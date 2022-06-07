package stringAopExample.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* stringAopExample.repository.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* stringAopExample.service.*.*(..))")
    public void serviceLayerExecution(){}
}
