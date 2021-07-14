package io.lyndon.springbasics.movierecommendersystem.lesson11;

public interface Filter {
  public String[] getRecommendations(String movie);
}
