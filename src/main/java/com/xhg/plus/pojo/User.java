/**
 * 
 * @date:   2020年5月14日 下午4:53:21
 */
package com.xhg.plus.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("t_user")
public class User {
	
	private Long userId;
	
    private String userName;
	
    private Integer userAge;
	
    private String userEmail;
}
