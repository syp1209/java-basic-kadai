<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Servlet課題</title>
</head>

<body>
    <a href="<%= request.getContextPath() %>/sj/LinkServlet?name=侍太郎">名前「侍太郎」をServletに送信</a>
	<% 
		String name = request.getParameter("name");
		String text = (String) request.getAttribute("text");
		if (text != null) {
	%>
		<p><%= text %></p>
	<%
		} 
	%>

</body>

</html>


