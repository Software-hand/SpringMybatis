package com.rjs.springmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.rjs.SpringMybatis.mapper")   // DepartmentMapper.java mapper文件太多时，没加注解，则在启动类标记mapper包位置，下面的所有包自动添加mapper注解
@SpringBootApplication
public class SpringMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisApplication.class, args);
	}

}
