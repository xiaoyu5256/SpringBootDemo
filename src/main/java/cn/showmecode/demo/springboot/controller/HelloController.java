package cn.showmecode.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.showmecode.demo.springboot.domain.UserRepository;

@RestController
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		return "Hello Spring Boot!ss";
	}
	
}
