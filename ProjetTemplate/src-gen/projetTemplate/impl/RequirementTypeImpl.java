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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import projetTemplate.ComputationalRequirementValue;
import projetTemplate.DomainRequirementValue;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementMapping;
import projetTemplate.RequirementType;

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
 *   <li>{@link projetTemplate.impl.RequirementTypeImpl#getDomainrequirementvalue <em>Domainrequirementvalue</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementTypeImpl#getComputationalrequirementvalue <em>Computationalrequirementvalue</em>}</li>
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
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getDomainrequirementvalue() <em>Domainrequirementvalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainrequirementvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainRequirementValue> domainrequirementvalue;

	/**
	 * The cached value of the '{@link #getComputationalrequirementvalue() <em>Computationalrequirementvalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationalrequirementvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputationalRequirementValue> computationalrequirementvalue;

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
	public String getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType) {
		String oldValueType = valueType;
		valueType = newValueType;
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
	public EList<DomainRequirementValue> getDomainrequirementvalue() {
		if (domainrequirementvalue == null) {
			domainrequirementvalue = new EObjectResolvingEList<DomainRequirementValue>(DomainRequirementValue.class,
					this, ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE);
		}
		return domainrequirementvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputationalRequirementValue> getComputationalrequirementvalue() {
		if (computationalrequirementvalue == null) {
			computationalrequirementvalue = new EObjectWithInverseResolvingEList<ComputationalRequirementValue>(
					ComputationalRequirementValue.class, this,
					ProjetTemplatePackage.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE,
					ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE);
		}
		return computationalrequirementvalue;
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
		case ProjetTemplatePackage.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComputationalrequirementvalue())
					.basicAdd(otherEnd, msgs);
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
		case ProjetTemplatePackage.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE:
			return ((InternalEList<?>) getComputationalrequirementvalue()).basicRemove(otherEnd, msgs);
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
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE:
			return getDomainrequirementvalue();
		case ProjetTemplatePackage.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE:
			return getComputationalrequirementvalue();
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
			setValueType((String) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE:
			setScope((String) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE:
			getDomainrequirementvalue().clear();
			getDomainrequirementvalue().addAll((Collection<? extends DomainRequirementValue>) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE:
			getComputationalrequirementvalue().clear();
			getComputationalrequirementvalue().addAll((Collection<? extends ComputationalRequirementValue>) newValue);
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
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE:
			getDomainrequirementvalue().clear();
			return;
		case ProjetTemplatePackage.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE:
			getComputationalrequirementvalue().clear();
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
			return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
		case ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE:
			return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE:
			return domainrequirementvalue != null && !domainrequirementvalue.isEmpty();
		case ProjetTemplatePackage.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE:
			return computationalrequirementvalue != null && !computationalrequirementvalue.isEmpty();
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
