package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단:");
		int dan = sc.nextInt();
		
		int i = 0;
		int index = 1;
		
		while( i < 9) {
			
			System.out.println(dan + "*" + index + "=" + dan*index);
			index++;
			i++;
		}
		
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
					
		System.out.println("단을 입력해주세요");
		System.out.print("단:");
		int dan = sc.nextInt();
					
		int i = 0;
					
		while(i <9) {
			System.out.println(dan + "*" + i+1 + "=" + dan*(i+1));
						
			i++;
		}
				
		sc.close();
	}
}
