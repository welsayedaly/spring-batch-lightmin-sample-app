package org.tuxdevelop.spring.batch.lightmin.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.tuxdevelop.spring.batch.lightmin")
public class SampleApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
