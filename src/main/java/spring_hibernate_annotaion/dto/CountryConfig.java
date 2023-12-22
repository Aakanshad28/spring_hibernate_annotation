package spring_hibernate_annotaion.dto;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "spring_hibernate_annotaion.dto", "spring_hibernate_annotation.dao" })
public class CountryConfig {
	@Bean
	public EntityManager entityManager() {
		return Persistence.createEntityManagerFactory("aakansha").createEntityManager();

	}

}
