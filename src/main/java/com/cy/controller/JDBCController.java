package com.cy.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@ConfigurationProperties(prefix = "jdbc") 
@PropertySource("classpath:/properties/jdbc.properties")
public class JDBCController {
	/* @Value("${jdbc.jdbcUrl}") */
	private String jdbcUrl;
	/* @Value("${jdbc.username}") */
	private String username;
	/* @Value("${jdbc.password}") */
	private String password;
	//为属性赋值时 依赖set方法

	@RequestMapping("/getMsg")
	public String getConn() {	
		String msg="获取数据库连接";
		msg +=":"+jdbcUrl+":"+username+":"+password;
		return msg;
		
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
