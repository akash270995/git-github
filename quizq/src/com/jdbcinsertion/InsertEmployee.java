package com.jdbcinsertion;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.util.JdbcConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class InsertEmployee extends HttpServlet {
	Connection con=null;

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }


	

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	doPost(request,response);
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String prof_id=request.getParameter("prof_id");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String institute=request.getParameter("institute");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		long contact_num=Long.parseLong(request.getParameter("contact_num"));
		String sec_ques=request.getParameter("securityques");
		String sec_ans=request.getParameter("securityans");
		String password=request.getParameter("psw");
		Connection con;
		JdbcConnection c=new JdbcConnection();
		con=c.createConnection();
		//System.out.println("inserting");
		
		
		try
		{
			 
			String sql="INSERT INTO professor values ('"+prof_id+"','"+fname+"','"+lname+"','"+institute+"','"+email+"','"+gender+"',"+contact_num+",'"+sec_ques+"','"+sec_ans+"','"+password+"')";
			PreparedStatement stmt= con.prepareStatement(sql);
			
			stmt.executeUpdate();
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Error while inserting record "+e);
			e.printStackTrace();
		}
		out.println("<script>alert(\"PROFESSOR SUCCESSFULLY REGISTERED\");</script>");
		RequestDispatcher rd=request.getRequestDispatcher("final.html");
		rd.forward(request, response);
}
}
