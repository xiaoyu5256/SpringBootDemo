package cn.showmecode.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		log.debug("Debug Spring Boot!");
		log.info("Hello Spring Boot!");
		return "Hello Spring Boot!";
	}
	
}
