package com.javaex.ex04;

public class Ex10 {

    public static void main(String[] args) {
    	/*
    	for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                break; //가장 가까운 반복문을 나간다
            }
            System.out.println(i);
            */
            
            for(int i=1; i<=10; i++) {
            	if(i==6) {
            		continue;  //
            	}
            System.out.println(i);
        }
            System.out.println("==============================");
            for(int i=1; i<=10; i++) {
            	if(i==6) {
            		//아무것도안둠
            	}else {
            		System.out.println(i);
            	}
     
            }
            System.out.println("========================");
            for(int i=1; i<=10; i++) {
            	if(!(i==6)) {
            		System.out.println(i);
            	}
            }
    }
}
