package spring.Spring_core.spring.Spring_core;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class App {
  public static void main(String args[])
  {
	  //System.out.print("abc");
	  ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
	 //Address A=(Address) context.getBean("address");
	// Customer C=(Customer) context.getBean("Customer");
	// System.out.println(A);
	  //System.out.println(C);
	  //collection col=(collection) context.getBean("Question") ;
	  //System.out.print(col);
	 Bankaccount_controller bnk=(Bankaccount_controller) context.getBean("bank");
	//System.out.println(bnk.deposit(1,3446));
	System.out.print(bnk.withdraw(1,32));
	  
	  //Autowiring auto =(Autowiring) context.getBean("abc");
	 // System.out.print(auto);
  }
}
