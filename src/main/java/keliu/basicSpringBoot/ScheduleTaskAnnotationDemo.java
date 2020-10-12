package keliu.basicSpringBoot;

import keliu.basicSpringBoot.config.DataConfig;
import keliu.basicSpringBoot.config.ServiceConfig;
import keliu.basicSpringBoot.services.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class  ScheduleTaskAnnotationDemo {
    private static Logger logger = LoggerFactory.getLogger(DataConfig.class);

    public static void main(String... args) throws Exception {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfig.class);
        CarService carService = ctx.getBean("carService", CarService.class);

        while (!carService.isDone()) {
            logger.info("Waiting for scheduled job to end ...");
            Thread.sleep(250);
        }

        logger.info("what");

        ctx.close();
    }
}
