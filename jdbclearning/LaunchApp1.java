package com.abhi.jdbclearning;
import java.sql.*;

public class LaunchApp1 
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
		String sql="insert into studentInfo(id,sname,sage,scity) values (2, 'abhii',25, 'bhopal')";
		int rowAffected=statement.executeUpdate(sql);
		
		//process the result
		if(rowAffected==0)
		{
			System.out.println("unable to insert data");
		}
		else
		{
			System.out.println("data inserted succesfully");
		}
		
		//close the resources
		statement.close();
		connect.close();
		

	}

}
