package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.resource.DbResource;

public class ProductDao {

			public int storeProduct(Product pdt) {
				try {
Connection con = DbResource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
				pstmt.setInt(1, pdt.getId());
				pstmt.setString(2, pdt.getName());
				pstmt.setFloat(3, pdt.getPrice());
				int res= pstmt.executeUpdate();
				return res;
				} catch (Exception e) {
					System.out.println(e);
				}
				return 0;
			}
			
			public int deleteProduct(int id) {
				try {
				Connection con = DbResource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("delete from product where id = ?");
				pstmt.setInt(1, id);
				int res= pstmt.executeUpdate();
				return res;
				} catch (Exception e) {
					System.out.println(e);
				}
				return 0;
			}
			
			public int updateProduct(Product pdt) {
				try {
					Connection con = DbResource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("update product set price = ? where id = ?");
				pstmt.setFloat(1, pdt.getPrice());
				pstmt.setInt(2, pdt.getId());
				int res= pstmt.executeUpdate();
				return res;
				} catch (Exception e) {
					System.out.println(e);
				}
				return 0;
			}
			public List<Product> findAllProduct() {
				
				List<Product> listOfPdt = new ArrayList<>();
				
				try {
					Connection con = DbResource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("select * from product");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Product pdt = new Product();				// converting each record into java bean object. 
					pdt.setId(rs.getInt("id"));
					pdt.setName(rs.getString("name"));
					pdt.setPrice(rs.getFloat("price"));
					listOfPdt.add(pdt);
				}
				return listOfPdt;
				
				} catch (Exception e) {
					System.out.println(e);
				}
				return null;
			}
			
			  //different query
		    public Product getProductByid(int id)
		    {
		        Product pdt = null;
		        try
		        {
		        	Connection con = DbResource.getDbConnection();
		            PreparedStatement ps = con.prepareStatement("SELECT * FROM product WHERE id = ?");
		            ps.setInt(1, id);
		            ResultSet rs = ps.executeQuery();
		            //iterate through result
		            while(rs.next())
		            {
		                pdt = new Product(rs.getInt("id"), rs.getString("name"), rs.getFloat("price"));
		            }
		        }
		        catch(Exception e)
		        {
		            e.printStackTrace();
		        }
		        return pdt;
		    }
}


