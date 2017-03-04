package applications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Javadocs
@SpringBootApplication(scanBasePackages = {"common.controllers"})
public class PublisherApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(PublisherApplication.class);
        app.setAdditionalProfiles("publisher");
        app.run(args);
    }
}
