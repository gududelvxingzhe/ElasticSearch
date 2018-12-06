package com.jettech.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


//@EnableCaching	//开启缓存
@SpringBootApplication
public class SpringbootEhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEhcacheApplication.class, args);
	}
}
