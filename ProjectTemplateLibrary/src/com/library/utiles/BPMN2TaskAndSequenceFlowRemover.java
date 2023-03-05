package com.library.utiles;
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

public class BPMN2TaskAndSequenceFlowRemover {

    //public static void main(String[] args) throws IOException {
    
    public static void CreateNewChaineByRemovingUnecessaryComponent(List<String> listOfCondition) throws IOException {
    	
		//Overfitting==Yes
		//Overfitting==No
		//ImbalancedDataSet==Yes
		//MinoryClass<<1000
		//ImbalancedDataSet==Yes && MinoryClass<<1000
		//ImbalancedDataSet==Yes && MinoryClass>>1000
		//ProblemType==Classification && ConfidentialyDataLableled==No && Accuracy==High
		//DataType==Categorial && SpeedOfTraining==High && Accuracy==High
    			
    			
//    	List<String> listOfCondition = new ArrayList<String>(Arrays.asList("Overfitting==Yes",
//    																	   "ImbalancedDataSet==Yes", 
//    																	   "MinoryClass<<1000", 
//    																	   "ProblemType==Classification", 
//    																	   "ConfidentialyDataLableled==No", 
//    																	   "Accuracy==High",
//    																	   "DataType==Categorial",
//    																	   "SpeedOfTraining==Low"));

    	
        // Load the BPMN2 file
        File file = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\process.bpmn");
        FileInputStream fis = new FileInputStream(file);
        BpmnModelInstance modelInstance = Bpmn.readModelFromStream(fis);
    	
    	// Read the sequence flow in a iteration and split it on the && 
		for (SequenceFlow sequenceFlow : modelInstance.getModelElementsByType(SequenceFlow.class)) {
			
			if (sequenceFlow != null) {
				
		        // Get the condition expression from the sequence flow
		        ConditionExpression conditionExpression = sequenceFlow.getConditionExpression();
		        if (conditionExpression != null) { 
		        	
		            String conditionValue = conditionExpression.getTextContent();
		            String [] listOfAndCondition =  conditionValue.split(" && ");
		            
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
		                    
		            	}
		            }
		            
		            System.out.println("Condition expression: " +  " (value: " + conditionValue + ")");
		            
		        } else {
		        	
		            System.out.println("No condition expression found for sequence flow ");
		        }
		         
			}

		} 
    		 
        
        // Write the modified BPMN2 model to a new file
        File newFile = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\modified-process.bpmn");
        FileOutputStream fos = new FileOutputStream(newFile);
        //Bpmn.writeModelToStream(fos, modelInstance);
        Bpmn.writeModelToFile(newFile, modelInstance);
         
    }

}
    
      