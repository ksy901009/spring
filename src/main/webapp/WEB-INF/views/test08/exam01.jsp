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
						"passwd" : $("#passwd").val()
				}
				var url = "${path}/test08/test08Proc.do";
				
				$.ajax({
					type: "post",
					data: param,
					url: url,
					success: function(data) {
						var dataArray = data.split("|");
						if(dataArray[0].trim() == 'hong' && dataArray[1].trim() == '1111') {
							$("#result").text("로그인 성공");
						} else {
							$("#result").text("로그인 실패");
						}
					}
				});
			}
		});
	});
</script>
</head>
<body>

<h2>test08.do / exam01.jsp</h2>

<h2>로그인</h2>

id : <input type="text" name="id" id="id"><br>
passwd : <input type="password" name="passwd" id="passwd"><br>
<input type="button" id="btnLogin" value="로그인">

<div id="result"></div>
</body>
</html>