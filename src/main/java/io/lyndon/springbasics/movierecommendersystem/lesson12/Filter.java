package io.lyndon.springbasics.movierecommendersystem.lesson12;

public interface Filter {
  public String[] getRecommendations(String movie);
}
