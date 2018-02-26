<%@page import="com.gopi.dao.UserDao"%>
<jsp:useBean id="u" class="com.gopi.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDao.delete(u);
response.sendRedirect("viewusers.jsp");
%>