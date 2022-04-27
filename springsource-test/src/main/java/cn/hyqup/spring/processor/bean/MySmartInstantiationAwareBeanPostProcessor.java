package cn.hyqup.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/4/25
 * @description:
 */
@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("执行 MySmartInstantiationAwareBeanPostProcessor.predictBeanType .....................");
		return null;
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("执行 MySmartInstantiationAwareBeanPostProcessor.determineCandidateConstructors .....................");
		return null;
	}

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("执行 MySmartInstantiationAwareBeanPostProcessor.getEarlyBeanReference .....................");
		return null;
	}
}
