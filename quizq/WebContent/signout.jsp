<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="backNoWork.js" type="text/javascript"></script>
    </head>
    <body>
<h1>signed out successfully</h1>
<%            response.setHeader("Pragma", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Expires", "0");
response.setDateHeader("Expires", -1); 
    session.setAttribute("uid", null);
    session.invalidate();
    
 //prevents caching at the proxy server
 
%>
 <a href="final.html" class="right">HOME</a>
</body>
</html>