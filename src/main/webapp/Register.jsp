<%--
  Created by IntelliJ IDEA.
  User: Hail
  Date: 2023/3/15
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Code Exercise2" %>
</h1>
<br/>
New User Registration! <br/>
<from method="post" action="register">
    Username:<input type="text" name="username"/><br/>
    password:<input type="password" name="password"/><br/>
    Email:<input type="email" name="email"/><br/>
    Gender<input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female<br>
    Date of Birth:<input type="text " name="birthDate" placeholder="Date of Birth"><br/>
    <input type="submit" value="register"/>

</from>
</body>
</html>
