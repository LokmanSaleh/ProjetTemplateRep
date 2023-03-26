package com.library.utiles;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.FlowElement;
import org.camunda.bpm.model.bpmn.instance.camunda.CamundaProperties;
import org.camunda.bpm.model.bpmn.instance.camunda.CamundaProperty;
import org.camunda.bpm.model.xml.instance.ModelElementInstance;

public class ADDDpoDownListInTheProperties {

	public static void main (String arg[]) throws Exception {
		
        File file = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\process_addDropDownList.bpmn");
        FileInputStream fis = new FileInputStream(file);
        BpmnModelInstance modelInstance = Bpmn.readModelFromStream(fis);
        
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("prop1", "value1"); 
        stringMap.put("prop2", "value2");
        stringMap.put("prop3", "value3");
        
        modelInstance = addCamundaProperties(modelInstance, Arrays.asList("ServiceTask_1"), stringMap);
	    
        File newFile2 = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\modified-process_addDropDownList.bpmn");

        FileOutputStream fos = new FileOutputStream(newFile2); 
        //Bpmn.writeModelToStream(fos, modelInstance);
        Bpmn.writeModelToFile(newFile2, modelInstance);
        
        Desktop.getDesktop().open(newFile2);
        
		// Get the BPMN model instance for the process definition
		//BpmnModelInstance modelInstance = repositoryService.getBpmnModelInstance(processDefinitionId);

		// Get the task element you want to add a dropdown list to
		/*
		 * FlowElement task = modelInstance.getModelElementById("ServiceTask_1");
		 * 
		 * // Add a new extension element to the task element CamundaProperties
		 * properties = CamundaPropertiesBuilder.create()
		 * .camundaProperty("Dropdown List") .camundaType("Dropdown")
		 * .camundaValue("Option 1, Option 2, Option 3") .build();
		 * 
		 * CamundaExtensionElements extensionElements =
		 * CamundaExtensionElementsBuilder.create() .addExtensionElement(properties)
		 * .build();
		 * 
		 * task.builder() .extensionElements(extensionElements) .build();
		 * 
		 * // Update the BPMN process definition with the modified model instance
		 * repositoryService.updateBpmnModelInstance(processDefinitionId,
		 * modelInstance);
		 */

	}


	private static CamundaProperties createCamundaProperties(BpmnModelInstance bpmnModelInstance, Map<String,String> properties) {
	    CamundaProperties camundaProperties = bpmnModelInstance.newInstance(CamundaProperties.class);
	    Iterator<Map.Entry<String, String>> iterator = properties.entrySet().iterator();
	    while (iterator.hasNext()) { 
	    	Map.Entry<String, String> entry = iterator.next();
	        camundaProperties.addChildElement(addCamundaProperty(camundaProperties, entry.getKey(), entry.getValue()));
	    }
	  return camundaProperties;
	}

	private static CamundaProperty addCamundaProperty(CamundaProperties properties, String key, String value){
	    CamundaProperty property = properties.getModelInstance().newInstance(CamundaProperty.class);
	    property.setCamundaName(key);
	    property.setCamundaValue(value);
	    return property;
	}

	private static BpmnModelInstance addCamundaProperties(BpmnModelInstance bpmnModelInstance, List<String> elementIds, Map<String, String> properties ) throws Exception{
	   
		for (String elementId : elementIds) {
		//elementIds.each { elementId ->
		
			FlowElement instance = bpmnModelInstance.getModelElementById(elementId);
	        
	        try {
	        	
	            CamundaProperties camundaProperties = createCamundaProperties(bpmnModelInstance,properties);
	            instance.builder().addExtensionElement(camundaProperties);
	            
	        } catch (Exception e){
	        	
	            throw new Exception("Cant add extension to Element: ${elementId}.  Error: ${e}");
	        }
	    }

	    return bpmnModelInstance;
	}

	/*
	 * BpmnModelInstance model3() {
	 * 
	 * BpmnModelInstance model = Bpmn.createExecutableProcess('model')
	 * .name("Reminder Demo") .startEvent('someStartEvent') .userTask('readEmail')
	 * .boundaryEvent('killusertask') .timerWithDuration("PT1H")
	 * .cancelActivity(true) .moveToActivity('readEmail') .boundaryEvent()
	 * .timerWithCycle("R3/PT10M") .cancelActivity(false) .serviceTask()
	 * .name('reminderSent') .implementation('expression')
	 * .camundaExpression('${1+1}') .endEvent() .moveToActivity('readEmail')
	 * .manualTask('manual1').name('do something')
	 * .moveToNode('killusertask').connectTo('manual1')
	 * //.moveToActivity('killusertask').connectTo('manual1') This does not work.
	 * Must use the moveToNode() .manualTask('manual2').name('do something else')
	 * .endEvent() .done(); model = addCamundaProperties(model,
	 * ['model','someStartEvent','killusertask', 'readEmail'], ['prop1':'value1',
	 * 'prop2':'value2']); return model; }
	 */
	
	
}
