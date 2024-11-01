<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<ul class="list-group text-center bg-light">
	<li class="list-group-item bg-light">
		<a href="${pageContext.request.contextPath}/on/main">홈으로</a>
	</li>
	<li class="list-group-item bg-light">
		<a href="${pageContext.request.contextPath}/on/staffOne">${loginStaff.username}님</a>
	</li>
	<li class="list-group-item bg-light">
		<a href="${pageContext.request.contextPath}/on/logout">로그아웃</a>
	</li>
	
	<li class="list-group-item bg-light">
		::: 지점 관리 :::
	</li>
	<li class="list-group-item bg-light">
		<a href="">지점 추가</a>
	</li>
	<li class="list-group-item bg-light">
		<a href="">지점 수정</a>
	</li>
	
	<li class="list-group-item bg-light">
		::: STAFF 관리 :::
	</li>
	<li class="list-group-item bg-light">
		<a href="">STAFF 추가</a>
	</li>
	<li class="list-group-item bg-light">
		<a href="">STAFF 수정</a>
	</li>
	
	<li class="list-group-item bg-light">
		::: 고객 관리 :::
	</li>
	<li class="list-group-item bg-light">
		<a href="">고객 추가</a>
	</li>
	<li class="list-group-item bg-light">
		<a href="">STAFF 수정</a>
	</li>
</ul>
