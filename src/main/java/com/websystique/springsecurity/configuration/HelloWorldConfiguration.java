package com.websystique.springsecurity.configuration;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.websystique.springsecurity")
public class HelloWorldConfiguration extends WebMvcConfigurerAdapter{
     

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/welcome").setViewName("welcome");
//		registry.addViewController("/").setViewName("welcome");
//		registry.addViewController("/admin").setViewName("admin");
//		registry.addViewController("/dba").setViewName("dba");
//		registry.addViewController("/login").setViewName("login");
//		registry.addViewController("/accessDenied").setViewName("accessDenied");
//	}
	
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
 
        return viewResolver;
    }
    
    
//    @Bean(name = "dataSource")
//	public DriverManagerDataSource dataSource() {
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
//		driverManagerDataSource.setUrl("jdbc:postgresql://localhost:5432/test");
//		driverManagerDataSource.setUsername("postgres");
//		driverManagerDataSource.setPassword("superuser");
//		return driverManagerDataSource;
//	}
    	
    @Bean
   	public MessageSource messageSource() {
   	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
   	    messageSource.setBasename("messages");
   	    return messageSource;
   	}	
 
     /*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    

}
