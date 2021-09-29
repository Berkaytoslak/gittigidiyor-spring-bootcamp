package dev.patika.patika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:foo.properties")
public class Patika0201Application {

    public static void main(String[] args) {
        SpringApplication.run(Patika0201Application.class, args);
    }

}
