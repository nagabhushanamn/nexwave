<!DOCTYPE html>
<%@page import="com.app.model.Person" %>
<%@taglib uri="http://wissen.com/my-tags" prefix="my" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pm-app</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">


	<div class="page-header">JSP Learn</div>
	
	<%-- <%@include file="banner.html" %> --%>

	<%
		Person p = (Person) request.getAttribute("person");
	%>
	
	<!-- HTML comment <%=1+2 %> -->
	<%-- JSP comment  <%=1+2 %> <h1>Hello</h1> --%>
	
	<pre>
		Id   : <%=p.getId() %>
		Name : <%=p.getName() %>
		Age  : <%=p.getAge() %>
		Dog  : <%=p.getDog().getName() %>
	</pre>

	<jsp:useBean id="person" class="com.app.model.Person" scope="request"></jsp:useBean>
	<pre>
		Id   : <jsp:getProperty property="id" name="person"/>
		Name : <jsp:getProperty property="name" name="person"/>
		Age  : <jsp:getProperty property="age" name="person"/>
	</pre>
	
	
	<pre>
	
		Id   : ${person.id}
		Name : ${person.name} ${person['name'] }
		Age  : ${person.age}
		Dog  : ${person.dog.name}
	
	</pre>


	 <pre>
	 	<h1><my:person /></h1>
	 </pre> 
	 
	 
	 
	 
	 
	 <c:if test="${false}">
	 	<h1> Today Holiday </h1>
	 </c:if>
	 
	 <c:choose>
	 	<c:when test="true">
	 		<h1>Hello</h1>
	 	</c:when>
	 	<c:when test="true">
	 		<h1>Hi</h1>
	 	</c:when>
	 	<c:otherwise>
	 		<h1>Bye</h1>
	 	</c:otherwise>
	 </c:choose>
	 
	 
	 
	 
	 
	 <c:forEach var="i" begin="1" end="10">
	 	<h1> need off today</h1>
	 </c:forEach>
	 
	 <%
	 	String[] menu={"Biryani","Mutton","CHicken"};
	    request.setAttribute("todaysMenu", menu);
	 %>
	 
	 <c:forEach var="item" items="${todaysMenu}">
	 	<h1> ${item}</h1>
	 </c:forEach>
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


</body>
</html>