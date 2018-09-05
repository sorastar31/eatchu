<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>

#member-info{
	position: relative;
	top: 41px;
}

#member-title{
	position: fixed;
	top: 41px;
	left: 15px;
	width: 90%;
	height: 5%;
	
	text-align: center;
	border: 1px solid #e9e9e9;
}
.star-button{
	width: 40px;
	height: 40px;
	overflow: hidden;
	text-indent: -999px;
	border: 0px;
	padding: 0px;
	
	background: url("/resources/iimages/icon-set.png") no-repeat 250px s300px;
}
</style>
<main>
	<section id="member-info">
		<h1 class="hidden">member정보</h1>
		<span id="member-title">sorastar31</span>
		<div>
			<img>
			<span>sorastar31(세시루)</span>
		</div>
		<input class="star-button" type="button" value="친구추가"/>
	</section>
	<section>
		<h1>지도가 들어가쥬</h1>
	</section>
	<section>
		<table>
			<tr>
				<td>
					<div class="img" style="background: url('') no-repeat center; background-size: cover;"></div>
				</td>
				<td>
					<ul>
						<li>돈코보쌈</li>
						<li>내 위치로부터 500m</li>
						<li>한식/회식/저녁/안주</li>
					</ul>
				</td>
			</tr>
			<tr>
				<td>
					<div class="img" style="background: url('') no-repeat center; background-size: cover;"></div>
				</td>
				<td>
					<ul>
						<li>서브웨이 홍대점</li>
						<li>내 위치로부터 700m</li>
						<li>점심/혼밥/간식/다이어트</li>
					</ul>
				</td>
			</tr>
		</table>
	</section>
</main>