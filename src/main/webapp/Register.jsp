<%--
  Created by IntelliJ IDEA.
  User: Hail
  Date: 2023/3/15
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>


<%@include file="header.jsp"%>
<from method="post" action="register">
    Username:<input type="text" name="username"/><br/>
    password:<input type="password" name="password"/><br/>
    Email:<input type="email" name="email"/><br/>
    Gender<input type="radio" name="gender" value="Male">Male <input type="radio" name="gender" value="Female">Female<br>
    Date of Birth:<input type="text " name="birthDate" placeholder="Date of Birth"><br/>
    <input type="submit" value="register"/>

</from>

<%@include file="footer.jsp"%>

