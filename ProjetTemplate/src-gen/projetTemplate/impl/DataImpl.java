/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.Data;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.impl.DataImpl#getCredentias <em>Credentias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredentias() <em>Credentias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentias()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDENTIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredentias() <em>Credentias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentias()
	 * @generated
	 * @ordered
	 */
	protected String credentias = CREDENTIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATA__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredentias() {
		return credentias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentias(String newCredentias) {
		String oldCredentias = credentias;
		credentias = newCredentias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATA__CREDENTIAS, oldCredentias,
					credentias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.DATA__VALUE:
			return getValue();
		case ProjetTemplatePackage.DATA__CREDENTIAS:
			return getCredentias();
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
		case ProjetTemplatePackage.DATA__VALUE:
			setValue((String) newValue);
			return;
		case ProjetTemplatePackage.DATA__CREDENTIAS:
			setCredentias((String) newValue);
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
		case ProjetTemplatePackage.DATA__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA__CREDENTIAS:
			setCredentias(CREDENTIAS_EDEFAULT);
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
		case ProjetTemplatePackage.DATA__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ProjetTemplatePackage.DATA__CREDENTIAS:
			return CREDENTIAS_EDEFAULT == null ? credentias != null : !CREDENTIAS_EDEFAULT.equals(credentias);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", credentias: ");
		result.append(credentias);
		result.append(')');
		return result.toString();
	}

} //DataImpl
