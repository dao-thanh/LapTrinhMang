<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title></title>
</head>
<body>
	<h3>Thêm phòng ban</h3>
	
	<form action="ThemPhongBan" method="post">
		<table>
			<tr>
				<td>IDPB:</td>
			
				<td><input type="text" name="IDPB"></td>
			</tr>
			<tr>
				<td>Tenpb</td>
				<td><input type="text" name="Tenpb"></td>
			</tr>
			<tr>
				<td>Mota</td>
				<td><input type="text" name="Mota"></td>
			</tr>
			<tr>
				<td>	
					<input type="submit" value="Thêm Phòng Ban"/>
				</td>
				<td>	
					<input type="button" value="Quay lại">	
				</td>	
			</tr>
		</table>
		
	</form>
</body>
</html>