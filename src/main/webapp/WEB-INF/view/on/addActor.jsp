<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="container-flud">
	<div class="row">
		<div class="col-sm-2 bg-light">
			<!-- leftMenu.jsp include -->
			<c:import url="/WEB-INF/view/on/inc/leftMenu.jsp"></c:import>
		</div>
		
		<div class="col-sm-10">
			<!-- main content -->
			<h1>ADD ACTOR</h1>
			<table class="table">
				<tr>
					<td>firstName</td>
					<td><input type="text" name="firstName"></td>
				</tr>
				<tr>
					<td>lastName</td>
					<td><input type="text" name="lastName"></td>
				</tr>
				<tr>
					<td>file</td>
					<td>
						<div id="fileDiv">
							<button type="button" id="btnAddFile">파일추가</button>
							<button type="button" id="btnRemoveFile">파일삭제</button>
						</div>
					</td>
				</tr>
			</table>
			<button type="button" id="btnAddActor">배우 추가</button>
		</div>
	</div>
</body>
<script>
	$('#btnAddFile').click(function() {
		/* 자바스크립트 API 사용
		let arr = $('.actorFile');
		arr.forEach(function(item, index) {
			
		});
		*/
		
		// JQuery API 사용
		
		let flag = true;
		$('.actorFile').each(function() { // 매개값(index, item) , item == $(this)
			if($(this).val() == '') {
				flag = false;
			}
		});
		if(flag) {
			let html = '<input type="file" name="actorFile" class="actorFile">';
			$('#fileDiv').append(html);
		} else {
			alert('첨부하지않은 파일이 이미 존재합니다');
		}
	});

	$('#btnRemoveFile').click(function(){
		// 마지막 <input type="file" name="actorFile" class="actorFile">태그를 제거
		// console.log($('.actorFile').length);
		$('.actorFile').last().remove();
	});
</script>
</html>