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
<title>user Main</title>
</head>
<body>
	<%@ include file="/header.jsp"%>

	<div class="orange box4x2 left">
		<div>
			<span class="boxTitle"
				style="white-space: nowrap; overflow: hidden; text-overflow: ellipsis; width: 440px;">ボット
				<c:forEach var="bot" items="${bots}">
					${f:h(bot.name)}
				</c:forEach>
			</span> <span class="clear"></span>
		</div>

		<div id="botList">
			ようこそ<br>${user.userId} さん<br>
		</div>
	</div>
	<div class="blue box2x2 left">
		<a href="/logout">ログアウト</a>
	</div>
	<div class="clear"></div>

	<div id="uploadForm" class="blue box2x2 left">
		<a href="/user/uploadForm"> ボットを<br />アップロードする<br /> <br /> <img
			src="/img/buttons/upload.png" />
		</a>
	</div>
	<div id="uploadForm" class="orange box2x2 left">
		<a href="/user/resultList">戦績を見る</a>
	</div>

	<div id="bossChallenge" class="red box2x2 left">
		<a href="/user/bossChallengeForm">ボスに挑戦する<br /> <br /> <img
			src="/img/buttons/play.png" /></a>
	</div>
	<div class="clear"></div>



	<%@ include file="/footer.jsp"%>
</body>
</html>
