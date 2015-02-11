package de.codecentric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.codecentric.moviedatabase.contentdelivery.config.ApplicationConfiguration;

@Configuration
@Import(ApplicationConfiguration.class)
@EnableAutoConfiguration
public class ContentDeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentDeliveryApplication.class, args);
    }
}
