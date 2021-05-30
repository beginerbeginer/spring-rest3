package dev.simpleboot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "Task API", version = "1.0.0", description = "これはTaskアプリケーションのAPIです"))
@SpringBootApplication
public class SpringRest3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringRest3Application.class, args);
    }

}
