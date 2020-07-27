package com.anusha2;

import java.sql.*;

public class StatementDemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_jdbc","root","root");	
        Statement st=con.createStatement();
        String sqlQuery="insert into employees values('Aparna',408,30000,'banglore')";
      // String sqlQuery="delete from employees where en0=409";
     // String sqlQuery="update employees set ename='anu',esal=100000 where eno=490";
        int count=st.executeUpdate(sqlQuery);
        System.out.println("Record Inserted count:"+count);
        con.close();
        System.out.println("Connection closed");
        
	}

}
