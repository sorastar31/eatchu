<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<style>
/* --------------main------------------ */
#main{
	position: relative;
	top: 41px;
	margin: 80px 0px;
}
#search-box{
	position: fixed;
	top: 91px;
	left: 0px;
	right: 0px;
	width: 100%;
	height: 45px;
	background: #e9e9e9;

	border-bottom: 3px solid #e9e9e9;
	
	z-index: 5;
	text-align: center;
}
	#search-box > input{
		margin: 5px 5px;
		width: 90%;
		height: 30px;
	}
.img{
	width: 100px;
	height: 100px;
	border: 1px solid;
}
	
.list{
	position: relative;
	top: 30px;
		
	margin: 0px 15px;
	margin-top: 15px;
	padding-bottom: 10px;
	border-bottom: 3px solid #e9e9e9;
}

#list-title{
	position: absolute;
	
	font-weight: bold;
	font-size: 20px;
	line-height: 200%;
}
#etc{
	position: absolute;
	right: 10px;
	
	color: #979797;
	font-size: 15px;
	line-height: 300%;
}
.list-table{
	position: relative;
	display: inline-block;
	margin: 0px 10px;
	margin-top: 30px;
}

#notice{
	position: relative;
	display: inline-block;
	margin: 0px 90px;
	margin-top: 30px;
	
}
	#notice > a{
		color: pink;
		font-size: 20px;
		line-height: 200%;
	}
</style>
    
<main id="main">
	<section id="search-box">
		<h1 class="hidden">검색박스</h1>
		<input type="text" placeholder="메뉴타입 및 태그">
		<button type="button" disabled title="delete" id="id-clear" class="wrg" style="display: none;">
			<span class="hidden">삭제</span>
		</button>
	</section>	
	<%-- <security:authorize access="!isAuthenticated()">
		<section id="friend-list" class="list">
			<h1 class="hidden">내친구목록</h1>
			<div id="list-title">내 친구</div>
				<div id="notice"><a href="/customer/login">로그인 해주세요</a></div>
		</section>
	</security:authorize>
	<security:authorize access="isAuthenticated()"> --%>
		<section id="friend-list" class="list">
			<h1 class="hidden">내친구목록</h1>
			<div id="list-title">내 친구</div>
			<div id="etc">더보기∨</div>
			<table class="list-table" cellspacing="10">
				<tr>
					<td>
						<div class="img" style="background: url('/resources/images/profile.png') no-repeat center; background-size: cover;"></div>
					</td>
					<td>
						<ul>
							<li>woghks2045(유대표)</li>
							<li>맛집 40</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td>
						<div class="img" style="background: url('/resources/images/profile.png') no-repeat center; background-size: cover;"></div>
					</td>
					<td>
						<ul>
							<li>donkey80(동키)</li>
							<li>맛집 11</li>
						</ul>
					</td>
				</tr>
			</table>
		</section>
	<%-- </security:authorize> --%>
	
	<section id="recommend-list" class="list">
		<h1 class="hidden">추천친구리스트</h1>
		<div id="list-title">친구 추천</div>
		<div id="etc">더보기∨</div>	
		<table class="list-table" cellspacing="10">
			<tr>
				<td>
					<div class="img" style="background: url('/resources/images/profile.png') no-repeat center; background-size: cover;"></div>
				</td>
				<td>
					<ul>
						<li>newlec(뉴렉)</li>
						<li>맛집 22</li>
					</ul>
				</td>
			</tr>
			<tr>
				<td>
					<div class="img" style="background: url('/resources/images/profile.png') no-repeat center; background-size: cover;"></div>
				</td>
				<td>
					<ul>
						<li>seolceo(슬사장)</li>
						<li>맛집 9</li>
					</ul>
				</td>
			</tr>
		</table>
	</section>	
</main>
<script>
</script>