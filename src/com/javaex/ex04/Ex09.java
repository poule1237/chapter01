package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int no = sc.nextInt();
			
			if(no ==0){
				break;
			}//else는 break때문에 생략가능
			
			if(no%3==0) {
				System.out.println("3의배수");
			}
			else {
				System.out.println("3의배수X");
			}
			//반복문(while) 처음으로
		}
		
	System.out.println("종료");	
	sc.close();
	}
	

}
