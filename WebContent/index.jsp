<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户界面</title>
	<script type="text/javascript">
		var result = "${result}";
		if(result=="add"){
			alert("新增成功")
		}else if(result=="update"){
			alert("更新成功")
		}else if(result=='delete'){
			alert("删除成功")
		}
	</script>
</head>
<body>
	<div style="position: absolute;left:350px;top:100px">
		<input type="button" value="新增" onclick="location.href='${initParam.root}/add.jsp'">
		<shiro:hasRole name="role1">
			<input type="button" value="人员管理" >
		</shiro:hasRole>
		<shiro:hasRole name="role2">
			<input type="button" value="薪资管理" >
		</shiro:hasRole>
		<table border="1" cellspacing="0px" cellpadding="5px" width="600px">
			<tr align="center">
				<td>编号</td>
				<td>用户名</td>
				<td>年龄</td>
				<td>电话</td>
				<td>地址</td>
				<td>编辑</td>
			</tr>
			<c:forEach items="${emps}" var="emp" >
				<tr align="center">
				<td>${emp.id }</td>
				<td>${emp.uname }</td>
				<td>${emp.age}</td>
				<td>${emp.phone }</td>
				<td>${emp.address }</td>
				<td>
					<input type="button" value="修改" onclick="location.href='${initParam.root}/getempbyid.do?id=${emp.id }'">
					<input type="button" value="删除" onclick="location.href='${initParam.root}/delete.do?id=${emp.id }'">
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>