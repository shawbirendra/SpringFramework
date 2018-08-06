package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;

@Aspect
public class LoggingAspect {

	// this will scan for any package of any class
	// @Before("execution(public double getBalance())")

	// @After("execution(public double getBalance())")
	// public void loggingAdviceBefore() {
	// System.out.println("-------------Logging After Called--------------");
	// }

	// log all getters
	// @Before("execution( * get*())")
	// public void loggingAdviceBefore() {
	// System.out.println("-------------Logging Before Called--------------");
	// }

	// log allthe getters who either take param or not
	// @Before("execution( * get*(..))")
	// public void loggingAdviceBefore() {
	// System.out.println("-------------Logging Before Called--------------");
	// }

	// any return type in any class of package com.training.aop.model
	// @Before("execution(* com.training.aop.model.*.getBalance())")
	// public void loggingAdviceBefore() {
	// System.out.println("-------------Logging Before Called--------------");
	// }

	@Before("allGetters()")
	public void loggingAdviceBefore() {
		System.out.println("-------------Second Aspect Invoked for all getters-------------");
	}

	@Before("allGettersSBAccount()")
	public void secondAdviseforSBAccount() {
		System.err.println("only for SB aCcount");
	}

	@Before("allGetters() || allGettersSBAccount()")
	public void compoundAdvice() {
		System.out.println("This is compound advice for or clause of getters and sb account");
	}

	// fi you have too many advises then its difficult to maintain so we can have
	// dummy method annotated with regex and we can use the method instead of
	// annotation

	@Pointcut("execution( * get*(..))")
	public void allGetters() {
		
	}
	
	@Pointcut("execution( * com.training.aop.model.SBAccount.getAccount())")
	public void allGettersSBAccount() {
		
	}
}
