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

import projetTemplate.DataAnalysisProblemType;
import projetTemplate.DataPropertyValueSet;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Algorithm Solution Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl#getMlalgorithm <em>Mlalgorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLAlgorithmSolutionPatternImpl extends MinimalEObjectImpl.Container implements MLAlgorithmSolutionPattern {
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
	 * The cached value of the '{@link #getProcessingchaintemplate() <em>Processingchaintemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingchaintemplate()
	 * @generated
	 * @ordered
	 */
	protected ProcessingChainTemplate processingchaintemplate;

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
	 * The cached value of the '{@link #getDataanalysisproblemtype() <em>Dataanalysisproblemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 * @ordered
	 */
	protected DataAnalysisProblemType dataanalysisproblemtype;

	/**
	 * The cached value of the '{@link #getMlalgorithm() <em>Mlalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlalgorithm()
	 * @generated
	 * @ordered
	 */
	protected MLAlgorithm mlalgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLAlgorithmSolutionPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.ML_ALGORITHM_SOLUTION_PATTERN;
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
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__NAME, oldName, name));
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
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION, oldExplanation, explanation));
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
							ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE,
							oldProcessingchaintemplate, processingchaintemplate));
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
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE,
					oldProcessingchaintemplate, processingchaintemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyValueSet> getDatapropertyvalueset() {
		if (datapropertyvalueset == null) {
			datapropertyvalueset = new EObjectWithInverseResolvingEList.ManyInverse<DataPropertyValueSet>(
					DataPropertyValueSet.class, this,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET,
					ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN);
		}
		return datapropertyvalueset;
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
							ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE,
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
	public NotificationChain basicSetDataanalysisproblemtype(DataAnalysisProblemType newDataanalysisproblemtype,
			NotificationChain msgs) {
		DataAnalysisProblemType oldDataanalysisproblemtype = dataanalysisproblemtype;
		dataanalysisproblemtype = newDataanalysisproblemtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE,
					oldDataanalysisproblemtype, newDataanalysisproblemtype);
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
	public void setDataanalysisproblemtype(DataAnalysisProblemType newDataanalysisproblemtype) {
		if (newDataanalysisproblemtype != dataanalysisproblemtype) {
			NotificationChain msgs = null;
			if (dataanalysisproblemtype != null)
				msgs = ((InternalEObject) dataanalysisproblemtype).eInverseRemove(this,
						ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN,
						DataAnalysisProblemType.class, msgs);
			if (newDataanalysisproblemtype != null)
				msgs = ((InternalEObject) newDataanalysisproblemtype).eInverseAdd(this,
						ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN,
						DataAnalysisProblemType.class, msgs);
			msgs = basicSetDataanalysisproblemtype(newDataanalysisproblemtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE,
					newDataanalysisproblemtype, newDataanalysisproblemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLAlgorithm getMlalgorithm() {
		if (mlalgorithm != null && mlalgorithm.eIsProxy()) {
			InternalEObject oldMlalgorithm = (InternalEObject) mlalgorithm;
			mlalgorithm = (MLAlgorithm) eResolveProxy(oldMlalgorithm);
			if (mlalgorithm != oldMlalgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM, oldMlalgorithm,
							mlalgorithm));
			}
		}
		return mlalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLAlgorithm basicGetMlalgorithm() {
		return mlalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMlalgorithm(MLAlgorithm newMlalgorithm, NotificationChain msgs) {
		MLAlgorithm oldMlalgorithm = mlalgorithm;
		mlalgorithm = newMlalgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM, oldMlalgorithm, newMlalgorithm);
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
	public void setMlalgorithm(MLAlgorithm newMlalgorithm) {
		if (newMlalgorithm != mlalgorithm) {
			NotificationChain msgs = null;
			if (mlalgorithm != null)
				msgs = ((InternalEObject) mlalgorithm).eInverseRemove(this,
						ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN, MLAlgorithm.class, msgs);
			if (newMlalgorithm != null)
				msgs = ((InternalEObject) newMlalgorithm).eInverseAdd(this,
						ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN, MLAlgorithm.class, msgs);
			msgs = basicSetMlalgorithm(newMlalgorithm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM, newMlalgorithm, newMlalgorithm));
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
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDatapropertyvalueset()).basicAdd(otherEnd,
					msgs);
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			if (dataanalysisproblemtype != null)
				msgs = ((InternalEObject) dataanalysisproblemtype).eInverseRemove(this,
						ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN,
						DataAnalysisProblemType.class, msgs);
			return basicSetDataanalysisproblemtype((DataAnalysisProblemType) otherEnd, msgs);
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM:
			if (mlalgorithm != null)
				msgs = ((InternalEObject) mlalgorithm).eInverseRemove(this,
						ProjetTemplatePackage.ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN, MLAlgorithm.class, msgs);
			return basicSetMlalgorithm((MLAlgorithm) otherEnd, msgs);
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
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return ((InternalEList<?>) getDatapropertyvalueset()).basicRemove(otherEnd, msgs);
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return basicSetDataanalysisproblemtype(null, msgs);
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM:
			return basicSetMlalgorithm(null, msgs);
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
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__NAME:
			return getName();
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION:
			return getExplanation();
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE:
			if (resolve)
				return getProcessingchaintemplate();
			return basicGetProcessingchaintemplate();
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return getDatapropertyvalueset();
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			if (resolve)
				return getDataanalysisproblemtype();
			return basicGetDataanalysisproblemtype();
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM:
			if (resolve)
				return getMlalgorithm();
			return basicGetMlalgorithm();
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
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION:
			setExplanation((String) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE:
			setProcessingchaintemplate((ProcessingChainTemplate) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			getDatapropertyvalueset().addAll((Collection<? extends DataPropertyValueSet>) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM:
			setMlalgorithm((MLAlgorithm) newValue);
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
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION:
			setExplanation(EXPLANATION_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE:
			setProcessingchaintemplate((ProcessingChainTemplate) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) null);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM:
			setMlalgorithm((MLAlgorithm) null);
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
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION:
			return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE:
			return processingchaintemplate != null;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return datapropertyvalueset != null && !datapropertyvalueset.isEmpty();
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return dataanalysisproblemtype != null;
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM:
			return mlalgorithm != null;
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
		result.append(", explanation: ");
		result.append(explanation);
		result.append(')');
		return result.toString();
	}

} //MLAlgorithmSolutionPatternImpl
