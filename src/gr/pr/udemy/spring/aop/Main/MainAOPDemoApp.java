package gr.pr.udemy.spring.aop.Main;

import gr.pr.udemy.spring.aop.DemoConfig;
import gr.pr.udemy.spring.aop.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOPDemoApp {
	
	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the ben from spring container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//all the buisiness method
		accountDAO.addAccount();
		
		System.out.println("let's do it again");
		
		//do it again
		accountDAO.addAccount();
		
		//close the contect
		context.close();
	}
}