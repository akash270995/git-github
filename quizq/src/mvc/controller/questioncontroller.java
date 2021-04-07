package mvc.controller;
import mvc.service.*;
import mvc.DAO.*;
import mvc.bean.questions;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class questioncontroller extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	@Override
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doPost(request,response);
//	}
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html;charset=UTF-8");
	 HttpSession session=request.getSession();
	 QuestionServices questionservices=new QuestionServices();
	 String trigerform=request.getParameter("getbutton");
	 System.out.println("its controller");
	 
	  if(trigerform.equals("viewquestionjava1"))
	 {   
		 String quiz_id="q01";
		 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
		 request.setAttribute("questions", a);
		 for(int i=0;i<a.size();i++)
		 {
			 System.out.println(a);
		 }
		 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
		 rd.forward(request, response); 
	 }	
	  
	  else if(trigerform.equals("viewquestionjava2"))
		 {   
		     String quiz_id="q02";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }
	  
	  else if(trigerform.equals("viewquestionjava3"))
		 {   
			 
		     String quiz_id="q03";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }	
	  
	  else if(trigerform.equals("viewquestionhtml1"))
		 {   
			 
		     String quiz_id="q11";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }	
	  
	  else if(trigerform.equals("viewquestionhtml2"))
		 {   
			 
		     String quiz_id="q12";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }	
	  
	  else if(trigerform.equals("viewquestionhtml3"))
		 {   
		     String quiz_id="q13";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 //System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }
	  
	  else if(trigerform.equals("viewquestionpython1"))
		 {   
			 
		     String quiz_id="q21";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }
	  
	  else if(trigerform.equals("viewquestionpython2"))
		 {   
			 
		     String quiz_id="q22";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }
	  
	  else if(trigerform.equals("viewquestionpython3"))
		 {   
			 
		     String quiz_id="q23";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }
	  
	  else if(trigerform.equals("viewquestionc1"))
		 {   
			 
		     String quiz_id="q01";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 //System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("aa.jsp"); 
			 rd.forward(request, response); 
		 }
	  
	  else if(trigerform.equals("viewquestionc2"))
		 {   
			 
		     String quiz_id="q02";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }
	  
	  else if(trigerform.equals("viewquestionc3"))
		 {   
			 
		     String quiz_id="q03";
			 ArrayList<questions> a=questionservices.viewquestions(quiz_id);
			 request.setAttribute("questions", a);
			 for(int i=0;i<a.size();i++)
			 {
				 System.out.println(a);
			 }
			 RequestDispatcher rd = request.getRequestDispatcher("viewquestions.jsp"); 
			 rd.forward(request, response); 
		 }
}
}
