package cn.hyqup.spring;

import cn.hyqup.spring.aop.HelloService;
import cn.hyqup.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/5/11
 * @description:
 */
public class AopMainTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(MainConfig.class);
		HelloService helloService = applicationContext.getBean(HelloService.class);
		helloService.sayHello("hello world!");

	}
}
