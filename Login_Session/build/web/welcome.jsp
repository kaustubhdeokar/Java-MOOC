<%-- 
    Document   : welcome
    Created on : 21 Jun, 2019, 8:48:37 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
        response.setHeader("Pragma","no-cache");
        response.setHeader("Expires","0");
        if(session.getAttribute("uname")==null){
            response.sendRedirect("login.jsp");
        }
        %>
        
        Welcome ${uname}

        <a href="videos.jsp">Videos</a>
    </body>
</html>
