/**
 */
package projetTemplate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetTemplate.CriteriaValues;
import projetTemplate.GroupeCriteria;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Groupe Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.GroupeCriteriaImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.GroupeCriteriaImpl#getCriteriavalues <em>Criteriavalues</em>}</li>
 *   <li>{@link projetTemplate.impl.GroupeCriteriaImpl#getSelectedcriteriavalues <em>Selectedcriteriavalues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupeCriteriaImpl extends MinimalEObjectImpl.Container implements GroupeCriteria {
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
	 * The cached value of the '{@link #getCriteriavalues() <em>Criteriavalues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriavalues()
	 * @generated
	 * @ordered
	 */
	protected EList<CriteriaValues> criteriavalues;

	/**
	 * The cached value of the '{@link #getSelectedcriteriavalues() <em>Selectedcriteriavalues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedcriteriavalues()
	 * @generated
	 * @ordered
	 */
	protected CriteriaValues selectedcriteriavalues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupeCriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.GROUPE_CRITERIA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.GROUPE_CRITERIA__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CriteriaValues> getCriteriavalues() {
		if (criteriavalues == null) {
			criteriavalues = new EObjectResolvingEList<CriteriaValues>(CriteriaValues.class, this,
					ProjetTemplatePackage.GROUPE_CRITERIA__CRITERIAVALUES);
		}
		return criteriavalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaValues getSelectedcriteriavalues() {
		if (selectedcriteriavalues != null && selectedcriteriavalues.eIsProxy()) {
			InternalEObject oldSelectedcriteriavalues = (InternalEObject) selectedcriteriavalues;
			selectedcriteriavalues = (CriteriaValues) eResolveProxy(oldSelectedcriteriavalues);
			if (selectedcriteriavalues != oldSelectedcriteriavalues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.GROUPE_CRITERIA__SELECTEDCRITERIAVALUES, oldSelectedcriteriavalues,
							selectedcriteriavalues));
			}
		}
		return selectedcriteriavalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriteriaValues basicGetSelectedcriteriavalues() {
		return selectedcriteriavalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedcriteriavalues(CriteriaValues newSelectedcriteriavalues) {
		CriteriaValues oldSelectedcriteriavalues = selectedcriteriavalues;
		selectedcriteriavalues = newSelectedcriteriavalues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.GROUPE_CRITERIA__SELECTEDCRITERIAVALUES, oldSelectedcriteriavalues,
					selectedcriteriavalues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.GROUPE_CRITERIA__NAME:
			return getName();
		case ProjetTemplatePackage.GROUPE_CRITERIA__CRITERIAVALUES:
			return getCriteriavalues();
		case ProjetTemplatePackage.GROUPE_CRITERIA__SELECTEDCRITERIAVALUES:
			if (resolve)
				return getSelectedcriteriavalues();
			return basicGetSelectedcriteriavalues();
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
		case ProjetTemplatePackage.GROUPE_CRITERIA__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.GROUPE_CRITERIA__CRITERIAVALUES:
			getCriteriavalues().clear();
			getCriteriavalues().addAll((Collection<? extends CriteriaValues>) newValue);
			return;
		case ProjetTemplatePackage.GROUPE_CRITERIA__SELECTEDCRITERIAVALUES:
			setSelectedcriteriavalues((CriteriaValues) newValue);
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
		case ProjetTemplatePackage.GROUPE_CRITERIA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.GROUPE_CRITERIA__CRITERIAVALUES:
			getCriteriavalues().clear();
			return;
		case ProjetTemplatePackage.GROUPE_CRITERIA__SELECTEDCRITERIAVALUES:
			setSelectedcriteriavalues((CriteriaValues) null);
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
		case ProjetTemplatePackage.GROUPE_CRITERIA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.GROUPE_CRITERIA__CRITERIAVALUES:
			return criteriavalues != null && !criteriavalues.isEmpty();
		case ProjetTemplatePackage.GROUPE_CRITERIA__SELECTEDCRITERIAVALUES:
			return selectedcriteriavalues != null;
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

} //GroupeCriteriaImpl
