package com.Engine;
 
import com.library.utiles.EMFUtiles;

import projetTemplate.MLProject;

public class DataBaseConnection {
	
	final static String TEMPLATE_PATH = "C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\MLTemplate2.projettemplate";

    public static void main(String args[]) {


//    	ConnectionInterface conInter = new ConnectionInterface();
//    	conInter.setTitle("Connection Data base");
//      conInter.setVisible(true);
        
        MLProject mlProject =  EMFUtiles.load(TEMPLATE_PATH);
        
//    	ConnectionInterface conInter = new ConnectionInterface();
//    	conInter.setTitle("Connection Data base");
//      conInter.setVisible(true);
        
        System.out.println(mlProject.getDatabase().toString());
        int x=0;
    }

}
