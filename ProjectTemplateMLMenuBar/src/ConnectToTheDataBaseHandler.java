import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.B.Engine.MLTemplateManipulaition;

import Utiles.UserInterfaceAPI;

public class ConnectToTheDataBaseHandler extends AbstractHandler {
	 
  public Object execute(ExecutionEvent event) throws ExecutionException {
    // Perform your desired action here
	  
	  System.out.println("ConnectToTheDataBaseHandler ");

	  UserInterfaceAPI.main();
	  
    return null;
  }
}
