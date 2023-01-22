/**
 */
package projetTemplate.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction;
import projetTemplate.DataAnalysisProblemType;
import projetTemplate.DataPropertyValueSet;
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.ProcessingChain;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Proc Chain Solution Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getProcessingchain <em>Processingchain</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getSelectedProcessingChainTemplateForTheMLAlgorithm <em>Selected Processing Chain Template For The ML Algorithm</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getCollecteddataknowledgeabouttemplateconstruction <em>Collecteddataknowledgeabouttemplateconstruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLProcChainSolutionPatternImpl extends MinimalEObjectImpl.Container implements MLProcChainSolutionPattern {
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
	 * The default value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPLANATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplanation() <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanation()
	 * @generated
	 * @ordered
	 */
	protected String explanation = EXPLANATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatapropertyvalueset() <em>Datapropertyvalueset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapropertyvalueset()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyValueSet> datapropertyvalueset;

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
	 * The cached value of the '{@link #getDataanalysisproblemtype() <em>Dataanalysisproblemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 * @ordered
	 */
	protected DataAnalysisProblemType dataanalysisproblemtype;

	/**
	 * The cached value of the '{@link #getSelectedProcessingChainTemplateForTheMLAlgorithm() <em>Selected Processing Chain Template For The ML Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedProcessingChainTemplateForTheMLAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected ProcessingChainTemplate selectedProcessingChainTemplateForTheMLAlgorithm;

	/**
	 * The cached value of the '{@link #getCollecteddataknowledgeabouttemplateconstruction() <em>Collecteddataknowledgeabouttemplateconstruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollecteddataknowledgeabouttemplateconstruction()
	 * @generated
	 * @ordered
	 */
	protected CollectedDataKnowledgeAboutTemplateConstruction collecteddataknowledgeabouttemplateconstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLProcChainSolutionPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION_PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExplanation() {
		return explanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanation(String newExplanation) {
		String oldExplanation = explanation;
		explanation = newExplanation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION, oldExplanation, explanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyValueSet> getDatapropertyvalueset() {
		if (datapropertyvalueset == null) {
			datapropertyvalueset = new EObjectResolvingEList<DataPropertyValueSet>(DataPropertyValueSet.class, this,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET);
		}
		return datapropertyvalueset;
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
							ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN, oldProcessingchain,
							processingchain));
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
	public void setProcessingchain(ProcessingChain newProcessingchain) {
		ProcessingChain oldProcessingchain = processingchain;
		processingchain = newProcessingchain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN, oldProcessingchain,
					processingchain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblemType getDataanalysisproblemtype() {
		if (dataanalysisproblemtype != null && dataanalysisproblemtype.eIsProxy()) {
			InternalEObject oldDataanalysisproblemtype = (InternalEObject) dataanalysisproblemtype;
			dataanalysisproblemtype = (DataAnalysisProblemType) eResolveProxy(oldDataanalysisproblemtype);
			if (dataanalysisproblemtype != oldDataanalysisproblemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE,
							oldDataanalysisproblemtype, dataanalysisproblemtype));
			}
		}
		return dataanalysisproblemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblemType basicGetDataanalysisproblemtype() {
		return dataanalysisproblemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataanalysisproblemtype(DataAnalysisProblemType newDataanalysisproblemtype) {
		DataAnalysisProblemType oldDataanalysisproblemtype = dataanalysisproblemtype;
		dataanalysisproblemtype = newDataanalysisproblemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE,
					oldDataanalysisproblemtype, dataanalysisproblemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplate getSelectedProcessingChainTemplateForTheMLAlgorithm() {
		if (selectedProcessingChainTemplateForTheMLAlgorithm != null
				&& selectedProcessingChainTemplateForTheMLAlgorithm.eIsProxy()) {
			InternalEObject oldSelectedProcessingChainTemplateForTheMLAlgorithm = (InternalEObject) selectedProcessingChainTemplateForTheMLAlgorithm;
			selectedProcessingChainTemplateForTheMLAlgorithm = (ProcessingChainTemplate) eResolveProxy(
					oldSelectedProcessingChainTemplateForTheMLAlgorithm);
			if (selectedProcessingChainTemplateForTheMLAlgorithm != oldSelectedProcessingChainTemplateForTheMLAlgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__SELECTED_PROCESSING_CHAIN_TEMPLATE_FOR_THE_ML_ALGORITHM,
							oldSelectedProcessingChainTemplateForTheMLAlgorithm,
							selectedProcessingChainTemplateForTheMLAlgorithm));
			}
		}
		return selectedProcessingChainTemplateForTheMLAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplate basicGetSelectedProcessingChainTemplateForTheMLAlgorithm() {
		return selectedProcessingChainTemplateForTheMLAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedProcessingChainTemplateForTheMLAlgorithm(
			ProcessingChainTemplate newSelectedProcessingChainTemplateForTheMLAlgorithm) {
		ProcessingChainTemplate oldSelectedProcessingChainTemplateForTheMLAlgorithm = selectedProcessingChainTemplateForTheMLAlgorithm;
		selectedProcessingChainTemplateForTheMLAlgorithm = newSelectedProcessingChainTemplateForTheMLAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__SELECTED_PROCESSING_CHAIN_TEMPLATE_FOR_THE_ML_ALGORITHM,
					oldSelectedProcessingChainTemplateForTheMLAlgorithm,
					selectedProcessingChainTemplateForTheMLAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectedDataKnowledgeAboutTemplateConstruction getCollecteddataknowledgeabouttemplateconstruction() {
		if (collecteddataknowledgeabouttemplateconstruction != null
				&& collecteddataknowledgeabouttemplateconstruction.eIsProxy()) {
			InternalEObject oldCollecteddataknowledgeabouttemplateconstruction = (InternalEObject) collecteddataknowledgeabouttemplateconstruction;
			collecteddataknowledgeabouttemplateconstruction = (CollectedDataKnowledgeAboutTemplateConstruction) eResolveProxy(
					oldCollecteddataknowledgeabouttemplateconstruction);
			if (collecteddataknowledgeabouttemplateconstruction != oldCollecteddataknowledgeabouttemplateconstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION,
							oldCollecteddataknowledgeabouttemplateconstruction,
							collecteddataknowledgeabouttemplateconstruction));
			}
		}
		return collecteddataknowledgeabouttemplateconstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectedDataKnowledgeAboutTemplateConstruction basicGetCollecteddataknowledgeabouttemplateconstruction() {
		return collecteddataknowledgeabouttemplateconstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollecteddataknowledgeabouttemplateconstruction(
			CollectedDataKnowledgeAboutTemplateConstruction newCollecteddataknowledgeabouttemplateconstruction) {
		CollectedDataKnowledgeAboutTemplateConstruction oldCollecteddataknowledgeabouttemplateconstruction = collecteddataknowledgeabouttemplateconstruction;
		collecteddataknowledgeabouttemplateconstruction = newCollecteddataknowledgeabouttemplateconstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION,
					oldCollecteddataknowledgeabouttemplateconstruction,
					collecteddataknowledgeabouttemplateconstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SelectMLAlgorithm() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__NAME:
			return getName();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION:
			return getExplanation();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return getDatapropertyvalueset();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN:
			if (resolve)
				return getProcessingchain();
			return basicGetProcessingchain();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			if (resolve)
				return getDataanalysisproblemtype();
			return basicGetDataanalysisproblemtype();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__SELECTED_PROCESSING_CHAIN_TEMPLATE_FOR_THE_ML_ALGORITHM:
			if (resolve)
				return getSelectedProcessingChainTemplateForTheMLAlgorithm();
			return basicGetSelectedProcessingChainTemplateForTheMLAlgorithm();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			if (resolve)
				return getCollecteddataknowledgeabouttemplateconstruction();
			return basicGetCollecteddataknowledgeabouttemplateconstruction();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION:
			setExplanation((String) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			getDatapropertyvalueset().addAll((Collection<? extends DataPropertyValueSet>) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN:
			setProcessingchain((ProcessingChain) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__SELECTED_PROCESSING_CHAIN_TEMPLATE_FOR_THE_ML_ALGORITHM:
			setSelectedProcessingChainTemplateForTheMLAlgorithm((ProcessingChainTemplate) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			setCollecteddataknowledgeabouttemplateconstruction(
					(CollectedDataKnowledgeAboutTemplateConstruction) newValue);
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION:
			setExplanation(EXPLANATION_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN:
			setProcessingchain((ProcessingChain) null);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) null);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__SELECTED_PROCESSING_CHAIN_TEMPLATE_FOR_THE_ML_ALGORITHM:
			setSelectedProcessingChainTemplateForTheMLAlgorithm((ProcessingChainTemplate) null);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			setCollecteddataknowledgeabouttemplateconstruction((CollectedDataKnowledgeAboutTemplateConstruction) null);
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION:
			return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return datapropertyvalueset != null && !datapropertyvalueset.isEmpty();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN:
			return processingchain != null;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return dataanalysisproblemtype != null;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__SELECTED_PROCESSING_CHAIN_TEMPLATE_FOR_THE_ML_ALGORITHM:
			return selectedProcessingChainTemplateForTheMLAlgorithm != null;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			return collecteddataknowledgeabouttemplateconstruction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN___SELECT_ML_ALGORITHM:
			SelectMLAlgorithm();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", explanation: ");
		result.append(explanation);
		result.append(')');
		return result.toString();
	}

} //MLProcChainSolutionPatternImpl
