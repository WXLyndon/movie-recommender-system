package io.lyndon.springbasics.movierecommendersystem;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

  public static void main(String[] args) {
    RecommenderImplementation recommender = new RecommenderImplementation();
    String[] result = recommender.recommendMovies("Finding Dory");
    System.out.println(Arrays.toString(result));
  }
}
