<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body bgcolor="lightpink">
<center>
<h1 style="color:blue">SDFC BANK</h1>
<h3 style="color:purple">EXTRADIONARY SERVICES</h3><p></p>
<p bgcolor="lime">
<a href="/">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/account">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/balance">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/deposit">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/withdraw">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/transfer">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/close">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/about">About Us</a>&nbsp;&nbsp;&nbsp;&nbsp;
</p>
<h1 style="color:blue">OPEN ACCOUNT FORM</h1>
<form:form action="/editu" method="POST">
<table>
<tr>
<td></td>
<td><form:hidden path="accountno"/></td>
</tr>
<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:input path="password"/></td>
</tr>
<tr>
<td>Amount:</td>
<td><form:input path="balance"/></td>
</tr>
<tr>
<td>Address:</td>
<td><form:input path="address"/></td>
</tr>
<tr>
<td>Mobile NO:</td>
<td><form:input path="mobileno"/></td>
</tr>
<tr>
<td>Status:</td>
<td><form:input path="status"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="editsave"></td>

</tr>

</table>
</form:form>
</center>
</body>