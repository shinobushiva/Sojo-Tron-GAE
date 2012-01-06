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
<title>user BossChallengeForm</title>
</head>
<body>
	<%@ include file="/header.jsp"%>

	<div class="orange box2x1 left">
		<a href="/user/resultList">更新<br /> <img
			src="/img/buttons/refresh.png" /></a>
	</div>
	<div class="blue box2x1 left">
		<a href="/user/main">メニューに戻る</a>
	</div>
	<div class="clear"></div>
	<div id="bossList">
		<c:forEach var="result" items="${results}">
			<c:if test="${result.winner == 1}">
				<div class="red box4x1">
			</c:if>
			<c:if test="${result.winner == 2}">
				<div class="blue box4x1">
			</c:if>
			<c:if test="${result.winner == 0}">
				<div class="orange box4x1">
			</c:if>
			<div class="resultLine">
				<div class="left">
					<div>${result.time}</div>
					<c:if test="${result.bossChallenge}">
						<div>ボス戦 ${result.bossBot.name}</div>
					</c:if>
					<c:if test="${result.bossChallenge == false}">
						<div>${result.bossBot.name}</div>
					</c:if>
					<c:if test="${result.winner == 1}">
						<div>勝利</div>
					</c:if>
					<c:if test="${result.winner == 2}">
						<div>敗退</div>
					</c:if>
					<c:if test="${result.winner == 0}">
						<div>引き分け</div>
					</c:if>
				</div>
				<div class="right" style="margin-left: 30px">
					<a href="/user/resultView?key=${f:h(result.key)}"><img
						style="margin-top: 15px;" src="/img/buttons/next.png" /></a>
				</div>
				<div class="clear"></div>
			</div>
	</div>
	</c:forEach>
	</div>

	<%@ include file="/footer.jsp"%>
</body>
</html>
