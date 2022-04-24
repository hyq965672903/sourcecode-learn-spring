package cn.hyqup.spring.config;

import cn.hyqup.spring.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/4/24
 * @description:
 */
@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("李四");
		return person;
	}
}
