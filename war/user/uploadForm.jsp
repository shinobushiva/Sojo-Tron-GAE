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
<title>user UploadForm</title>
</head>
<body>
	<%@ include file="/header.jsp"%>

	<div class="orange box2x2 left">
		<img src="/img/buttons/upload.png" />
	</div>
	<div class="blue box2x2 left">
		<a href="/user/main">メニューに戻る</a>
	</div>
	<div class="clear"></div>

	<div class="blue box4x2 form">
		<form action="/user/upload" method="post"
			enctype="multipart/form-data">
			<div>
				<div class="left">ボットの名前</div>
				<div class="right">
					<input type="text" name="name" placeholder="空の場合はクラス名">
				</div>
				<div class="clear"></div>
			</div>
			<div>
				<div class="left">
					<input type="file" name="botFile" />
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



	<a href="main">Back to Main</a>


	<%@ include file="/footer.jsp"%>
</body>
</html>
