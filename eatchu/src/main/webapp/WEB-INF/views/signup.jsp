<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>

input{
	border: 0px;
	margin: 0px;
	padding: 0px;
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
}

#sign-info table {
	width: 100%;
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
						<td><input type="file" accept=".jpg .png .gif" /></td>
					</tr>
					<tr>
						<td><input type="text" placeholder="아이디" /></td>
					</tr>
					<tr>
						<td><input type="text" placeholder="닉네임" /></td>
					</tr>
					<tr>
						<td><input type="text" placeholder="비밀번호" /></td>
					</tr>
					<tr>
						<td><input type="text" placeholder="비밀번호 확인" /></td>
					</tr>
					<tr>
						<td>
							<select>
									<option>출생년도</option>
							</select>
						</td>
					</tr>
					<tr>
						<td><input type="radio" name="gender-radio">
					<label>남성</label>
					<input type="radio" name="gender-radio">
					<label>여성</label></td>
					</tr>
					<tr>
						<td></td>
					</tr>




					
					
				</tbody>
			</table>
		</form>
	</section>
</section>