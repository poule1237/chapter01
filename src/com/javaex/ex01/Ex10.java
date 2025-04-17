package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//논리 연산사
		int a = 5;
		int b = 7;
		System.out.println("&&연산자(엄격,깐깐) and-------------");
		
		System.out.println(true && true); //t && t -> true
		System.out.println(false && false); // t && f ->false
		System.out.println(true && false); //f && t -> false
		System.out.println(false && true); //f && f ->false
		
		System.out.println("|| 연산자(엄격,깐깐) or -------------");
		
		System.out.println(true || true); // t || t ->true
		System.out.println(true || false); //t || f ->true
		System.out.println(false || true); //f || t ->true
		System.out.println(false || false); //f || f ->false
		
		System.out.println("! 연산자(반대)-------------");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("응용-------------");
		boolean result = (a>5) && (a>b); //5<7 && 5> => t && f => false
		System.out.println(result);
		
		System.out.println(true && false || true); //t && f||t  t && f , f||t t
		System.out.println(true || false || true); // t||f ->t  t||t -> t
		
		System.out.println( ! (a>b) ); // 5>7 ->f     !f-->t
	}
}
