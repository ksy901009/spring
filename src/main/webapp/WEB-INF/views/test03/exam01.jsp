<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/inc_menu.jsp" %>

<h2>test03.do / exam01.jsp</h2>

<form action="test03Proc.do" method="post">
	이름 : <input type="text" name="name" id="name" value=""><br>
	성별 : <input type="text" name="gender" id="gender" value=""><br>
	주민등록번호 : <input type="text" name="jumin" id="jumin" value=""><br>
	나이 : <input type="text" name="age" id="age" value=""><br>
	<input type="submit" value="확인">
</form>