//package com.fastcampus.ch2;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.Set;
//
//public class MethodCall {
//	public static void main(String[] args) throws Exception{
//		HashMap map = new HashMap();
//		System.out.println("before:"+map);
//
//		ModelController mc = new ModelController();
//		String viewName = mc.main(map);
//		
//		System.out.println("after :"+map);
//		
//		render(map, viewName);
//	}
//	
//	static void render(HashMap map, String viewName) throws IOException {
//		String result = "";
//		
//		// 1. ���� ������ ���پ� �о �ϳ��� ���ڿ��� �����.
//		Scanner sc = new Scanner(new File(viewName+".txt"));
//		
//		while(sc.hasNextLine())
//			result += sc.nextLine()+ System.lineSeparator();
//		
//		// 2. map�� ��� key�� �ϳ��� �о template�� ${key}�� value�ٲ۴�.
//		Iterator it = map.keySet().iterator();
//		
//		while(it.hasNext()) {
//			String key = (String)it.next();
//
//			// 3. replace()�� key�� value ġȯ�Ѵ�.
//			result = result.replace("${"+key+"}", (String)map.get(key));
//		}
//		
//		// 4.������ ����� ����Ѵ�.
//		System.out.println(result);
//	}
//}
//
//class ModelController {
//	public String main(HashMap map) {
//		map.put("id", "asdf");
//		map.put("pwd", "1111");
//		
//		return "txtView2";
//	}
//}
////
////[txtView1.txt]
////id=${id}, pwd=${pwd}
////
////[txtView2.txt]
////id:${id}
////pwd:${pwd}
////
////
////
////[������]
////before:{}
////after :{id=asdf, pwd=1111}
////[txtView2.txt]
////id:asdf
////pwd:1111