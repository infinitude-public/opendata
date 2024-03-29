package io.infinitude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestContextListener;

@SpringBootApplication
public class JenkinsBootApplication{

	public static void main(String[] args) {
		SpringApplication.run(JenkinsBootApplication.class, args); 
	}

	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

	@Bean
	public StartupRunner schedulerRunner() {
		return new StartupRunner();
	}

}
