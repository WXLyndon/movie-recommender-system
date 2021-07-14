package io.lyndon.springbasics.movierecommendersystem.lesson14;

public class RecommenderImplementation {

  private final Filter filter;

  public RecommenderImplementation(Filter filter) {
    this.filter = filter;
    System.out.println("Constructor invoked...");
  }

  public String[] recommendMovies(String movie) {

    // print the name of interface implementation being used
    System.out.println("Name of the filter in use: " + filter + "\n");
    return filter.getRecommendations("Finding Dory");
  }
}
