<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
  <jsp:useBean id="snr" class="com.gopi.jee.ValidateBean" />

  <jsp:setProperty name="snr" property="user" />
  <jsp:setProperty name="snr" property="pass" />

  You entered user name as <jsp:getProperty name="snr" property="user" /> <br>

  You entered user password as <jsp:getProperty name="snr" property="pass" /> <br>

  <br>

  You are a <%= snr.validate("Gopinathan", "java") %> user.  <br>

  <b>Thank You</b>
</body>
</html>