<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int Nota1 = Integer.parseInt(request.getParameter("paramNota1"));
int Nota2= Integer.parseInt(request.getParameter("paramNota2"));
int Nota3 = Integer.parseInt(request.getParameter("paramNota3"));

int media = (Nota1+Nota2+Nota3)/3;

out.print("Sua média é: "+media);




%>
</body>
</html>