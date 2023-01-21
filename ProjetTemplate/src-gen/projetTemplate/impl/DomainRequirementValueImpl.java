/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.Accuracy;
import projetTemplate.DomainRequirementValue;
import projetTemplate.Explainability;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getRequirementtype <em>Requirementtype</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getExplainability <em>Explainability</em>}</li>
 *   <li>{@link projetTemplate.impl.DomainRequirementValueImpl#getAccuracy <em>Accuracy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainRequirementValueImpl extends MinimalEObjectImpl.Container implements DomainRequirementValue {
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
	 * The cached value of the '{@link #getRequirementtype() <em>Requirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementtype()
	 * @generated
	 * @ordered
	 */
	protected RequirementType requirementtype;

	/**
	 * The cached value of the '{@link #getExplainability() <em>Explainability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplainability()
	 * @generated
	 * @ordered
	 */
	protected Explainability explainability;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected Accuracy accuracy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainRequirementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DOMAIN_REQUIREMENT_VALUE;
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
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION, oldExplanation, explanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getRequirementtype() {
		if (requirementtype != null && requirementtype.eIsProxy()) {
			InternalEObject oldRequirementtype = (InternalEObject) requirementtype;
			requirementtype = (RequirementType) eResolveProxy(oldRequirementtype);
			if (requirementtype != oldRequirementtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE, oldRequirementtype,
							requirementtype));
			}
		}
		return requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetRequirementtype() {
		return requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementtype(RequirementType newRequirementtype) {
		RequirementType oldRequirementtype = requirementtype;
		requirementtype = newRequirementtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE, oldRequirementtype,
					requirementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Explainability getExplainability() {
		if (explainability != null && explainability.eIsProxy()) {
			InternalEObject oldExplainability = (InternalEObject) explainability;
			explainability = (Explainability) eResolveProxy(oldExplainability);
			if (explainability != oldExplainability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLAINABILITY, oldExplainability,
							explainability));
			}
		}
		return explainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Explainability basicGetExplainability() {
		return explainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplainability(Explainability newExplainability) {
		Explainability oldExplainability = explainability;
		explainability = newExplainability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLAINABILITY, oldExplainability, explainability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accuracy getAccuracy() {
		if (accuracy != null && accuracy.eIsProxy()) {
			InternalEObject oldAccuracy = (InternalEObject) accuracy;
			accuracy = (Accuracy) eResolveProxy(oldAccuracy);
			if (accuracy != oldAccuracy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__ACCURACY, oldAccuracy, accuracy));
			}
		}
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accuracy basicGetAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(Accuracy newAccuracy) {
		Accuracy oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			return getExplanation();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			if (resolve)
				return getRequirementtype();
			return basicGetRequirementtype();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLAINABILITY:
			if (resolve)
				return getExplainability();
			return basicGetExplainability();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__ACCURACY:
			if (resolve)
				return getAccuracy();
			return basicGetAccuracy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			setExplanation((String) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLAINABILITY:
			setExplainability((Explainability) newValue);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__ACCURACY:
			setAccuracy((Accuracy) newValue);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			setExplanation(EXPLANATION_EDEFAULT);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) null);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLAINABILITY:
			setExplainability((Explainability) null);
			return;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__ACCURACY:
			setAccuracy((Accuracy) null);
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
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLANATION:
			return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE:
			return requirementtype != null;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__EXPLAINABILITY:
			return explainability != null;
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE__ACCURACY:
			return accuracy != null;
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
		result.append(" (explanation: ");
		result.append(explanation);
		result.append(')');
		return result.toString();
	}

} //DomainRequirementValueImpl
