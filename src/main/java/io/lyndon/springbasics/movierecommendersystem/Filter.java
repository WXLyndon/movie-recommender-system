package io.lyndon.springbasics.movierecommendersystem;

public interface Filter {
  public String[] getRecommendations(String movie);
}
