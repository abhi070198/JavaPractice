package com.abhi.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Launch4 
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
		String sql="delete from studentInfo where id=2";
		int rowAffected=statement.executeUpdate(sql);
		
		//process the result
		if(rowAffected==0)
		
			System.out.println("failed to delete record");
		else
			System.out.println("record deleted succesfully");
		
		
		//close the resources
		//rs.close();
		statement.close();
		connect.close();
		
	}

}
