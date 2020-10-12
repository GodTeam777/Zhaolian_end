package com.zhaolian.demo.web.interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;

import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.concurrent.Executors;


/**
 * 跨域请求支持
 */
@Configuration
public class MyInterceptor extends WebMvcConfigurationSupport {


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

//文件磁盘图片url 映射
//配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径
		registry.addResourceHandler("/img/**").addResourceLocations("file:"+System.getProperty("user.dir")+"/upload/");
		super.addResourceHandlers(registry);
}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowCredentials(true)
				.allowedHeaders("*")
				.allowedMethods("*")
				.allowedOrigins("*");

	}

	@Override
	protected void configureAsyncSupport(AsyncSupportConfigurer configurer){
		configurer.setTaskExecutor(new ConcurrentTaskExecutor(Executors.newFixedThreadPool(3)));
		configurer.setDefaultTimeout(30000);


	}
}








