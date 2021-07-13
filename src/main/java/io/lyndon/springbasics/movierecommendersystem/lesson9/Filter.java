package io.lyndon.springbasics.movierecommendersystem.lesson9;

public interface Filter {
  public String[] getRecommendations(String movie);
}
