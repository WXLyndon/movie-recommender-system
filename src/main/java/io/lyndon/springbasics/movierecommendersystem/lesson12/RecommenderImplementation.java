package io.lyndon.springbasics.movierecommendersystem.lesson12;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RecommenderImplementation {

  public Filter getFilter() {
    return filter;
  }

  private final Filter filter;

  @Inject
  public RecommenderImplementation(@Qualifier("CBF") Filter filter) {
    this.filter = filter;
    System.out.println("Constructor invoked...");
  }

  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter + "\n");
    return filter.getRecommendations("Finding Dory");
  }
}
