/**
 * 
 * @date:   2020年5月14日 下午5:25:25
 */
package com.xhg.plus.service;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xhg.plus.pojo.User;

public interface UserService extends IService<User>{
	
	IPage<User> selectPageExt(IPage<User> page, User user);
	
}
