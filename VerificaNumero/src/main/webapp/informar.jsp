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

int number = Integer.parseInt(request.getParameter("numero53"));
int resto = number %2;

if (resto == 0 ){
	out.print("Seu número é par!");
	
}else {
	out.print("Seu número é impar!");
}

%>

</body>
</html>