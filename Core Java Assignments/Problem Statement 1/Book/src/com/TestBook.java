package com;

import java.util.Scanner;
public class TestBook
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Book Title:");
        String bookname=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        sc.nextLine();
        
        
        Book obj=new Book();
        obj.setBookName(bookname);
        obj.setBookPrice(price);
        System.out.println("Book Title :"+obj.getBookName());
        System.out.println("Price :"+obj.getBookPrice());
    }
}