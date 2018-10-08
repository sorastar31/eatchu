<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
td{
	margin: 0;
	padding: 0;
}

input{
	border: 0px;
	margin: 0px;
	padding: 0px;
}

.td-height-50 td {
	height: 50px;
	min-height: 50px;
	line-height: 50px;
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
#main{
	position: relative;
	top: 41px;
}

#email-check{
	top: 80px;
	width: 100%;
}
#email-check > form{
	width: 100%;
}
#email-check table {
	width: 100%;
}
 
table input[type="text"]{
	width: 90%;
	height: 30px;
	left: 5%;
	position:relative;
	border-bottom: 2px solid rgb(160,160,160);
	padding-left: 5px;
	color: #979797;
}
table input[type="submit"]{
	width: 90%;
	height: 100%;
	left: 5%;
	position:relative;
	padding-left: 5px;
}

</style>

<section id="main">
	<h1>회원가입을 위한 이메일 인증</h1>
	<section id="email-check">
		<h1 class="hidden">정보 입력 부분</h1>
		<form method="post">
			<table>
				<tbody class="td-height-50">
					<tr>
						<td>
							<input type="text" name="email" placeholder="이메일을 입력해주세요. ex) eatchu@eatchu.com"/>
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="회원가입을 위한 링크 메일 발송"/>
						<td>
					</tr>
				</tbody>
			</table>
		</form>
	</section>
</section>

<script type="text/javascript">


</script>