
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Interior Coche</title>
</head>
<body>
<h2>Aquí tiene el interior del vehículo</h2>
<%
    String color = request.getParameter("color");
    String material = request.getParameter("material");
    String imagen = color + material + ".jpg";

    out.print("<img src = " + imagen + ">");
%>

</body>
</html>
