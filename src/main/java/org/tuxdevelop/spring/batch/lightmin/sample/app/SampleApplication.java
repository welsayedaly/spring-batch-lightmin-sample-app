package org.tuxdevelop.spring.batch.lightmin.sample.app;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.tuxdevelop.spring.batch.lightmin.configuration.AbstractSpringBatchLightminConfiguration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class SampleApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Configuration
	public static class ApplicationConfiguration extends
			AbstractSpringBatchLightminConfiguration {

	}

	@Bean
	public DataSource dataSource() {
		final EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
		return embeddedDatabaseBuilder.addScript("classpath:create.sql")
				.setType(EmbeddedDatabaseType.H2).build();
	}

}
