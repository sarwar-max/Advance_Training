package com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a,b,range,i,c;
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter first number- ");  
		a = sc.nextInt();  
		System.out.print("Enter second number- ");  
		b = sc.nextInt(); 
		System.out.print("Enter range- ");  
		range = sc.nextInt();
		
		for(i=1; i<=range; i++) {
			System.out.println(a);
			
			c = a + b;
			a = b;
			b = c;
			
		}

	}

}
