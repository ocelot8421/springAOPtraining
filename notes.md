067_Step_01_Setting_up_AOP_Example_Part_1

    cross-cutting concern (all web, business and data layer)

068-Step_02-Setting_up_AOP_Example-Part_2  

    SpringAopApplication:
        implements CommandLineRunner

069-Step_03-Defining_an_atBefore_advice
    
    BeforeAspect class:
        logger.info("blabla{}")
        @Configuration
        @Aspect
            @Before("execution(* PACKAGE.*.*(..))")
                JoinPoint
    UserAccessAspect class

070-Step_04-Understand_AOP_Terminology-Pointcut_Advice_Aspect_and_Join_Point

    @Before("execution(* vid067_Step_01_Setting_up_AOP_Example_Part_1..*.*(..))")
        pointcut has been changed:  service subfolder has been deleted
        advice:  the codes inside the before method
    aspect = pointcut + advice
    jointPoint:  specific execution interception
    weaving:  the whole process

071-Step_05-Using_atAfter_atAfterReturning_atAfterThrowing_advices

    AfterAopAspect class:
        @AfterReturning
        logger.info(" {} returned with the value {}", joinPoint, result)
    
    
                
