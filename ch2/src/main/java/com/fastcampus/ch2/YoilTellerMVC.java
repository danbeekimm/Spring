package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class YoilTellerMVC {
//년월일 입력하면 요일을 알려주는 프로그램
	//public static void main(String[] args) { //매개변수 args로
		// TODO Auto-generated method stub
	@RequestMapping("/getYoilMVC")
	public String main(int year,int month,int day,Model model)throws IOException{
		//http://localhost:8080/ch2/getYoilMVC?year=2021&month=10&day=1

		
//void 를 String 변경함. return 값이 string이라서
//void 일때 뷰 return 안하는데 그럴땐 매핑된 걸로 지정되서 나옴 지금은 getYoilMVC.jsp 라는걸로 지정되어 나온다는것임.
		
		
//modelandview 도 반환타입가능. 모델을 파라미터로 받지않고 안에서
//		ModelAndView mv= new ModelAndView(); //모델과 뷰 객체생성
//		mv.addObject("year",year);//결과저장
//		mv.setViewName("yoil");//결과 보여줄 view를 지정
//		return mv;
//		
		
		
//1. 유효성검사
		if (!isValid(year,month,day)) 
			return "yoilError";
//2. 요일 계산
		char yoil = getYoil(year, month, day);
//3. 계산한 결과를 model 에 저장
		model.addAttribute("year",year);
		model.addAttribute("month",month);
		model.addAttribute("day",day);
		model.addAttribute("yoil",yoil);
		return "yoil"; //web-inf/views/yoil.jsp 로 반환. 뷰이름을 리턴하면돼

	}
//class 안에서만 쓰기 때문에 private 로 함.
private boolean isValid(int year, int month, int day) {
	// TODO Auto-generated method stub
	return true; //false 면 yoilerror.jsp 실행
}
//따로 메서드 지정 우클릭 > refactor > extract method
//이후 char 로 변환
private char getYoil(int year, int month, int day) {
	Calendar cal = Calendar.getInstance();
	cal.set(year, month -1, day);
	
	int dayofweek = cal.get(Calendar.DAY_OF_WEEK); //요일 //1.일 2.월...
	return "일월화수목금토".charAt(dayofweek);
}

}
