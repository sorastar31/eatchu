<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>내말 맛집</title>
</head>
<body>
<section id="main">
 	<h1>회원가입</h1>
 	<section id="sign-info">
 	<h1 class="hidden">정보 입력 부분</h1>
	<form>
		<input type="file" accept=".jpg .png .gif"/>
		<input type="text" placeholder="아이디"/>
		<input type="text" placeholder="닉네임"/>
		<input type="text" placeholder="비밀번호"/>
		<input type="text" placeholder="비밀번호 확인"/>
		<select>
			<option>출생년도</option>
		</select>
		<input type="radio" name="gender-radio"><label>남성</label>
		<input type="radio" name="gender-radio"><label>여성</label>
	</form>
 	</section>
 </section>
 </body>
 </html>