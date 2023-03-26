/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementMapping;
import projetTemplate.RequirementType;
import projetTemplate.RequirementTypeValues;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.RequirementTypeImpl#getRequirementmapping <em>Requirementmapping</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementTypeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementTypeImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementTypeImpl extends MinimalEObjectImpl.Container implements RequirementType {
	/**
	 * The cached value of the '{@link #getRequirementmapping() <em>Requirementmapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementmapping()
	 * @generated
	 * @ordered
	 */
	protected RequirementMapping requirementmapping;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementTypeValues VALUE_TYPE_EDEFAULT = RequirementTypeValues.EXPLINABILITY;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected RequirementTypeValues valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.REQUIREMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementMapping getRequirementmapping() {
		if (requirementmapping != null && requirementmapping.eIsProxy()) {
			InternalEObject oldRequirementmapping = (InternalEObject) requirementmapping;
			requirementmapping = (RequirementMapping) eResolveProxy(oldRequirementmapping);
			if (requirementmapping != oldRequirementmapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.REQUIREMENT_TYPE__REQUIREMENTMAPPING, oldRequirementmapping,
							requirementmapping));
			}
		}
		return requirementmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementMapping basicGetRequirementmapping() {
		return requirementmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementmapping(RequirementMapping newRequirementmapping) {
		RequirementMapping oldRequirementmapping = requirementmapping;
		requirementmapping = newRequirementmapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.REQUIREMENT_TYPE__REQUIREMENTMAPPING, oldRequirementmapping,
					requirementmapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.REQUIREMENT_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.REQUIREMENT_TYPE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementTypeValues getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(RequirementTypeValues newValueType) {
		RequirementTypeValues oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.REQUIREMENT_TYPE__VALUE_TYPE,
					oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE,
					oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.REQUIREMENT_TYPE__REQUIREMENTMAPPING:
			if (resolve)
				return getRequirementmapping();
			return basicGetRequirementmapping();
		case ProjetTemplatePackage.REQUIREMENT_TYPE__NAME:
			return getName();
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DESCRIPTION:
			return getDescription();
		case ProjetTemplatePackage.REQUIREMENT_TYPE__VALUE_TYPE:
			return getValueType();
		case ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE:
			return getScope();
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
		case ProjetTemplatePackage.REQUIREMENT_TYPE__REQUIREMENTMAPPING:
			setRequirementmapping((RequirementMapping) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__VALUE_TYPE:
			setValueType((RequirementTypeValues) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE:
			setScope((String) newValue);
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
		case ProjetTemplatePackage.REQUIREMENT_TYPE__REQUIREMENTMAPPING:
			setRequirementmapping((RequirementMapping) null);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__VALUE_TYPE:
			setValueType(VALUE_TYPE_EDEFAULT);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE:
			setScope(SCOPE_EDEFAULT);
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
		case ProjetTemplatePackage.REQUIREMENT_TYPE__REQUIREMENTMAPPING:
			return requirementmapping != null;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ProjetTemplatePackage.REQUIREMENT_TYPE__VALUE_TYPE:
			return valueType != VALUE_TYPE_EDEFAULT;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE:
			return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
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
		result.append(", description: ");
		result.append(description);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //RequirementTypeImpl
