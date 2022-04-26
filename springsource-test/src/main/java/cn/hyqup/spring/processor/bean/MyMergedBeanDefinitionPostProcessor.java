package cn.hyqup.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
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
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

	public MyMergedBeanDefinitionPostProcessor() {
		System.out.println("MyMergedBeanDefinitionPostProcessor  构造器执行.....");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行 MyMergedBeanDefinitionPostProcessor.postProcessBeforeInitialization .....................");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行 MyMergedBeanDefinitionPostProcessor.postProcessAfterInitialization .....................");
		return null;
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("执行 MyMergedBeanDefinitionPostProcessor.postProcessMergedBeanDefinition .....................");

	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("执行 MyMergedBeanDefinitionPostProcessor.resetBeanDefinition .....................");

	}
}
