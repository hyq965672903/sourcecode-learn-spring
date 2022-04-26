package cn.hyqup.spring;

import cn.hyqup.spring.bean.Cat;
import cn.hyqup.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/4/24
 * @description:
 */
public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Cat bean = applicationContext.getBean(Cat.class);
		System.out.println(bean);
	}
}
