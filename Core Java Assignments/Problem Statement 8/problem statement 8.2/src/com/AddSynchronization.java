package com;

public class AddSynchronization {
	public static void main(String[] args) {
		Storage st = new Storage();
		Counter c = new Counter(st);
		Printer p = new Printer(st);
		new Thread(c, "Counter").start();
		new Thread(p, "Printer").start(); 
	}

}