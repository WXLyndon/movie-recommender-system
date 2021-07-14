package io.lyndon.springbasics.movierecommendersystem.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RecommenderImplementation {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  private Filter filter;

  @Autowired
  public void setFilter(Filter filter) {
    logger.info("In RecommenderImplementation setter method..dependency injection");
    this.filter = filter;
  }

  @PostConstruct
  public void postConstruct() {
    logger.info("In RecommenderImplementation postConstruct method");
  }

  @PreDestroy
  public void preDestroy() {
    // cleanup code
    logger.info("In RecommenderImplementation preDestroy method");
  }

  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter + "\n");
    return filter.getRecommendations("Finding Dory");
  }
}
