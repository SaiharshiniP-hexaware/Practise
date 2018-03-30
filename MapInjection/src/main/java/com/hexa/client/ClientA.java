package com.hexa.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.dao.Idao;
import com.hexa.service.Iser;

public class ClientA {
private static ApplicationContext ctx;
	
static {
	ctx=new ClassPathXmlApplicationContext("beans.xml","beans2.xml");
    
}

public static void main(String[] args) {
	System.out.println("inside main");
 		Iser ser=ctx.getBean("myser",Iser.class);
 		boolean res=ser.transferFund(1001, 1002, 5000);
 		System.out.println("fund transfered"+ res);

 		Idao dao= ctx.getBean("mydao",Idao.class);
 		System.out.println(dao.getaccount(1001));
 		System.out.println(dao.getaccount(1002));
	}

}
