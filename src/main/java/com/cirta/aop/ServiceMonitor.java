package com.cirta.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Mise en place d'un exemple de monitoring en utilisant la programmation AOP
 * Aspect Oriented Programming 
 * 
 * @author Nassim AIT BRAHAM
 *
 */

@Aspect
@Component
public class ServiceMonitor {
	
	/**
	 * Methode declancher avant chaque appel au service du package com.cirta.servuce
	 * @param joinPoint
	 */
	@Before("execution(* com.cirta.service..*.*(..))")
	public void logServiceAccessBefore(JoinPoint joinPoint){
		System.out.println("Before : "+joinPoint.getTarget().getClass().getName());
	}
	
	/**
	 * Methode declancher après l'appel au service du package com.cirta.servuce
	 * @param joinPoint
	 */
	@After("execution(* com.cirta.service..*.*(..))")
	public void logServiceAccessAfter(JoinPoint joinPoint){
		System.out.println("After : "+joinPoint.getTarget().getClass().getName());
	}
	
}
