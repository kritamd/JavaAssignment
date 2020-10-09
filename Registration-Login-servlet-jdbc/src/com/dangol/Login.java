package com.dangol;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.ConnectionProvider;


public class Login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		response.setContentType("text/html");
				
		Connection connection = ConnectionProvider.getConn();
		try {
			java.sql.PreparedStatement ps=connection.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				RequestDispatcher rd =request.getRequestDispatcher("Welcome");
				response.getWriter().println("Invalid username or password");
				rd.forward(request, response);
			}
			else
			{

				RequestDispatcher rd =request.getRequestDispatcher("index.html");
				response.getWriter().println("Invalid username or password");
				rd.include(request, response);
				
			}
			
	
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}}
