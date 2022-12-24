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
 * An implementation of the model object '<em><b>Selection Criterion Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.SelectionCriterionValueImpl#getValues <em>Values</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionValueImpl#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.SelectionCriterionValueImpl#getSelectioncriterion <em>Selectioncriterion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectionCriterionValueImpl extends MinimalEObjectImpl.Container implements SelectionCriterionValue {
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
	 * The cached value of the '{@link #getSelectioncriterionvalueset() <em>Selectioncriterionvalueset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectioncriterionvalueset()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionCriterionValueSet> selectioncriterionvalueset;

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
	protected SelectionCriterionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.SELECTION_CRITERION_VALUE;
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
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE__VALUES, oldValues, values));
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
							ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION, oldSelectioncriterion,
							selectioncriterion));
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
	public NotificationChain basicSetSelectioncriterion(SelectionCriterion newSelectioncriterion,
			NotificationChain msgs) {
		SelectionCriterion oldSelectioncriterion = selectioncriterion;
		selectioncriterion = newSelectioncriterion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION, oldSelectioncriterion,
					newSelectioncriterion);
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
	public void setSelectioncriterion(SelectionCriterion newSelectioncriterion) {
		if (newSelectioncriterion != selectioncriterion) {
			NotificationChain msgs = null;
			if (selectioncriterion != null)
				msgs = ((InternalEObject) selectioncriterion).eInverseRemove(this,
						ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE, SelectionCriterion.class,
						msgs);
			if (newSelectioncriterion != null)
				msgs = ((InternalEObject) newSelectioncriterion).eInverseAdd(this,
						ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE, SelectionCriterion.class,
						msgs);
			msgs = basicSetSelectioncriterion(newSelectioncriterion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION, newSelectioncriterion,
					newSelectioncriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionCriterionValueSet> getSelectioncriterionvalueset() {
		if (selectioncriterionvalueset == null) {
			selectioncriterionvalueset = new EObjectWithInverseResolvingEList.ManyInverse<SelectionCriterionValueSet>(
					SelectionCriterionValueSet.class, this,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET,
					ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE);
		}
		return selectioncriterionvalueset;
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSelectioncriterionvalueset())
					.basicAdd(otherEnd, msgs);
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION:
			if (selectioncriterion != null)
				msgs = ((InternalEObject) selectioncriterion).eInverseRemove(this,
						ProjetTemplatePackage.SELECTION_CRITERION__SELECTIONCRITERIONVALUE, SelectionCriterion.class,
						msgs);
			return basicSetSelectioncriterion((SelectionCriterion) otherEnd, msgs);
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET:
			return ((InternalEList<?>) getSelectioncriterionvalueset()).basicRemove(otherEnd, msgs);
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION:
			return basicSetSelectioncriterion(null, msgs);
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__VALUES:
			return getValues();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET:
			return getSelectioncriterionvalueset();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION:
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__VALUES:
			setValues((String) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET:
			getSelectioncriterionvalueset().clear();
			getSelectioncriterionvalueset().addAll((Collection<? extends SelectionCriterionValueSet>) newValue);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION:
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__VALUES:
			setValues(VALUES_EDEFAULT);
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET:
			getSelectioncriterionvalueset().clear();
			return;
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION:
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
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__VALUES:
			return VALUES_EDEFAULT == null ? values != null : !VALUES_EDEFAULT.equals(values);
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET:
			return selectioncriterionvalueset != null && !selectioncriterionvalueset.isEmpty();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE__SELECTIONCRITERION:
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
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //SelectionCriterionValueImpl
