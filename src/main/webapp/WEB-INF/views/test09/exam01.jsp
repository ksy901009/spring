<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/inc_menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	$(document).ready(function() {
		$("#btnLogin").click(function(){
			if(confirm('로그인하시겠습니까?')) {
				var param = {
						"id" : $("#id").val(),
						"name" : $("#name").val(),
						"email" : $("#email").val()
				}
				var url = "${path}/test09/test09Proc.do";
				
				$.ajax({
					type: "post",
					data: param,
					url: url,
					success: function(data) {
						$("#result").html("id: " + data.id + ", name: " + data.name + ", email: " + data.email);
					}
				});
			}
		});
	});
</script>
</head>
<body>

<h2>test09.do / exam01.jsp</h2>

<h2>로그인</h2>

id : <input type="text" name="id" id="id"><br>
name : <input type="text" name="name" id="name"><br>
email : <input type="text" name="email" id="email"><br>
<input type="button" id="btnLogin" value="로그인">

<div id="result"></div>
</body>
</html>