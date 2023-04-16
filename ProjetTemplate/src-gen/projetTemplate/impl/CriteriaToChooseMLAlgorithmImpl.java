/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import projetTemplate.CriteriaToChooseMLAlgorithm;
import projetTemplate.DomainRequirementSelectionCriteria;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criteria To Choose ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.CriteriaToChooseMLAlgorithmImpl#getDomainrequirementselectioncriteria <em>Domainrequirementselectioncriteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CriteriaToChooseMLAlgorithmImpl extends MinimalEObjectImpl.Container
		implements CriteriaToChooseMLAlgorithm {
	/**
	 * The cached value of the '{@link #getDomainrequirementselectioncriteria() <em>Domainrequirementselectioncriteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainrequirementselectioncriteria()
	 * @generated
	 * @ordered
	 */
	protected DomainRequirementSelectionCriteria domainrequirementselectioncriteria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriaToChooseMLAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.CRITERIA_TO_CHOOSE_ML_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRequirementSelectionCriteria getDomainrequirementselectioncriteria() {
		if (domainrequirementselectioncriteria != null && domainrequirementselectioncriteria.eIsProxy()) {
			InternalEObject oldDomainrequirementselectioncriteria = (InternalEObject) domainrequirementselectioncriteria;
			domainrequirementselectioncriteria = (DomainRequirementSelectionCriteria) eResolveProxy(
					oldDomainrequirementselectioncriteria);
			if (domainrequirementselectioncriteria != oldDomainrequirementselectioncriteria) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.CRITERIA_TO_CHOOSE_ML_ALGORITHM__DOMAINREQUIREMENTSELECTIONCRITERIA,
							oldDomainrequirementselectioncriteria, domainrequirementselectioncriteria));
			}
		}
		return domainrequirementselectioncriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRequirementSelectionCriteria basicGetDomainrequirementselectioncriteria() {
		return domainrequirementselectioncriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainrequirementselectioncriteria(
			DomainRequirementSelectionCriteria newDomainrequirementselectioncriteria) {
		DomainRequirementSelectionCriteria oldDomainrequirementselectioncriteria = domainrequirementselectioncriteria;
		domainrequirementselectioncriteria = newDomainrequirementselectioncriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.CRITERIA_TO_CHOOSE_ML_ALGORITHM__DOMAINREQUIREMENTSELECTIONCRITERIA,
					oldDomainrequirementselectioncriteria, domainrequirementselectioncriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.CRITERIA_TO_CHOOSE_ML_ALGORITHM__DOMAINREQUIREMENTSELECTIONCRITERIA:
			if (resolve)
				return getDomainrequirementselectioncriteria();
			return basicGetDomainrequirementselectioncriteria();
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
		case ProjetTemplatePackage.CRITERIA_TO_CHOOSE_ML_ALGORITHM__DOMAINREQUIREMENTSELECTIONCRITERIA:
			setDomainrequirementselectioncriteria((DomainRequirementSelectionCriteria) newValue);
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
		case ProjetTemplatePackage.CRITERIA_TO_CHOOSE_ML_ALGORITHM__DOMAINREQUIREMENTSELECTIONCRITERIA:
			setDomainrequirementselectioncriteria((DomainRequirementSelectionCriteria) null);
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
		case ProjetTemplatePackage.CRITERIA_TO_CHOOSE_ML_ALGORITHM__DOMAINREQUIREMENTSELECTIONCRITERIA:
			return domainrequirementselectioncriteria != null;
		}
		return super.eIsSet(featureID);
	}

} //CriteriaToChooseMLAlgorithmImpl
