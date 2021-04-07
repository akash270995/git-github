package com.jdbc;
import DB.util.*;

import java.sql.*;

public class validate {
	
    public static boolean checkStudent(String student_id,String password) 
    {	 JdbcConnection j=new JdbcConnection();
          Connection con=j.createConnection();
        boolean st =false;
        try {

            //loading drivers for mysql
            

            //creating connection with the database
           
            PreparedStatement ps = con.prepareStatement("select * from student where student_id=? and password=?");
            ps.setString(1, student_id);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            
      
            st=rs.next();
           //System.out.println(st);
          con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
    public static boolean checkProfessor(String student_id,String password) 
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            

            //creating connection with the database
            JdbcConnection j=new JdbcConnection();
            Connection con=j.createConnection();
            PreparedStatement ps = con.prepareStatement("select * from professor where professor_id=? and password=?");
             ps.setString(1, student_id);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            
      
            st=rs.next();
            con.close();
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }  
    
    public static boolean changepasswordstudent(String user_id,String secques,String secans) 
    {	 JdbcConnection j=new JdbcConnection();
          Connection con=j.createConnection();
        boolean st =false;
        try {

            //loading drivers for mysql
            

            //creating connection with the database
           
            PreparedStatement ps = con.prepareStatement("select * from student where student_id=? and security_ques=? and sec_answer=?");
           
             ps.setString(1, user_id);
             ps.setString(2, secques);
             ps.setString(3, secans);
            
            ResultSet rs =ps.executeQuery();
            st=rs.next();
            System.out.println(st);
          
          con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
    public static boolean changepasswordprofessor(String user_id,String secques,String secans) 
    {	 JdbcConnection j=new JdbcConnection();
          Connection con=j.createConnection();
        boolean st =false;
        try {

            //loading drivers for mysql
            

            //creating connection with the database
           
            PreparedStatement ps = con.prepareStatement("select * from professor where professor_id=? and security_ques=? and sec_answer=?");
            
             ps.setString(1, user_id);
             ps.setString(2, secques);
             ps.setString(3, secans);
            // System.out.println(user_id);
            //System.out.println(secans);
            //System.out.println(secques);
            ResultSet rs =ps.executeQuery();
            st=rs.next();
            System.out.println(st);
          
          con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}