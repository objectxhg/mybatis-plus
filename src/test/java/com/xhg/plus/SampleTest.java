/**
 * 
 * @date:   2020年5月14日 下午4:54:54
 */
package com.xhg.plus;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.xhg.plus.mapper.UserMapper;
import com.xhg.plus.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		
		userList.forEach(System.out::println);
	}
}
