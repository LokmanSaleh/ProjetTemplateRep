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

import projetTemplate.ProjetTemplatePackage;
import projetTemplate.SelectionCriterion;
import projetTemplate.SelectionCriterionValue;
import projetTemplate.SelectionCriterionValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Criterion Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.SelectionCriterionValueSetImpl#getSetType <em>Set Type</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionValueSetImpl#getValues <em>Values</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionValueSetImpl#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionValueSetImpl#getSelectioncriterion <em>Selectioncriterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionCriterionValueSetImpl extends MinimalEObjectImpl.Container implements SelectionCriterionValueSet {
	/**
	 * The default value of the '{@link #getSetType() <em>Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetType()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetType() <em>Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetType()
	 * @generated
	 * @ordered
	 */
	protected String setType = SET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected String values = VALUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectioncriterionvalue() <em>Selectioncriterionvalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectioncriterionvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionCriterionValue> selectioncriterionvalue;

	/**
	 * The cached value of the '{@link #getSelectioncriterion() <em>Selectioncriterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectioncriterion()
	 * @generated
	 * @ordered
	 */
	protected SelectionCriterion selectioncriterion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionCriterionValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.SELECTION_CRITERION_VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetType() {
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetType(String newSetType) {
		String oldSetType = setType;
		setType = newSetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SET_TYPE, oldSetType, setType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(String newValues) {
		String oldValues = values;
		values = newValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__VALUES, oldValues, values));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionCriterionValue> getSelectioncriterionvalue() {
		if (selectioncriterionvalue == null) {
			selectioncriterionvalue = new EObjectResolvingEList<SelectionCriterionValue>(SelectionCriterionValue.class,
					this, ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE);
		}
		return selectioncriterionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterion getSelectioncriterion() {
		if (selectioncriterion != null && selectioncriterion.eIsProxy()) {
			InternalEObject oldSelectioncriterion = (InternalEObject) selectioncriterion;
			selectioncriterion = (SelectionCriterion) eResolveProxy(oldSelectioncriterion);
			if (selectioncriterion != oldSelectioncriterion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION,
							oldSelectioncriterion, selectioncriterion));
			}
		}
		return selectioncriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterion basicGetSelectioncriterion() {
		return selectioncriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectioncriterion(SelectionCriterion newSelectioncriterion) {
		SelectionCriterion oldSelectioncriterion = selectioncriterion;
		selectioncriterion = newSelectioncriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION, oldSelectioncriterion,
					selectioncriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SET_TYPE:
			return getSetType();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__VALUES:
			return getValues();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE:
			return getSelectioncriterionvalue();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION:
			if (resolve)
				return getSelectioncriterion();
			return basicGetSelectioncriterion();
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SET_TYPE:
			setSetType((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__VALUES:
			setValues((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
			getSelectioncriterionvalue().addAll((Collection<? extends SelectionCriterionValue>) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION:
			setSelectioncriterion((SelectionCriterion) newValue);
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SET_TYPE:
			setSetType(SET_TYPE_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__VALUES:
			setValues(VALUES_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION:
			setSelectioncriterion((SelectionCriterion) null);
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SET_TYPE:
			return SET_TYPE_EDEFAULT == null ? setType != null : !SET_TYPE_EDEFAULT.equals(setType);
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__VALUES:
			return VALUES_EDEFAULT == null ? values != null : !VALUES_EDEFAULT.equals(values);
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE:
			return selectioncriterionvalue != null && !selectioncriterionvalue.isEmpty();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION:
			return selectioncriterion != null;
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
		result.append(" (setType: ");
		result.append(setType);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //SelectionCriterionValueSetImpl
