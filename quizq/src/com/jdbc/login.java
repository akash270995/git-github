package com.jdbc;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname=request.getParameter("fname"+" "+"lname");
        String user_id = request.getParameter("uid");
        String pass = request.getParameter("psw");
        
        if(validate.checkStudent(user_id, pass))
        { 
        	HttpSession session=request.getSession();

        	session.setAttribute("uid",user_id);
        	session.setAttribute("uname",uname);
      
            RequestDispatcher rs = request.getRequestDispatcher("studentloginpage.html");
            rs.include(request, response);
            out.println("<script>");
            out.println("alert('Successfully loged in')");
            out.println("</script>");
      
        }
        else if(validate.checkProfessor(user_id, pass))
        {
        	HttpSession session=request.getSession();
        	session.setAttribute("uid",user_id);
        	session.setAttribute("uname",uname);
            RequestDispatcher rs = request.getRequestDispatcher("proffesorloginpage.html");
            rs.forward(request, response);
        }
        else
        {           RequestDispatcher rs = request.getRequestDispatcher("final.html");
                    rs.include(request, response);
                    out.println("<script>alert(\"incorrect username or password\");</script>");
           

        }
    }  
}