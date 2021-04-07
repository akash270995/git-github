<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="mvc.bean.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz </title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>

body{
background-image: url(quiz.jpg);
background-position: cover;
}
.quiz{
border-radius: 25px;
  background: bisque;
  background-position: left top;
  background-repeat: repeat;
  padding: 20px; 
  margin:auto;
  width: 50%;
  height: 400px; 
 
}
.abc{
background-color: gray;
 margin:0 auto;

border-radius: 25px;
  border: 2px solid #73AD21;
  padding: 20px; 
  width: auto;
  height: auto;  
}


.def{
	background-image: linear-gradient(to right, rgba(255,0,0,0), rgba(255,0,0,1));
	  width: auto;
  height: auto; 

 margin:0 auto;

}

span {
    display: inline-block;
    width: 70px;
    height: 70px;
    margin: 6px;
    background-color: red;
}


</style>
</head>
<body>

<%
ArrayList<questions> list = (ArrayList<questions>)request.getAttribute("questions"); 

%>
   

<%
if(request.getAttribute("questions") != null)  // Null check for the object
{
	out.println("asdsds");
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
    
	
	
	
	<div class="quiz">
	<h1  class="text-center">Java Quiz</h1>
	

	<div class="def">
    <label><%=q.getQuestion()%></label><br>
	</div>
	<br>
    <div class="abc" >
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption1()%>" required><%=q.getOption1()%><br>
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption2()%>"><%=q.getOption2()%><br>
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption3()%>"><%=q.getOption3()%><br>
    <input type="radio" name="<%= q.getQuestion()%>" value="<%=q.getOption4()%>"><%=q.getOption4()%><br>
    
    </div>
	
   <%
   i++;
 }%>
 
 
<div class="col-sm-12 " style="text-align: center; margin-top: 10px;">
 <input type="submit" class="btn btn-danger" value="SUBMIT" >
 </div>
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