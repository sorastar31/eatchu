<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main id="main">

	<section id="search-box">
		<h1 class="hidden">검색박스</h1>
		<input type="text" placeholder="메뉴타입 및 태그">
		<button type="button" disabled title="delete" id="id-clear" class="wrg" style="display: none;">
			<span class="hidden">삭제</span>
		</button>
	</section>	

	<section id="friend-list" class="recommend-list list-sm">
		<h1 class="hidden">추천친구리스트</h1>
		<div class="list-title">친구 추천</div>
		<div class="etc">더보기∨</div>	
		<table class="list" cellspacing="10">
			<tr>
				<td>
					<div class="img" style="background: url('') no-repeat center; background-size: cover;"></div>
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
					<div class="img" style="background: url('') no-repeat center; background-size: cover;"></div>
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
/* 아니이이이 로그인 안되있으면 로그인해달라고 해야대 */
</script>