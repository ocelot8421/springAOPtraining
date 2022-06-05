package vid067_Step_01_Setting_up_AOP_Example_Part_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vid067_Step_01_Setting_up_AOP_Example_Part_1.service.Business1;
import vid067_Step_01_Setting_up_AOP_Example_Part_1.service.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	Business1 business1;

	@Autowired
	Business2 business2;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}
}
