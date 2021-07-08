package io.lyndon.springbasics.movierecommendersystem;

public class CollaborativeFilter implements Filter {

  public String[] getRecommendations(String movie) {
    // logic of collaborative filter
    return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
  }
}
