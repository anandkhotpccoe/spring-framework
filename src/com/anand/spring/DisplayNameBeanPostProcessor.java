/**
 * 
 */
package com.anand.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author anand
 *
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("In After Initialization method. Bean Name is: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In Before Initialization method. Bean Name is: " + beanName);
		return bean;
	}
	

}
