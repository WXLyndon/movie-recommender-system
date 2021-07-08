package io.lyndon.springbasics.movierecommendersystem;

public class RecommenderImplementation {

  public String[] recommendMovies(String movie) {
    // use content based filter to find similar movies
    ContentBasedFilter filter = new ContentBasedFilter();
    return filter.getRecommendations("Finding Dory");
  }
}
