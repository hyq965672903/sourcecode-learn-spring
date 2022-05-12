//package cn.hyqup.spring.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
///**
// * Copyright © 2022 灼华. All rights reserved.
// *
// * @author create by hyq
// * @version 0.1
// * @date 2022/5/11
// * @description:
// */
//@Component
//@Aspect
//public class LogAspect {
//	public LogAspect(){
//		System.out.println("LogAspect...");
//	}
//	/**
//	 * 定义切入点：对要拦截的方法进行定义与限制，如包、类
//	 *
//	 * 1、execution(public * *(..)) 任意的公共方法
//	 * 2、execution（* set*（..）） 以set开头的所有的方法
//	 * 3、execution（* com.hyqup.annotation.LoggerApply.*（..））com.lingyejun.annotation.LoggerApply这个类里的所有的方法
//	 * 4、execution（* com.hyqup.annotation.*.*（..））com.lingyejun.annotation包下的所有的类的所有的方法
//	 * 5、execution（* com.hyqup.annotation..*.*（..））com.lingyejun.annotation包及子包下所有的类的所有的方法
//	 * 6、execution(* com.hyqup.annotation..*.*(String,?,Long)) com.lingyejun.annotation包及子包下所有的类的有三个参数，第一个参数为String类型，第二个参数为任意类型，第三个参数为Long类型的方法
//	 * 7、execution(@annotation(xxx))
//	 */
//	@Pointcut("execution(* cn.hyqup.spring.aop.HelloService.sayHello(..))")
//	private void cutMethod() {
//
//	}
//
//
//
//	/**
//	 * 前置通知：在目标方法执行前调用
//	 */
//	@Before("cutMethod()")
//	public void logStart(JoinPoint joinPoint){
//		String name = joinPoint.getSignature().getName();
//		System.out.println("前置通知==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】");
//	}
//
//	/**
//	 * 后置通知：在目标方法执行后调用，若目标方法出现异常，则不执行
//	 */
//	@AfterReturning(value = "cutMethod()",returning = "result")
//	public void logReturn(JoinPoint joinPoint,Object result){
//		String name = joinPoint.getSignature().getName();
//		System.out.println("后置通知(不发生异常执行)()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】【result: "+result+"】");
//	}
//
//
//	/**
//	 * 后置/最终通知：无论目标方法在执行过程中出现一场都会在它之后调用
//	 */
//	@After("cutMethod()")
//	public void logEnd(JoinPoint joinPoint){
//		String name = joinPoint.getSignature().getName();
//		System.out.println("后置通知(必定执行)()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】");
//	}
//
//
//	/**
//	 * 异常通知：目标方法抛出异常时执行
//	 */
//	@AfterThrowing(value = "cutMethod()",throwing = "e")
//	public void logError(JoinPoint joinPoint,Exception e){
//		String name = joinPoint.getSignature().getName();
//		System.out.println("异常通知()==>"+name+"....【args: "+ Arrays.asList(joinPoint.getArgs()) +"】【exception: "+e+"】");
//	}
//
//	/**
//	 * 环绕通知：灵活自由的在目标方法中切入代码
//	 */
//	@Around("cutMethod()")
//	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//		String methodName = joinPoint.getSignature().getName();
//		System.out.println("环绕方法执行前通知()==> --》 method name " + methodName + " args " + Arrays.asList(joinPoint.getArgs()));
//		joinPoint.proceed();
//		System.out.println("环绕方法执行后通知()==> --》 method name " + methodName + " args " + Arrays.asList(joinPoint.getArgs()));
//	}
//}
