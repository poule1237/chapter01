package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		점수를 입력 받아  60점 이상이면 “합격입니다.
		”60점 미만이면 “불합격입니다.”를 출력하세요
		 */
		System.out.print("점수:");
		
		int point = sc.nextInt();
		
		
		if(point>= 60 ) {
			//true일때 해야할일
			System.out.println("합격입니다.");
		
		}else {
			//false일때 해야할일
			System.out.println("불합격입니다.");
		}
		
		System.out.println("프로그램 종료");
		

		sc.close();

	}
}
