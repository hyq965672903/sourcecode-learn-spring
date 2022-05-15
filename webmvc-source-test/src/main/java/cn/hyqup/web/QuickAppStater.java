package cn.hyqup.web;

import cn.hyqup.web.config.SpringConfig;
import cn.hyqup.web.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/5/15
 * @description:
 */
public class QuickAppStater extends AbstractAnnotationConfigDispatcherServletInitializer {
	/**
	 * 根容器的配置（Spring容器相关的配置）
	 * @return
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{SpringConfig.class };
	}

	/**
	 * web容器相关的配置（SpringMVC的配置类）
	 * @return
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{SpringMVCConfig.class };
	}

	/**
	 * Servlet的映射路径
	 * @return
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
