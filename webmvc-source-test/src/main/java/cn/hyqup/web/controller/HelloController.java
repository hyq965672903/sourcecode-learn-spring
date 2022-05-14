package cn.hyqup.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2022 灼华. All rights reserved.
 *
 * @author create by hyq
 * @version 0.1
 * @date 2022/5/14
 * @description:
 */
@RestController
public class HelloController {
	@GetMapping("/say")
	public String say() {
		return "Hello SpringMVC";
	}
}
