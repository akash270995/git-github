<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="mvc.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<questions> list = (ArrayList<questions>)request.getAttribute("questions");
for(int i=0;i<list.size();i++)
{
	out.println(list);
}
/* try{
int count=0;

 Iterator<questions> iterator = list.iterator();
while(iterator.hasNext())
{
	 questions q= iterator.next();
     String ans=request.getParameter(q.getQuestion());
     if(ans.equals(q.getAnswer()))
     {
    	 count++;
     }
}
out.println("you have got"+count);
}
catch(NullPointerException e)
{ 
	out.println("ho");
	e.printStackTrace();
}*/
%>
</body>
</html>