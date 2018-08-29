<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
/* --------------reset----------------- */

/* --------------main------------------ */
.list-sm{
	margin: 0px 15px;
	margin-top: 15px;
	border-top: 3px solid #e9e9e9;
}

.img{
	width: 100px;
	height: 100px;
	border: 1px solid;
}
#main{
	position: relative;
	top: 41px;
	margin: 60px 0px;
	height: 100%;
	overflow: auto;
}
#search-box{
	text-align: center;
}
	#search-box > input{
		width: 80%;
		height: 30px;
	}

.recommend-list{
	position: relative;
}
	.list-title{
		position: absolute;
		
		font-weight: bold;
		font-size: 20px;
		line-height: 200%;
	}
		.etc{
			position: absolute;
			right: 0px;
			
			color: #979797;
			font-size: 15px;
			line-height: 300%;
		}
			.list{
				position: relative;
				display: inline-block;
				margin: 0px 10px;
				margin-top: 30px; 
			}
				.list > tr{
					border-spacing: 5px;
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
		
	<section id="store-list" class="recommend-list list-sm">
		<h1 class="hidden">추천맛집리스트</h1>
		<div class="list-title">근처 맛집 추천</div>
		<div class="etc">더보기∨</div>	
		<table class="list" cellspacing="10">
			<tr>
				<td><img class="img" src=""></td>
				<td>
					<ul>
						<li>돈코보쌈</li>
						<li>내 위치로부터 500m</li>
						<li>한식/회식/저녁/안주</li>
					</ul>
				</td>
			</tr>
			<tr>
				<td><img class="img" src=""></td>
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
	
	<section id="friend-list" class="recommend-list list-sm">
		<h1 class="hidden">추천친구리스트</h1>
		<div class="list-title">친구 추천</div>
		<div class="etc">더보기∨</div>	
		<table class="list" cellspacing="10">
			<tr>
				<td><img class="img" src=""></td>
				<td>
					<ul>
						<li>newlec(뉴렉)</li>
						<li>맛집 22</li>
					</ul>
				</td>
			</tr>
			<tr>
				<td><img class="img" src=""></td>
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
	//자바스크립트로  text박스에 입력이 되면 삭제버튼 생성
	//더보기 누를시 리스트 페이지이동? 리스트 페이지들이 필요할까요?
</script>