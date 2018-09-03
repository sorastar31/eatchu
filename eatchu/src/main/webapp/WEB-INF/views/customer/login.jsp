<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<main>
	<h1>멤버로그인페이지이</h1>
	<section id="login">
		<form method="post">
			<table>
				<tr>
					<td>
						<label for="id-input"></label>
						<input type="text" id="id-input" name="username" placeholder="아이디"/>
						<span id="id-toggle">X</span>
					</td>
				</tr>
				<tr>
					<td>
						<label for="pwd-input"></label>
						<input type="password" id="pwd-input" name="password" placeholder="비밀번호"/>
						<span id="pwd-toggle">X</span>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="로그인"/>
					</td>
				</tr>
			</table>
		</form>
	</section>
</main>
<script>
window.addEventListener("load",function(){
	
});
</script>