import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.B.Engine.MLTemplateManipulaition;

public class MyCommandHandler extends AbstractHandler {
	 
  public Object execute(ExecutionEvent event) throws ExecutionException {
    // Perform your desired action here
	  
	  System.out.println("HEllo ");

	  MLTemplateManipulaition mLTemplateManipulaition = new MLTemplateManipulaition();
	  mLTemplateManipulaition.main();
	  
    return null;
  }
}
