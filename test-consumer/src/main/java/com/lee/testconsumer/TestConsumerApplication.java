package com.lee.testconsumer;

import com.lee.testconsumer.service.DubboConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestConsumerApplication {
	@Autowired
	private DubboConsumer consumer;

	public static void main(String[] args) {
		SpringApplication.run(TestConsumerApplication.class, args);
	}
}
