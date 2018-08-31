<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 보류 -->
<main>
	<section>
		<h1>로그인페이지</h1>
		<form method="post">
			<table>
				<tr>
					<td>
						<label for="id"></label>
						<input type="text" id="id" name="id" placeholder="아이디" />	
						<span class="profile-toggle">X</span>
					</td>
				</tr>
				<tr>
					<td>
						<label for="password"></label>
						<input type="password" id="password" name="pwd" placeholder="비밀번호" />	
						<span class="profile-toggle">X</span>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="로그인" />	
					</td>
				</tr>
			</table>
		</form>
	</section>
</main>