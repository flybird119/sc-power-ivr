<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.util.*,org.jbpm.api.*,org.jbpm.api.task.*" %>
<%
 ProcessEngine processEngine = Configuration.getProcessEngine();
 TaskService taskService = processEngine.getTaskService();
 String taskId = request.getParameter("id");
 Task task = taskService.getTask(taskId);
%>
<body>
  <fieldset>
    <legend>老板审核</legend>
    <form action="qhsubmit_boss.jsp" method="post">
      <input type="hidden" name="taskId" value="${param.id}">
      申请人：<%=taskService.getVariable(taskId, "owner") %><br/>
  请假时间：<%=taskService.getVariable(taskId, "day") %><br/>
    请假原因：<%=taskService.getVariable(taskId, "reason") %><br/>
    <input name="result" type="submit" value="approval"/><input name="result" type="submit" value="reject"/>
    </form>
  </fieldset>