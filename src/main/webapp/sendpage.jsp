<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="sendmail">
			<label>TO</label> <input type="text" name="to"
				placeholder="Enter your E-mail"><br>
			<br> <label>Subject</label> <input type="text" name="sub"
				placeholder="Enter your subject"><br>
			<br> <label>Message</label> <input type="text" name="msg"
				placeholder="Enter your message"><br>
			<br> <input type="submit" value="Send Mail">
		</form>

	</div>
</body>
</html>