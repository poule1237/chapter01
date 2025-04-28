package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		/*
	 	int no =9;
		int var = no; 
		*/
		
		
		
		int[] arrA = new int[3];
		arrA[0] =3;
		arrA[1] =6;
		arrA[2] =7;
		
		//이부분 중요
		int[] arrB = arrA;
		
		
		
		
		
		//arrA출력
		for(int i=0; i<3; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("-----------------------------");
		
		for(int i=0; i<3; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("-----------------------------");
		
		arrA[1] = 100;
		
		for(int i=0; i<3; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------------");
		
		for(int i=0; i<3; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("-----------------------------");
		
		//arrB를 통해서[1]을 100으로 변경
		//arrA = arrB룰 동시에 바뀌는지 확인
		
		arrB[2] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("-----------------------------");
		
		for(int i=0; i<3; i++) {
			System.out.println(arrB[i]);
		}
		
		
	}

}
