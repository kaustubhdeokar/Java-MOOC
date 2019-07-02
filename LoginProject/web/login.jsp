<%-- 
    Document   : login
    Created on : 21 Jun, 2019, 8:48:27 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .split{
                width:100%;
                position:fixed;
            }
            .top{
                height:25%;
                top:0;
            }
            .bottom{
                height:75%;
                bottom:0;
            }
            body{
               background-image:url('crop.jpeg');
               background-repeat:no-repeat;
               background-color: #2f2f2f; /* White */

            }
            .input{
                width:100;
            }
        </style>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 
    </head>
    <body>
    <centre>  
        
        <div class="col-sm-6">
            Lorem Ipsum
        </div>
        
        <div class="form-group col-sm-6" style="background-color: #2f2f2f;">
            <form action="Login" method="post" class="split bottom">
            Enter username:<input type="text" value="username" style="width:300px;border-radius: 20px;" name="uname"><br>
            <br>
            Enter password:<input type="password" value="" style="width:300px;border-radius: 20px;"  name="pass"><br>
            <br>
            <input type="submit" value="Submit">
        </form>
        </div>
    </centre>
        <script src="vendor/jquery/jquery.min.js"></script>
      <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </body>
</html>
