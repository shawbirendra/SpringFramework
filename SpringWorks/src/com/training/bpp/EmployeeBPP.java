package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;

//if you want spring to know this is post processor implements BeanPostProcessor, 
//this way every bean when created by spring has to go through this classs

//Since this class can handle any class all are given as object
public class EmployeeBPP implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("--------------EmployeeBPP.postProcessBeforeInitialization()-------" + beanName + "-------");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out
				.println("--------------EmployeeBPP.postProcessAfterInitialization()----------" + beanName + "------");
		if (bean instanceof Employee) {
			Employee employee = (Employee) bean;
			employee.setEmpName(employee.getEmpName().toUpperCase());
			return employee;
		}
		return bean;
	}

}
