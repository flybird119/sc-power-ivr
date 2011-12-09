<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qhrequest.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <fieldset>
    <legend>申请</legend>
    <form action="qhsubmit.jsp" method="post">
      <input type="hidden" name="taskId" value="${param.id}">
      	 申请人：<input type="text" name="owner" value="<%=request.getSession().getAttribute("user") %>"/><br/>
   		请假时间：<input type="text" name="day" value=""/><br/>
     	请假原因：<textarea name="reason"></textarea><br/>
    <input type="submit"/>
    </form>
  </fieldset>
  </body>
</html>
