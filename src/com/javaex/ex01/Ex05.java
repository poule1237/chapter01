package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		//일반적인 방식
		double pi; 
		pi = 3.14;
		
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//p1 값 변경가능
		pi = 3.141512;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수로 정의하는 방식
		final double PI; //상수로 정의할떄는 보통 대문자로 표기
		PI = 3.14;
		
		double result03 = PI*5*5;
		System.out.println(result03);
	
		/*
		//상수의 값을 변경하려고 하면 에러발생
		PI = 3.1415926; //PI는 상수로 선언 변경시 에러발생
		double result04 = PI*5*5;
		System.out.println(result04);
		*/
		
	}
}
