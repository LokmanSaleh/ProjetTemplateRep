/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.DataPropertyValue;
import projetTemplate.ModelElement;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.ModelElementImpl#getDatapropertyvalue <em>Datapropertyvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatapropertyvalue() <em>Datapropertyvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapropertyvalue()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyValue datapropertyvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.MODEL_ELEMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyValue getDatapropertyvalue() {
		if (datapropertyvalue != null && datapropertyvalue.eIsProxy()) {
			InternalEObject oldDatapropertyvalue = (InternalEObject) datapropertyvalue;
			datapropertyvalue = (DataPropertyValue) eResolveProxy(oldDatapropertyvalue);
			if (datapropertyvalue != oldDatapropertyvalue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.MODEL_ELEMENT__DATAPROPERTYVALUE, oldDatapropertyvalue,
							datapropertyvalue));
			}
		}
		return datapropertyvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyValue basicGetDatapropertyvalue() {
		return datapropertyvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatapropertyvalue(DataPropertyValue newDatapropertyvalue) {
		DataPropertyValue oldDatapropertyvalue = datapropertyvalue;
		datapropertyvalue = newDatapropertyvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.MODEL_ELEMENT__DATAPROPERTYVALUE, oldDatapropertyvalue, datapropertyvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.MODEL_ELEMENT__NAME:
			return getName();
		case ProjetTemplatePackage.MODEL_ELEMENT__DATAPROPERTYVALUE:
			if (resolve)
				return getDatapropertyvalue();
			return basicGetDatapropertyvalue();
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
		case ProjetTemplatePackage.MODEL_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.MODEL_ELEMENT__DATAPROPERTYVALUE:
			setDatapropertyvalue((DataPropertyValue) newValue);
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
		case ProjetTemplatePackage.MODEL_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.MODEL_ELEMENT__DATAPROPERTYVALUE:
			setDatapropertyvalue((DataPropertyValue) null);
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
		case ProjetTemplatePackage.MODEL_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.MODEL_ELEMENT__DATAPROPERTYVALUE:
			return datapropertyvalue != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
