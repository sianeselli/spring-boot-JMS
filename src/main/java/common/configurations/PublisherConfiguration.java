package common.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath*:configurations/common-spring-context.xml")
@Configuration
public class PublisherConfiguration {

}
