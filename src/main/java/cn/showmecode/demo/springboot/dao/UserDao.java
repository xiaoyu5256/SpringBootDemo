package cn.showmecode.demo.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.showmecode.demo.springboot.domain.User;


public interface UserDao extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
