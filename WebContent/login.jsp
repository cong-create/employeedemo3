<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body background="${initParam.root}/images/bj.jpg">
	<form action="${initParam.root}/login.do" method="post">
		<fieldset style="width: 240px;position: absolute;top:220px;left:550px">
			<legend>用于登录</legend>
			<table>
				<tr>
					<td colspan="2">
						${msg }
					</td>
				</tr>
				<tr>
					<td>
						用户名：
					</td>
					<td>
						<input type="text" name="uname">
					</td>
				</tr>
				<tr>
					<td>
						密码：
					</td>
					<td>
						<input type="password" name="upass">
					</td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="登录">
					</td>
				</tr>
			</table>
		</fieldset>
	
	</form>
</body>
</html>