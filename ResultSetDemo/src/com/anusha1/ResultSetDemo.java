package com.anusha1;
import java.sql.*;

public class ResultSetDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_jdbc","root","root");	
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employees");
        while(rs.next())
        {
        	System.out.println(rs.getString(1)+"..."+rs.getInt(2)+"..."+rs.getDouble(3)+"..."+rs.getString(4));
        	
        	
        }
        con.close();
}
}