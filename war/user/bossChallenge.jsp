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
<title>user BossChallenge</title>

<script type="text/javascript"
	src="http://webplayer.unity3d.com/download_webplayer-3.x/3.0/uo/UnityObject.js"></script>
<script type="text/javascript">

		function initialized(){
			var unity = GetUnity();
			if(unity && unity != null){
				try{
					unity.SendMessage("JSONReader","SetURL", 
							location.protocol+"//"+location.host+"/ajax/getResult");
					unity.SendMessage("JSONReader","Read", "${key}");
				}catch(e){
					setTimeout(initialized, 500);
				}
			}else{
				setTimeout(initialized, 500);
			}
		}
		
		function GetUnity() {
			if (typeof unityObject != "undefined") {
				return unityObject.getObjectById("unityPlayer");
			}
			return null;
		}
		if (typeof unityObject != "undefined") {
			unityObject.embedUnity("unityPlayer", "/unity/TronUnity.unity3d", 600, 450);
			
		}
		-->
		</script>
<style type="text/css">
<!--
div.unity {
	margin: auto;
	width: 600px;
}

div.missing {
	margin: auto;
	position: relative;
	top: 50%;
	width: 193px;
}

div.missing a {
	height: 63px;
	position: relative;
	top: -31px;
}

div.missing img {
	border-width: 0px;
}

div#unityPlayer {
	cursor: default;
	height: 450px;
	width: 600px;
}
-->
</style>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<%@ include file="/userMenu.jsp"%>

	<div>
		<span>Winner : </span><span>${winner} </span>
	</div>
	<hr />

	<div class="unity">
		<div id="unityPlayer">
			<div class="missing">
				<a href="http://unity3d.com/webplayer/"
					title="Unity Web Player. Install now!"> <img
					alt="Unity Web Player. Install now!"
					src="http://webplayer.unity3d.com/installation/getunity.png"
					width="193" height="63" />
				</a>
			</div>
		</div>
	</div>

	<hr />

	<div>${printableResult}</div>

	<%@ include file="/footer.jsp"%>
</body>
</html>
