<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:forTokens items="Shahrukh-Amir-Salman" delims="-" var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>  
</body>  
</html>