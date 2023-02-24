package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRcordUsingPS {

	public static void main(String[] args) {
		try(Connection conn= DatabaseConnection.getConnection();
				Scanner sc= new Scanner(System.in))
		{
			String sql="Delete from teacher where ID=? ";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			System.out.println("Enter ID which you want to delete:");
			int id=sc.nextInt();
		
			ps.setInt(1, id);
			int row =ps.executeUpdate();//execute updating for insert query
			
			System.out.println(row+ " record delete successfully!!");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
