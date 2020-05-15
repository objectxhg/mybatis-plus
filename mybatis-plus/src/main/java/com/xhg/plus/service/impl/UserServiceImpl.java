/**
 * 
 * @date:   2020年5月14日 下午5:27:57
 */
package com.xhg.plus.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhg.plus.mapper.UserMapper;
import com.xhg.plus.service.UserService;
import com.xhg.plus.pojo.User;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public IPage<User> selectPageExt(IPage<User> page, User user) {
		
		
		QueryWrapper<User> queryUser = new QueryWrapper<User>();
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("user_name", user.getUserName());
		params.put("user_age", user.getUserAge());
		/**
		 * params 参数
		 * null2IsNull 是否不忽略为null的参数（简易：相当于以前sql里面的 <if test= "params != null">
		 * allEq(params, null2IsNull)
		 */
		queryUser.allEq(params, false);
				
		IPage<User> userPage = 
				userMapper.selectPage(page, queryUser);
		
		return userPage;
	}



}
