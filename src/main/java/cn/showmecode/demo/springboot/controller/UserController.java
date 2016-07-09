package cn.showmecode.demo.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.showmecode.demo.springboot.domain.User;
import cn.showmecode.demo.springboot.domain.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	private final static Integer PAGE_SIZE = 2;
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/pages/{pagenum}",method=RequestMethod.GET )
	public Page<User> listUsers(@PathVariable Integer pagenum){
		PageRequest pageable = new PageRequest(pagenum - 1, PAGE_SIZE);
		return userRepository.findAll(pageable);
	}
	@RequestMapping(method=RequestMethod.GET )
	public Page<User> queryUsers(Pageable pageable){
		Page<User> users = userRepository.findAll(pageable);
		return users;
	}
	
	@RequestMapping(method=RequestMethod.POST )
	public List<User> updateUsers(User user){
		if(user!=null&&userRepository.findByUsername(user.getUsername())!=null){
			return null;
		}
		user = userRepository.save(user);
		return userRepository.findAll();
	}
}
