package com.training.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.aop.service.BankingService;

public class Client {
	public static void main(String[] args) throws RuntimeException {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-context.xml");

		BankingService service = context.getBean("banking", BankingService.class);

		System.out.println(service.getCaAccount().showBalance());
		System.out.println(service.getSbAccount().getAccount().getBalance());
		service.getCaAccount().getOneParam(100);
		String retVal = service.setAndGet("Birenddra");
		System.out.println("Returned Val::" + retVal);

		
		service.checkNegative(-10);
	}
}
