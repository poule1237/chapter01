package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("숫자를 입력하세요");
		int sum = 0;//숫자를 누적한값
		int num;
		 do{
		//숫자입력
		num = sc.nextInt();	 
		//합계
		sum = sum + num;
		//합계출력
		System.out.println("합계:" + sum);
		 }
		while(num != 0);
		 
		System.out.println("종료");
		sc.close();
		*/
		
		////////////////////////////////////////////////////////
		System.out.println("숫자를 입력해주세요");
		int sum=0;
		while(true) {
			int num = sc.nextInt();//숫자 입력
			sum = sum + num; //누적
		System.out.println("합계:" + sum);//출력	
			
			if(num==0) {//반복문 끝
				break; //반복문끝
			}
		}
		System.out.println("종료");
		sc.close();
	}

}
