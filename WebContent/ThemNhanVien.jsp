<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title></title>
</head>
<body>
	<h3>Thêm nhân viên</h3>
	
	<form action="ThemNhanVien" method="post">
		<table>
			<tr>
				<td>IDNV:</td>
			
				<td><input type="text" name="IDNV"></td>
			</tr>
			<tr>
				<td>Hoten</td>
				<td><input type="text" name="Hoten"></td>
			</tr>
			<tr>
				<td>IDPB</td>
				<td><input type="text" name="IDPB"></td>
			</tr>
			<tr>
				<td>Diachi</td>
				<td><input type="text" name="Diachi"></td>
			</tr>
			<tr>
				<td>	
					<input type="submit" value="Thêm Nhân Viên"/>
				</td>
				<td>	
					<input type="button" value="Quay lại">	
				</td>	
			</tr>
		</table>
		
	</form>
</body>
</html>