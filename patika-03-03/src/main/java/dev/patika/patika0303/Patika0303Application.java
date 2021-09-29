package dev.patika.patika0303;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Patika0303Application {

    public static void main(String[] args) {
        SpringApplication.run(Patika0303Application.class, args);
    }

    @Bean
    public RestTemplate restTemplateBuilderr(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }

}
