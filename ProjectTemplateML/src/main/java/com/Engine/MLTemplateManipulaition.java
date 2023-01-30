package com.Engine;
 
import java.io.File;

import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;

import com.library.utiles.EMFUtiles;

import projetTemplate.MLProject;

public class MLTemplateManipulaition {
	
	final static String TEMPLATE_PATH = "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\MLTemplate.projettemplate";

    public static void main(String args[]) {

       // MLProject mlProject =  EMFUtiles.load(TEMPLATE_PATH);
        
        //TODO : it's possible to parse the bpmn file into java object 
        File file = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\NaiveBayesChaine.bpmn");
        BpmnModelInstance modelInstance = Bpmn.readModelFromFile(file);
        
        //TODO : rendre le lien dans le path clickable 
        //EMFUtiles.SaveEMFObjectAsXMLEditor(mlProject);
        
        System.out.println(mlProject.toString()); 
    }

}
