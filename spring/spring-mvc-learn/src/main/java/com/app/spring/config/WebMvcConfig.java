package com.app.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.app.web","com.app.validator" })
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	
    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		// bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		return bean;
	}

}
