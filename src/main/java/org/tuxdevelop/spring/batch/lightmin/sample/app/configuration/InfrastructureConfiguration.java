package org.tuxdevelop.spring.batch.lightmin.sample.app.configuration;

import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class InfrastructureConfiguration {

	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private PlatformTransactionManager dataSourceTransactionManager;

	@Bean
	public StepBuilderFactory stepBuilderFactory() {
		return new StepBuilderFactory(jobRepository, dataSourceTransactionManager);
	}

	@Bean
	public JobBuilderFactory jobBuilderFactory() {
		return new JobBuilderFactory(jobRepository);
	}

}
