<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<script type="text/javascript">
	$(function() {
		$('.content:not(body#index .content)').css({
			display : 'block',
			marginLeft : $(window).width(),
			opacity : '0'
		});
		$('.content:not(body#index .content)').animate({
			marginLeft : '0px',
			opacity : '1'
		}, 500);

		$('body#index .content').css({
			display : 'block',
			opacity : '0'
		});
		$('body#index .content').animate({
			opacity : '1'
		}, 500);

		$('a').click(function() {
			var pass = $(this).attr("href");
			$('.content').animate({
				marginLeft : '-=' + $(window).width() + 'px',
				opacity : '0'
			}, 500, function() {
				location.href = pass;
			});
			return false;
		});
	});
</script>
