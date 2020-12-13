<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.nhanvien" %>
<%@ page import="java.util.ArrayList" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Sua Thong Tin Sinh Vien</title>
</head>
<body>
	<h3>Sửa thông tin sinh viên</h3>
	<% 	
		ArrayList<nhanvien> userArray = (ArrayList<nhanvien>)request.getAttribute("userArray");
	%>
	<form action="CapNhatNhanVien" method="post">
		<table>
			<tr>
				<td>IDNV:</td>
			
				<td><input type="text" name="IDNV"  value="<%= userArray.get(0).getIDNV()%>" ></td>
			</tr>
			<tr>
				<td>Hoten</td>
				<td><input type="text" name="Hoten" value="<%= userArray.get(0).getHoten() %>" ></td>
			</tr>
			<tr>
				<td>IDPB</td>
				<td><input type="text" name="IDPB" value="<%= userArray.get(0).getIDPB() %>"></td>
			</tr>
			<tr>
				<td>Diachi</td>
				<td><input type="text" name="Diachi" value="<%= userArray.get(0).getDiaChi()%>"></td>
			</tr>
			<tr>
				<td>	
					<input type="submit" value="Cập nhật"/>
				</td>
				<td>	
					<input type="button" value="Quay lại">	
				</td>	
			</tr>
		</table>
		
	</form>
</body>
</html>