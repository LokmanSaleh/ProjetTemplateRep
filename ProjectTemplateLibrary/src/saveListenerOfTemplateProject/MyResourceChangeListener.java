package saveListenerOfTemplateProject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
 

public class MyResourceChangeListener implements IResourceChangeListener {
    private MLTemplateManipulaition fileHandler = new MLTemplateManipulaition();

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        // Check if the event was triggered by a file save
        if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
            IResourceDelta delta = event.getDelta();
            if (delta != null) {
                // Check if the delta corresponds to the specific file you want to watch
                IResourceDelta[] affectedChildren = delta.getAffectedChildren();
                for (IResourceDelta childDelta : affectedChildren) {
                    if (childDelta.getResource().getType() == IResource.FILE) {
                        IFile file = (IFile) childDelta.getResource();
                        if (file.getName().equals("myfile.txt")) {
                            // Call the method to handle the file save
                            fileHandler.main();
                        }
                    }
                }
            }
        }
    }
}
