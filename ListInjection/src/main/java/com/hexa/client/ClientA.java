package com.hexa.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.hexa.service.Iser;

public class ClientA {
private static ApplicationContext ctx;
	
static {
	ctx=new ClassPathXmlApplicationContext("beans.xml");
    
}

public static void main(String[] args) {
	System.out.println("inside main");
	Iser ser=ctx.getBean("myser",Iser.class);
Set<String> st = ser.getCities();
		st.forEach(System.out::println);

}
}
