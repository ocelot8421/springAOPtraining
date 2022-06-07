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

    @Before("execution(* stringAopExample..*.*(..))")
        pointcut has been changed:  service subfolder has been deleted
        advice:  the codes inside the before method
    aspect = pointcut + advice
    jointPoint:  specific execution interception
    weaving:  the whole process

071-Step_05-Using_atAfter_atAfterReturning_atAfterThrowing_advices

    AfterAopAspect class:
        @AfterReturning
            logger.info(" {} returned with the value {}", joinPoint, result)
        @AfterThrowing - after exeption thrown
        @After

072-Step_06-Using_atAround_advice_to_implement_performance_tracing

    MethodExecutionCalculationAspect class:
        @Around
            ProceedingJoinPoint
        long startTime = System.currentTimeMillis();

073-Step_07-Best_Practice__Use_common_Pointcut_Configuration

    CommonJoinPointConfig class:
        @PointCut

074-Step_08-Quick_summary_of_other_Pointcuts

    @Pointcut( && )
    @Pointcut("bean(*dao*)")
    @Pointcut("within(com. ... .repository..*")

075-Step_09-Creating_Custom_Annotation_and_an_Aspect_for_Tracking_Time

    
    
    
                
