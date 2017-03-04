package configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath*:configurations/spring-context.xml")
@Configuration
public class HelloWorldConfiguration {

}
