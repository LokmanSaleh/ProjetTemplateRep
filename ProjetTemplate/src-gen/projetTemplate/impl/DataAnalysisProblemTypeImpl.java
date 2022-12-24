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
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Analysis Problem Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemTypeImpl#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}</li>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemTypeImpl#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAnalysisProblemTypeImpl extends MinimalEObjectImpl.Container implements DataAnalysisProblemType {
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
	 * The cached value of the '{@link #getMlprocchainsolutionpattern() <em>Mlprocchainsolutionpattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlprocchainsolutionpattern()
	 * @generated
	 * @ordered
	 */
	protected EList<MLProcChainSolutionPattern> mlprocchainsolutionpattern;

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
	protected DataAnalysisProblemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DATA_ANALYSIS_PROBLEM_TYPE;
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
					ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLProcChainSolutionPattern> getMlprocchainsolutionpattern() {
		if (mlprocchainsolutionpattern == null) {
			mlprocchainsolutionpattern = new EObjectWithInverseResolvingEList.ManyInverse<MLProcChainSolutionPattern>(
					MLProcChainSolutionPattern.class, this,
					ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE);
		}
		return mlprocchainsolutionpattern;
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
					ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE);
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMlprocchainsolutionpattern())
					.basicAdd(otherEnd, msgs);
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN:
			return ((InternalEList<?>) getMlprocchainsolutionpattern()).basicRemove(otherEnd, msgs);
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__NAME:
			return getName();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN:
			return getMlprocchainsolutionpattern();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN:
			getMlprocchainsolutionpattern().clear();
			getMlprocchainsolutionpattern().addAll((Collection<? extends MLProcChainSolutionPattern>) newValue);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN:
			getMlprocchainsolutionpattern().clear();
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN:
			return mlprocchainsolutionpattern != null && !mlprocchainsolutionpattern.isEmpty();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DataAnalysisProblemTypeImpl
