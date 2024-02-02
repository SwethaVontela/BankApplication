<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style>
	p{
	color:pink;
	background-color:pink;
}
</style>
<body bgcolor="lavender">
<center>
<h1 style="color:blue">SDFC BANK</h1>
<h3 style="color:purple">EXTRADIONARY SERVICES</h3>
<p style="color:aqua"; background-color:pink>
<a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/account">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/close">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/about">About Us</a>&nbsp;&nbsp;&nbsp;&nbsp;
</p>

<h1 style="color:blue">Transfer Form</h1>
<form:form action="/change" method="POST">
Account No:<input type="text" name="accountno"><p></p>
Name:<input type="text" name="name"><p></p>
Password:<input type="text" name="password"><p></p>
Target Account No:<input type="text" name="transferacno"><p></p>
Amount:<input type="text" name="transferamt"><p></p>
<input type="submit" value="submit">
<input type="reset" value="clear"><p></p>
</form:form>
</center>
</body>