/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.DataPropertyValueSet;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementMapping;
import projetTemplate.RequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.RequirementMappingImpl#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementMappingImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementMappingImpl#getRequirementtype <em>Requirementtype</em>}</li>
 *   <li>{@link projetTemplate.impl.RequirementMappingImpl#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementMappingImpl extends MinimalEObjectImpl.Container implements RequirementMapping {
	/**
	 * The default value of the '{@link #getRestrictions() <em>Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictions()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestrictions() <em>Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictions()
	 * @generated
	 * @ordered
	 */
	protected String restrictions = RESTRICTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

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
	 * The cached value of the '{@link #getDatapropertyvalueset() <em>Datapropertyvalueset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapropertyvalueset()
	 * @generated
	 * @ordered
	 */
	protected DataPropertyValueSet datapropertyvalueset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.REQUIREMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestrictions() {
		return restrictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictions(String newRestrictions) {
		String oldRestrictions = restrictions;
		restrictions = newRestrictions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.REQUIREMENT_MAPPING__RESTRICTIONS, oldRestrictions, restrictions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.REQUIREMENT_MAPPING__RATIONALE,
					oldRationale, rationale));
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
							ProjetTemplatePackage.REQUIREMENT_MAPPING__REQUIREMENTTYPE, oldRequirementtype,
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
					ProjetTemplatePackage.REQUIREMENT_MAPPING__REQUIREMENTTYPE, oldRequirementtype, requirementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyValueSet getDatapropertyvalueset() {
		if (datapropertyvalueset != null && datapropertyvalueset.eIsProxy()) {
			InternalEObject oldDatapropertyvalueset = (InternalEObject) datapropertyvalueset;
			datapropertyvalueset = (DataPropertyValueSet) eResolveProxy(oldDatapropertyvalueset);
			if (datapropertyvalueset != oldDatapropertyvalueset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.REQUIREMENT_MAPPING__DATAPROPERTYVALUESET, oldDatapropertyvalueset,
							datapropertyvalueset));
			}
		}
		return datapropertyvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyValueSet basicGetDatapropertyvalueset() {
		return datapropertyvalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatapropertyvalueset(DataPropertyValueSet newDatapropertyvalueset) {
		DataPropertyValueSet oldDatapropertyvalueset = datapropertyvalueset;
		datapropertyvalueset = newDatapropertyvalueset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.REQUIREMENT_MAPPING__DATAPROPERTYVALUESET, oldDatapropertyvalueset,
					datapropertyvalueset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RESTRICTIONS:
			return getRestrictions();
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RATIONALE:
			return getRationale();
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__REQUIREMENTTYPE:
			if (resolve)
				return getRequirementtype();
			return basicGetRequirementtype();
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__DATAPROPERTYVALUESET:
			if (resolve)
				return getDatapropertyvalueset();
			return basicGetDatapropertyvalueset();
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
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RESTRICTIONS:
			setRestrictions((String) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RATIONALE:
			setRationale((String) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) newValue);
			return;
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__DATAPROPERTYVALUESET:
			setDatapropertyvalueset((DataPropertyValueSet) newValue);
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
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RESTRICTIONS:
			setRestrictions(RESTRICTIONS_EDEFAULT);
			return;
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
			return;
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__REQUIREMENTTYPE:
			setRequirementtype((RequirementType) null);
			return;
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__DATAPROPERTYVALUESET:
			setDatapropertyvalueset((DataPropertyValueSet) null);
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
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RESTRICTIONS:
			return RESTRICTIONS_EDEFAULT == null ? restrictions != null : !RESTRICTIONS_EDEFAULT.equals(restrictions);
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__REQUIREMENTTYPE:
			return requirementtype != null;
		case ProjetTemplatePackage.REQUIREMENT_MAPPING__DATAPROPERTYVALUESET:
			return datapropertyvalueset != null;
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
		result.append(" (restrictions: ");
		result.append(restrictions);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(')');
		return result.toString();
	}

} //RequirementMappingImpl
