<%--
  Created by IntelliJ IDEA.
  User: OFedorenko
  Date: 01/28/20
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
    <title>Registration</title>

    <form name="RegistrationForm" method="post" action="registration">
        Username: <input type="text" name="username"/> <br/>
        Password: <input type="password" name="password"/> <br/>
        E-mail: <input type="text" name="email"/> <br/>
        First Name: <input type="text" name="firstName"/> <br/>
        Last Name: <input type="text" name="lastName"/> <br/>
        Date of Birth: <input type="date" name="dob"/> <br/>
        <input type="submit" value="register"/>
    </form>
</body>
</html>
