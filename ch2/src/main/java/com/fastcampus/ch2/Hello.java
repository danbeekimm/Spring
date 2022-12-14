package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//원격 호출가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv =10;//인스턴스변수
	static int cv = 20; //static변수
	
	//2 url 과 메서드 연결
	
	@RequestMapping("/hello")
	private void main() { 
		//public 이 아닌 private 이라도 가능
		//static 이없어도 실행가능 : 인스턴스메서드임.
		//인스턴스메서드는 객체생성 후 실행가능함. 중간에서 톰켓이 객체를 생성해준다는것임.
		//인스턴스변수 : iv,cv 둘다사용가능
		System.out.println(cv);
		System.out.println(iv); //둘다 사용가능
		System.out.println("hello- static"); //톰켓에 실행
	}
	
	public static void main2() {
		System.out.println(cv);
		//System.out.println(iv); //에러
	}
}
