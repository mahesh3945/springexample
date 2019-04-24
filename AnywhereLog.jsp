<%@page import="org.w3c.dom.ls.LSInput"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/AnywhereLogUI/css/style.css" type="text/css"></link>
<script src="/AnywhereLogUI/js/jquery-1.10.2.js"></script>
<script src="/AnywhereLogUI/js/jquery-ui-1.10.4.custom.js"></script>
<script src="/AnywhereLogUI/js/jquery.colorbox.js"></script>
<script src="/AnywhereLogUI/js/jquery.jtable.js"></script>
<link rel="stylesheet" href="/AnywhereLogUI/css/jquery-ui-1.10.4.custom.css" />
<link rel="stylesheet" href="/AnywhereLogUI/css/reporting.css" />
<link rel="stylesheet" href="/AnywhereLogUI/css/colorbox.css" />
<link href="/AnywhereLogUI/css/jtable.css" rel="stylesheet" type="text/css" />
<%@ page import="com.crd.log.action.LogFileVO" language="java"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<title>CRA logs - PROD</title>
<script>
window.dotsGoingUp = true;
var dots = window.setInterval( function() 
{
    var wait = document.getElementById("wait");
    if ( window.dotsGoingUp ) 
        wait.innerHTML += ".";
    else {
        wait.innerHTML = wait.innerHTML.substring(1, wait.innerHTML.length);
        if ( wait.innerHTML === "")
            window.dotsGoingUp = true;
    }
    if ( wait.innerHTML.length > 9 )
        window.dotsGoingUp = false;
}, 60);
</script>

<script type="text/javascript">

function getServerDetails()
{
	var environmentSelectedValue=document.getElementById("environmentId");
	alert(environmentSelectedValue.options[environmentSelectedValue.selectedIndex].text);
	
}

function getExcel()
{
	var prodseverityList=document.getElementById("severityList");
  	var selectedseverity=prodseverityList.options[prodseverityList.selectedIndex].value;
  	var selectedInputdate = $('#inputdate').val(); 
	//alert(selectedInputdate);
  	//alert(selectedseverity);
  	if(selectedseverity=="Select Severity List")
  	{
  		alert("Please Select Severity Type");
  	}
  	else
  	{
  	document.myform.action="logFileGeneratorAction_generateExcel.action?severityType="+selectedseverity+"&inputdate="+selectedInputdate;
  	document.myform.submit();
  	}
  	//document.getElementById("loading").style.display="table";
}

function showExcel()
{
	document.myform.action="logFileGeneratorAction_showExcelFile.action";
  	document.myform.submit();
}

function showExcel1()
{
	document.myform.action="logFileGeneratorAction_showExcel.action";
  	document.myform.submit();
}

function sendEmail()
{
	document.myform.action="logFileGeneratorAction_sendEmail.action";
    document.myform.submit(); 
}

$(function() 
{
	$( "#inputdate").datepicker();
});

