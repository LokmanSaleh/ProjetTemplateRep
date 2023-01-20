package Utiles;
 
import com.automl.datarepresentation.view.ConnectionInterface;
import com.library.utiles.EMFUtiles;

import projetTemplate.MLProject;

public class UserInterfaceAPI {
	
    public static void main(String args[]) {


    	ConnectionInterface conInter = new ConnectionInterface();
    	conInter.setTitle("Connection Data base");
        conInter.setVisible(true);
 
    }

}
