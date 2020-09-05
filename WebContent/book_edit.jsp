<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="requpdaterecord?bkid=${Book.bkid}">
<br>Book ID<input type="text" name="bkid" value="${Book.bkid}" /readonly>
<br>Book Name<input type="text" name="bkname" value="${Book.bkname}">
<br>Book Subject<input type="text" name="bksubject" value="${Book.bksubject}">
<br>Book Author<input type="text" name="bkauthor" value="${Book.bkauthor}">
<br>Book Reference<input type="text" name="bkref" value="${Book.bkref}">
<br>Book Price<input type="text" name="bkprice" value="${Book.bkprice}">
<br>Book Quantity<input type="text" name="bkqoh" value="${Book.bkqoh}">
<br><input type="submit" value="Update Book">
</form>
</body>
</html>