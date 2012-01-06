<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@ include file="/css.jsp"%>
<%@ include file="/js.jsp"%>
<%@ include file="/fade-page-js.jsp"%>
<title>SOJO Tron Competition</title>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<%@ include file="/errors.jsp"%>

	<div class="blue box4x2 form left">

		<div>
			<span class="boxTitle">ここからログイン</span><span class="clear"></span>
		</div>

		<div>
			<form action="login" method="post" id="loginForm">
				<div>
					<div class="left">USER ID</div>
					<div class="right">
						<input type="text" name="userId" placeholder="ログインID">
					</div>
					<div class="clear"></div>
				</div>
				<div>
					<div class="left">PASSWORD</div>
					<div class="right">
						<input type="password" name="password" placeholder="パスワード">
					</div>
					<div class="clear"></div>
				</div>
				<div>
					<div class="right">
						<input id="image-btn-next" type="submit" value="">
					</div>
					<div class="clear"></div>
				</div>
			</form>
		</div>
	</div>
	<div class="clear"></div>

	<div class="blue box2x2 left">
		<div>
			<span class="boxTitle">未登録ならばこちら</span><span class="clear"></span>
		</div>
		<div>
			<a href="registrationForm">登録する</a>
		</div>
	</div>
	<div class="orange box2x2 left">Sojo Tron Competition</div>

	<div class=" clear"></div>

	<%@ include file="/footer.jsp"%>
</body>
</html>
