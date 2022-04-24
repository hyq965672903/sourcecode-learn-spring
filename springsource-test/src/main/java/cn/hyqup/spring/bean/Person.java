package cn.hyqup.spring.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/4/23
 * @description:
 */
@Data
@Component
public class Person  implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	private String name;


	public Person() {
		System.out.println("person 被创建...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//  利用回调机制，将IOC注入进来
		this.applicationContext=applicationContext;
	}
}
