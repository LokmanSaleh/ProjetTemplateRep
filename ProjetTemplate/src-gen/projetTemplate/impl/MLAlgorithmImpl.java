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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.ProcessingChain;
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
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getProcessingchain <em>Processingchain</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmImpl#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLAlgorithmImpl extends MinimalEObjectImpl.Container implements MLAlgorithm {
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
	 * The cached value of the '{@link #getProcessingchain() <em>Processingchain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingchain()
	 * @generated
	 * @ordered
	 */
	protected ProcessingChain processingchain;

	/**
	 * The cached value of the '{@link #getMlalgorithmsolutionpattern() <em>Mlalgorithmsolutionpattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlalgorithmsolutionpattern()
	 * @generated
	 * @ordered
	 */
	protected EList<MLAlgorithmSolutionPattern> mlalgorithmsolutionpattern;

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
	public ProcessingChain getProcessingchain() {
		if (processingchain != null && processingchain.eIsProxy()) {
			InternalEObject oldProcessingchain = (InternalEObject) processingchain;
			processingchain = (ProcessingChain) eResolveProxy(oldProcessingchain);
			if (processingchain != oldProcessingchain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN, oldProcessingchain, processingchain));
			}
		}
		return processingchain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChain basicGetProcessingchain() {
		return processingchain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingchain(ProcessingChain newProcessingchain, NotificationChain msgs) {
		ProcessingChain oldProcessingchain = processingchain;
		processingchain = newProcessingchain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN, oldProcessingchain, newProcessingchain);
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
	public void setProcessingchain(ProcessingChain newProcessingchain) {
		if (newProcessingchain != processingchain) {
			NotificationChain msgs = null;
			if (processingchain != null)
				msgs = ((InternalEObject) processingchain).eInverseRemove(this,
						ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM, ProcessingChain.class, msgs);
			if (newProcessingchain != null)
				msgs = ((InternalEObject) newProcessingchain).eInverseAdd(this,
						ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM, ProcessingChain.class, msgs);
			msgs = basicSetProcessingchain(newProcessingchain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN,
					newProcessingchain, newProcessingchain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLAlgorithmSolutionPattern> getMlalgorithmsolutionpattern() {
		if (mlalgorithmsolutionpattern == null) {
			mlalgorithmsolutionpattern = new EObjectWithInverseResolvingEList<MLAlgorithmSolutionPattern>(
					MLAlgorithmSolutionPattern.class, this,
					ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM);
		}
		return mlalgorithmsolutionpattern;
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
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN:
			if (processingchain != null)
				msgs = ((InternalEObject) processingchain).eInverseRemove(this,
						ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM, ProcessingChain.class, msgs);
			return basicSetProcessingchain((ProcessingChain) otherEnd, msgs);
		case ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMlalgorithmsolutionpattern())
					.basicAdd(otherEnd, msgs);
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
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN:
			return basicSetProcessingchain(null, msgs);
		case ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN:
			return ((InternalEList<?>) getMlalgorithmsolutionpattern()).basicRemove(otherEnd, msgs);
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
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			return getName();
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			if (resolve)
				return getSelectioncriterionvalueset();
			return basicGetSelectioncriterionvalueset();
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			return getSelectioncriterionvalue();
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN:
			if (resolve)
				return getProcessingchain();
			return basicGetProcessingchain();
		case ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN:
			return getMlalgorithmsolutionpattern();
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
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			setSelectioncriterionvalueset((SelectionCriterionValueSet) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
			getSelectioncriterionvalue().addAll((Collection<? extends SelectionCriterionValue>) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN:
			setProcessingchain((ProcessingChain) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN:
			getMlalgorithmsolutionpattern().clear();
			getMlalgorithmsolutionpattern().addAll((Collection<? extends MLAlgorithmSolutionPattern>) newValue);
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
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			setSelectioncriterionvalueset((SelectionCriterionValueSet) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			getSelectioncriterionvalue().clear();
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN:
			setProcessingchain((ProcessingChain) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN:
			getMlalgorithmsolutionpattern().clear();
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
		case ProjetTemplatePackage.ML_ALGORITHM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUESET:
			return selectioncriterionvalueset != null;
		case ProjetTemplatePackage.ML_ALGORITHM__SELECTIONCRITERIONVALUE:
			return selectioncriterionvalue != null && !selectioncriterionvalue.isEmpty();
		case ProjetTemplatePackage.ML_ALGORITHM__PROCESSINGCHAIN:
			return processingchain != null;
		case ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN:
			return mlalgorithmsolutionpattern != null && !mlalgorithmsolutionpattern.isEmpty();
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
