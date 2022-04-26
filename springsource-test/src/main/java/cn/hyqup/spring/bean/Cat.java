package cn.hyqup.spring.bean;

import org.springframework.stereotype.Component;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/4/25
 * @description:
 */
@Component
public class Cat {

	public Cat() {
		System.out.println("猫被创建了");
	}
}
