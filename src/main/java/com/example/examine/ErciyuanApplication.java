package com.example.examine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.examine.dao")
public class ErciyuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErciyuanApplication.class, args);
	}

}
