package keliu.basicSpringBoot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@Import({DataConfig.class})
@EnableScheduling
public class ServiceConfig {
}
