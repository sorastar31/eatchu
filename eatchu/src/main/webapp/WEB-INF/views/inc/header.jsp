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
ul{
	margin: 0px;
	padding: 0px;
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
	background: url("/eatchu/resources/images/icon-set.png") no-repeat 0px -200px;
}
.setting-button{
	background: url("/eatchu/resources/images/icon-set.png") no-repeat -40px -200px;
}
.photo{
	width: 150px;
	height: 150px;
	border: 1px solid #e9e9e9;
	border-radius: 75px;
	display: inline-block;
}
/* --------------header------------------ */
#header{
	width: 100%;
	height: 40px;
	background: #fff;
	text-align: center;
	border-bottom: 1px solid rgb(160,160,160);
	
	position: relative;
}
	#header > h1{
		display: inline-block;
		padding-top: 5px;
	}
	
.back-button{
	position: absolute;
	top: 0px;
	left: 0px;
	height: 100%;
	line-height: 40px;
	padding-left: 5px;
}
.setting-button{
	position: absolute;
	top: 0px;
	right: 0px;
	height: 100%;
	line-height: 40px;
	padding-right: 5px;
}
	
#header #login-info{
	display: block;
	background: #fff;
	width: 80%;
	height: 100%;
	
	position: fixed;
	top: 0px;
	right: -80%;
	z-index: 2;
	
	transition: 400ms right ease;
}
	#header.menu-show #login-info{
		right: 0%;
	}	
#header:after{
	display: block;
	background: #000;
	content: "";
	width: 100%;
	height: 0%;
	
	position: fixed;
	top: 0px;
	left: 0px;
	z-index: 1;
	
	opacity: 0;
	
	transition: 400ms opacity ease;
}
	#header.menu-show:after{
		opacity: 0.7;
		height: 100%;
	}
	
#profile{
	padding: 20px 0px;
	border-bottom: 1px solid #e9e9e9;
}
#set-menu{
	padding: 10px 0px;
}
	
</style>

<header id="header">
	<h1>
		<picture>
			<img src="/eatchu/resources/images/logo.png" alt="내말맛집">
		</picture>
	</h1>
	<section id="header-button-box">
		<h1 class="hidden">뒤로 버튼</h1>
		<input class="button back-button" type="button" value="뒤로" />
		
		<h1 class="hidden">설정 버튼</h1>
		<input class="button setting-button" type="button" value="설정" />
	</section>
	<aside id="login-info">
		<section id="profile">
			<h1 class="hidden">프로필</h1>
			<div>
				<div class="photo" style="background: url('') no-repeat center; background-size: cover;"></div>
				<div class="userId">아이디(닉네임)</div>
				<div class="auth-status"><a href="/login">로그인</a></div>
			</div>
		</section>
		<section id="set-menu">
			<h1 class="hidden">설정메뉴</h1>
			<ul>
				<li><a href="/eatchu/member/detail">프로필</a></li>
				<li><a href="">공지사항</a></li>
				<li><a href="">버전정보</a></li>
				<li><a href="">알림</a></li>
			</ul>
		</section>
	</aside>
</header>

<script>
	window.addEventListener("load",function(){
		var header = document.querySelector("header");
		var setBtn = header.querySelector(".setting-button");
		
		header.onclick = function(e){
			if(e.target.nodeName == "HEADER")
				header.classList.remove("menu-show");
		};
		setBtn.onclick = function(e){
			header.classList.add("menu-show");
			e.stopPropagation();
		};
	});
</script>