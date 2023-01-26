/**
 */
package projetTemplate.impl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.ExtendedBPMNModel;
import projetTemplate.ProjetTemplatePackage;

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

			try {
				path = path.replaceAll("/", "\\");
				//path = path.replaceAll("\\", "\\\\");
				//TODO: create the bpmn file by the ressource offered by bpmn, to eliminate error 
			     File myFile = new File("C:\\Users\\lookm\\git\\ProjetTemplateRep\\ProjectTemplateML\\src\\main\\java\\com\\ProjectTemplateML\\"+ path +".bpmn");
			      if (myFile.createNewFile()) {
				        //System.out.println("File created: " + myObj.getName());
			    	  
						if (Desktop.isDesktopSupported()) {
							Desktop.getDesktop().open(myFile);
						}

			      }  else {
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
