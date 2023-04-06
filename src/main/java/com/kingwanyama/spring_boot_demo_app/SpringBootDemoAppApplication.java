package com.kingwanyama.spring_boot_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoAppApplication.class, args);
	}

}
