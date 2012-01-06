<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%@ include file="/css.jsp"%>
<link rel="stylesheet" type="text/css"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/themes/redmond/jquery-ui.css" />
<style type="text/css">
/*preload classes*/
.svw {
	width: 50px;
	height: 20px;
	background: #fff;
}

.svw ul {
	position: relative;
	left: -999em;
}

/*core classes*/
.stripViewer {
	position: relative;
	overflow: hidden;
	/*border: 5px solid #ff0000;*/
	margin-bottom: 2px;
}

.stripViewer ul { /* this is your UL of images */
	margin: 0;
	padding: 0;
	position: relative;
	left: 0;
	top: 0;
	width: 1%;
	list-style-type: none;
}

.stripViewer ul li {
	float: left;
}

.stripTransmitter {
	overflow: auto;
	width: 1%;
}

.stripTransmitter ul {
	margin: 0;
	padding: 0;
	position: relative;
	list-style-type: none;
}

.stripTransmitter ul li {
	width: 20px;
	float: left;
	margin: 0 1px 1px 0;
}

.stripTransmitter a {
	font: bold 10px Verdana, Arial;
	text-align: center;
	line-height: 22px;
	background: #fba921;
	color: #fff;
	text-decoration: none;
	display: block;
}

.stripTransmitter a:hover,a.current {
	background: #fff;
	color: #fba921;
}

/*tooltips formatting*/
.tooltip {
	padding: 0.5em;
	background: #fff;
	color: #000;
	border: 5px solid #dedede;
}
</style>

<%@ include file="/js.jsp"%>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.16/jquery-ui.min.js"></script>
<script type="text/javascript"
	src="http://gsgd.co.uk/sandbox/jquery/easing/jquery.easing.1.3.js"></script>
<script type="text/javascript"
	src="http://www.gcmingati.net/wordpress/wp-content/lab/jquery/imagestrip/jquery.slideviewer.1.2.js"></script>

<%@ include file="/fade-page-js.jsp"%>
<script type="text/javascript">
	var selected = "random";
	$(function() {

		$('a').unbind('click');

		$(".bossLink").click(function(e) {

			var url = $(this).attr('href') + "&map=" + selected;
			$('.content').animate({
				marginLeft : '-=' + $(window).width() + 'px',
				opacity : '0'
			}, 500, function() {
				location.href = url;
			});
			return false;
		});

		$("div#mapimages").slideView({
			toolTip : true,
			ttOpacity : 0.5
		}); // ttOpacity can be 0.1 to 1.0

		$(".stripTransmitter a").click(function() {
			var v = $(this).attr('title');
			selected = v;
		});
	});
</script>
<title>user BossChallengeForm</title>
</head>
<body>
	<%@ include file="/header.jsp"%>

	<div class="orange box2x2 left">
		<div>
			<span class="boxTitle">マップを選択しますか？</span> <span class="clear"></span>
		</div>
		<div style="display: block;">
			<div id="mapimages" class="svw">
				<ul>
					<li><img src="/img/buttons/questionmark.png" width=105
						height=105 alt="random" /></li>
					<li><img src="/img/map/apocalyptic.png" width=105 height=105
						alt="apocalyptic" /></li>
					<li><img src="/img/map/big-room.png" width=105 height=105
						alt="big-room" /></li>
					<li><img src="/img/map/center.png" width=105 height=105
						alt="center" /></li>
					<li><img src="/img/map/divider.png" width=105 height=105
						alt="divider" /></li>
					<li><img src="/img/map/empty-room.png" width=105 height=105
						alt="empty-room" /></li>
					<li><img src="/img/map/huge-room.png" width=105 height=105
						alt="huge room" /></li>
					<li><img src="/img/map/joust.png" width=105 height=105
						alt="joust" /></li>
					<li><img src="/img/map/keyhole.png" width=105 height=105
						alt="keyhole" /></li>
					<li><img src="/img/map/playground.png" width=105 height=105
						alt="playground" /></li>
					<li><img src="/img/map/quadrant.png" width=105 height=105
						alt="quadrant" /></li>
					<li><img src="/img/map/ring.png" width=105 height=105
						alt="ring" /></li>
					<li><img src="/img/map/toronto.png" width=105 height=105
						alt="toronto" /></li>
					<li><img src="/img/map/trix.png" width=105 height=105
						alt="trix" /></li>
					<li><img src="/img/map/u.png" width=105 height=105 alt="u" /></li>
					<!--eccetera-->
				</ul>
			</div>
		</div>
	</div>
	<div class="blue box2x2 left">
		<a href="/user/main">メニューに戻る</a>
	</div>
	<div class="clear"></div>
	<div id="bossList">
		<c:forEach var="boss" items="${bosses}">
			<div class="red box4x1">
				<div>
					<span class="boxTitle">${f:h(boss.name)}</span><span class="clear"></span>
				</div>
				<div>
					<span><a class="bossLink"
						href="bossChallenge2?bossName=${f:h(boss.name)}">挑戦する</a> </span>
				</div>
			</div>
		</c:forEach>
	</div>

	<%@ include file="/footer.jsp"%>
</body>
</html>
