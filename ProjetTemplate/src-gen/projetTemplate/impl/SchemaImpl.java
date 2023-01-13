/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import projetTemplate.ModelElement;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.SchemaImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link projetTemplate.impl.SchemaImpl#getModelelement <em>Modelelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected String technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelelement() <em>Modelelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelelement()
	 * @generated
	 * @ordered
	 */
	protected ModelElement modelelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc --> 
	 * 
	 */
	protected SchemaImpl() {
		super();
		//		//    	ConnectionInterface conInter = new ConnectionInterface();
		//		//    	conInter.setTitle("Connection Data base");
		//		//      conInter.setVisible(true); 
		//
		//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
		//
		//		Statement stmt = con.createStatement();
		//
		//		stmt.executeQuery("SELECT 1");
		//
		//		JOptionPane.showInputDialog("CONNECTED");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(String newTechnology) {
		String oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.SCHEMA__TECHNOLOGY,
					oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getModelelement() {
		if (modelelement != null && modelelement.eIsProxy()) {
			InternalEObject oldModelelement = (InternalEObject) modelelement;
			modelelement = (ModelElement) eResolveProxy(oldModelelement);
			if (modelelement != oldModelelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.SCHEMA__MODELELEMENT, oldModelelement, modelelement));
			}
		}
		return modelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetModelelement() {
		return modelelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelelement(ModelElement newModelelement) {
		ModelElement oldModelelement = modelelement;
		modelelement = newModelelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.SCHEMA__MODELELEMENT,
					oldModelelement, modelelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.SCHEMA__TECHNOLOGY:
			return getTechnology();
		case ProjetTemplatePackage.SCHEMA__MODELELEMENT:
			if (resolve)
				return getModelelement();
			return basicGetModelelement();
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
		case ProjetTemplatePackage.SCHEMA__TECHNOLOGY:
			setTechnology((String) newValue);
			return;
		case ProjetTemplatePackage.SCHEMA__MODELELEMENT:
			setModelelement((ModelElement) newValue);
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
		case ProjetTemplatePackage.SCHEMA__TECHNOLOGY:
			setTechnology(TECHNOLOGY_EDEFAULT);
			return;
		case ProjetTemplatePackage.SCHEMA__MODELELEMENT:
			setModelelement((ModelElement) null);
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
		case ProjetTemplatePackage.SCHEMA__TECHNOLOGY:
			return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
		case ProjetTemplatePackage.SCHEMA__MODELELEMENT:
			return modelelement != null;
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
		result.append(" (technology: ");
		result.append(technology);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
