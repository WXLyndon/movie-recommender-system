package io.lyndon.springbasics.movierecommendersystem.lesson14;

public interface Filter {
  public String[] getRecommendations(String movie);
}
