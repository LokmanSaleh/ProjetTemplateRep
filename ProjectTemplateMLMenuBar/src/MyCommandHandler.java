import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PlatformUI;

import com.B.Engine.MLTemplateManipulaition;

public class MyCommandHandler extends AbstractHandler {
	
	public static String SQL_DELETE_ALGORITHMS_FOR_TEMPLAET = " UPDATE algorithms  " + 
			"SET isDeleted = 1 " +
			"WHERE templateName = ?";
	
  public Object execute(ExecutionEvent event) throws ExecutionException {
    // Perform your desired action here
	  
	  System.out.println("HEllo ");

	  MLTemplateManipulaition mLTemplateManipulaition = new MLTemplateManipulaition();
	  mLTemplateManipulaition.main();
	  
    return null;
  }
}
