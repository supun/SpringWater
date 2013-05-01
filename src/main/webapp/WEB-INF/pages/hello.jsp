<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="../templates/header.jsp" %>
<h1>Page with image</h1>
<!-- use c:url to get the correct absolute path -->
<img src="<c:url value="/resources/img/mvc2.png" />" />
	<h1>Message : ${message}</h1>	
<%@include file="../templates/footer.jsp" %>