package com.javaex.ex05;

public class Ex10 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 7;
		
		
		int[] arrB = new int[3];
		
		//같은방끼리 값을 복사한다  A-->B
		for(int i=0; i<3; i++) {
			arrB[i] = arrA[i];
		}
		
		
		//arrA출력
		for(int i=0; i<3; i++ ) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------");
		//arrB출력
		for(int i=0; i<3; i++ ) {
			System.out.println(arrB[i]);
		}
		
		//서로 다른 2개의 배열
		
	}

}
