/**
 */
package projetTemplate.impl;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.ExtendedBPMNModel;
import projetTemplate.ProjetTemplatePackage;



import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.Process;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended BPMN Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.ExtendedBPMNModelImpl#getPath <em>Path</em>}</li>
 *   <li>{@link projetTemplate.impl.ExtendedBPMNModelImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedBPMNModelImpl extends MinimalEObjectImpl.Container implements ExtendedBPMNModel {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedBPMNModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.EXTENDED_BPMN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {

			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.EXTENDED_BPMN_MODEL__PATH,
					oldPath, path));

			
//			
//			
//			// create a new BPMN2 model
//			Bpmn2Factory factory = Bpmn2Factory.eINSTANCE;
//			Definitions definitions = factory.createDefinitions();
//			Process process = factory.createProcess();
//			process.setId("myProcess");
//			definitions.getRootElements().add(process);
//
//	        // Create a new file in the workspace
//	        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
//	        IFile file = workspaceRoot.getFile(new Path("hy\\src" + path+".bpmn") );
//	        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
//	        
//	        // Save the BPMN model to the file
//	        ResourceSet resourceSet = new ResourceSetImpl();
//	        Resource resource = resourceSet.createResource(uri);
//	        resource.getContents().add(definitions);
//	        
//	        try {
//	            resource.save(null);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	            return;
//	        }
//
//	        // Open the BPMN file in an editor
//	        IWorkbench workbench = PlatformUI.getWorkbench();
//	        IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
//	        IWorkbenchPage page = window.getActivePage();
//	        IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
//	        IEditorInput editorInput = new FileEditorInput(file);
//	        
//			try {
//			    IDE.openEditor(page, file, "http://org.eclipse.bpmn2.modeler.examples.customtask", true);
//			} catch (PartInitException e) {
//			    e.printStackTrace();
//			}
//
//			
//			
//			
			
			
			
			
			
			
			
			try {
				path = path.replaceAll("/", "\\");
				//path = path.replaceAll("\\", "\\\\");
				//TODO: create the bpmn file by the ressource offered by bpmn, to eliminate error 
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorPart editor = page.getActiveEditor();
				IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
				IFile file = input.getFile();
				IProject project = file.getProject();
				String pathProject = project.getLocation().toString();
				
				File myFile =  copieTemplate(pathProject+"/" + path + ".bpmn");
				
				if (myFile.createNewFile()) {
					//System.out.println("File created: " + myObj.getName());

					if (Desktop.isDesktopSupported()) {
						Desktop.getDesktop().open(myFile);
					}

				} else {
					if (Desktop.isDesktopSupported()) {
						
						Desktop.getDesktop().open(myFile);
					}
					//System.out.println("File already exists.");
				}
				//			        
				//				if (Desktop.isDesktopSupported()) {
				//					Desktop.getDesktop().open(new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\MY" + ".bpmn"));
				//				}

			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}
	}

	
	public static File copieTemplate(String Path) {
		
	      InputStream inputStream = null;
	      OutputStream outputStream = null;
	      File file2 = null;
	      try {
	         File file1 = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjetTemplate\\model\\TemplateEtendedBPMNChaine.bpmn"); // Replace "source_file_path" with the path of the source file
	         file2 = new File(Path); // Replace "destination_file_path" with the path of the destination file
	         inputStream = new FileInputStream(file1);
	         outputStream = new FileOutputStream(file2);

	         byte[] buffer = new byte[1024];
	         int length;

	         while ((length = inputStream.read(buffer)) > 0) {
	            outputStream.write(buffer, 0, length);
	         }

	         System.out.println("File copied successfully");
	         
	         
	      } catch (IOException e) {
	    	  
	         e.printStackTrace();
	      } finally {
	         try {
	        	 
	            inputStream.close();
	            outputStream.close();
  
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	      
		return file2;

	   }
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.EXTENDED_BPMN_MODEL__AUTHOR,
					oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__PATH:
			return getPath();
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__AUTHOR:
			return getAuthor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__PATH:
			setPath((String) newValue);
			return;
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__AUTHOR:
			setAuthor((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(", author: ");
		result.append(author);
		result.append(')');
		return result.toString();
	}

} //ExtendedBPMNModelImpl
