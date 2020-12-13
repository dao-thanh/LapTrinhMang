<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.bean.phongban" %>
<%@ page import="java.util.ArrayList" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Sua Thong Tin Phong Ban</title>
</head>
<body>
	<h3>Sửa thông tin phòng ban</h3>
	<% 	
		ArrayList<phongban> userArray = (ArrayList<phongban>)request.getAttribute("userArray");
	%>
	<form action="CapNhatPhongBan" method="post">
		<table>
			<tr>
				<td>IDPB:</td>
			
				<td><input type="text" name="IDPB"  value="<%= userArray.get(0).getIDPB()%>" ></td>
			</tr>
			<tr>
				<td>Tenpb</td>
				<td><input type="text" name="Tenpb" value="<%= userArray.get(0).getTenpb() %>" ></td>
			</tr>
			<tr>
				<td>Mota</td>
				<td><input type="text" name="Mota" value="<%= userArray.get(0).getMota()%>"></td>
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