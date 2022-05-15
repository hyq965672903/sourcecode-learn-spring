package cn.hyqup.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/5/14
 * @description:
 */
@ComponentScan(value = "cn.hyqup.web",includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
},useDefaultFilters = false)
@Configuration
public class SpringMVCConfig {
}
