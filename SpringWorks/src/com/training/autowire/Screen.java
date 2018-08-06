package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:mobile_info.properties")
@Component
public class Screen {
	@Bean
	public PropertyPlaceholderConfigurer configurer() {
		return new PropertyPlaceholderConfigurer();
	}
	@Value("${mobile.screen.glasstype}")
	private String glassType;
	private int len;
	private int bre;

	public Screen() {
		System.out.println("Creating Screen.Screen() " + this);
	}

	public String getGlassType() {
		return glassType;
	}

	public void setGlassType(String glassType) {
		this.glassType = glassType;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBre() {
		return bre;
	}

	public void setBre(int bre) {
		this.bre = bre;
	}

}
