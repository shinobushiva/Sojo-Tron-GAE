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
<title>登録フォーム</title>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<%@ include file="/errors.jsp"%>

	<div class="blue box4x4 form left">
		<div>
			<span class="boxTitle">すべて記入して下さい</span><span class="clear"></span>
		</div>
		<div style="padding: 0 20px;">
			<div>
				<a href="/"><img src="/img/buttons/back.png"></a>
			</div>
			<form action="registration">
				<div>
					<div class="left">USER ID</div>
					<div class="right">
						<input type="text" name="userId" placeholder="ログインID" />
					</div>
					<div class="clear"></div>

				</div>
				<div>
					<div class="left">PASSWORD</div>
					<div class="right">
						<input type="password" name="password" placeholder="パスワード" />
					</div>
					<div class="clear"></div>
				</div>
				<div>
					<div class="left">PASSWORD2</div>
					<div class="right">
						<input type="password" name="password2" placeholder="パスワード(確認)" />
					</div>
					<div class="clear"></div>
				</div>
				<div>
					<div class="left">E-MAIL</div>
					<div class="right">
						<input type="text" name="email" placeholder="メールアドレス" />
					</div>
					<div class="clear"></div>
				</div>
				<div>
					<input id="image-btn-next" type="submit" value="" />
				</div>
			</form>
		</div>
	</div>
	<div class="clear"></div>

	<%@ include file="/footer.jsp"%>
</body>
</html>
