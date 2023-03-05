package com.library.utiles.notUsed;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.ConditionExpression;
import org.camunda.bpm.model.bpmn.instance.FlowElement;
import org.camunda.bpm.model.bpmn.instance.FlowNode;
import org.camunda.bpm.model.bpmn.instance.SequenceFlow;
import org.camunda.bpm.model.bpmn.instance.Task;
import org.camunda.bpm.model.bpmn.instance.bpmndi.BpmnDiagram;
import org.camunda.bpm.model.bpmn.instance.bpmndi.BpmnShape;
import org.camunda.bpm.model.bpmn.instance.di.DiagramElement;
import org.camunda.bpm.model.xml.instance.ModelElementInstance;

public class BPMN2TaskAndSequenceFlowRemover2 {

    public static void main(String[] args) throws IOException {
    	
		//Overfitting==Yes
		//Overfitting==No
		//ImbalancedDataSet==Yes
		//MinoryClass<<1000
		//ImbalancedDataSet==Yes && MinoryClass<<1000
		//ImbalancedDataSet==Yes && MinoryClass>>1000
		//ProblemType==Classification && ConfidentialyDataLableled==No && Accuracy==High
		//DataType==Categorial && SpeedOfTraining==High && Accuracy==High
    			
    			
    	List<String> listOfCondition = new ArrayList<String>(Arrays.asList("Overfitting==Yes",
    																	   "ImbalancedDataSet==Yes", 
    																	   "MinoryClass<<1000", 
    																	   "ProblemType==Classification", 
    																	   "ConfidentialyDataLableled==No", 
    																	   "Accuracy==High",
    																	   "DataType==Categorial",
    																	   "SpeedOfTraining==High"));

    	
        // Load the BPMN2 file
        File file = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\process.bpmn");
        FileInputStream fis = new FileInputStream(file);
        BpmnModelInstance modelInstance = Bpmn.readModelFromStream(fis);
        
        // Get the BPMN diagram element
        BpmnDiagram bpmnDiagram = modelInstance.getModelElementsByType(BpmnDiagram.class).iterator().next();

        

    	
    	// Read the sequence flow in a iteration and split it on the && 
		for (SequenceFlow sequenceFlow : modelInstance.getModelElementsByType(SequenceFlow.class)) {
			if (sequenceFlow != null) {
				
		        // Get the condition expression from the sequence flow
		        ConditionExpression conditionExpression = sequenceFlow.getConditionExpression();
		        if (conditionExpression != null) { 
		        	
		            String conditionValue = conditionExpression.getTextContent();
		            String [] listOfAndCondition =  conditionValue.split(" && ");
		            
		         // verify that all the condition in the list 
		            boolean isAllConditionInsideListe = true;
		            
		            for (int i=0; i < listOfAndCondition.length ; i++  ) {
		            	
		            	if(!listOfCondition.contains(listOfAndCondition[i])) { 

		                    // Get the target task of the sequence flow that you just removed (TASK)
		                    Task targetTask = (Task) sequenceFlow.getTarget();

		                    // Find the outgoing sequence flows from the target task (The third sequence flow) 
		                    for (SequenceFlow successorFlowtemp : targetTask.getOutgoing()) {
		                    	successorFlowtemp.getParentElement().removeChildElement(successorFlowtemp); 
		                    }
		                    
		                    // remove the task
		                    targetTask.getParentElement().removeChildElement(targetTask); 
		                     
		                    // Remove the sequence flow
		            		sequenceFlow.getParentElement().removeChildElement(sequenceFlow);
		                    
		                    // Remove the target task and all its outgoing sequence flows
//		                    targetTask.getOutgoing().forEach(targetOutgoingFlow -> {
//		                        FlowNode targetOutgoingTask = (FlowNode) targetOutgoingFlow.getTarget();
//		                        targetOutgoingTask.getIncoming().remove(targetOutgoingFlow);
//		                        modelInstance.getModelElementsByType(FlowElement.class).remove(targetOutgoingTask);
//		                    });
//		                    if (successorFlow != null) {
//		                        FlowNode successorTask = (FlowNode) successorFlow.getTarget();
//		                        successorTask.getIncoming().remove(successorFlow);
//		                        modelInstance.getModelElementsByType(FlowElement.class).remove(successorTask);
//		                    }
		                    
		            	}
		            }
		            
		            System.out.println("Condition expression: " +  " (value: " + conditionValue + ")");
		            
		        } else {
		            System.out.println("No condition expression found for sequence flow ");
		        }
		        
				String elementType = sequenceFlow.getElementType().getTypeName();
				String elementId = sequenceFlow.getAttributeValue("id");
				System.out.println("Sequence flow: " + elementType + " (ID: " + elementId + ")");
			}

		} 
    		
    			// if not remove the sequence flow with its successor task 
    	
    	
    	// Split 
        //removeTaskByID(modelInstance, "Task_2");
        
        
        // Write the modified BPMN2 model to a new file
        File newFile = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\modified-process2.bpmn");
        FileOutputStream fos = new FileOutputStream(newFile);
        Bpmn.writeModelToStream(fos, modelInstance);
         
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * 
     * @param modelInstance
     * @param taskIdToRemove
     */
    private static void removeTaskByID(BpmnModelInstance modelInstance, String taskIdToRemove ) {
    	
        // Remove the task with the specified ID and its incoming and outgoing sequence flows
        Task task = modelInstance.getModelElementById(taskIdToRemove);
        
        for (SequenceFlow sequenceFlow : task.getIncoming()) {
            removeFlowElement(modelInstance, sequenceFlow);
        }
        for (SequenceFlow sequenceFlow : task.getOutgoing()) {
            removeFlowElement(modelInstance, sequenceFlow);
        }
        removeFlowElement(modelInstance, task);

        // Remove the BPMN diagram information for the removed task
        BpmnShape diagram = modelInstance.getModelElementsByType(BpmnShape.class).iterator().next();
        for (DiagramElement diagramElement : diagram.getChildElementsByType(DiagramElement.class)) {
            if (diagramElement instanceof ModelElementInstance) {
                ModelElementInstance element = (ModelElementInstance) diagramElement;
                if (element.equals(task)) {
                    diagramElement.getParentElement().removeChildElement(diagramElement);
                }
            }
        }
    }
    /**
     * 
     * @param modelInstance
     * @param flowElement
     */
    private static void removeFlowElement(BpmnModelInstance modelInstance, FlowElement flowElement) {
        flowElement.getParentElement().removeChildElement(flowElement);
//		for (SequenceFlow sequenceFlow : flowElement.getOutgoing()) {
//			removeFlowElement(modelInstance, sequenceFlow);
//		}
    }
}
