package com.dangol;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.ConnectionProvider;


public class Register extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		//System.out.println(username+" "+email+" "+password+" "+address+" "+contact);


		
		Connection connection = ConnectionProvider.getConn();
		try {
			String sql="INSERT INTO users (username,email,password,address,contact)" + "VALUES(?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			
			ps.setString(1,username);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.setString(4,address);
			ps.setString(5,contact);
			int i= ps.executeUpdate();
			if(i>0) 
			{
				//response.getWriter().println("data inserted");
				response.sendRedirect("index.html");
			}
			else
			{
				response.getWriter().println("data not inserted");
			}
			} 
		
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
