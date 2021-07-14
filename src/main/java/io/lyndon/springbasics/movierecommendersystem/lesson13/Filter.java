package io.lyndon.springbasics.movierecommendersystem.lesson13;

public interface Filter {
  public String[] getRecommendations(String movie);
}
