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
import projetTemplate.ExtendedBPMNModel;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSelectionCriteriaContainer;
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
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getX_selectioncriterionvalueset <em>Xselectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getX_selectioncriterionvalue <em>Xselectioncriterionvalue</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getCriteriatochoosemlalgorithm <em>Criteriatochoosemlalgorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLAlgorithmImpl extends MinimalEObjectImpl.Container implements MLAlgorithm {
	/**
	 * The cached value of the '{@link #getX_selectioncriterionvalueset() <em>Xselectioncriterionvalueset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_selectioncriterionvalueset()
	 * @generated
	 * @ordered
	 */
	protected SelectionCriterionValueSet x_selectioncriterionvalueset;

	/**
	 * The cached value of the '{@link #getX_selectioncriterionvalue() <em>Xselectioncriterionvalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_selectioncriterionvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionCriterionValue> x_selectioncriterionvalue;

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
	 * The cached value of the '{@link #getExtendedbpmnmodel() <em>Extendedbpmnmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedbpmnmodel()
	 * @generated
	 * @ordered
	 */
	protected ExtendedBPMNModel extendedbpmnmodel;

	/**
	 * The cached value of the '{@link #getCriteriatochoosemlalgorithm() <em>Criteriatochoosemlalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteriatochoosemlalgorithm()
	 * @generated
	 * @ordered
	 */
	protected MLAlgorithmSelectionCriteriaContainer criteriatochoosemlalgorithm;

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
	public SelectionCriterionValueSet getX_selectioncriterionvalueset() {
		if (x_selectioncriterionvalueset != null && x_selectioncriterionvalueset.eIsProxy()) {
			InternalEObject oldX_selectioncriterionvalueset = (InternalEObject) x_selectioncriterionvalueset;
			x_selectioncriterionvalueset = (SelectionCriterionValueSet) eResolveProxy(oldX_selectioncriterionvalueset);
			if (x_selectioncriterionvalueset != oldX_selectioncriterionvalueset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUESET,
							oldX_selectioncriterionvalueset, x_selectioncriterionvalueset));
			}
		}
		return x_selectioncriterionvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterionValueSet basicGetX_selectioncriterionvalueset() {
		return x_selectioncriterionvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_selectioncriterionvalueset(SelectionCriterionValueSet newX_selectioncriterionvalueset) {
		SelectionCriterionValueSet oldX_selectioncriterionvalueset = x_selectioncriterionvalueset;
		x_selectioncriterionvalueset = newX_selectioncriterionvalueset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUESET, oldX_selectioncriterionvalueset,
					x_selectioncriterionvalueset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionCriterionValue> getX_selectioncriterionvalue() {
		if (x_selectioncriterionvalue == null) {
			x_selectioncriterionvalue = new EObjectResolvingEList<SelectionCriterionValue>(
					SelectionCriterionValue.class, this, ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUE);
		}
		return x_selectioncriterionvalue;
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
	public MLAlgorithmSelectionCriteriaContainer getCriteriatochoosemlalgorithm() {
		if (criteriatochoosemlalgorithm != null && criteriatochoosemlalgorithm.eIsProxy()) {
			InternalEObject oldCriteriatochoosemlalgorithm = (InternalEObject) criteriatochoosemlalgorithm;
			criteriatochoosemlalgorithm = (MLAlgorithmSelectionCriteriaContainer) eResolveProxy(
					oldCriteriatochoosemlalgorithm);
			if (criteriatochoosemlalgorithm != oldCriteriatochoosemlalgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM,
							oldCriteriatochoosemlalgorithm, criteriatochoosemlalgorithm));
			}
		}
		return criteriatochoosemlalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLAlgorithmSelectionCriteriaContainer basicGetCriteriatochoosemlalgorithm() {
		return criteriatochoosemlalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteriatochoosemlalgorithm(MLAlgorithmSelectionCriteriaContainer newCriteriatochoosemlalgorithm) {
		MLAlgorithmSelectionCriteriaContainer oldCriteriatochoosemlalgorithm = criteriatochoosemlalgorithm;
		criteriatochoosemlalgorithm = newCriteriatochoosemlalgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM, oldCriteriatochoosemlalgorithm,
					criteriatochoosemlalgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUESET:
			if (resolve)
				return getX_selectioncriterionvalueset();
			return basicGetX_selectioncriterionvalueset();
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUE:
			return getX_selectioncriterionvalue();
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			return getName();
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			if (resolve)
				return getExtendedbpmnmodel();
			return basicGetExtendedbpmnmodel();
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			if (resolve)
				return getCriteriatochoosemlalgorithm();
			return basicGetCriteriatochoosemlalgorithm();
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
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUESET:
			setX_selectioncriterionvalueset((SelectionCriterionValueSet) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUE:
			getX_selectioncriterionvalue().clear();
			getX_selectioncriterionvalue().addAll((Collection<? extends SelectionCriterionValue>) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			setCriteriatochoosemlalgorithm((MLAlgorithmSelectionCriteriaContainer) newValue);
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
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUESET:
			setX_selectioncriterionvalueset((SelectionCriterionValueSet) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUE:
			getX_selectioncriterionvalue().clear();
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			setCriteriatochoosemlalgorithm((MLAlgorithmSelectionCriteriaContainer) null);
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
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUESET:
			return x_selectioncriterionvalueset != null;
		case ProjetTemplatePackage.ML_ALGORITHM__XSELECTIONCRITERIONVALUE:
			return x_selectioncriterionvalue != null && !x_selectioncriterionvalue.isEmpty();
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.ML_ALGORITHM__EXTENDEDBPMNMODEL:
			return extendedbpmnmodel != null;
		case ProjetTemplatePackage.ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM:
			return criteriatochoosemlalgorithm != null;
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
