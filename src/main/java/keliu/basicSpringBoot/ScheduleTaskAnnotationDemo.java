package keliu.basicSpringBoot;

import keliu.basicSpringBoot.config.DataConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class  ScheduleTaskAnnotationDemo {
    private static Logger logger = LoggerFactory.getLogger(DataConfig.class);

    public static void main(String... args) throws Exception {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(DataConfig.class);

        logger.info("what");

        ctx.close();
    }
}
