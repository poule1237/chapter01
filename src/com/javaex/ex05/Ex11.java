package com.javaex.ex05;

public class Ex11 {

	public static void main(String[] args) {
	
		
		int[] leftArray = new int[] {10,20,30};
		int[] ringhtArray = new int[] {10,20,30};
		
		
		if(leftArray.length == ringhtArray.length) {
			//값이 같으면 아무것도안함
			for(int i=0; i<leftArray.length; i++) {
				if(leftArray[1] == ringhtArray[1]) {
					//값이 다르면 실행
					
				}else{
					System.out.println(i + " 배열의  값이 다릅니다");
				}
			}
		
		}else {
			System.out.println("두 배열의 값이 다릅니다");
		}
			
				
			
		
		
		
		
		

	}

}
