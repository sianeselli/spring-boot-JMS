package applications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Javadocs
@SpringBootApplication(scanBasePackages = {"common.controllers"})
public class ConsumerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(ConsumerApplication.class);
        app.setAdditionalProfiles("consumer");
        app.run(args);
    }
}
