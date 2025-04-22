package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		
		System.out.print("과목번호:");
		
		int code = sc.nextInt();
		
		switch(code) {
			case 1: //code == 1
				System.out.println("R101");
				break;
				
			case 2: //code == 2
				System.out.println("R202");
				break;
				
			case 3: //code == 3
				System.out.println("R303");
				break;
				
			case 4: //code == 4
				System.out.println("R404");
				break;	
				
			default: //나머지	
				System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
	}
	

}

