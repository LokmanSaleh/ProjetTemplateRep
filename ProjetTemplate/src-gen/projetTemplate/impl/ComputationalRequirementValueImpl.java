/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.ComputationalRequirementValue;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computational Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.ComputationalRequirementValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.impl.ComputationalRequirementValueImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link projetTemplate.impl.ComputationalRequirementValueImpl#getRequirementtype <em>Requirementtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationalRequirementValueImpl extends MinimalEObjectImpl.Container
		implements ComputationalRequirementValue {
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
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirementtype() <em>Requirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementtype()
	 * @generated
	 * @ordered
	 */
	protected RequirementType requirementtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationalRequirementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.COMPUTATIONAL_REQUIREMENT_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getRequirementtype() {
		if (requirementtype != null && requirementtype.eIsProxy()) {
			InternalEObject oldRequirementtype = (InternalEObject) requirementtype;
			requirementtype = (RequirementType) eResolveProxy(oldRequirementtype);
			if (requirementtype != oldRequirementtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE, oldRequirementtype,
							requirementtype));
			}
		}
		return requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetRequirementtype() {
		return requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementtype(RequirementType newRequirementtype) {
		RequirementType oldRequirementtype = requirementtype;
		requirementtype = newRequirementtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE, oldRequirementtype,
					requirementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__VALUE:
			return getValue();
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE:
			return getRationale();
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			if (resolve)
				return getRequirementtype();
			return basicGetRequirementtype();
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
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__VALUE:
			setValue((String) newValue);
			return;
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE:
			setRationale((String) newValue);
			return;
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) newValue);
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
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
			return;
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) null);
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
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			return requirementtype != null;
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
		result.append(", rationale: ");
		result.append(rationale);
		result.append(')');
		return result.toString();
	}

} //ComputationalRequirementValueImpl
