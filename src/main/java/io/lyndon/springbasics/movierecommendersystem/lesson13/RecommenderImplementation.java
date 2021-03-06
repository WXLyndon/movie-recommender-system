package io.lyndon.springbasics.movierecommendersystem.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

  private final Filter filter;

  @Autowired
  public RecommenderImplementation(@Qualifier("CF") Filter filter) {
    this.filter = filter;
    System.out.println("Constructor invoked...");
  }

  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter + "\n");
    return filter.getRecommendations("Finding Dory");
  }
}
