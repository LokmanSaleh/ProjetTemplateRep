/**
 */
package projetTemplate.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import projetTemplate.MLAlgorithmSelectionCriteriaContainer;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.SelectionCriteria;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Algorithm Selection Criteria Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSelectionCriteriaContainerImpl#getDomainrequirementselectioncriteria <em>Domainrequirementselectioncriteria</em>}</li>
 *   <li>{@link projetTemplate.impl.MLAlgorithmSelectionCriteriaContainerImpl#getRegle <em>Regle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLAlgorithmSelectionCriteriaContainerImpl extends MinimalEObjectImpl.Container
		implements MLAlgorithmSelectionCriteriaContainer {
	/**
	 * The cached value of the '{@link #getDomainrequirementselectioncriteria() <em>Domainrequirementselectioncriteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainrequirementselectioncriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionCriteria> domainrequirementselectioncriteria;

	/**
	 * The default value of the '{@link #getRegle() <em>Regle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegle()
	 * @generated
	 * @ordered
	 */
	protected static final String REGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegle() <em>Regle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegle()
	 * @generated
	 * @ordered
	 */
	protected String regle = REGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLAlgorithmSelectionCriteriaContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionCriteria> getDomainrequirementselectioncriteria() {
		if (domainrequirementselectioncriteria == null) {
			domainrequirementselectioncriteria = new EObjectResolvingEList<SelectionCriteria>(SelectionCriteria.class,
					this,
					ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__DOMAINREQUIREMENTSELECTIONCRITERIA);
		}
		return domainrequirementselectioncriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegle() {
		return regle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegle(String newRegle) {
		String oldRegle = regle;
		regle = newRegle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE, oldRegle, regle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__DOMAINREQUIREMENTSELECTIONCRITERIA:
			return getDomainrequirementselectioncriteria();
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE:
			return getRegle();
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
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__DOMAINREQUIREMENTSELECTIONCRITERIA:
			getDomainrequirementselectioncriteria().clear();
			getDomainrequirementselectioncriteria().addAll((Collection<? extends SelectionCriteria>) newValue);
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE:
			setRegle((String) newValue);
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
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__DOMAINREQUIREMENTSELECTIONCRITERIA:
			getDomainrequirementselectioncriteria().clear();
			return;
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE:
			setRegle(REGLE_EDEFAULT);
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
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__DOMAINREQUIREMENTSELECTIONCRITERIA:
			return domainrequirementselectioncriteria != null && !domainrequirementselectioncriteria.isEmpty();
		case ProjetTemplatePackage.ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE:
			return REGLE_EDEFAULT == null ? regle != null : !REGLE_EDEFAULT.equals(regle);
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
		result.append(" (Regle: ");
		result.append(regle);
		result.append(')');
		return result.toString();
	}

} //MLAlgorithmSelectionCriteriaContainerImpl
