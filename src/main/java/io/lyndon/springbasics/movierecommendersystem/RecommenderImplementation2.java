package io.lyndon.springbasics.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {

  private Filter filter;

  @Autowired
  @Qualifier("CBF")
  public void setFilter(Filter filter) {
    this.filter = filter;
    System.out.println("Setter method invoked...");
  }

  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter + "\n");
    return filter.getRecommendations("Finding Dory");
  }
}
