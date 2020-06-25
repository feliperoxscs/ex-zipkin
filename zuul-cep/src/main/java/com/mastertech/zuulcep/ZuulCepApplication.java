package com.mastertech.zuulcep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulCepApplication.class, args);
	}

}
