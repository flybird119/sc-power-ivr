package org.jbpm.examples.test;

import java.util.HashMap;
import java.util.Map;

import org.jbpm.api.Configuration;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.RepositoryService;

public class TestDeploy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
ProcessEngine en=	new Configuration().buildProcessEngine();
RepositoryService rs=en.getRepositoryService();
ExecutionService executionService=en.getExecutionService();
String deploymentId=rs.createDeployment().addResourceFromClasspath("org/jbpm/examples/test/MyXml.xml").deploy();
System.out.println("deploymentId"+deploymentId);

Map<String,Object> map = new HashMap<String,Object> ();

map.put("a1", "hello");
ProcessInstance processInstance=executionService.startProcessInstanceByKey("test1",map);
System.out.println("创建流程实例的返回值："+processInstance);
//    ProcessInstance processInstance = executionService.startProcessInstanceByKey("Custom","CS"+deploymentId);
//Execution executionInPrintDots = processInstance.findActiveExecutionIn("print dots");
//// assertNotNull(executionInPrintDots);
//String executionId = executionInPrintDots.getId();
//
//System.out.println("executionId"+executionId);
//System.out.println("isEnded()"+processInstance.isEnded());
//
//executionService.signalExecutionById(executionId);
//System.out.println("isEnded()"+processInstance.isEnded());
//
//Execution  mystate = processInstance.findActiveExecutionIn("mystate");
////assertNotNull(executionInPrintDots);
////String mystateid = mystate.getId();
//
////System.out.println("mystateid"+mystateid);
//System.out.println("isEnded()"+processInstance.isEnded());
//
//executionService.signalExecutionById(executionId);
	}

}
