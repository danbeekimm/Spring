package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main();
		//private은 외부 호출 불가
		//Reflection API 사용 - 클래스 정보 얻고 다룰수 있는 강력한 기능제공
		//java.lang.reflect 패키지 제공
		
		//Reflection API 사용해서
		//Hello클래스의 Class 객체(클래스의 정보를 담고있는 객체)를 얻어온다
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		
		Hello hello = (Hello) helloClass.newInstance();//class객체가 가진 정보로 객체 생성
		Method main= helloClass.getDeclaredMethod("main");
		main.setAccessible(true); //private 인 main()을 호출 가능하게 함
		
		main.invoke(hello); //hello.main
	
	}
}
