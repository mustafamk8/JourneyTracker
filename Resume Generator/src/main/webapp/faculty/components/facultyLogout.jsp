<%@page import="com.resume.bean.Faculty"%>
<%
 Faculty faculty = (Faculty)session.getAttribute("current-user");
if (faculty == null) {
	session.setAttribute("message", "You are not logged in !! login First");
	response.sendRedirect("role.jsp");
	return;
}
%>
<%
response.addHeader("pragma", "no-cache");
response.addHeader("cache-control", "no-store");
response.addHeader("expire", "0");
%>