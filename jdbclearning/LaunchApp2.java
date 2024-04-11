package com.abhi.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp2 
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
		
		//execute query
		String sql="update studentInfo set sage = 28 where id=2";
		int rowAffected=statement.executeUpdate(sql);
		if(rowAffected==0)
			System.out.println("updation failed");
		else
			System.out.println("update succesfully");
		
		//process the result
		
		
		//close the resources
		statement.close();
		connect.close();
		
	}
}
