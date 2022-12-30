package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.service.MailService;

@SpringBootApplication
public class SpringMailSenderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringMailSenderApplication.class, args);
	System.out.println("app runnning");
	System.out.println("Changes By Sneha");
      System.out.println("app runnning--------Demo");

	}

}
