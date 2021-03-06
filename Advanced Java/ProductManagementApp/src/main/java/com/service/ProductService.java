package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	public String storeProduct(Product pdt) {
		
		if(pdt.getPrice()<12000) {
			return "Salary must be > 12000";
		}else {
			ProductDao ed = new ProductDao();
			int res = ed.storeProduct(pdt);
			if(res > 0) {
				return "Record inserted";
			}else {
				return "Record didn't insert";
			}
			
		}
	}
	public String deleteProductInfo(int id) {
		ProductDao pd = new ProductDao();
		if(pd.deleteProduct(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	public String updateProductInfo(Product pdt) {
		ProductDao pd = new ProductDao();
		if(pd.updateProduct(pdt)>0) {
			return "Record updated successfully";
		}else {
			return "Record not present";
		}
	}
	public List<Product> getAllProduct() {
		ProductDao pd = new ProductDao();
		List<Product> listOfPdt = pd.findAllProduct();
		Iterator<Product> li = listOfPdt.iterator();
		while(li.hasNext()) {
			Product pdt = li.next();
			pdt.setPrice(pdt.getPrice());
		}
		return listOfPdt;
	}
	
	public String searchProductInfo(int id) {
		ProductDao pd = new ProductDao();
		if(pd.getProductByid(id) != null) {
			return "Record find successfully";
		}else {
			return "Record not present";
		}
	}
	
}
