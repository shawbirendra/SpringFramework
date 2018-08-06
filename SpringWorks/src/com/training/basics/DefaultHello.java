package com.training.basics;

public class DefaultHello implements HelloService {

	private String name;
	private String city;
	
	public DefaultHello() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return sayHello(name, city);
	}

	@Override
	public String sayHello(String name, String city) {
		// TODO Auto-generated method stub
		String myStrs[] = { "hey how are you mr/ms/mrs %s & How is your city %s",
				"Good morning %s, your city is beautiful %s" };
		int randomNumber = (int) (Math.random() * 3);
		return String.format(myStrs[randomNumber], name, city);
	}
	public void ginit() {
		System.out.println("DefaultHello.ginit()");
	}
	public void gdestroy() {
		System.out.println("DefaultHello.gdestroy()");
	}
}