package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		/*
		int no = 1;
		
		while(true) {
			if( no% 6 == 0 &&  no% 14 == 0) {
			break;	
			}
			System.out.println("현재" + no);
			no++;
			
		}
		System.out.println("정답" + no);
		 */
		int no = 1;
		
		boolean action = true;
				
		while(action) {
			if( no% 6 == 0 &&  no% 14 == 0) {
				action=false;
			}
			System.out.println("현재" + no);
			no++;
					
		}
		System.out.println("정답" + no);
	
	
	
	}
	

}
