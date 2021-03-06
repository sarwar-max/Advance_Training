package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		int id;
		String name;
		float price;
		String con="";
		int choice;
		String result;
		
		do {
			System.out.println("1:Add Product, 2:Delete Product, 3:Update Product, 4:Display All Products, 5:Exit, 6:Search Product");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
		
			switch(choice) {
			case 1: System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("Enter the name");
					name = sc.next();
					System.out.println("Enter the price");
					price = sc.nextFloat();
					Product pdt = new Product(id, name, price);
					result = ps.storeProduct(pdt);
					System.out.println(result);
					break;
			case 2:	System.out.println("Enter the id");
					id = sc.nextInt();
					result = ps.deleteProductInfo(id);
					System.out.println(result);
					break;
					 
			case 3:System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("Enter the price");
					price = sc.nextFloat();
					Product pdt1 = new Product();
					pdt1.setId(id);
					pdt1.setPrice(price);
					result = ps.updateProductInfo(pdt1);
					System.out.println(result);
					break;
			case 4:List<Product> listOfPdt = ps.getAllProduct();
					Iterator<Product> li = listOfPdt.iterator();
					while(li.hasNext()) {
						Product e = li.next();
						System.out.println(e);
					}
					break;
					
			case 5:
                System.out.println("******************************THANK YOU********************");
                System.exit(0);
                break;
                
			case 6:	System.out.println("Enter the id");
			id = sc.nextInt();
			result = ps.searchProductInfo(id);
			System.out.println(result);
			break;
					
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("do you want to continue? press (y)");
			con = sc.next();
		}while(con.equals("y"));
		System.out.println("Thank you visit again!");
	}

}
