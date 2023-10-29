<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nisarata
  Date: 29/10/2023 AD
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Subject List</title>
</head>
<body>
    <div>
        <table>
            <tr>
                <td>No</td>
                <td>Subject code</td>
                <Td>Title</Td>
                <td>Credit</td>
                <td>Select</td>
            </tr>

                <c:forEach items="${subjects}" var="s" varStatus="vs">
                    <tr>
                        <td>${vs.count}</td>
                        <td>${s.id}</td>
                        <td>${s.title}</td>
                        <td>${s.credit}</td>
                        <td><input type="checkbox" value="${s.id}" name="s"}></td>
                    </tr>
                </c:forEach>
               <%-- //ข้อมูลอยู่ใน list list อยู่request  --%>


        </table>
    </div>
</body>
</html>
