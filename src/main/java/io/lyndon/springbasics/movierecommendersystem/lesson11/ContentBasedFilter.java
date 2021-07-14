package io.lyndon.springbasics.movierecommendersystem.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ContentBasedFilter implements Filter {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public ContentBasedFilter() {
    logger.info("In ContentBasedFilter constructor method");
  }

  @PostConstruct
  public void postConstruct() {
    logger.info("In ContentBasedFilter postConstruct method");
  }

  @PreDestroy
  public void preDestroy() {
    logger.info("In ContentBasedFilter preDestroy method");
  }

  public String[] getRecommendations(String movie) {
    // logic of content based filter
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
