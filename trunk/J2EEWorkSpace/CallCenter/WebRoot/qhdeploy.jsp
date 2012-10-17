<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.util.*,org.jbpm.api.*,java.util.zip.*"%>
<%
 ProcessEngine processEngine = Configuration.getProcessEngine();
 RepositoryService repositoryService = processEngine
   .getRepositoryService();

 repositoryService.createDeployment().addResourceFromClasspath("leave.jpdl.xml").deploy();
 //ZipInputStream zis = new ZipInputStream(this.getClass()
//   .getResourceAsStream("/leave.zip"));
// repositoryService.createDeployment()
 //  .addResourcesFromZipInputStream(zis).deploy();
 response.sendRedirect("qhindex.jsp");
%>