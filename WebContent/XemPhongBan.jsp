<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>  
<%@page import="model.bean.phongban" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Login page</title>
</head>
<body>
		
		<% 	
			ArrayList<phongban> userArray = (ArrayList<phongban>)request.getAttribute("userArray");
		%>
	<caption><font color="#FF6600" size="5">Thông tin phòng ban</font></caption>	
	<div style="text-align:right;">
		<form action="TimKiemPhongBan" method="post">
			<input type="text" name="tenphongban"/>
			<input type="submit" value="Tìm kiếm"/>
		</form>
	</div>
	<table border="2" width="100%">
	
		<tr>
			<th>IDPB</th>
			<th>Tenpb</th>
			<th>Mota</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
			for(int i = 0; i<userArray.size();i++){
		%>
	
		<tr>
			<td><%= userArray.get(i).getIDPB() %></td>
			<td><%= userArray.get(i).getTenpb() %></td>
			<td><%= userArray.get(i).getMota() %></td>
			<td>
       			<a href="XoaPhongBan?IDPB=<%= userArray.get(i).getIDPB()%>">delete</a>
       		</td>
			<td>
       			<a href="LayPhongBan?IDPB=<%= userArray.get(i).getIDPB()%>">update</a>
       		</td>	
		</tr>
		<%
			}
		%>
	</table>
	<a href="ThemPhongBan.jsp"><input type="button" value = "Thêm Phòng Ban"></a>
</body>
</html>