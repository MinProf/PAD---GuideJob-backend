package com.project.GuideJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@ComponentScan(basePackages={"<base package name>"})
@EnableJpaRepositories(basePackages="com.project.GuideJob.repo")
@EnableTransactionManagement
@EntityScan(basePackages="com.project.GuideJob.model")
public class GuideJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuideJobApplication.class, args);
	}

}
