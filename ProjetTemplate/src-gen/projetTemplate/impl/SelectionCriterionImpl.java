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
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.SelectionCriterion;
import projetTemplate.SelectionCriterionValue;
import projetTemplate.SelectionCriterionValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.SelectionCriterionImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionImpl#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionImpl#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionCriterionImpl extends MinimalEObjectImpl.Container implements SelectionCriterion {
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
	 * The cached value of the '{@link #getSelectioncriterionvalueset() <em>Selectioncriterionvalueset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectioncriterionvalueset()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionCriterionValueSet> selectioncriterionvalueset;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.SELECTION_CRITERION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.SELECTION_CRITERION__NAME,
					oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.SELECTION_CRITERION__VALUE_TYPE,
					oldValueType, valueType));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.SELECTION_CRITERION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionCriterionValueSet> getSelectioncriterionvalueset() {
		if (selectioncriterionvalueset == null) {
			selectioncriterionvalueset = new EObjectWithInverseResolvingEList<SelectionCriterionValueSet>(
					SelectionCriterionValueSet.class, this,
					ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUESET,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION);
		}
		return selectioncriterionvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionCriterionValue> getSelectioncriterionvalue() {
		if (selectioncriterionvalue == null) {
			selectioncriterionvalue = new EObjectWithInverseResolvingEList<SelectionCriterionValue>(
					SelectionCriterionValue.class, this,
					ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION);
		}
		return selectioncriterionvalue;
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
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUESET:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSelectioncriterionvalueset())
					.basicAdd(otherEnd, msgs);
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSelectioncriterionvalue()).basicAdd(otherEnd,
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
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUESET:
			return ((InternalEList<?>) getSelectioncriterionvalueset()).basicRemove(otherEnd, msgs);
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE:
			return ((InternalEList<?>) getSelectioncriterionvalue()).basicRemove(otherEnd, msgs);
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
		case ProjetTemplatePackage.SELECTION_CRITERION__NAME:
			return getName();
		case ProjetTemplatePackage.SELECTION_CRITERION__VALUE_TYPE:
			return getValueType();
		case ProjetTemplatePackage.SELECTION_CRITERION__DESCRIPTION:
			return getDescription();
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUESET:
			return getSelectioncriterionvalueset();
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE:
			return getSelectioncriterionvalue();
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
		case ProjetTemplatePackage.SELECTION_CRITERION__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__VALUE_TYPE:
			setValueType((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUESET:
			getSelectioncriterionvalueset().clear();
			getSelectioncriterionvalueset().addAll((Collection<? extends SelectionCriterionValueSet>) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
			getSelectioncriterionvalue().addAll((Collection<? extends SelectionCriterionValue>) newValue);
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
		case ProjetTemplatePackage.SELECTION_CRITERION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__VALUE_TYPE:
			setValueType(VALUE_TYPE_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUESET:
			getSelectioncriterionvalueset().clear();
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
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
		case ProjetTemplatePackage.SELECTION_CRITERION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.SELECTION_CRITERION__VALUE_TYPE:
			return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
		case ProjetTemplatePackage.SELECTION_CRITERION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUESET:
			return selectioncriterionvalueset != null && !selectioncriterionvalueset.isEmpty();
		case ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE:
			return selectioncriterionvalue != null && !selectioncriterionvalue.isEmpty();
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
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SelectionCriterionImpl
