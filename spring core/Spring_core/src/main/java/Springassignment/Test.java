package Springassignment;

import org.springframework
	.context
	.ConfigurableApplicationContext;

import org.springframework
	.context.support
	.ClassPathXmlApplicationContext;

import Springassignment.init_destroybean;
public class Test {

	public static void main(String[] args)
		throws Exception
	{
		ConfigurableApplicationContext cap
			= new ClassPathXmlApplicationContext(
				"spring.xml");
		cap.close();
	}
}

