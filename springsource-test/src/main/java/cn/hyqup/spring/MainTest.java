package cn.hyqup.spring;

import cn.hyqup.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/4/23
 * @description:
 */
public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
