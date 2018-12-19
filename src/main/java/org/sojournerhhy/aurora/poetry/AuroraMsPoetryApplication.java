package org.sojournerhhy.aurora.poetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuroraMsPoetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuroraMsPoetryApplication.class, args);
	}

}

