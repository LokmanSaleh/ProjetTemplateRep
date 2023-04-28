package saveListenerOfTemplateProject;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class MyPlugin extends AbstractUIPlugin implements IStartup {
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        ResourcesPlugin.getWorkspace().addResourceChangeListener(new MyResourceChangeListener());
    }

    @Override
    public void earlyStartup() {
        // Do nothing
    }
}
 
