package com.app.tips;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

@SpringBootApplication
public class SpringBootTipsApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootTipsApplication.class);

	public static void main(String[] args) {
		logger.info("SpringBootTipsApplication started...");
			SpringApplication.run(SpringBootTipsApplication.class, args);
	}

}
