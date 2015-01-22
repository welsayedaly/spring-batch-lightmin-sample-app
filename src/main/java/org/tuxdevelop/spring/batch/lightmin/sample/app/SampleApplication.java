package org.tuxdevelop.spring.batch.lightmin.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.tuxdevelop.spring.batch.lightmin.configuration.AbstractSpringBatchLightminConfiguration;

@Configuration
@EnableAutoConfiguration(exclude = { BatchAutoConfiguration.class })
@ComponentScan
public class SampleApplication extends AbstractSpringBatchLightminConfiguration {

	public static void main(final String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
}
