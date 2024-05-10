package com.group1.BidZone_Onlinebiddingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.group1.BidZone_Onlinebiddingsystem.Repository")
@EntityScan("com.group1.BidZone_Onlinebiddingsystem.Model")
public class BidZoneOnlineBiddingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidZoneOnlineBiddingSystemApplication.class, args);
	}

}
