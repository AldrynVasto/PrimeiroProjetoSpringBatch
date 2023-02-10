package com.deep.projetospringbatch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {
     @Bean
     public PropertySourcesPlaceholderConfigurer configBatch() {
    	 PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
    	 configurer.setLocation(new FileSystemResource("/etc/config/spring-batch-projeto/application.properties"));
    	 return configurer;
     }
}
