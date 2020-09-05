<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Book Data</title>
</head>
<body>
<form action="reqinsrecord">
<br>Book ID<input type="text" name="bkid">
<br>Book Name<input type="text" name="bkname">
<br>Book Subject<input type="text" name="bksubject">
<br>Book Author<input type="text" name="bkauthor">
<br>Book Reference<input type="text" name="bkref">
<br>Book Price<input type="text" name="bkprice">
<br>Book Quantity<input type="text" name="bkqoh">
<br><input type="submit" value="Insert Book">
</form>
<br>
<table border="1">
 	<thead style="background-color:lightgreen">
 		<tr>
	 		<th>Book ID</th>
	 		<th>Book Name</th>
	 		<th>Book Subject</th>
	 		<th>Book Author</th>
	 		<th>Book Reference</th>
	 		<th>Book Price</th>
	 		<th>Book Quantity</th>
 		</tr>
 	</thead>
 	<tbody style="background-color:lightblue">
		<c:forEach items="${Book}" var="b">
			<tr>
				<td>${b.bkid}</td>
				<td>${b.bkname}</td>
				<td>${b.bksubject}</td>
				<td>${b.bkauthor}</td>
				<td>${b.bkref}</td>
				<td>${b.bkprice}</td>
				<td>${b.bkqoh}</td>
				<td><a href="reqdelrecord?bkid=${b.bkid}">delete</a></td>
    			<td><a href="reqeditrecord?bkid=${b.bkid}">Edit</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>