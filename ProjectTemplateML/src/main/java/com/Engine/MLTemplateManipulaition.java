package com.Engine;
 
import java.io.File;

import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.eclipse.emf.common.util.EList;

import com.library.utiles.EMFUtiles;

import projetTemplate.ComputationalRequirementValue;
import projetTemplate.DomainRequirementValue;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLProject;
import projetTemplate.SelectionCriteria;
import projetTemplate.Componenets;

import resources.BdQueries; 

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class MLTemplateManipulaition {
	
	final static String TEMPLATE_PATH = "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\Engine\\MachineLearningConfiguration26.projettemplate";

    public static void main(String args[]) {

    	// Get the ml Data from template 
        MLProject mlProject =  EMFUtiles.load(TEMPLATE_PATH);
        
        String templateName = "MachineLearningConfiguration26";
         
        saveDataInDataBaseFromTempalete(mlProject,templateName );
  
        
        //TODO : it's possible to parse the bpmn file into java object 
//        File file = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\NaiveBayesChaine.bpmn");
//        BpmnModelInstance modelInstance = Bpmn.readModelFromFile(file);
        
        //TODO : rendre le lien dans le path clickable 
        //EMFUtiles.SaveEMFObjectAsXMLEditor(mlProject);
        
        
        
        
        System.out.println(mlProject.toString()); 
    }

    /**
     * 
     * @param mlProject
     * @param templateName
     */
	private static void saveDataInDataBaseFromTempalete(MLProject mlProject, String templateName) { 
         
		
        // Disactivate all the data related to this template 
        BdQueries.deleteAllProjectTemplateInformations(templateName);
         
        
        // conserve the selection criteria and their values
        	// conserve the Domaine requirement criteria 
        	for (DomainRequirementValue domainRequirementValue : mlProject.getDomainproblem().getDomainRequirementValue()) {
        		
        		BdQueries.insertCriteria(domainRequirementValue, DomainRequirementValue.class.toString(), "", templateName);
        		
        	}
        	
        	// conserve the computional requirement criteria, with their formula and values 
        	for (ComputationalRequirementValue computationalRequirementValue : mlProject.getDataanalysisproblem().getComputationalrequirementvalue()) {
        		
        		BdQueries.insertCriteria(computationalRequirementValue, ComputationalRequirementValue.class.toString(), computationalRequirementValue.getFormule(), templateName);
        		
        	}
        
        // conserve the ML algorithms with their criteria 
        	// conserve the ML algorithm, its category (model build, data preprosessing etc..), their selection criterias and values 
        	for (MLAlgorithmSolutionPattern mLAlgorithmSolutionPattern : mlProject.getDataanalysisproblem().getDataanalysisproblemtype().getMlalgorithmsolutionpattern()) {
        		
        		BdQueries.insertAlgorithm(mLAlgorithmSolutionPattern.getMlalgorithm().getName(), mLAlgorithmSolutionPattern.getMlalgorithm().getCriteriatochoosemlalgorithm().getComponenet().toString(), templateName);
            	
        		for (SelectionCriteria selectionCriteria : mLAlgorithmSolutionPattern.getMlalgorithm().getCriteriatochoosemlalgorithm().getSelectionCriteria()) {
 
        			BdQueries.insertAlgorithmCriteria(mLAlgorithmSolutionPattern.getMlalgorithm().getName(), selectionCriteria.getId(), templateName);
        		}
        	} 
        	
        	
        // Send data to the BPMN 
        ConnserveTheDataToBeReadableByBPMN();
        
	}

	
	private static void ConnserveTheDataToBeReadableByBPMN() {
		// TODO Auto-generated method stub
		
		List<String> listl = new ArrayList<>();
		
        BdQueries bdquery = new BdQueries();
        
        EList<MLAlgorithmSolutionPattern>  list = BdQueries.GetdAlgorithmsByCategory(Componenets.MODEL_CONSTRUCTION.toString()).getMlalgorithmsolutionpattern();
    
	      for (MLAlgorithmSolutionPattern mlsolutionAlgorithmSolutionPattern : list) {
	    	  listl.add(mlsolutionAlgorithmSolutionPattern.getMlalgorithm().getName());
	      }
      
	        try {
	            File file = new File("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\data.txt");
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	              
	            bw.write(String.join(";", listl));
	            
	            bw.close();
	            
	        } catch (IOException e) {
	        	
	            e.printStackTrace();
	        }
	        
	}
	
	
	
	
	
	
}
