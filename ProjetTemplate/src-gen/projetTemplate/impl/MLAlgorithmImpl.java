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

import projetTemplate.CriteriaToChooseMLAlgorithm;
import projetTemplate.ExtendedBPMNModel;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithms;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.SelectionCriterionValue;
import projetTemplate.SelectionCriterionValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getCriteriatochoosemlalgorithm <em>Criteriatochoosemlalgorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLAlgorithmImpl extends MinimalEObjectImpl.Container implements MLAlgorithm {
	/**
	 * The cached value of the '{@link #getSelectioncriterionvalueset() <em>Selectioncriterionvalueset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectioncriterionvalueset()
	 * @generated
	 * @ordered
	 */
	protected SelectionCriterionValueSet selectioncriterionvalueset;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final MLAlgorithms NAME_EDEFAULT = MLAlgorithms.NAIVE_BAYES;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected MLAlgorithms name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedbpmnmodel() <em>Extendedbpmnmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedbpmnmodel()
	 * @generated
	 * @ordered
	 */
	protected ExtendedBPMNModel extendedbpmnmodel;

	/**
	 * The cached value of the '{@link #getCriteriatochoosemlalgorithm() <em>Criteriatochoosemlalgorithm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriatochoosemlalgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<CriteriaToChooseMLAlgorithm> criteriatochoosemlalgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.ML_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterionValueSet getSelectioncriterionvalueset() {
		if (selectioncriterionvalueset != null && selectioncriterionvalueset.eIsProxy()) {
			InternalEObject oldSelectioncriterionvalueset = (InternalEObject) selectioncriterionvalueset;
			selectioncriterionvalueset = (SelectionCriterionValueSet) eResolveProxy(oldSelectioncriterionvalueset);
			if (selectioncriterionvalueset != oldSelectioncriterionvalueset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET,
							oldSelectioncriterionvalueset, selectioncriterionvalueset));
			}
		}
		return selectioncriterionvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterionValueSet basicGetSelectioncriterionvalueset() {
		return selectioncriterionvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectioncriterionvalueset(SelectionCriterionValueSet newSelectioncriterionvalueset) {
		SelectionCriterionValueSet oldSelectioncriterionvalueset = selectioncriterionvalueset;
		selectioncriterionvalueset = newSelectioncriterionvalueset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET, oldSelectioncriterionvalueset,
					selectioncriterionvalueset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionCriterionValue> getSelectioncriterionvalue() {
		if (selectioncriterionvalue == null) {
			selectioncriterionvalue = new EObjectResolvingEList<SelectionCriterionValue>(SelectionCriterionValue.class,
					this, ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE);
		}
		return selectioncriterionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLAlgorithms getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(MLAlgorithms newName) {
		MLAlgorithms oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_ALGORITHM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedBPMNModel getExtendedbpmnmodel() {
		if (extendedbpmnmodel != null && extendedbpmnmodel.eIsProxy()) {
			InternalEObject oldExtendedbpmnmodel = (InternalEObject) extendedbpmnmodel;
			extendedbpmnmodel = (ExtendedBPMNModel) eResolveProxy(oldExtendedbpmnmodel);
			if (extendedbpmnmodel != oldExtendedbpmnmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL, oldExtendedbpmnmodel,
							extendedbpmnmodel));
			}
		}
		return extendedbpmnmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedBPMNModel basicGetExtendedbpmnmodel() {
		return extendedbpmnmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedbpmnmodel(ExtendedBPMNModel newExtendedbpmnmodel) {
		ExtendedBPMNModel oldExtendedbpmnmodel = extendedbpmnmodel;
		extendedbpmnmodel = newExtendedbpmnmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL,
					oldExtendedbpmnmodel, extendedbpmnmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CriteriaToChooseMLAlgorithm> getCriteriatochoosemlalgorithm() {
		if (criteriatochoosemlalgorithm == null) {
			criteriatochoosemlalgorithm = new EObjectResolvingEList<CriteriaToChooseMLAlgorithm>(
					CriteriaToChooseMLAlgorithm.class, this,
					ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM);
		}
		return criteriatochoosemlalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			if (resolve)
				return getSelectioncriterionvalueset();
			return basicGetSelectioncriterionvalueset();
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			return getSelectioncriterionvalue();
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			return getName();
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			if (resolve)
				return getExtendedbpmnmodel();
			return basicGetExtendedbpmnmodel();
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			return getCriteriatochoosemlalgorithm();
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
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			setSelectioncriterionvalueset((SelectionCriterionValueSet) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
			getSelectioncriterionvalue().addAll((Collection<? extends SelectionCriterionValue>) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			setName((MLAlgorithms) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			getCriteriatochoosemlalgorithm().clear();
			getCriteriatochoosemlalgorithm().addAll((Collection<? extends CriteriaToChooseMLAlgorithm>) newValue);
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
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			setSelectioncriterionvalueset((SelectionCriterionValueSet) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			getCriteriatochoosemlalgorithm().clear();
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
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			return selectioncriterionvalueset != null;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			return selectioncriterionvalue != null && !selectioncriterionvalue.isEmpty();
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			return name != NAME_EDEFAULT;
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			return extendedbpmnmodel != null;
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			return criteriatochoosemlalgorithm != null && !criteriatochoosemlalgorithm.isEmpty();
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

} //MLAlgorithmImpl
