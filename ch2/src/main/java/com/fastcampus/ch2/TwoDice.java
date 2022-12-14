package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwoDice {
	@RequestMapping("/rollDice") //요청받으면
	
	//리소스 2가지
	//실행할때마다 결과가 변함 - 동적리소스 
	//이미지파일,*.js & *.css & *.html 등 변하지않음 - 정적리소스
	public void main(HttpServletResponse response) throws IOException {
		int idx1= (int)(Math.random()*6)+1;
		int idx2= (int)(Math.random()*6)+1;
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src='resources/img/dice"+idx1+".jpg'>");
		out.println("<img src='resources/img/dice"+idx2+".jpg'>");
		out.println("</body>");
		out.println("</html>");
		
	}
}
