<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/inc_menu.jsp" %>

<h2>test07.do / exam01.jsp</h2>

<form action="test07Proc.do" method="post">
	상품분류 <input type="text" name="productGubun" id="productGubun" value=""><br>
	상품이름 <input type="text" name="productName" id="productName" value=""><br>
	상품가격 <input type="text" name="productPrice" id="productPrice" value=""><br>
	할인률 <input type="text" name="productPromotion" id="productPromotion" value=""><br>
	제조사 <input type="text" name="manufacturer" id="manufacturer" value=""><br>
	<input type="submit" value="확인">
</form>