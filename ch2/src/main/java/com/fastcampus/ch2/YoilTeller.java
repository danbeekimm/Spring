package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class YoilTeller {
//년월일 입력하면 요일을 알려주는 프로그램
	//public static void main(String[] args) { //매개변수 args로
		// TODO Auto-generated method stub
	@RequestMapping("/getYoil")
	public void main(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//HttpServletResponse response:브라우저에 결과 주려면
		//1입력
		//string 값을 입력받은다음 저장
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
//		String month = args[1];
//		String day = args[2];
//		
		//숫자로 바꾸기
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		
		//작업 (날짜세팅)
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd);
		
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK); //요일 //1.일 2.월...
		char yoil = "일월화수목금토".charAt(dayofweek);
		
		//3출력
		//출력전 브라우저로 보낼때 인코딩과 택스트인지 알려줘야함
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out= response.getWriter();//response 객체에서 출력 스트림을 얻는다
		out.println(year+"년"+month+"월"+day+"일은 ");
		out.println(yoil+"요일입니다.");
	}

}
