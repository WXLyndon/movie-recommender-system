package io.lyndon.springbasics.movierecommendersystem.lesson10;

public interface Filter {
  public String[] getRecommendations(String movie);
}
