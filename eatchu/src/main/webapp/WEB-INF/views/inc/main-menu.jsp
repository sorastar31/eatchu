<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>
	.hidden{
		display: none;
	}
	.gray-box{
		width: 50px;
		height: 50px;
		background: rgb(160,160,160);
	}
	.pink-box{
		width: 0px;
		height: 50px;
		background: pink;
	}
	.icon{
		width: 50px;
		height: 50px;
	}
	.overlap{
		position: absolute;
	}
	.margin-auto{
		position: relative;
		width: 50px;
		height: 50px;
		margin: 0 auto;
	}
	.main-button-box{
		position: absolute;
 		width: 33.3%;
 		height: 50px;
 		background: white;
	}
	
	.main-menu-link{
		position: absolute;
		width: 100%;
		height: 50px;
		top:0px;
		z-index: 1;
	}
	
	#main-menu{
		position: fixed;
		top:41px;
		width: 100%;
		height:50px;
		background: #fff;
		z-index: 10;
	}
	#main-menu .mystore{
 		left: 0%;
	}
	#main-menu .friends{
 		left:33.3%;
	}
	#main-menu .public{
 		left:66.6%;
	}
	#main-menu .mystore-icon{
		background: url("/eatchu/resources/images/icon-set.png") no-repeat 0px 0px; 
	}
	#main-menu .friends-icon{
		background: url("/eatchu/resources/images/icon-set.png") no-repeat -50px 0px;
	}
	#main-menu .public-icon{
		background: url("/eatchu/resources/images/icon-set.png") no-repeat -100px 0px;
	}
	
	.main-button-box > a:hover+div > div:nth-child(2){
		transition: 500ms ease width;
		width: 50px;
	}
</style>

<section id="main-menu">
	<h1 class="hidden">메인항목 메뉴</h1>
	<div class="mystore main-button-box">
		<a href="" class="main-menu-link"></a>
		<div class="margin-auto">
			<div class="gray-box overlap"></div>
			<div class="pink-box overlap"></div>
			<div class="icon mystore-icon overlap"></div>
		</div>
	</div>
	<div class="friends main-button-box">
		<a href="" class="main-menu-link"></a>
		<div class="margin-auto">
			<div class="gray-box overlap"></div>
			<div class="pink-box overlap"></div>
			<div class="icon friends-icon overlap"></div>
		</div>
	</div>
	<diV class="public main-button-box">
		<a href="" class="main-menu-link"></a>
		<div class="margin-auto">	
			<div class="gray-box overlap"></div>
			<div class="pink-box overlap"></div>
			<div class="icon public-icon overlap"></div>
		</div>
	</diV>
</section>

<script>
	
</script>