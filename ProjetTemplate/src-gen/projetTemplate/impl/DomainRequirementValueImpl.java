/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getX_requirementtype <em>Xrequirementtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainRequirementValueImpl extends SelectionCriteriaImpl implements DomainRequirementValue {
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
	 * The cached value of the '{@link #getX_requirementtype() <em>Xrequirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_requirementtype()
	 * @generated
	 * @ordered
	 */
	protected RequirementType x_requirementtype;

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
	public RequirementType getX_requirementtype() {
		if (x_requirementtype != null && x_requirementtype.eIsProxy()) {
			InternalEObject oldX_requirementtype = (InternalEObject) x_requirementtype;
			x_requirementtype = (RequirementType) eResolveProxy(oldX_requirementtype);
			if (x_requirementtype != oldX_requirementtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE, oldX_requirementtype,
							x_requirementtype));
			}
		}
		return x_requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetX_requirementtype() {
		return x_requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_requirementtype(RequirementType newX_requirementtype) {
		RequirementType oldX_requirementtype = x_requirementtype;
		x_requirementtype = newX_requirementtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE, oldX_requirementtype,
					x_requirementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			return getExplanation();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			if (resolve)
				return getX_requirementtype();
			return basicGetX_requirementtype();
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			setExplanation((String) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			setX_requirementtype((RequirementType) newValue);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			setExplanation(EXPLANATION_EDEFAULT);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			setX_requirementtype((RequirementType) null);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			return x_requirementtype != null;
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
		result.append(" (explanation: ");
		result.append(explanation);
		result.append(')');
		return result.toString();
	}

} //DomainRequirementValueImpl
