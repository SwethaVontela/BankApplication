<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body bgcolor="lightblue">
<center>
<c:if test="${Banks==null}">
<p>Your Account Doesnot Exist</p>
</c:if>
<c:if test="${Banks!=null}">
<table border="1">
<tr>
<th>Account No</th>
<th>Name</th>
<th>Password</th>
<th>Amount</th>
<th>Address</th>
<th>Mobile No</th>

<th>Edit</th>
</tr>
<h3 style="color:purple">welcome ${Banks.name}</h3>
<tr>
<td>${Banks.accountno }</td>
<td>${Banks.name }</td>
<td>${Banks.password}</td>
<td>${Banks.balance}</td>
<td>${Banks.address}</td>
<td>${Banks.mobileno }</td>

<td><a href="/edit/${Banks.accountno}">Edit</a></td>
</tr>

</table>
</c:if>
</center>
</body>