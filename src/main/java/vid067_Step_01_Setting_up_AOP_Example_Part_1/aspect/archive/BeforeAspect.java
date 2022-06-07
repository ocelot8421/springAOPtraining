package vid067_Step_01_Setting_up_AOP_Example_Part_1.aspect.archive;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* vid067_Step_01_Setting_up_AOP_Example_Part_1.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info(" Intercepted Method Call {} - ", joinPoint);
    }
}
