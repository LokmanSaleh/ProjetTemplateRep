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
import projetTemplate.MLProcChainSolutionPattern;
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
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProcChainSolutionPatternImpl#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
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
	 * The cached value of the '{@link #getDataanalysisproblemtype() <em>Dataanalysisproblemtype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 * @ordered
	 */
	protected EList<DataAnalysisProblemType> dataanalysisproblemtype;

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
	public EList<DataAnalysisProblemType> getDataanalysisproblemtype() {
		if (dataanalysisproblemtype == null) {
			dataanalysisproblemtype = new EObjectWithInverseResolvingEList.ManyInverse<DataAnalysisProblemType>(
					DataAnalysisProblemType.class, this,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE,
					ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN);
		}
		return dataanalysisproblemtype;
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
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET,
					ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN);
		}
		return datapropertyvalueset;
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataanalysisproblemtype()).basicAdd(otherEnd,
					msgs);
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDatapropertyvalueset()).basicAdd(otherEnd,
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return ((InternalEList<?>) getDataanalysisproblemtype()).basicRemove(otherEnd, msgs);
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return ((InternalEList<?>) getDatapropertyvalueset()).basicRemove(otherEnd, msgs);
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__NAME:
			return getName();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION:
			return getExplanation();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return getDataanalysisproblemtype();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return getDatapropertyvalueset();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			getDataanalysisproblemtype().clear();
			getDataanalysisproblemtype().addAll((Collection<? extends DataAnalysisProblemType>) newValue);
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
			getDatapropertyvalueset().addAll((Collection<? extends DataPropertyValueSet>) newValue);
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			getDataanalysisproblemtype().clear();
			return;
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			getDatapropertyvalueset().clear();
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
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE:
			return dataanalysisproblemtype != null && !dataanalysisproblemtype.isEmpty();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET:
			return datapropertyvalueset != null && !datapropertyvalueset.isEmpty();
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

} //MLProcChainSolutionPatternImpl
