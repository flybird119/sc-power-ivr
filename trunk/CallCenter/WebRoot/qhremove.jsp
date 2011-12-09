<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.util.*,org.jbpm.api.*,java.util.zip.*"%>
<%
 ProcessEngine processEngine = Configuration.getProcessEngine();
 RepositoryService repositoryService = processEngine
   .getRepositoryService();
repositoryService.deleteDeploymentCascade(request.getParameter("id"));

 response.sendRedirect("qhindex.jsp");
%>