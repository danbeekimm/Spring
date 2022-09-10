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
//����� �Է��ϸ� ������ �˷��ִ� ���α׷�
	//public static void main(String[] args) { //�Ű����� args��
		// TODO Auto-generated method stub
	@RequestMapping("/getYoilMVC")
	public String main(int year,int month,int day,Model model)throws IOException{
		//http://localhost:8080/ch2/getYoilMVC?year=2021&month=10&day=1

		
//void �� String ������. return ���� string�̶�
//void �϶� �� return ���ϴµ� �׷��� ���ε� �ɷ� �����Ǽ� ���� ������ getYoilMVC.jsp ��°ɷ� �����Ǿ� ���´ٴ°���.
		
		
//modelandview �� ��ȯŸ�԰���. ���� �Ķ���ͷ� �����ʰ� �ȿ���
//		ModelAndView mv= new ModelAndView(); //�𵨰� �� ��ü����
//		mv.addObject("year",year);//�������
//		mv.setViewName("yoil");//��� ������ view�� ����
//		return mv;
//		
		
		
//1. ��ȿ���˻�
		if (!isValid(year,month,day)) 
			return "yoilError";
//2. ���� ���
		char yoil = getYoil(year, month, day);
//3. ����� ����� model �� ����
		model.addAttribute("year",year);
		model.addAttribute("month",month);
		model.addAttribute("day",day);
		model.addAttribute("yoil",yoil);
		return "yoil"; //web-inf/views/yoil.jsp �� ��ȯ. ���̸��� �����ϸ��

	}
//class �ȿ����� ���� ������ private �� ��.
private boolean isValid(int year, int month, int day) {
	// TODO Auto-generated method stub
	return true; //false �� yoilerror.jsp ����
}
//���� �޼��� ���� ��Ŭ�� > refactor > extract method
//���� char �� ��ȯ
private char getYoil(int year, int month, int day) {
	Calendar cal = Calendar.getInstance();
	cal.set(year, month -1, day);
	
	int dayofweek = cal.get(Calendar.DAY_OF_WEEK); //���� //1.�� 2.��...
	return "�Ͽ�ȭ�������".charAt(dayofweek);
}

}
