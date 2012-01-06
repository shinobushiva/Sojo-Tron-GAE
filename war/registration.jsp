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
<title>登録完了</title>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<%@ include file="/errors.jsp"%>

	<div class="blue box4x4 form">
		<div>
			<span class="boxTitle">登録が完了しました</span><span class="clear"></span>
		</div>
		<a href="loginForm">ログインに戻る</a>
	</div>

	<%@ include file="/footer.jsp"%>
</body>
</html>
