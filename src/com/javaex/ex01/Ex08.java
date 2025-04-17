package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자 =
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("--------------------------");
		
		//산술연산자
		int sum = a + b;
		System.out.println(sum); 	// +
		
		System.out.println(a+b);	//+
		System.out.println(a-b); 	// -
		System.out.println(a*b);	//*
		System.out.println(a/b);	// 7/2 => (3)---1
		System.out.println(a%b);	// 7/2=3---(1)
	
		System.out.println(7/2);	// 3 정수/정수 =>정수
		System.out.println(7.0/2);  // 7.0/2.0 => 3.5
		System.out.println(7.0/2.0);	//7.0/2.0 =>3.5
		
		System.out.println("--------------------------------");
		
		//부호연산자
		int var = -3;
		int pVar = -var;  // -(3) ==> 3
		System.out.println(pVar);
		
		int mVar = +var;	// +(3) ==> -3
		System.out.println(mVar);
		
		System.out.println("--------------------------------");
		
		//증강연산자
		System.out.println(a);  // 7
		System.out.println(++a); // 7 -> 8 변수값 변경 +1 출력
		System.out.println(a);
		
		System.out.println(b); // 2
		System.out.println(--b); // 2 ->1  변수값 변경 -1 출력
		System.out.println(b);
		
		System.out.println("--------------------------------");
		System.out.println(a);	// 8
		System.out.println(a++); //8        +1 , 출력
		System.out.println(a); //9
		
		System.out.println("--------------------------------");
		System.out.println(b); // 1
		System.out.println(b--); // 1      -1출력
		System.out.println(b); // 0
		
		//해야할일을 나열 가장먼저  가장 나중에 할지 결정
		System.out.println("--------------------------------");
		
		int c = 5;
		System.out.println(c); //
		System.out.println(++c * 2); // 5+1=> 6 * 2 =>  12 
		System.out.println(c); // +1출력  6
		
		int d = 5;
		System.out.println(d); // 5
		System.out.println(d++ * 2); // 5*2 => 10
		System.out.println(d); // +1출력 6
	}
}
