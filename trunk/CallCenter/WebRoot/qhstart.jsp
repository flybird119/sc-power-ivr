<%@ page language="java" import="org.jbpm.api.*,java.util.*" pageEncoding="GBK"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qhstart.jsp' starting page</title>
    
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
  
<%
 ProcessEngine processEngine = Configuration.getProcessEngine();
 ExecutionService executionService = processEngine
   .getExecutionService();
//***********对指定用户进行启动流程
 Map map = new HashMap();
 map.put("owner", session.getAttribute("user"));
//***********用JPBM//用户组启动流程
 //Map map2 = new HashMap();
 IdentityService identityService = processEngine.getIdentityService();
 //identityService.createGroup("dev");
 //identityService.createUser("user1", "user1", "user1");
// identityService.createUser("user2", "user2", "user2");
 //identityService.createMembership("user1", "dev");
// identityService.createMembership("user2", "dev");
 map.put("dev",identityService.findGroupById("sales").getId());
 executionService.startProcessInstanceById(request
   .getParameter("id"), map);
 response.sendRedirect("qhindex.jsp");
%>
  </body>
</html>
