package com.training.messagesource;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class HelloWorld {
	private String greeting;
	private String message;
	// you can have MessageResource entry made in .xml fileand u can do autowire or
	// do below

	@Autowired
	private MessageSource messageSource;

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public void sayHello() {
		System.out.println(messageSource.getMessage("helloworld.greet", new Object[] { greeting, message }, null));
	}

	// values from properties file will be injected..
	public void sayHello_fr() {
		System.out.println(
				messageSource.getMessage("helloworld.greet", new Object[] { greeting, message }, new Locale("FR")));
	}
	public void sayHello_gr() {
		System.out.println(
				messageSource.getMessage("helloworld.greet", new Object[] { greeting, message }, new Locale("de_DE")));
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
