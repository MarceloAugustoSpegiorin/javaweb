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


int num = Integer.parseInt(request.getParameter("numero"));
int quantidade = Integer.parseInt(request.getParameter("quantidade"));
for(int i=1; i<=quantidade; i=i+1){
	out.print("\n"+num+" x "+i+"= "+(num*i)+ "<br>");		
}

%>

</body>
</html>