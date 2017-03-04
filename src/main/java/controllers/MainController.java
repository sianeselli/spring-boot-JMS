package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Javadocs
@SpringBootApplication(scanBasePackages = {"controllers"})
public class MainController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainController.class, args);
    }
}
