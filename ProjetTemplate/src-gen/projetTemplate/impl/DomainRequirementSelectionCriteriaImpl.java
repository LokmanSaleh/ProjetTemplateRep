/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import projetTemplate.DomainRequirementSelectionCriteria;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Requirement Selection Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DomainRequirementSelectionCriteriaImpl#getCriteriaName <em>Criteria Name</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementSelectionCriteriaImpl#getCriteriaValue <em>Criteria Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainRequirementSelectionCriteriaImpl extends MinimalEObjectImpl.Container
		implements DomainRequirementSelectionCriteria {
	/**
	 * The default value of the '{@link #getCriteriaName() <em>Criteria Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaName()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriteriaName() <em>Criteria Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaName()
	 * @generated
	 * @ordered
	 */
	protected String criteriaName = CRITERIA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriteriaValue() <em>Criteria Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CRITERIA_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriteriaValue() <em>Criteria Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriaValue()
	 * @generated
	 * @ordered
	 */
	protected String criteriaValue = CRITERIA_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainRequirementSelectionCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DOMAIN_REQUIREMENT_SELECTION_CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriteriaName() {
		return criteriaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaName(String newCriteriaName) {
		String oldCriteriaName = criteriaName;
		criteriaName = newCriteriaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_NAME, oldCriteriaName,
					criteriaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCriteriaValue() {
		return criteriaValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriaValue(String newCriteriaValue) {
		String oldCriteriaValue = criteriaValue;
		criteriaValue = newCriteriaValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_VALUE, oldCriteriaValue,
					criteriaValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_NAME:
			return getCriteriaName();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_VALUE:
			return getCriteriaValue();
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_NAME:
			setCriteriaName((String) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_VALUE:
			setCriteriaValue((String) newValue);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_NAME:
			setCriteriaName(CRITERIA_NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_VALUE:
			setCriteriaValue(CRITERIA_VALUE_EDEFAULT);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_NAME:
			return CRITERIA_NAME_EDEFAULT == null ? criteriaName != null : !CRITERIA_NAME_EDEFAULT.equals(criteriaName);
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA__CRITERIA_VALUE:
			return CRITERIA_VALUE_EDEFAULT == null ? criteriaValue != null
					: !CRITERIA_VALUE_EDEFAULT.equals(criteriaValue);
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
		result.append(" (criteriaName: ");
		result.append(criteriaName);
		result.append(", criteriaValue: ");
		result.append(criteriaValue);
		result.append(')');
		return result.toString();
	}

} //DomainRequirementSelectionCriteriaImpl
