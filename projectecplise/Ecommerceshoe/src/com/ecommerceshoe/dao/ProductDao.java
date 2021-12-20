package com.ecommerceshoe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.ecommerceshoe.model.Product;
import com.ecommerceshoe.model.Users;

public class ProductDao {
	public static void inserproduct(Product product) {
		ConnectionUtil conUtil = new ConnectionUtil();
		
		String insertQuery = "insert into  Product(Brand_name,Brand_type,Brand_size,color,prices,manufacture_date) values(?,?,?,?,?,?)";
		Connection con = conUtil.getDbconnection();
		PreparedStatement pstmt = null;
		try {

			pstmt = con.prepareStatement(insertQuery);
			pstmt.setString(1, product.getBrandName());
			pstmt.setString(2, product.getBrandType());
			pstmt.setInt(3, product.getBrandSize());
			pstmt.setString(4,product.getColor());
			pstmt.setDouble(5, product.getPrices());
			pstmt.setDate(6,new java.sql.Date(product.getManufactureDate().getTime()) );
			int i=pstmt.executeUpdate();
			System.out.println(i+"Value Inserted Successfully");

		} catch (SQLException e) {
			//catch the exception and get that message
			e.printStackTrace();
			System.out.println("Value not Setted in the query");
		}
	}
		
		
		public  void updated(Product product) {
			
			String updateQuery="update Product set  Brand_name=?,Brand_size=?,prices=? where color=?";
			
			ConnectionUtil conUtil;
			Connection con = ConnectionUtil.getDbconnection();
			PreparedStatement pstmt = null;
			try {
				
			 pstmt= con.prepareStatement(updateQuery);
			 pstmt.setString(1, product.getBrandName());
			     pstmt.setInt(2, product.getBrandSize());
			     
			     pstmt.setDouble(3, product.getPrices());
			     pstmt.setString(4, product.getColor());
				     int i=pstmt.executeUpdate();
				     System.out.println("updated");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    

		}
	}

