package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		
		System.out.print("과목번호:");
		
		String code = sc.nextLine();
		
		switch(code) { //a,b,c,d
			case "a": //code == a
				System.out.println("R101");
				break;
				
			case "b": //code == b
				System.out.println("R202");
				break;
				
			case "c": //code == c
				System.out.println("R303");
				break;
				
			case "d": //code == d
				System.out.println("R404");
				break;	
				
			default: //나머지	
				System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
	}
}

