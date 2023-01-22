/**
 */
package projetTemplate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetTemplate.MLAlgorithm;
import projetTemplate.ProcessingChainTemplate;
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
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLAlgorithmImpl extends ComponentImpl implements MLAlgorithm {
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
	 * The cached value of the '{@link #getProcessingchaintemplate() <em>Processingchaintemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingchaintemplate()
	 * @generated
	 * @ordered
	 */
	protected ProcessingChainTemplate processingchaintemplate;

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
	public ProcessingChainTemplate getProcessingchaintemplate() {
		if (processingchaintemplate != null && processingchaintemplate.eIsProxy()) {
			InternalEObject oldProcessingchaintemplate = (InternalEObject) processingchaintemplate;
			processingchaintemplate = (ProcessingChainTemplate) eResolveProxy(oldProcessingchaintemplate);
			if (processingchaintemplate != oldProcessingchaintemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAINTEMPLATE, oldProcessingchaintemplate,
							processingchaintemplate));
			}
		}
		return processingchaintemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplate basicGetProcessingchaintemplate() {
		return processingchaintemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingchaintemplate(ProcessingChainTemplate newProcessingchaintemplate) {
		ProcessingChainTemplate oldProcessingchaintemplate = processingchaintemplate;
		processingchaintemplate = newProcessingchaintemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAINTEMPLATE, oldProcessingchaintemplate,
					processingchaintemplate));
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
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAINTEMPLATE:
			if (resolve)
				return getProcessingchaintemplate();
			return basicGetProcessingchaintemplate();
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
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAINTEMPLATE:
			setProcessingchaintemplate((ProcessingChainTemplate) newValue);
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
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAINTEMPLATE:
			setProcessingchaintemplate((ProcessingChainTemplate) null);
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
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAINTEMPLATE:
			return processingchaintemplate != null;
		}
		return super.eIsSet(featureID);
	}

} //MLAlgorithmImpl
