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
//����� �Է��ϸ� ������ �˷��ִ� ���α׷�
	//public static void main(String[] args) { //�Ű����� args��
		// TODO Auto-generated method stub
	@RequestMapping("/getYoil")
	public void main(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//HttpServletResponse response:�������� ��� �ַ���
		//1�Է�
		//string ���� �Է¹������� ����
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
//		String month = args[1];
//		String day = args[2];
//		
		//���ڷ� �ٲٱ�
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);
		
		
		//�۾� (��¥����)
		Calendar cal = Calendar.getInstance();
		cal.set(yyyy, mm-1, dd);
		
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK); //���� //1.�� 2.��...
		char yoil = "�Ͽ�ȭ�������".charAt(dayofweek);
		
		//3���
		//����� �������� ������ ���ڵ��� �ý�Ʈ���� �˷������
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out= response.getWriter();//response ��ü���� ��� ��Ʈ���� ��´�
		out.println(year+"��"+month+"��"+day+"���� ");
		out.println(yoil+"�����Դϴ�.");
	}

}