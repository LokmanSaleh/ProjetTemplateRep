/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import projetTemplate.DomainRequirementValue;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getRequirementtype <em>Requirementtype</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getHy <em>Hy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainRequirementValueImpl extends MinimalEObjectImpl.Container implements DomainRequirementValue {
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
	 * The default value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPLANATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected String explanation = EXPLANATION_EDEFAULT;

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
	 * The default value of the '{@link #getHy() <em>Hy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHy()
	 * @generated
	 * @ordered
	 */
	protected static final String HY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHy() <em>Hy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHy()
	 * @generated
	 * @ordered
	 */
	protected String hy = HY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainRequirementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DOMAIN_REQUIREMENT_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanation(String newExplanation) {
		String oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION, oldExplanation, explanation));
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
							ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE, oldRequirementtype,
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
	public NotificationChain basicSetRequirementtype(RequirementType newRequirementtype, NotificationChain msgs) {
		RequirementType oldRequirementtype = requirementtype;
		requirementtype = newRequirementtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE, oldRequirementtype,
					newRequirementtype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementtype(RequirementType newRequirementtype) {
		if (newRequirementtype != requirementtype) {
			NotificationChain msgs = null;
			if (requirementtype != null)
				msgs = ((InternalEObject) requirementtype).eInverseRemove(this,
						ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE, RequirementType.class, msgs);
			if (newRequirementtype != null)
				msgs = ((InternalEObject) newRequirementtype).eInverseAdd(this,
						ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE, RequirementType.class, msgs);
			msgs = basicSetRequirementtype(newRequirementtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE, newRequirementtype,
					newRequirementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHy() {
		return hy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHy(String newHy) {
		String oldHy = hy;
		hy = newHy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__HY,
					oldHy, hy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			if (requirementtype != null)
				msgs = ((InternalEObject) requirementtype).eInverseRemove(this,
						ProjetTemplatePackage.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE, RequirementType.class, msgs);
			return basicSetRequirementtype((RequirementType) otherEnd, msgs);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			return basicSetRequirementtype(null, msgs);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__VALUE:
			return getValue();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			return getExplanation();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			if (resolve)
				return getRequirementtype();
			return basicGetRequirementtype();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__HY:
			return getHy();
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__VALUE:
			setValue((String) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			setExplanation((String) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__HY:
			setHy((String) newValue);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			setExplanation(EXPLANATION_EDEFAULT);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) null);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__HY:
			setHy(HY_EDEFAULT);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			return requirementtype != null;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__HY:
			return HY_EDEFAULT == null ? hy != null : !HY_EDEFAULT.equals(hy);
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
		result.append(", explanation: ");
		result.append(explanation);
		result.append(", hy: ");
		result.append(hy);
		result.append(')');
		return result.toString();
	}

} //DomainRequirementValueImpl
