<%@ page language="java" import="java.util.*, java.lang.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	
	<%  
	// retrieve your list from the request, with casting 
	JSONStringsArrayList = (ArrayList<String>) request.getAttribute("UserRequest");
	
	// print the information about every category of the list
	for(String string : JSONStringsArraylist) {
	    out.println(string.getList());
	}
	%>

</body>
</html>