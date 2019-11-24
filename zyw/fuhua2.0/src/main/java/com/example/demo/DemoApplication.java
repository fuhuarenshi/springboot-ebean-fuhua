package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author zyw
 * @Description 浮华的启动类
 * @Date 18:20 2019/11/13
 * @Param: null
 * @Return
 */
@SpringBootApplication
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("(♥◠‿◠)ﾉﾞ  浮华 -基于ebean实现 gogog  ლ(´ڡ`ლ)ﾞ" );
	}

}
