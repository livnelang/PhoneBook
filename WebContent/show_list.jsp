<%@ page language="java" contentType="text/html; charset=windows-1255"
	import="java.util.HashMap,com.livne.lang.model.Contact"
    pageEncoding="windows-1255"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/default.css">
<meta charset="utf-8">
<title>Insert title here</title>
</head>
	<body>
		<div id="wrapper">
			<header>
				<nav>
					<ul id="top_nav">
						<li><a href="#">Home</a></li>
						<li><a href="#">Add</a></li>
						<li><a href="show_contact_list">Show People</a></li>
						<li><a href="#">Sort</a></li>
					</ul>
				</nav>
			</header>
				<main>
					<form id="myform" action="/PhoneBook/controller/add">
						<table>
						<% 
							HashMap<Integer, Contact> contacts = new HashMap<Integer,Contact>((HashMap)(session.getAttribute("phonebook")));
							for ( Contact cont : contacts.values() )  {
								%>
								<tr><td><%=cont.toString() %></td></tr>
								<%
								}
								%>
								
							
						</table>
					</form>
				</main>
		</div>
	
	
	
	</body>
		

</html>