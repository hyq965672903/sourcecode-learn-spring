package cn.hyqup.spring.processor.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/4/25
 * @description: 什么周期接口
 */
public class MyInitializingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行 MyInitializingBean.afterPropertiesSet .....................");
	}
}
