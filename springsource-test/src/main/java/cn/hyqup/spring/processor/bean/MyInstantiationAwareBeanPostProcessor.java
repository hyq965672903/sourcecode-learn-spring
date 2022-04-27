package cn.hyqup.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
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
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("MyInstantiationAwareBeanPostProcessor  构造器执行.....");
	}


	/**
	 * 直接返回对象，不用spring创建
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("执行 MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation .....................");

		return null;
	}

	/**
	 * 返回false 后续的后置处理器不再工作
	 * @param bean the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("执行 MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation .....................");

		return true;
	}

	/**
	 *
	 * @param pvs the property values that the factory is about to apply (never {@code null})
	 * @param bean the bean instance created, but whose properties have not yet been set
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("执行 MyInstantiationAwareBeanPostProcessor.postProcessProperties .....................");
		return null;
	}
}
