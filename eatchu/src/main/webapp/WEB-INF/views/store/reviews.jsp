<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>

.page-title{
	position: fixed;
	top: 41px;
	left: 0px;
	right: 0px;
	width: 100%;
	height: 29px;
	text-align: center;
	font-size: 20px;
	font-weight: lighter;
	
	z-index: 5;
/* position이 fixed 되야해여 
	height: 15%;
	position: relative;
	top: 41px;
	text-align: center;
	font-size: 20px;
	font-weight: lighter;*/
	
	background: #fff;
	border-bottom: 1px solid #e9e9e9;
}

.map-info{

	position: fixed;
	top: 71px;
	left: 0px;
	right: 0px;
	width: 100%;
/* position이 fixed 되야해여
	position: relative;
	top: 45px; */

	z-index: 5;
}
.map-view{
	height: 200px;
	
	background: pink;
}

.list-form{
	position: fixed;
	top: 300px;
	border-top: 3px solid #e9e9e9;
	margin: 0px 15px;
}
.list-table{
	position: fixed;
	top: 330px;
	margin: 0px 10px;
	
	display: block;
	height: 260px;
	overflow: auto;
	
}

.img{
	width: 100px;
	height: 100px;
	border: 1px solid;
}

</style>

<main>
	<h1 class="page-title">노랑통닭 홍대점</h1>
	<section class="map-info">
		<h1 class="hidden">주소지도</h1>
		<div>서울특별시 마포구 홍익로 3길 8</div>
		<div class="map-view">지도</div>
	</section>
	<section class="list-form">
		<h1 class="hidden">맛집등록목록</h1>
		<div>맛집등록(3)</div>
	</section>
		<table class="list-table" cellspacing="10">
				<tr>
					<td>
						<div class="img" style="background: url('/resources/images/profile.png') no-repeat center; background-size: cover;"></div>
					</td>
					<td>
						<ul>
							<li>세시루(sorastar31@gmail.com)</li>
							<li>치킨/야식</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td>
						<div class="img" style="background: url('/resources/images/profile.png') no-repeat center; background-size: cover;"></div>
					</td>
					<td>
						<ul>
							<li>유대표(woghks2045@gmail.com)</li>
							<li>회식/치킨/안주</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td>
						<div class="img" style="background: url('/resources/images/profile.png') no-repeat center; background-size: cover;"></div>
					</td>
					<td>
						<ul>
							<li>동키(donkey80@gmail.com)</li>
							<li>치킨/안주/닭강정</li>
						</ul>
					</td>
				</tr>
			</table>
</main>