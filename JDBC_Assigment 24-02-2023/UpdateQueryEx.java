package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQueryEx {

	public static void main(String[] args) {
		try(Connection conn= DatabaseConnection.getConnection();
				Scanner sc= new Scanner(System.in))
		{
			System.out.println("Enter name to update:");
			String name= sc.nextLine();
			
			System.out.println("Enter email to update:");
			String email= sc.nextLine();
			
			System.out.println("Enter salary to update:");
			String sal= sc.nextLine();
			
			String query="update teacher set name='"+name+"', email='"+email+"',"
					+ "salary='"+sal+"' where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			
			System.out.println("Enter id:");
			int id = sc.nextInt();
			
			ps.setInt(1, id);
			int row=ps.executeUpdate();
			System.out.println(row+" record update successfully!!");
			
			System.out.println();
			String query1="select * from teacher where id='"+id+"'" ;
			PreparedStatement ps1=conn.prepareStatement(query1);
			
			ResultSet rs=ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Teacher ID: "+rs.getInt(1));//get int cloumn intext
				System.out.println("Teacher Name: "+rs.getString("name"));//get String column Name
				System.out.println("Teacher Email: "+rs.getString(3));//get String column Index
				System.out.println("Teacher Salary: "+rs.getInt("Salary"));//get int column Name
				System.out.println("================================================");	
			}
			else
				System.out.println("ID not found!!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
