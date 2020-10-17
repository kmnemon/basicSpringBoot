package keliu.basicSpringBoot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataConfig.class})

public class ServiceConfig {
}
