/**
 * @author Administrator
 * @date:   2020年5月14日 下午5:32:52
 * @Description:TODO(描述这个类的作用)
 * 
 */
package com.xhg.plus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xhg.plus.pojo.User;
import com.xhg.plus.service.UserService;

/**
 * 
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/getAll/{current}/{size}")
	public IPage<User> getAll(@PathVariable Integer current, @PathVariable Integer size, User user) {
		
		System.out.println(user);
		
		IPage<User> page = new Page<>(current,size);
		IPage<User> userPage = userService.selectPageExt(page, user);
		
		return userPage;
	}
	
	@RequestMapping("/insert/{name}/{age}/{email}")
	public String insert(@PathVariable String name, @PathVariable Integer age, @PathVariable String email) {
		
		User user = new User();
		user.setUserName(name);
		user.setUserAge(age);
		user.setUserEmail(email);
		
		boolean save = userService.save(user);
		return "success";
	}
}
