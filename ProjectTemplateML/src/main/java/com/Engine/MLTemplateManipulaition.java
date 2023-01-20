package com.Engine;
 
import com.library.utiles.EMFUtiles;

import projetTemplate.MLProject;

public class MLTemplateManipulaition {
	
	final static String TEMPLATE_PATH = "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\MLTemplate.projettemplate";

    public static void main(String args[]) {

        MLProject mlProject =  EMFUtiles.load(TEMPLATE_PATH);
        
        //EMFUtiles.SaveEMFObjectAsXMLEditor(mlProject);
        
        System.out.println(mlProject.toString()); 
    }

}
