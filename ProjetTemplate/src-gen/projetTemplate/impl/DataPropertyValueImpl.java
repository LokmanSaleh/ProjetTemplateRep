/**
 */
package projetTemplate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projetTemplate.DataPropertyType;
import projetTemplate.DataPropertyValue;
import projetTemplate.DataPropertyValueSet;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DataPropertyValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.DataPropertyValueImpl#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.DataPropertyValueImpl#getDatapropertytype <em>Datapropertytype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPropertyValueImpl extends MinimalEObjectImpl.Container implements DataPropertyValue {
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
	 * The cached value of the '{@link #getDatapropertyvalueset() <em>Datapropertyvalueset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapropertyvalueset()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyValueSet> datapropertyvalueset;

	/**
	 * The cached value of the '{@link #getDatapropertytype() <em>Datapropertytype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapropertytype()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyType datapropertytype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DATA_PROPERTY_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATA_PROPERTY_VALUE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyValueSet> getDatapropertyvalueset() {
		if (datapropertyvalueset == null) {
			datapropertyvalueset = new EObjectWithInverseResolvingEList.ManyInverse<DataPropertyValueSet>(
					DataPropertyValueSet.class, this, ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET,
					ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE);
		}
		return datapropertyvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyType getDatapropertytype() {
		if (datapropertytype != null && datapropertytype.eIsProxy()) {
			InternalEObject oldDatapropertytype = (InternalEObject) datapropertytype;
			datapropertytype = (DataPropertyType) eResolveProxy(oldDatapropertytype);
			if (datapropertytype != oldDatapropertytype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYTYPE, oldDatapropertytype,
							datapropertytype));
			}
		}
		return datapropertytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyType basicGetDatapropertytype() {
		return datapropertytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatapropertytype(DataPropertyType newDatapropertytype) {
		DataPropertyType oldDatapropertytype = datapropertytype;
		datapropertytype = newDatapropertytype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYTYPE, oldDatapropertytype,
					datapropertytype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDatapropertyvalueset()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET:
			return ((InternalEList<?>) getDatapropertyvalueset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__NAME:
			return getName();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET:
			return getDatapropertyvalueset();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYTYPE:
			if (resolve)
				return getDatapropertytype();
			return basicGetDatapropertytype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			getDatapropertyvalueset().addAll((Collection<? extends DataPropertyValueSet>) newValue);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYTYPE:
			setDatapropertytype((DataPropertyType) newValue);
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYTYPE:
			setDatapropertytype((DataPropertyType) null);
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET:
			return datapropertyvalueset != null && !datapropertyvalueset.isEmpty();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYTYPE:
			return datapropertytype != null;
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

} //DataPropertyValueImpl
