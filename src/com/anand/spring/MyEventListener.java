/**
 * 
 */
package com.anand.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author anand
 *
 */
@SuppressWarnings("rawtypes")
@Component
public class MyEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		
		System.out.println(event.toString());
	}

}
