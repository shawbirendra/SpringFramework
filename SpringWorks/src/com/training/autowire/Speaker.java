package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:mobile_info.properties")
@Component
public class Speaker {
	
	@Bean
	public PropertyPlaceholderConfigurer configurer() {
		return new PropertyPlaceholderConfigurer();
	}
	private int volume;
	private int limit;
	@Value("${mobile.speaker.type}")
	private String type;

	public Speaker() {
		System.out.println("Creating Speaker.Speaker() " + this);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
