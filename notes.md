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
                
