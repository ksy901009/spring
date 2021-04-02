<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/inc_menu.jsp" %>
<h2>test06Proc.do / exam01Result.jsp</h2>
<h2>상품분류 : ${dto.productGubun }</h2>
<h2>상품이름 : ${dto.productName }</h2>
<h2>상품가격 : ${dto.productPrice }</h2>
<h2>할인률 : ${dto.productPromotion }</h2>
<h2>할인금액 : ${dto.productResultPrice }</h2>
<h2>제조사 : ${dto.manufacturer }</h2>

<%-- <c:set var="sum" value="${dto.kor + dto.eng + dto.mat + dto.sci + dto.his }"/> --%>
<%-- <h2>총점 : ${sum }</h2> --%>
<%-- <h2>평균 : ${sum / 5 }</h2> --%>