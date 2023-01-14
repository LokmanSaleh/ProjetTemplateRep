package com.utiles;
 
import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import projetTemplate.MLProject;
import projetTemplate.ProjetTemplatePackage;

public class EMFModelLoad {
	
    public static MLProject load() {
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
                .createFileURI(new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\MLTemplate.projettemplate").getAbsolutePath()), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        MLProject myWeb = (MLProject) resource.getContents().get(0);
        return myWeb;
    }

    
    public static void main (String [] agrgs ) {
    	 load();
    }
}