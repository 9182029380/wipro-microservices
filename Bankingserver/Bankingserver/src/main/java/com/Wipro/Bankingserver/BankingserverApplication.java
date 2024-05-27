package com.Wipro.Bankingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingserverApplication.class, args);
	}

}
