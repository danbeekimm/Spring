package com.fastcampus.ch2;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestHeader {
	@RequestMapping("/requestHeader")
	public void main(HttpServletRequest request) {
		
		Enumeration<String>e=request.getHeaderNames();
		
		while(e.hasMoreElements()) {
			String name = e.nextElement();
			System.out.println(name+":"+request.getHeader(name));
		}
	}
}

//�ش��� �� ����
//INFO : com.fastcampus.ch2.HomeController - Welcome home! The client locale is ko_KR.
//host:localhost:8080
//connection:keep-alive
//sec-ch-ua:"Google Chrome";v="105", "Not)A;Brand";v="8", "Chromium";v="105"
//sec-ch-ua-mobile:?0
//sec-ch-ua-platform:"Windows"
//upgrade-insecure-requests:1
//user-agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36
//accept:text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
//sec-fetch-site:none
//sec-fetch-mode:navigate
//sec-fetch-user:?1
//sec-fetch-dest:document
//accept-encoding:gzip, deflate, br
//accept-language:ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
