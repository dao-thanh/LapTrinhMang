<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>  
<%@page import="model.bean.nhanvien" %>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Login page</title>
</head>
<body>
		
		<% 	
			ArrayList<nhanvien> userArray = (ArrayList<nhanvien>)request.getAttribute("userArray");
		%>
	<caption><font color="#FF6600" size="5">Thông tin nhân viên</font></caption>
	<div style="text-align:right;">
	<form action="TimKiemNhanVien" method="post">
		<input type="text" name="username"/>
		<input type="submit" value="Tìm kiếm"/>
	</form>
	</div>
	<table border="2" width="100%">
		<tr>
			<th>IDNV</th>
			<th>Hoten</th>
			<th>IDPB</th>
			<th>DiaChi</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
			for(int i = 0; i<userArray.size();i++){
		%>
	
		<tr>
			<td><%= userArray.get(i).getIDNV() %></td>
			<td><%= userArray.get(i).getHoten() %></td>
			<td><%= userArray.get(i).getIDPB() %></td>
			<td><%= userArray.get(i).getDiaChi() %></td>
			<td>
       			<a href="XoaNhanVien?IDNV=<%= userArray.get(i).getIDNV()%>">delete</a>
       		</td>
			<td>
       			<a href="LayNhanVien?IDNV=<%= userArray.get(i).getIDNV()%>">update</a>
       		</td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="ThemNhanVien.jsp"><input type="button" value = "Thêm Nhân Viên"></a>	
</body>
</html>