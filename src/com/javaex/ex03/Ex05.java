package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("근무시간을 입력하세요: ");
        int time = sc.nextInt();
        
        int multiple = 0; 
        
       
       
        if (time <= 8) {
        	multiple  = time * 10000; 
        } else {
            multiple = (8 * 10000) + ((time - 8)*12000);
            
        }
        System.out.println("총 임금은 " + multiple + "원 입니다.");
        
        
		sc.close();
	}

}
