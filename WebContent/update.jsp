<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<form action="${initParam.root}/update.do" method="post">
		
			<table>
				
				<tr>
					<td colspan="2">
						<input type="hidden" name="flag" value="update">
					</td>
				</tr>
				<tr>
					<td>
						id：
					</td>
					<td>
						<input type="text" name="id" value="${emp.id }" readonly="readonly">
					</td>
				</tr>
				<tr>
					<td>
						用户名：
					</td>
					<td>
						<input type="text" name="uname" value="${emp.uname }">
					</td>
				</tr>
				<tr>
					<td>
						密码：
					</td>
					<td>
						<input type="password" name="upass" value="${emp.upass }">
					</td>
				</tr>				
				<tr>
					<td>
						年龄：
					</td>
					<td>
						<input type="text" name="age" value="${emp.age }">
					</td>
				</tr>
				<tr>
					<td>
						电话：
					</td>
					<td>
						<input type="text" name="phone" value="${emp.phone }">
					</td>
				</tr>
				<tr>
					<td>
						地址：
					</td>
					<td>
						<input type="text" name="address" value="${emp.address}">
					</td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="保存">
					</td>
				</tr>
			</table>
		
	</form>
</body>
</html>