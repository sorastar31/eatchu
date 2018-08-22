<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
/* -----------reset--------------------- */
body{
	margin: 0px;
}
h1{
	margin: 0px;
}
li{
	list-style: none;
}
a{
	text-decoration: none;
	color: #000;
}
/* -----------common style-------------- */
.hidden{
	display: none;
}
/* ----------component style------------- */
.button{
	width: 40px;
	height: 40px;
	overflow: hidden;
	text-indent: -999px;
	border: 0px;
	padding: 0px;
}
.back-button{
	display: block;
	position: fixed;
	top: 0px;
	left: 0px;
	background: url("/eatchu/resources/images/icon-set.png") no-repeat 0px -200px;
}
.setting-button{
	display: block;
	position: fixed;
	top: 0px;
	right: 0px;
	background: url("/eatchu/resources/images/icon-set.png") no-repeat -40px -200px;
}
/* --------------header------------------ */
#header{
	width: 100%;
	height: 40px;
	background: #fff;
}
	#header h1{
		background: url("/eatchu/resources/images/logo.png") no-repeat center;
		text-indent: -999px;
		overflow: hidden;
		text-align: center;
	}
	
</style>

<header id="header">
	<h1>내말맛집</h1>
	<section id="header-button-box">
		<h1 class="hidden">뒤로 버튼</h1>
		<input class="button back-button" type="button" value="뒤로" />
		
		<h1 class="hidden">설정 버튼</h1>
		<input class="button setting-button" type="button" value="설정" />
	</section>
	<section id="set-menu" class="">
		<h1 class="hidden">설정메뉴</h1>
		<ul>
			<li>사진</li>
			<li>이름(닉네임)</li>
			<li><a href="">프로필</a></li>
			<li><a href="">공지사항</a></li>
			<li><a href="">버전정보</a></li>
			<li><a href="">알림</a></li>
			<li>로그아웃</li>
		</ul>
	</section>
</header>

<script>
	
</script>