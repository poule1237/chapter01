package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		
		int[] intArr = new int[3];
		
		intArr[0] = 3;
		intArr[1] = 6;
		intArr[2] = 35;
		
		/*
		int[] intArr = new int[] {3,6,35};
			*/				//숫자를 빼야한다
		
		/*
		//추천하지않음
		int[] intArr = {3,6,35};
		*/
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
	}


}
