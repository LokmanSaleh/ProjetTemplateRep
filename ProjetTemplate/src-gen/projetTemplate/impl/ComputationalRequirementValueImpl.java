/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import projetTemplate.ComputationalRequirementValue;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computational Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.ComputationalRequirementValueImpl#getFormule <em>Formule</em>}</li>
 *   <li>{@link projetTemplate.impl.ComputationalRequirementValueImpl#getX_requirementtype <em>Xrequirementtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationalRequirementValueImpl extends SelectionCriteriaImpl implements ComputationalRequirementValue {
	/**
	 * The default value of the '{@link #getFormule() <em>Formule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormule()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormule() <em>Formule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormule()
	 * @generated
	 * @ordered
	 */
	protected String formule = FORMULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getX_requirementtype() <em>Xrequirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_requirementtype()
	 * @generated
	 * @ordered
	 */
	protected RequirementType x_requirementtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationalRequirementValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.COMPUTATIONAL_REQUIREMENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormule() {
		return formule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormule(String newFormule) {
		String oldFormule = formule;
		formule = newFormule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__FORMULE, oldFormule, formule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType getX_requirementtype() {
		if (x_requirementtype != null && x_requirementtype.eIsProxy()) {
			InternalEObject oldX_requirementtype = (InternalEObject) x_requirementtype;
			x_requirementtype = (RequirementType) eResolveProxy(oldX_requirementtype);
			if (x_requirementtype != oldX_requirementtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE,
							oldX_requirementtype, x_requirementtype));
			}
		}
		return x_requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetX_requirementtype() {
		return x_requirementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_requirementtype(RequirementType newX_requirementtype) {
		RequirementType oldX_requirementtype = x_requirementtype;
		x_requirementtype = newX_requirementtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE, oldX_requirementtype,
					x_requirementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__FORMULE:
			return getFormule();
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			if (resolve)
				return getX_requirementtype();
			return basicGetX_requirementtype();
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
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__FORMULE:
			setFormule((String) newValue);
			return;
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			setX_requirementtype((RequirementType) newValue);
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
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__FORMULE:
			setFormule(FORMULE_EDEFAULT);
			return;
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			setX_requirementtype((RequirementType) null);
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
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__FORMULE:
			return FORMULE_EDEFAULT == null ? formule != null : !FORMULE_EDEFAULT.equals(formule);
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE:
			return x_requirementtype != null;
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
		result.append(" (formule: ");
		result.append(formule);
		result.append(')');
		return result.toString();
	}

} //ComputationalRequirementValueImpl
