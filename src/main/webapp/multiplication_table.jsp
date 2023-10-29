<%--
  Created by IntelliJ IDEA.
  User: nisarata
  Date: 30/10/2023 AD
  Time: 00:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Multiplication table</title>
</head>
<body>
<h3>Multiplication Table</h3>
<h6>Error ::<hr>
${requestScope.message} <span style="color: red">(${param.number})</span>
</h6>

</body>
</html>
