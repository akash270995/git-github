package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.util.JdbcConnection;

public class Changepassword extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        
	        
	        
	        PrintWriter out = response.getWriter();
	        
	        String user_id = request.getParameter("uid");
	        String secques = request.getParameter("securityques");
	        String secans = request.getParameter("securityans");
	        String password=request.getParameter("psw");
	        
	        System.out.println(user_id);
	        System.out.println(secques);
	        System.out.println(secans);
	        System.out.println(password);
	        
	        
	        if(validate.changepasswordstudent(user_id,secques,secans))
	        { 
	        	try
	        	{
	        	JdbcConnection j=new JdbcConnection();
		        Connection con=j.createConnection();
		        PreparedStatement ps= con.prepareStatement("update student set password ='"+password+"' where student_id ='"+user_id+"'");
		       // ps.setString(1, password);
		       //ps.setString(2, user_id);
		        //System.out.println(password);
		        //System.out.println(user_id);
		        ps.executeUpdate();
		        con.close();
		        response.setContentType("text/html");
		        out.println("<script>alert(\"PASSWORD IS SUCCESSFULLY UPDATED\");</script>");
		       RequestDispatcher rs = request.getRequestDispatcher("final.html");
                rs.include(request, response);
                
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println("error");
	        	}
	        }
	        else if(validate.changepasswordprofessor(user_id,secques,secans))
	        {
	        	try
	        	{
	        	JdbcConnection j=new JdbcConnection();
		        Connection con=j.createConnection();
		        PreparedStatement ps= con.prepareStatement("update professor set password ='"+password+"' where professor_id ='"+user_id+"'");
		        //ps.setString(1, password);
		        //ps.setString(2, user_id);
		        
		        ps.executeUpdate();
		        con.close();
		        
		        RequestDispatcher rs = request.getRequestDispatcher("final.html");
                rs.forward(request, response);
                out.println("<script>alert(\"PASSWORD IS SUCCESSFULLY UPDATED\");</script>");
	        	}
	        	catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	        	
	        }
	        else
	        {           RequestDispatcher rs = request.getRequestDispatcher("forgotpassword.html");
	                    rs.include(request, response);
	                    out.println("<script>alert(\"incorrect security question or answer\");</script>");
	           

	        }
	       
	    }  
}
