package com.org.amit.sampleLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author AMIT
 *
 */

@SpringBootApplication
@EnableSwagger2
public class SampleLoginApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SampleLoginApplication.class, args);
	}

}
