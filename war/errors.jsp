<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<c:set var="errors" value="f:errors()" />
<c:if test="${fn:length(errors) > 1 }">
	<div class="red box-error">
		<c:forEach var="e" items="${f:errors()}">
			<div>${f:h(e)}</div>
		</c:forEach>
	</div>
</c:if>

