<%--
  Created by IntelliJ IDEA.
  User: gonza
  Date: 12/02/2020
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabla de Multiplicar</title>
    <table>
    <%
        int numero = Integer.parseInt(request.getParameter("numero"));
        for (int i = 0; i < 11; i++) {
          out.print("<tr><td>" + numero + " X " + i + "</td><td> = </td><td>" + numero * i + "</td></tr>");

        }
    %>
    </table>
</head>
<body>

</body>
</html>
