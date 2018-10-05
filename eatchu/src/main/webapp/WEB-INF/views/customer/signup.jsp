<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
.td-height-50 td {
	height: 50px;
	min-height: 50px;
	line-height: 50px;
}

input{
	border: 0px;
	margin: 0px;
	padding: 0px;
}

.profile-box{
	text-align: center;
}

#main > h1 {
	width: 100%;
	border-bottom: 1px solid #a0a0a0;
	height: 30px;
	text-align: center;
	font-size: 15px;
	font-family: 맑은 고딕, arial;
	color: rgb(100,100,100);
	line-height: 30px;
}

#sign-info {
	width: 100%;
}

#sign-info input[type="text"] {
	width: 90%;
	height: 30px;
	left: 5%;
	position:relative;
	border-bottom: 2px solid rgb(160,160,160);
	padding-left: 5px;
}
#sign-info input[type="file"] {
	width: 30%;
}

#sign-info table {
	width: 100%;
	margin-top: 25px;
}

#sign-info tbody > tr:first-child > td:first-child{
	text-align: center;
}

#sign-info tbody > tr:last-child > td:first-child{
	line-height: 50px;
}

#sign-info .profile-box {
	position: relative;
	display: inline-block;
}

.profile-box label { 
	display: inline-block; 
	padding: 0px;  
	width: 100px;
	height: 100px;
	background: url("/resources/images/profile.png"); 
	cursor: pointer; 
	border: 1px solid #ebebeb;  
	border-radius: .25rem; 
} 
.profile-box input[type="file"]{
	 /* 파일 필드 숨기기 */ 
	 position: absolute; 
	 width: 0px; 
	 height: 0px; 
	 padding: 0; 
	 margin: -1px; 
	 overflow: hidden; 
	 clip:rect(0,0,0,0); 
	 border: 0; 
 }
 .profile-box span{
	 position: absolute; 
	 width: 20px; 
	 height: 20px; 
	 color: #fff;
	 border: 1px solid #fff;
	 border-radius: 10px; 
	 right: 0px;
	 bottom: 0px;
	 background: #a0a0a0;
	 font-weight: bold;
	 text-align: center;
	 line-height: 20px;
	 cursor: pointer;
	 display: none;
 }
 
 #sign-info .birth-year-select{
 	position: relative;
 	display:inline-block;
 	border: 1px solid #a0a0a0;
 	width: 45%;
 	left: 5%;
 	height: 50px;
 }
 
 #sign-info .gender-input{
    position: absolute !important;
    clip: rect(0, 0, 0, 0);
    height: 1px;
    width: 1px;
    border: 0;
    overflow: hidden;
 }
 
 #sign-info .gender-input+label{
 	  position: relative;
   	  float:left;
	  display: inline-block;
	  width: calc(50% - 2px);
	  height: 48px;
	  background-color: #e4e4e4;
	  color: rgba(0, 0, 0, 0.6);
	  font-size: 14px;
	  font-weight: normal;
	  text-align: center;
	  text-shadow: none;
	  border: 1px solid rgba(0, 0, 0, 0.2);
	  transition: all 0.1s ease-in-out;
}

#sign-info .gender-input:checked+label{
	 background-color: rgb(255,155,255);
}

 #sign-info .gender-input-box{
 	position: absolute;
 	left: 50%;
 	display:inline-block;
 	width: 45%;
 }
 
 
 
</style>

<section id="main">
	<h1>회원가입</h1>
	<section id="sign-info">
		<h1 class="hidden">정보 입력 부분</h1>
		<form>
			<table>
				<tbody>
					<tr>
						<td>
							<div class="profile-box">
								<label for="profile-input"></label>
								<input id="profile-input" name="profile-pic" type="file" accept=".jpg, .png, .gif" />
								<span class="profile-toggle">X</span>
							</div>
						</td>
					</tr>
					<tr>
						<td><input name="id" type="text" placeholder="아이디" /></td>
					</tr>
					<tr>
						<td><input name="ninckname" type="text" placeholder="닉네임" /></td>
					</tr>
					<tr>
						<td><input name="pwd" type="text" placeholder="비밀번호" /></td>
					</tr>
					<tr>
						<td><input name="pwd-confirm" type="text" placeholder="비밀번호 확인" /></td>
					</tr>
					<tr>
						<td>
							<select class="birth-year-select">
									<option>출생년도</option>
							</select>
							<div class="gender-input-box">
							<input class="gender-input" type="radio" name="gender-radio" id="gender-male">
							<label for="gender-male">남성</label>
							<input class="gender-input" type="radio" name="gender-radio" id="gender-female">
							<label for="gender-female">여성</label>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</section>
</section>

<script type="text/javascript">

window.addEventListener("load",function(){
	var profileBox = document.querySelector(".profile-box"); 
	var profileInput = profileBox.querySelector("#profile-input");
	var profileLabel = profileBox.querySelector("label");
	var profileToggle = profileBox.querySelector(".profile-toggle");

	profileInput.onchange = function(e){
		var reader = new FileReader();
		reader.readAsDataURL(e.target.files[0]);
		reader.onload = function(e){
			var url = e.target.result;
			profileLabel.style.background = 'url("'+url+'") no-repeat center';
			profileLabel.style.backgroundSize = "cover";
			profileToggle.style.display = "block";
			};
	};

	profileToggle.onclick = function(){
		profileLabel.style.background = 'url("/resources/images/profile.png")';
		this.style.display = "none";
	};
	});
</script>