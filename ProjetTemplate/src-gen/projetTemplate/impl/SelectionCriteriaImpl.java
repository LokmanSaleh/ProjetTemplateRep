/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.SelectionCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.SelectionCriteriaImpl#getCriteriaName <em>Criteria Name</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriteriaImpl#getCriteriaValue <em>Criteria Value</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriteriaImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionCriteriaImpl extends MinimalEObjectImpl.Container implements SelectionCriteria {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.SELECTION_CRITERIA;
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
					ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_NAME, oldCriteriaName, criteriaName));
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
					ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_VALUE, oldCriteriaValue, criteriaValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.SELECTION_CRITERIA__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_NAME:
			return getCriteriaName();
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_VALUE:
			return getCriteriaValue();
		case ProjetTemplatePackage.SELECTION_CRITERIA__ID:
			return getId();
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
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_NAME:
			setCriteriaName((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_VALUE:
			setCriteriaValue((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERIA__ID:
			setId((String) newValue);
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
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_NAME:
			setCriteriaName(CRITERIA_NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_VALUE:
			setCriteriaValue(CRITERIA_VALUE_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERIA__ID:
			setId(ID_EDEFAULT);
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
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_NAME:
			return CRITERIA_NAME_EDEFAULT == null ? criteriaName != null : !CRITERIA_NAME_EDEFAULT.equals(criteriaName);
		case ProjetTemplatePackage.SELECTION_CRITERIA__CRITERIA_VALUE:
			return CRITERIA_VALUE_EDEFAULT == null ? criteriaValue != null
					: !CRITERIA_VALUE_EDEFAULT.equals(criteriaValue);
		case ProjetTemplatePackage.SELECTION_CRITERIA__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", Id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SelectionCriteriaImpl
