package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//���� ȣ�Ⱑ���� ���α׷����� ���
@Controller
public class Hello {
	int iv =10;//�ν��Ͻ�����
	static int cv = 20; //static����
	
	//2 url �� �޼��� ����
	
	@RequestMapping("/hello")
	private void main() { 
		//public �� �ƴ� private �̶� ����
		//static �̾�� ���డ�� : �ν��Ͻ��޼�����.
		//�ν��Ͻ��޼���� ��ü���� �� ���డ����. �߰����� ������ ��ü�� �������شٴ°���.
		//�ν��Ͻ����� : iv,cv �Ѵٻ�밡��
		System.out.println(cv);
		System.out.println(iv); //�Ѵ� ��밡��
		System.out.println("hello- static"); //���Ͽ� ����
	}
	
	public static void main2() {
		System.out.println(cv);
		//System.out.println(iv); //����
	}
}