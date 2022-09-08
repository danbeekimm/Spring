package com.fastcampus.ch2;

import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMessage {
@RequestMapping("/requestMessage")
public void main(HttpServletRequest request) throws Exception{
	
	//1 request line
	String requestLine = request.getMethod();
	requestLine += " "+request.getRequestURI(); // /ch2/requestMessage
	
	String queryString = request.getQueryString(); //year=2021~~~
	requestLine += queryString == null? "" : "?"+queryString;
	requestLine += " " + request.getProtocol(); //http/1.1
	System.out.println(requestLine);
	
	//2 request headers
	Enumeration<String> e = request.getHeaderNames();
	
	while(e.hasMoreElements()) {
		String name = e.nextElement();
		System.out.println(name + ":" + request.getHeader(name));
	}
	
	//3 request body - post 일때만 해당 get은 바디가 없어서
	final int CONTENT_LENGTH = request.getContentLength();
	System.out.println("context length="+CONTENT_LENGTH);
	
	if (CONTENT_LENGTH > 0) { //바디가 있을때
		byte[] content = new byte[CONTENT_LENGTH];
		
		InputStream in = request.getInputStream();
		in.read(content,0,CONTENT_LENGTH);
		
		System.out.println(); //empty
		System.out.println(new String(content,"utf-8"));//year=2021~~~
	}
	
	
}
	
}
