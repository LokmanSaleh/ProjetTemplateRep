package com.B.Engine;
 
import java.io.File;

import org.camunda.bpm.model.bpmn.Bpmn;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.eclipse.emf.common.util.EList;
import org.hibernate.Criteria;

import com.library.utiles.EMFUtiles;

import projetTemplate.ComputationalRequirementValue;
import projetTemplate.DomainRequirementValue;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSelectionCriteriaContainer;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLProject;
import projetTemplate.SelectionCriteria;
import resources.BdQueries;
import resources.Item;
import projetTemplate.Componenets;
 

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class MLTemplateManipulaition {
	
	final static String TEMPLATE_PATH = "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\A\\ProjectTemplateML\\MachineLearningConfiguration.projettemplate";

    public static void main() {

    	// Get the ml Data from template 
        MLProject mlProject =  EMFUtiles.load(TEMPLATE_PATH);
        
        String templateName = "MachineLearningConfiguration";
         
        saveDataInDataBaseFromTempalete(mlProject,templateName );
        //ConnserveTheDataToBeReadableByBPMN();

        
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
            	
        		MLAlgorithmSelectionCriteriaContainer container = mLAlgorithmSolutionPattern.getMlalgorithm().getCriteriatochoosemlalgorithm();
        		for (SelectionCriteria selectionCriteria : container.getSelectionCriteria()) {
 
        			BdQueries.insertAlgorithmCriteria(mLAlgorithmSolutionPattern.getMlalgorithm().getName(), selectionCriteria.getId(), templateName);
        		}
        	} 
        	
        	
        // Send data to the BPMN 
        ConnserveTheDataToBeReadableByBPMN();
        
	}

	/**
	 * Conserve the data to be readable by BPMN
	 */
	private static void ConnserveTheDataToBeReadableByBPMN() {
		// TODO Auto-generated method stub
		
		List<List<String>> listOutPut = new ArrayList<List<String>>();

        BdQueries bdquery = new BdQueries();
        
        
        // Conserve les Algorithms avec leurs crieteres de selection dans le fichier 
        EList<MLAlgorithmSolutionPattern>  list = BdQueries.GetALLAlgorithms().getMlalgorithmsolutionpattern();
    
	      for (MLAlgorithmSolutionPattern mlsolutionAlgorithmSolutionPattern : list) {

	    	  MLAlgorithm mlalgorithm =  mlsolutionAlgorithmSolutionPattern.getMlalgorithm();
	  		
	    	  List<String> listOutPutMember = new ArrayList<String>(); 
	    	  listOutPutMember.add(mlalgorithm.getCriteriatochoosemlalgorithm().getComponenet().toString());
	    	  listOutPutMember.add(mlalgorithm.getName());

		      for (SelectionCriteria selectionCriteria : mlalgorithm.getCriteriatochoosemlalgorithm().getSelectionCriteria()) {
		    	  
		    	  // TODO : add the type of the criteria, Data analysis or user demande 
		    	  listOutPutMember.add(selectionCriteria.getCriteriaName());
		    	  listOutPutMember.add(selectionCriteria.getCriteriaValue());

		      } 
		      
		      listOutPut.add(listOutPutMember);
	      }
	      
	      
	      // conserve les criteres de selection dans le fichier. 
	      List<List<Item>> allCriteria = BdQueries.GetALLCriteria();
	      
	      	for (List<Item> criteria : allCriteria) {
	      		
		    	  List<String> listOutPutMember = new ArrayList<String>(); 
		    	  listOutPutMember.add("SelectionCriteria");
		    	  listOutPutMember.add(criteria.get(0).getCritere());
		    	  
		    	  for (Item item: criteria) {
		    		  
			    	  listOutPutMember.add(item.getValue());

		    	  }
	      		
		    	  listOutPut.add(listOutPutMember);
	      	}
       
	      	
	        try {
	        	
	            File file = new File("C:\\Users\\lookm\\git\\EtendreBPMNCriteresEtChoixDynamique\\org.eclipse.bpmn2-modeler\\examples\\plugins\\data.txt");
	            FileWriter fw = new FileWriter(file);
	            BufferedWriter bw = new BufferedWriter(fw);
	              
	            for (List<String> ele :  listOutPut) { 
		            bw.write(String.join(";", ele)+"\n"); 
	            }
	            
	            bw.close();
	            
	        } catch (IOException e) {
	        	
	            e.printStackTrace();
	        }
	        
	}
	 
}
