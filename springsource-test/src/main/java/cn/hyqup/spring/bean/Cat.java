package cn.hyqup.spring.bean;

import org.springframework.beans.factory.InitializingBean;
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
public class Cat implements InitializingBean {

	public Cat() {
		System.out.println("猫被创建了");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行 MyInitializingBean.afterPropertiesSet .....................");
	}
}