$(document).ready(function()
{
    /* $('#showExcel').hide(); */
    $('#LogFile').hide();
    $('#loading').hide();
}); 
</script>
</head>
<body>
<s:form name="myform" method="post">  
<fieldset class="fieldset">
<h1>Automation Log Files</h1>
<%@ page import="java.util.*,java.io.*,java.net.*" %>
<%java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); %>
<h1>Date: <%= df.format(new java.util.Date()) %></h1>
</fieldset>
<TABLE CELLSPACING="2" CELLPADDING="2" width='100%' style="background-color: peachpuff;">
<tr>
	<td>
	<h3>Connect to Unix Machine</h3>
	<TABLE border="2" CELLSPACING="2" CELLPADDING="2" width='100%' >
		<tr>
		<td>
		<TABLE CELLSPACING="2" CELLPADDING="2" width='100%' style="background-color: teal;">
		<tr>
		<td>
		<TABLE CELLSPACING="0" CELLPADDING="0" width='100%' style="background-color: teal;">
		<tr>
		<td>
		<h4>Environment List</h4>
		<s:select name="environmentId" id="environmentId" list="%{#session.environmentList}" cssClass="select" onchange="getServerDetails();"></s:select>
		</td>
		</tr>
		</TABLE>
		</td>
		
		<!-- 2nd part -->
		<td>
		<TABLE CELLSPACING="2" CELLPADDING="2" width='100%' style="background-color: silver;">
		<tr>
		<td>
		<h3>Severity List</h3>
		<select name="severityList" id="severityList">
		<s:set name="severityType" value="severityType"/>
		<s:if test="%{#severityType=='eventERROR'}">
			<option>Select Severity List</option>
	        <option value="eventERROR" selected="selected">Error</option>
	        <option value="eventINFO">Info</option>
	        <option value="eventWARN">Warn</option>
       	</s:if>
       	<s:elseif test="%{#severityType=='eventINFO'}">
       		<option>Select Severity List</option>
			<option value="eventERROR">Error</option>
	        <option value="eventINFO" selected="selected">Info</option>
	        <option value="eventWARN">Warn</option>
		</s:elseif>
		<s:elseif test="%{#severityType=='eventWARN'}">
       		<option>Select Severity List</option>
			<option value="eventERROR">Error</option>
	        <option value="eventINFO">Info</option>
	        <option value="eventWARN" selected="selected">Warn</option>
		</s:elseif>
		<s:else>
			<option selected="selected">Select Severity List</option>
			<option value="eventERROR">Error</option>
	        <option value="eventINFO">Info</option>
	        <option value="eventWARN">Warn</option>
		</s:else>
		</select>
		</td>
		<td><input style="margin-top: 4em; margin-left: -2em;" type="button" value="Generate Excel" onclick="getExcel();"/></td>
		<td><input style="margin-top: 4em; margin-left: -0.5em;" type="button" value="Open Excel" onclick="showExcel();"/></td>
		<td><input style="margin-top: 4em; margin-left: -0.5em;" type="button" value="Display Excel" onclick="showExcel1();"/></td>
		<td><input style="margin-top: 4em; margin-left: -0.5em;" type="button" value="Email" onclick="sendEmail();"/></td>
		</tr>
		</TABLE>
		</td>
		</tr>
		</TABLE> 
		</td>
		</tr>
				<tr>
				<td>
				<div>
				<s:if test="hasActionMessages()">
		  		 <div class="welcome">
		      		<s:actionmessage/>
		   		</div>
		   		</s:if>
				</div>
				<div>
				<s:if test="hasActionErrors()">
		  		 <div class="error">
		      		<s:actionerror/>
		   		</div>
				</s:if>
				</div>
					<TABLE id="loading" CELLSPACING="2" CELLPADDING="2" width='100%' style="background-color: #888888;" align="right">
					<tr>
					<td>
					<h3>Downloading files from FTP server.....<span id="wait">.</span></h3>
					</td>
					</tr>
					</TABLE>
				
					<TABLE id="LogFile" CELLSPACING="2" CELLPADDING="2" width='100%' style="background-color: #888888;">
					<tr>
					<td>
					<h3>Log File List</h3>
					<ol>
					<s:iterator value="logfileList">  
					<li><s:property/></li>
					</s:iterator>
					</ol> 
					</td>
					</tr>
					</TABLE>
					</td>
					</tr>
	</TABLE>
	</td>
</tr>
</TABLE>
			<TABLE id="showExcel" border="2" CELLSPACING="2" CELLPADDING="2" width='100%' style="background-color: peachpuff;">
			<% int i=0; %>
				<s:iterator value="outputExcelList">
					<%  i++;		
						if (i==1){
					%>		
						<tr><td><s:property/></td>
					<%  }else if (i==10){ 	%>
						<td><s:property/></td></tr>
					<%   i=0;
						}else
						{	%>
						<td><s:property/></td>
					<% }	%>	
				</s:iterator>
			</TABLE>
			
<input type="hidden" value="%{#session.environmentList}"/> 
<%-- <s:label value="%{#session.environmentList}"></s:label> --%>
</s:form>
</body>
</html>