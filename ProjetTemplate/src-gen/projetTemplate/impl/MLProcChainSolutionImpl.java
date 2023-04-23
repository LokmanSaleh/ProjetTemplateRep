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
import projetTemplate.MLProcChainSolution;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Proc Chain Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionImpl#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionImpl#getX_processingchain <em>Xprocessingchain</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionImpl#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionImpl#getExecutedTemplate <em>Executed Template</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionImpl#getX_collecteddataknowledgeabouttemplateconstruction <em>Xcollecteddataknowledgeabouttemplateconstruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLProcChainSolutionImpl extends MinimalEObjectImpl.Container implements MLProcChainSolution {
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
	 * The cached value of the '{@link #getX_processingchain() <em>Xprocessingchain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_processingchain()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingChainTemplate> x_processingchain;

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
	 * The cached value of the '{@link #getExecutedTemplate() <em>Executed Template</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedBPMNModel> executedTemplate;

	/**
	 * The cached value of the '{@link #getX_collecteddataknowledgeabouttemplateconstruction() <em>Xcollecteddataknowledgeabouttemplateconstruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_collecteddataknowledgeabouttemplateconstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectedDataKnowledgeAboutTemplateConstruction> x_collecteddataknowledgeabouttemplateconstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLProcChainSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyValueSet> getDatapropertyvalueset() {
		if (datapropertyvalueset == null) {
			datapropertyvalueset = new EObjectResolvingEList<DataPropertyValueSet>(DataPropertyValueSet.class, this,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET);
		}
		return datapropertyvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingChainTemplate> getX_processingchain() {
		if (x_processingchain == null) {
			x_processingchain = new EObjectResolvingEList<ProcessingChainTemplate>(ProcessingChainTemplate.class, this,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN);
		}
		return x_processingchain;
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
							ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE,
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
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE, oldDataanalysisproblemtype,
					dataanalysisproblemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedBPMNModel> getExecutedTemplate() {
		if (executedTemplate == null) {
			executedTemplate = new EObjectResolvingEList<ExtendedBPMNModel>(ExtendedBPMNModel.class, this,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE);
		}
		return executedTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectedDataKnowledgeAboutTemplateConstruction> getX_collecteddataknowledgeabouttemplateconstruction() {
		if (x_collecteddataknowledgeabouttemplateconstruction == null) {
			x_collecteddataknowledgeabouttemplateconstruction = new EObjectResolvingEList<CollectedDataKnowledgeAboutTemplateConstruction>(
					CollectedDataKnowledgeAboutTemplateConstruction.class, this,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION);
		}
		return x_collecteddataknowledgeabouttemplateconstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplate ConstruireUneChaineDeTraitementInitiale() {
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__NAME:
			return getName();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET:
			return getDatapropertyvalueset();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN:
			return getX_processingchain();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE:
			if (resolve)
				return getDataanalysisproblemtype();
			return basicGetDataanalysisproblemtype();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE:
			return getExecutedTemplate();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			return getX_collecteddataknowledgeabouttemplateconstruction();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			getDatapropertyvalueset().addAll((Collection<? extends DataPropertyValueSet>) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN:
			getX_processingchain().clear();
			getX_processingchain().addAll((Collection<? extends ProcessingChainTemplate>) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE:
			getExecutedTemplate().clear();
			getExecutedTemplate().addAll((Collection<? extends ExtendedBPMNModel>) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			getX_collecteddataknowledgeabouttemplateconstruction().clear();
			getX_collecteddataknowledgeabouttemplateconstruction()
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN:
			getX_processingchain().clear();
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) null);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE:
			getExecutedTemplate().clear();
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			getX_collecteddataknowledgeabouttemplateconstruction().clear();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET:
			return datapropertyvalueset != null && !datapropertyvalueset.isEmpty();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN:
			return x_processingchain != null && !x_processingchain.isEmpty();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE:
			return dataanalysisproblemtype != null;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE:
			return executedTemplate != null && !executedTemplate.isEmpty();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION:
			return x_collecteddataknowledgeabouttemplateconstruction != null
					&& !x_collecteddataknowledgeabouttemplateconstruction.isEmpty();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION___CONSTRUIRE_UNE_CHAINE_DE_TRAITEMENT_INITIALE:
			return ConstruireUneChaineDeTraitementInitiale();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION___MERGE_PROCESSING_CHAIN_AND_TEMPLATE:
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

} //MLProcChainSolutionImpl
