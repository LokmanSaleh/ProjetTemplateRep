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
import projetTemplate.ExtendedBPMNModel;
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.ProcessingChain;
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
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getProcessingchain <em>Processingchain</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getExecutedTemplate <em>Executed Template</em>}</li>
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
	 * The cached value of the '{@link #getExecutedTemplate() <em>Executed Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedTemplate()
	 * @generated
	 * @ordered
	 */
	protected ExtendedBPMNModel executedTemplate;

	/**
	 * The cached value of the '{@link #getCollecteddataknowledgeabouttemplateconstruction() <em>Collecteddataknowledgeabouttemplateconstruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollecteddataknowledgeabouttemplateconstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectedDataKnowledgeAboutTemplateConstruction> collecteddataknowledgeabouttemplateconstruction;

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
	public ExtendedBPMNModel getExecutedTemplate() {
		if (executedTemplate != null && executedTemplate.eIsProxy()) {
			InternalEObject oldExecutedTemplate = (InternalEObject) executedTemplate;
			executedTemplate = (ExtendedBPMNModel) eResolveProxy(oldExecutedTemplate);
			if (executedTemplate != oldExecutedTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXECUTED_TEMPLATE,
							oldExecutedTemplate, executedTemplate));
			}
		}
		return executedTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedBPMNModel basicGetExecutedTemplate() {
		return executedTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutedTemplate(ExtendedBPMNModel newExecutedTemplate) {
		ExtendedBPMNModel oldExecutedTemplate = executedTemplate;
		executedTemplate = newExecutedTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXECUTED_TEMPLATE, oldExecutedTemplate,
					executedTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectedDataKnowledgeAboutTemplateConstruction> getCollecteddataknowledgeabouttemplateconstruction() {
		if (collecteddataknowledgeabouttemplateconstruction == null) {
			collecteddataknowledgeabouttemplateconstruction = new EObjectResolvingEList<CollectedDataKnowledgeAboutTemplateConstruction>(
					CollectedDataKnowledgeAboutTemplateConstruction.class, this,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION);
		}
		return collecteddataknowledgeabouttemplateconstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChain ConstruireUneChaineDeTraitementInitiale() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedBPMNModel MergeProcessingChainAndTemplate() {
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXECUTED_TEMPLATE:
			if (resolve)
				return getExecutedTemplate();
			return basicGetExecutedTemplate();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			return getCollecteddataknowledgeabouttemplateconstruction();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXECUTED_TEMPLATE:
			setExecutedTemplate((ExtendedBPMNModel) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			getCollecteddataknowledgeabouttemplateconstruction().clear();
			getCollecteddataknowledgeabouttemplateconstruction()
					.addAll((Collection<? extends CollectedDataKnowledgeAboutTemplateConstruction>) newValue);
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN:
			setProcessingchain((ProcessingChain) null);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) null);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXECUTED_TEMPLATE:
			setExecutedTemplate((ExtendedBPMNModel) null);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			getCollecteddataknowledgeabouttemplateconstruction().clear();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return datapropertyvalueset != null && !datapropertyvalueset.isEmpty();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN:
			return processingchain != null;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return dataanalysisproblemtype != null;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXECUTED_TEMPLATE:
			return executedTemplate != null;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			return collecteddataknowledgeabouttemplateconstruction != null
					&& !collecteddataknowledgeabouttemplateconstruction.isEmpty();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN___CONSTRUIRE_UNE_CHAINE_DE_TRAITEMENT_INITIALE:
			return ConstruireUneChaineDeTraitementInitiale();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN___MERGE_PROCESSING_CHAIN_AND_TEMPLATE:
			return MergeProcessingChainAndTemplate();
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
		result.append(')');
		return result.toString();
	}

} //MLProcChainSolutionPatternImpl
