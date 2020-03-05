<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>El_trile</title>
</head>
<body>
    <%
      int vaso = Integer.parseInt(request.getParameter("vaso"));
      int vasoGanador = (int)(Math.random() * 3 ) + 1;
      if (vasoGanador == vaso) {
        out.print("<h1> Has acertado </h1>");
      } else {
        out.print("<h1> Has perdido </h1>");
      }
        System.out.println(vaso + " " + vasoGanador);

        for (int i = 1; i <= 3 ; i++) {
          if (i == vasoGanador) {
            out.print("<img src= \"cubilete_con_1bola.png\"> ");
          } else {
              out.print("<img src= \"cubilete_sin_bola.png\"> ");
          }
        }
    %>
    <a href="index.jsp"><button>Volver atrás</button></a>

</body>
</html>
