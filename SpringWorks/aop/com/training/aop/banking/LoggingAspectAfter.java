package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {

	@After("execution(* get*(*))")
	public void afterGetter() {
		System.out.println("##########  After Advised invoked  #############");
	}
	
	@AfterReturning("execution(* com.training.aop.model.SBAccount.getAccount())")
	public void afterSuccessOfGetter() {
		System.out.println("LoggingAspectAfter.afterSuccessOfGetter()");
	}
	
	@AfterReturning(pointcut="args(val)",returning="returnString" )
	public void afterReturningStringSetter(String val,String returnString) {
		System.out.println("After Invoked for input -> "+val+",return  "+returnString);
		
	}
	
	// checkNegative
	@AfterThrowing("execution(* che*(*))")
	public void afterThrowing() {
		System.out.println("LoggingAspectAfter.afterThrowing()");
	}
}
