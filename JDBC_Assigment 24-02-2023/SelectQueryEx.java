package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class SelectQueryEx {

	public static void main(String[] args) {
		
//		try(Connection conn= DatabaseConnection.getConnection())
//		{
//			String sql = "select * from teacher";
//			
//			PreparedStatement pst = conn.prepareStatement(sql);
//			ResultSet result= pst.executeQuery();//execute query to execute the select query
//			
//			while(result.next())//result set next method
//			{
//				System.out.println("Teacher ID: "+result.getInt(1));//get int cloumn intext
//				System.out.println("Teacher Name: "+result.getString("name"));//get String column Name
//				System.out.println("Teacher Email: "+result.getInt(3));//get String column Index
//				System.out.println("Teacher Salary: "+result.getString("Salary"));//get int column Name
//				System.out.println("================================================");
//			}
//		}
		try(Connection conn= DatabaseConnection.getConnection();
				Scanner sc= new Scanner(System.in))
		{
			String sql="select * from teacher where id=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Teacher ID: "+rs.getInt(1));//get int cloumn intext
				System.out.println("Teacher Name: "+rs.getString("name"));//get String column Name
				System.out.println("Teacher Email: "+rs.getString(3));//get String column Index
				System.out.println("Teacher Salary: "+rs.getInt("Salary"));//get int column Name
				System.out.println("================================================");	
			}
			else
			{
				System.out.println("ID not present!!");
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
