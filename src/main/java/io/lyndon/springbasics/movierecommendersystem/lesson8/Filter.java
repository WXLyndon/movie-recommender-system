package io.lyndon.springbasics.movierecommendersystem.lesson8;

public interface Filter {
  public String[] getRecommendations(String movie);
}
