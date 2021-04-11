package com.example.testgateway;

import io.netty.util.internal.PlatformDependent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class TestGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestGatewayApplication.class, args);
	}

	@Scheduled(fixedDelayString = "2000")
	public void printDirectMemory(){
		System.out.println("Direct memory used: "+PlatformDependent.usedDirectMemory());
	}

}
