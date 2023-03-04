package com.library.utiles.notUsed;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.bpmn2.BaseElement;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import projetTemplate.Database;
import projetTemplate.MLProject;
import projetTemplate.ProjetTemplateFactory;
import projetTemplate.ProjetTemplatePackage;

public class EMFUtilesBPMN{

    /**
     * @param args
     */
    public static void main(String[] args) {
    	
//    	String FilePath= "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\MLTemplate2.projettemplate";
//    	SaveEMFObjectAsXMLEditor(FilePath);
//    	
//    	String FileLocation =  "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\MLTemplate.projettemplate";
    	System.out.println(loadBPMN( ).toString());
    	
    	
    }
    
    public static void SaveEMFObjectAsXMLEditor(String FILE_PATH_WITH_EXTENSION) {
    
        // Initialize the model
    	ProjetTemplatePackage.eINSTANCE.eClass();
        // Retrieve the default factory singleton
    	ProjetTemplateFactory factory = ProjetTemplateFactory.eINSTANCE;

        // create the content of the model via this program
        MLProject myWeb = factory.createMLProject();
        Database page = factory.createDatabase();
        page.setCredentias("credential");
        page.setValue("LE valeur"); 
        myWeb.setDatabase(page);
        
        // As of here we preparing to save the model content

        // Register the XMI resource factory for the .website extension

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("projettemplate", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
//        Resource resource = resSet.createResource(URI
//                .createURI("http://www.example.org/projetTemplate"));
        Resource resource = resSet.createResource(URI
                .createFileURI(new File(FILE_PATH_WITH_EXTENSION).getAbsolutePath()));
  
        
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        resource.getContents().add(myWeb);
        resource.getContents().add(page);

        // now save the content.
        try {
            resource.save(null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } 
    
    public static MLProject load(String FILE_LOCATION) {
        // Initialize the model
    	ProjetTemplatePackage.eINSTANCE.eClass();

        // Register the XMI resource factory for the .website extension 
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("projettemplate", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createFileURI(new File(FILE_LOCATION).getAbsolutePath()), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        MLProject myWeb = (MLProject) resource.getContents().get(0);
        return myWeb;
    }
    
    
    public static EObject loadBPMN() {
        // Initialize the model
    	Bpmn2Package.eINSTANCE.eClass();

        // Register the XMI resource factory for the .website extension 
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("bpmn2:definitions", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI
                .createFileURI(new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateLibrary\\src\\com\\library\\utiles\\process_1.bpmn").getAbsolutePath()), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        BaseElement mybpmnfile = (BaseElement) resource.getContents().get(0);
        
        return mybpmnfile;
    }
    
    
    
}