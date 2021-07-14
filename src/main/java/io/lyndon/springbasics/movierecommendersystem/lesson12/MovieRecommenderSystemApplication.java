package io.lyndon.springbasics.movierecommendersystem.lesson12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

  public static void main(String[] args) {

    // ApplicationContext manages the beans and dependencies
    ApplicationContext appContext =
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);
    RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

    System.out.println(recommender);
    System.out.println(recommender.getFilter());
  }
}
