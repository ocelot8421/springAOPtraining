package stringAopExample.aspect.archive;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
//public class BeforeAspect {
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "execution(* stringAopExample.service.*.*(..))",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info(" {} returned with the value {}", joinPoint, result); //TODO why result is null?
    }
}
