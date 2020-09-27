package com.zhaolian.demo.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//设置Access-Control-Allow-Origin=*，实现跨域访问，允许所有域名访问允许所有域名访问，也可以指定域名才可以访问				 response.setHeader("Access-Control-Allow-Origin", "*");
				 response.setHeader("Access-Control-Allow-Methods", "*");
				 response.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
				 return true;
	}

}








