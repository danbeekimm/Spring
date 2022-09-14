package com.fastcampus.ch2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	@Override //서블릿초기화될때 자동호출
	//서블릿의 초기화작업담당
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("helloservlet init() is called");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//입력
		//처리
		//출력
		System.out.println("helloservlet service() is called");
	}

	@Override
	public void destroy() {
		//뒷정리, 서블릿이 메모리에서제거될때 서블릿컨테이너에 의해서 자동호출
		System.out.println("helloservlet destroy() is called");
	}
	
	
//	helloservlet init() is called
//	helloservlet service() is called
//	helloservlet service() is called
//	9월 13, 2022 3:22:41 오후 org.apache.catalina.core.StandardContext reload
//	INFO: 이름이 [/ch2]인 컨텍스트를 다시 로드하는 작업이 시작되었습니다.
//	9월 13, 2022 3:22:41 오후 org.apache.catalina.core.ApplicationContext log
//	INFO: Destroying Spring FrameworkServlet 'appServlet'
//	INFO : org.springframework.web.context.support.XmlWebApplicationContext - Closing WebApplicationContext for namespace 'appServlet-servlet': startup date [Tue Sep 13 15:21:43 KST 2022]; parent: Root WebApplicationContext
//	INFO : org.springframework.beans.factory.support.DefaultListableBeanFactory - Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@1068176: defining beans [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping#0,org.springframework.format.support.FormattingConversionServiceFactoryBean#0,org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter#0,org.springframework.web.servlet.handler.MappedInterceptor#0,org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver#0,org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver#0,org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver#0,org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping,org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter,org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter,org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0,org.springframework.web.servlet.handler.SimpleUrlHandlerMapping#0,org.springframework.web.servlet.view.InternalResourceViewResolver#0,hello,homeController,requestHeader,requestInfo,requestMessage,twoDice,yoilTeller,yoilTellerMVC,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,org.springframework.context.annotation.ConfigurationClassPostProcessor$ImportAwareBeanPostProcessor#0]; parent: org.springframework.beans.factory.support.DefaultListableBeanFactory@6f91fbda
//	helloservlet destroy() is called



}
