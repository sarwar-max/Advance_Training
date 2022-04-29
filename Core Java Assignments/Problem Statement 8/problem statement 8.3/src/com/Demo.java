package com;

public class Demo {
	   public static void main(String args[]) {
	        ThreadA a = new ThreadA();
	        ThreadB b = new ThreadB();
	      
	        a.start();
	        b.start();
	        System.out.println("... Multithreading is over ");
	   }
	}