package com.zuowa.scpower.ivr;

import java.util.List;

import org.jbpm.api.Configuration;
import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.IdentityService;
import org.jbpm.api.ProcessDefinition;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.RepositoryService;

public class TestDeploy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
ProcessEngine en=Configuration.getProcessEngine();
RepositoryService rs=en.getRepositoryService();
ExecutionService executionService=en.getExecutionService();
IdentityService identityService = en.getIdentityService();

System.out.println(identityService.findGroupById("sales").getId());  
//for (int i=21;i<23;i++) {   
	//rs.deleteDeploymentCascade(1+"0001");
//	}  

//rs.deleteDeploymentCascade(4+"0001");
//rs.deleteDeploymentCascade("1");
//String deploymentId=rs.createDeployment().addResourceFromClasspath("com/zuowa/scpower/ivr/leave.jpdl.xml").deploy();
//System.out.println("deploymentId"+deploymentId);

List<ProcessDefinition> definitions=rs.createProcessDefinitionQuery().list();//执行搜索   
for (ProcessDefinition processDefinition : definitions) {   
  System.out.println(processDefinition.getId());   
}  
// ProcessInstance processInstance = executionService.startProcessInstanceByKey("Custom");  
//   System.out.println("流程实例Id:" + processInstance.getId()); 
//  System.out.println("流程定义Id:" + processInstance.getProcessDefinitionId());  
////  
////    // 判断当前是否位于state节点      
//  System.out.println("是否位于print dots节点:" + processInstance.isActive("print dots"));  
//   System.out.println("向下执行...");         
//  // Execution executionInPrintDots = processInstance.findActiveExecutionIn("print dots");
//   
//  // String executionId = executionInPrintDots.getId();
//   
// //  System.out.println("executionId=executionInPrintDots.getId():"+executionId+"\n executionInPrintDots"+executionInPrintDots);   
//   ProcessInstance processInstanceMyState= executionService.signalExecutionById(processInstance.getId(),"to mystate");
//  //  ProcessInstance processInstanceMyState=executionService.signalExecutionById(processInstance.getId());      
//  System.out.println("当前流程是否位于mystate节点---->"+processInstance.isActive("mystate"));    
//   System.out.println("当前流程是否结束---->"+processInstance.isEnded());        
//    ProcessInstance endinstance=executionService.signalExecutionById(processInstance.getId());    
// System.out.println("当前流程是否结束---->"+processInstance.isEnded());



	}

}
