<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="mvc.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta cha
rset="ISO-8859-1">
<title>Quiz </title>
<style>
.abc{
background-color: gray;
}

</style>
</head>
<body>
<h1>Questions are displaying</h1>
<%
ArrayList<questions> list = (ArrayList<questions>)request.getAttribute("questions"); 

%>
   

<%
if(request.getAttribute("questions") != null)  // Null check for the object
{
	%>
<table class="tg">


 
  <%
 Iterator<questions> iterator = list.iterator(); %> 
 <form action="validate.jsp"  method="post" >
 <% int i=1;
 while(iterator.hasNext())  // iterate through all the data until the last record
 {
	 questions q = iterator.next();
	%>
    <% out.println(i);%>
    
    <label ><%=q.getQuestion()%></label><br>
    <div class="abc">
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption1()%>" required><%=q.getOption1()%><br>
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption2()%>"><%=q.getOption2()%><br>
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption3()%>"><%=q.getOption3()%><br>
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption4()%>"><%=q.getOption4()%><br>
    <br>
    <br>
    </div>
   <%
   i++;
 }%>

 <input type="submit" value="submit">
 </form>
 <% 
}
else
{%>
	<h3>No Results</h3>
	<%
}
%>
  </table>


 
 <br>

</body>
</html>