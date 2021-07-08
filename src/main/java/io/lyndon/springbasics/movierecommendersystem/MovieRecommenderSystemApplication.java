package io.lyndon.springbasics.movierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

  public static void main(String[] args) {

    ApplicationContext appContext =
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);

    // use ApplicationContext to find which filter is being used
    RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

    String[] result = recommender.recommendMovies("Finding Dory");

    System.out.println(Arrays.toString(result));
  }
}
