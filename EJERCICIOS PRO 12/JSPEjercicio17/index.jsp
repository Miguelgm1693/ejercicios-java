<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Color Interior Coche</title>
  </head>
  <body>
    <h2>SELECCIÓN DE COLOR INTERIOR DEL VEHÍCULO</h2>
    <h3>Selecciona el color de la tapicería del vehículo</h3>
    <form action="coche.jsp" method="POST">
      <select name="color">
        <option value="blanco">Blanco</option>
        <option value="berengena">Berenjena</option>
        <option value="negro">Negro</option>
      </select>

      <h3>Selecciona el Material de la tapicería:</h3>
        <select name="material">
          <option value="madera">Madera</option>
          <option value="carbono">Carbono</option>
        </select>
      <input type="submit">
      </form>

  </body>
</html>