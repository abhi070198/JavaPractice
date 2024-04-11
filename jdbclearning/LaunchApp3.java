package com.abhi.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp3 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbclearning";
		String user="root";
		String password="A11$@#+&baa";
		
		//Establish the connection
		Connection connect = DriverManager.getConnection(url, user, password);
		
		//creating statement
		Statement statement = connect.createStatement();
		
		String sql="select * from studentInfo";
		//execute query
		ResultSet rs=statement.executeQuery(sql);
		
		//process the result
		while(rs.next())
		{
			//int id=rs.getInt(1);
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("sage")+" "+rs.getString(4));
		}
		
		//close the resources
		rs.close();
		statement.close();
		connect.close();
		
	}
}
