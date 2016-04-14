<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:importAttribute name="field"/>

<div class="form-group">
	<label class="control-label col-md-4 small" data-i18n="crit_please_describe_them">${span18n['crit_please_describe_them']}</label>
	<div class="col-md-8">
		<form:textarea path="${field}.description1" class="form-control" data-i18n="crit_please_describe_them_placeholder" placeholder="${i18n['crit_please_describe_them_placeholder']}"></form:textarea>
	</div>
</div> 
