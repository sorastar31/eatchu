<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style>

#footer-button-box{
	position: relative;
	width: 100%;
	height: 50px;
	bottom: 0px;
	margin: 0 auto;
	border-top: 1px solid #e9e9e9;	
	background: #fff;
	z-index: 1;	
}
	.button{
		padding: 0px;
		height: 100%;
		width: 50px;
		line-height: 50px;
		border: 0;
		outline: 0;
		overflow: hidden;
		text-indent: -999px;
		position: absolute;
		bottom: 0px;
	}
		.up-menu-button{
			background: url("/eatchu/resources/images/icon-set.png") no-repeat 0px -100px;
			left: 15%;
		}
		.home-button{
			background: url("/eatchu/resources/images/icon-set.png") no-repeat -50px -100px;
			left: 43%;
		}
		.reg-button{
			background: url("/eatchu/resources/images/icon-set.png") no-repeat -100px -100px;
			left: 72%;
		}	
			.up-menu-button:hover {
				background: url("/eatchu/resources/images/icon-set.png") no-repeat 0px -150px;
			}
			.home-button:hover{
				background: url("/eatchu/resources/images/icon-set.png") no-repeat -50px -150px;
			}
			.reg-button:hover{
				background: url("/eatchu/resources/images/icon-set.png") no-repeat -100px -150px;
			}
		
#footer{
	bottom: 0px;
	width: 100%;
	height:50px;
		
	position: fixed;
}
	#footer #quick-menu{
		display: block;
		width: 100%;
		height: 30%;
		/* background: #fff; */
		position: fixed;
		bottom: -250px;
		
		z-index: 3;
		
		transition: 400ms bottom ease;
	}
		#footer.menu-show #quick-menu{
			bottom: 50px;
		}
	#footer:after{
		content: "";
		display: block;
		width: 100%;
		height: 0%;
		background: #000;
		position: fixed;
		bottom: 50px;
		
		z-index:2;
		opacity: 0;
	}
		#footer.menu-show:after{
			opacity: 0.7;
			height: 100%;
		}

#up-menu li{
	margin: 20px 30px;
}
	#up-menu a{
		color: #fff;
	}

</style>

<footer id="footer">
	<section id="footer-button-box">
		<h1 class="hidden">푸터버튼</h1>
		<input class="button up-menu-button" type="button" value="촤르르"/>
		<div class="button home-button" onclick="location.href='/eatchu/member/list'">홈</div>
		<!-- <input class="button home-button" type="button" value="홈"/> -->
		<input class="button reg-button" type="button" value="등록"/>
	</section>
	<aside id="quick-menu">
		<section id="up-menu">
			<h1 class="hidden">촤르르메뉴항목</h1>
			<ul>
				<li><a href="">내맛집</a></li>
				<li><a href="">친구맛집</a></li>
				<li><a href="">추천</a></li>
			</ul>
		</section>
	</aside>
</footer>

<script>
	window.addEventListener("load",function(){
		var footer = document.querySelector("footer");
		var upBtn = footer.querySelector(".up-menu-button");
		
		upBtn.onclick = function(e){
			if(footer.classList.contains("menu-show")){
				footer.classList.remove("menu-show");
				return;
			}
			footer.classList.add("menu-show");
			return;
			
		};
	});
</script>