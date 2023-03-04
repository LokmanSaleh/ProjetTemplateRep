package com.library.utiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance; 
import org.camunda.bpm.model.bpmn.instance.FlowElement;
import org.camunda.bpm.model.bpmn.instance.SequenceFlow;
import org.camunda.bpm.model.bpmn.instance.Task;
import org.camunda.bpm.model.bpmn.instance.bpmndi.BpmnDiagram;
import org.camunda.bpm.model.bpmn.instance.bpmndi.BpmnShape;
import org.camunda.bpm.model.bpmn.instance.di.DiagramElement;
import org.camunda.bpm.model.xml.instance.ModelElementInstance;

public class BPMN2TaskAndSequenceFlowRemover {

    public static void main(String[] args) throws IOException {
        // Load the BPMN2 file
        File file = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\process.bpmn");
        FileInputStream fis = new FileInputStream(file);
        BpmnModelInstance modelInstance = Bpmn.readModelFromStream(fis);

        // Remove the task with the specified ID and its incoming and outgoing sequence flows
        String taskIdToRemove = "Task_2";
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
        
        // Write the modified BPMN2 model to a new file
        File newFile = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\modified-process.bpmn");
        FileOutputStream fos = new FileOutputStream(newFile);
        Bpmn.writeModelToStream(fos, modelInstance);
    }

    private static void removeFlowElement(BpmnModelInstance modelInstance, FlowElement flowElement) {
        flowElement.getParentElement().removeChildElement(flowElement);
//		for (SequenceFlow sequenceFlow : flowElement.getOutgoing()) {
//			removeFlowElement(modelInstance, sequenceFlow);
//		}
    }
}
