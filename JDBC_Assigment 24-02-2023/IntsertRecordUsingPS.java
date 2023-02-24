package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class IntsertRecordUsingPS {

	public static void main(String[] args) {
		//try with resource
		try(Connection conn= DatabaseConnection.getConnection();
		Scanner sc= new Scanner(System.in))
		{
			String sql="insert into teacher values(?,?,?,?)";//insert record using statement
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			
			System.out.println("Enter email:");
			String email=sc.nextLine();
			
			System.out.println("Enter salary:");
			int salary=sc.nextInt();
			
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, salary);
			
			int row =ps.executeUpdate();//execute updating for insert query
			
			System.out.println(row+ " record inserted successfully!!");
			
			System.out.println();
			String query="Select * from teacher where id='"+id+"'";
			PreparedStatement ps1=conn.prepareStatement(query);
			
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
