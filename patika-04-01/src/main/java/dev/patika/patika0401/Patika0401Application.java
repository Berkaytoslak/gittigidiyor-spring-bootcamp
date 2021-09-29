package dev.patika.patika0401;

import dev.patika.patika0401.config.annotation.DeveloperInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@DeveloperInfo(
        expertise = DeveloperInfo.Expertise.SENIOR,
        createdBy = "Koray Güney",
        url = "https://github.com/korayguney",
        email = "koray.guney@hotmail.com"
)
public class Patika0401Application {

    public static void main(String[] args) {
        SpringApplication.run(Patika0401Application.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
