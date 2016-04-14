<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="now" value="<%=new java.util.Date()%>" scope="request"/>
<footer style="padding-top: 10px; color: black" class="hidden-print container-fluid">
	<div class="row">
		<div class="col-lg-12">
			<span data-i18n="footer_last_update"><s:message code='footer_last_update'/></span>
			<span class="datefmt"> <fmt:formatDate value="${now}"/> </span> |
			<a target="_blank" href="http://ec.europa.eu/growth/tools-databases/security-incidents/index_en.htm">
				<span data-i18n="footer_report_security_incident"><s:message code='footer_report_security_incident'/></span>
			</a>
		</div>
	</div>
</footer>
<spring:eval var="piwikServer" scope="page" expression='@espdConfiguration.piwikServer' />
<spring:eval var="piwikId" scope="page" expression='@espdConfiguration.piwikId' />
<script type="text/javascript">
	var piwik = Piwik.getTracker("${piwikServer}", ${piwikId});
	piwik.enableLinkTracking(true);
	piwik.trackPageView();
</script>
<noscript><p><img src="${piwikServer}?idsite=${piwikId}" style="border:0;" alt="" /></p></noscript>
