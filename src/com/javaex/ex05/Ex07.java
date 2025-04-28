package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] intArray;
		intArray = new int[5]; 
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		
		for ( int i =0; i < intArray.length; i++ ){
			System.out.println(intArray[i]);
		}

		
		System.out.println(intArray[4]);
		

	}

}
