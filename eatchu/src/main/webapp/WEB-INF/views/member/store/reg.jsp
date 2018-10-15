<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>
.page-title{
	height: 15%;
	position: relative;
	top: 41px;
	text-align: center;
	font-size: 20px;
	font-weight: lighter;
	
	background: #fff;
}

#search-box{
	position: fixed;
	top: 70px;
	left: 0px;
	right: 0px;
	width: 100%;
	height: 45px;
	background: #e9e9e9;
	
	z-index: 5;
	text-align: center;
}
	#search-box > input{
		margin: 5px 5px;
		width: 90%;
		height: 30px;
	}

.map-view{
	height: 200px;
	position: relative;
	top: 85px;
	
	background: pink;
}
.photo-add{
	width: 100px;
	height: 100px;
	background: #e9e9e9
}

.input-form{
	position: relative;
	top: 90px;
	width: 100%;
}

.input-form-td{
	height: 40px;
	text-align: center;
}


.select-type{
	width: 120px;
	height: 30px;
	font-size: 15px;
}

.text-edit{
	border: 0;
	border-bottom: 1px solid #000;
	width: 90%;
	font-size: 15px;
}


</style>

<main>
	<h1 class="page-title">나의 맛집 등록</h1>
	<section id="search-box">
		<h1 class="hidden">검색창</h1>
		<input type="text" placeholder="장소,주소,전화번호" />
	</section>
	<section class="map-view">
		<h1 class="hidden">지도</h1>
	</section>
	<section>
		<h1 class="hidden">정보등록</h1>
		<table class="input-form">
			<tr>
				<td colspan="2">
					<input type="file" class="photo-add"/>
					<span></span>
				</td>
			</tr>
			<tr>
				<td>
					<select class="select-type">
						<option>메뉴타입선택</option>
						<option>패스트푸드</option>
					</select>
				</td>
				<td>패스트푸드</td>
			</tr>
			<tr class="input-form-tr">
				<td colspan="2" class="input-form-td"><input type="text" placeholder="상호명" class="text-edit"/></td>
			</tr>
			<tr class="input-form-tr">
				<td colspan="2" class="input-form-td"><input type="text" placeholder="메뉴명" class="text-edit"/></td>
			</tr>
			<tr class="input-form-tr">
				<td colspan="2" class="input-form-td"><input type="text" placeholder="내용또는해시태그" class="text-edit"/></td>
			</tr>
		</table>
	</section>
</main>