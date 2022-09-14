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
	@Override //�����ʱ�ȭ�ɶ� �ڵ�ȣ��
	//������ �ʱ�ȭ�۾����
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("helloservlet init() is called");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�Է�
		//ó��
		//���
		System.out.println("helloservlet service() is called");
	}

	@Override
	public void destroy() {
		//������, ������ �޸𸮿������ŵɶ� ���������̳ʿ� ���ؼ� �ڵ�ȣ��
		System.out.println("helloservlet destroy() is called");
	}
	
	
//	helloservlet init() is called
//	helloservlet service() is called
//	helloservlet service() is called
//	9�� 13, 2022 3:22:41 ���� org.apache.catalina.core.StandardContext reload
//	INFO: �̸��� [/ch2]�� ���ؽ�Ʈ�� �ٽ� �ε��ϴ� �۾��� ���۵Ǿ����ϴ�.
//	9�� 13, 2022 3:22:41 ���� org.apache.catalina.core.ApplicationContext log
//	INFO: Destroying Spring FrameworkServlet 'appServlet'
//	INFO : org.springframework.web.context.support.XmlWebApplicationContext - Closing WebApplicationContext for namespace 'appServlet-servlet': startup date [Tue Sep 13 15:21:43 KST 2022]; parent: Root WebApplicationContext
//	INFO : org.springframework.beans.factory.support.DefaultListableBeanFactory - Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@1068176: defining beans [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping#0,org.springframework.format.support.FormattingConversionServiceFactoryBean#0,org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter#0,org.springframework.web.servlet.handler.MappedInterceptor#0,org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver#0,org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver#0,org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver#0,org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping,org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter,org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter,org.springframework.web.servlet.resource.ResourceHttpRequestHandler#0,org.springframework.web.servlet.handler.SimpleUrlHandlerMapping#0,org.springframework.web.servlet.view.InternalResourceViewResolver#0,hello,homeController,requestHeader,requestInfo,requestMessage,twoDice,yoilTeller,yoilTellerMVC,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,org.springframework.context.annotation.ConfigurationClassPostProcessor$ImportAwareBeanPostProcessor#0]; parent: org.springframework.beans.factory.support.DefaultListableBeanFactory@6f91fbda
//	helloservlet destroy() is called



}
