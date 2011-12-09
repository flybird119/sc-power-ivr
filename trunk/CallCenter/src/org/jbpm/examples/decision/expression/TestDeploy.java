package org.jbpm.examples.decision.expression;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jbpm.api.Configuration;
import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
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



//String deploymentId = rs.createDeployment()
//.addResourceFromClasspath("org/jbpm/examples/decision/expression/process.jpdl.xml")
//.deploy();
Map<String, Object> variables = new HashMap<String, Object>();
variables.put("content", "good");
ProcessInstance processInstance = executionService.startProcessInstanceByKey("DecisionExpression", variables);

   System.out.println("流程实例Id:" + processInstance.getId()); 
  System.out.println("流程定义Id:" + processInstance.getProcessDefinitionId());  
//  
//    // 判断当前是否位于state节点      
  System.out.println("是否位于submit document节点:" + processInstance.isActive("submit document"));  
   System.out.println("向下执行...");         

   System.out.println("当前流程是否结束---->"+processInstance.isEnded());        
    ProcessInstance endinstance=executionService.signalExecutionById(processInstance.getId(),"to end");    
 System.out.println("当前流程是否结束---->"+endinstance.isEnded());
//    
//    
    
    
    
    
    
    
    
    
    //    
//   // PrintDots.findActiveActivityNames().get(0);
//    //Execution executionInPrintDots = processInstance.findActiveExecutionIn("print dots");
//// assertNotNull(executionInPrintDots);
//
//System.out.println("print dots is Active:"+processInstance.isActive("print dots"));
////String executionId = executionInPrintDots.getId();
//ProcessInstance PrintDots=executionService.signalExecutionById(processInstance.getId(),"to print dots");
//
//
//
//System.out.println(" print dots isActive ()"+processInstance.isActive("print dots"));
//
//ProcessInstance mystate=executionService.signalExecutionById(processInstance.getId(),"to state");
//System.out.println(" print dots isEnded ()"+PrintDots.isEnded()); 
//
//System.out.println(" mystate isEnded()"+mystate.isEnded());
//System.out.println(" mystate isActive ()"+processInstance.isActive("mystate"));
//ProcessInstance end=executionService.signalExecutionById(processInstance.getId(),"to end");
//executionService.endProcessInstance(processInstance.getId(), "end");
//System.out.println("isEnded()"+end.isEnded());
////executionService.signalExecutionById(executionId);
//	

	}

}
