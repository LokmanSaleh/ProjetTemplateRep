package projectwizard;
 

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;


public class MyWizard extends Wizard implements INewWizard {

    protected MyPageOne one;
    protected MyPageTwo two;

    public MyWizard() {
        super();
        setNeedsProgressMonitor(true);
    }

    @Override
    public String getWindowTitle() {
        return "Export My Data";
    }

    @Override
    public void addPages() {
        one = new MyPageOne();
        two = new MyPageTwo();
        addPage(one);
        //addPage(two);
    }

    @Override
    public boolean performFinish() {
        // Print the result to the console
        System.out.println(one.getText1());
        //System.out.println(two.getText1());
        
        IProjectDescription description = null;
        
        try {
          String PROJECT_PATH = "C:\\Users\\lookm\\eclipse-workSpace-ForModeling\\CreatProjectFromWizard";
          description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(PROJECT_PATH + "/.project")); //$NON-NLS-1$ 
          IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(one.getText1());
          project.create(description, null);
          project.open(null);
          
        } catch (CoreException exception_p) {
          exception_p.printStackTrace();
        }
        return true;
    }

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
}