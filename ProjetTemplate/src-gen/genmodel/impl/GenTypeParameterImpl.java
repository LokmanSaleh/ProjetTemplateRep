/**
 */
package genmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import genmodel.GenTypeParameter;
import genmodel.GenmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genmodel.impl.GenTypeParameterImpl#getEcoreTypeParameter <em>Ecore Type Parameter</em>}</li>
 *   <li>{@link genmodel.impl.GenTypeParameterImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenTypeParameterImpl extends GenBaseImpl implements GenTypeParameter {
	/**
	 * The cached value of the '{@link #getEcoreTypeParameter() <em>Ecore Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreTypeParameter()
	 * @generated
	 * @ordered
	 */
	protected ETypeParameter ecoreTypeParameter;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * This is true if the Documentation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean documentationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenTypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenmodelPackage.Literals.GEN_TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter getEcoreTypeParameter() {
		if (ecoreTypeParameter != null && ecoreTypeParameter.eIsProxy()) {
			InternalEObject oldEcoreTypeParameter = (InternalEObject) ecoreTypeParameter;
			ecoreTypeParameter = (ETypeParameter) eResolveProxy(oldEcoreTypeParameter);
			if (ecoreTypeParameter != oldEcoreTypeParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GenmodelPackage.GEN_TYPE_PARAMETER__ECORE_TYPE_PARAMETER, oldEcoreTypeParameter,
							ecoreTypeParameter));
			}
		}
		return ecoreTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter basicGetEcoreTypeParameter() {
		return ecoreTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreTypeParameter(ETypeParameter newEcoreTypeParameter) {
		ETypeParameter oldEcoreTypeParameter = ecoreTypeParameter;
		ecoreTypeParameter = newEcoreTypeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenmodelPackage.GEN_TYPE_PARAMETER__ECORE_TYPE_PARAMETER, oldEcoreTypeParameter,
					ecoreTypeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		boolean oldDocumentationESet = documentationESet;
		documentationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_TYPE_PARAMETER__DOCUMENTATION,
					oldDocumentation, documentation, !oldDocumentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDocumentation() {
		String oldDocumentation = documentation;
		boolean oldDocumentationESet = documentationESet;
		documentation = DOCUMENTATION_EDEFAULT;
		documentationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GenmodelPackage.GEN_TYPE_PARAMETER__DOCUMENTATION,
					oldDocumentation, DOCUMENTATION_EDEFAULT, oldDocumentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentation() {
		return documentationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GenmodelPackage.GEN_TYPE_PARAMETER__ECORE_TYPE_PARAMETER:
			if (resolve)
				return getEcoreTypeParameter();
			return basicGetEcoreTypeParameter();
		case GenmodelPackage.GEN_TYPE_PARAMETER__DOCUMENTATION:
			return getDocumentation();
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
		case GenmodelPackage.GEN_TYPE_PARAMETER__ECORE_TYPE_PARAMETER:
			setEcoreTypeParameter((ETypeParameter) newValue);
			return;
		case GenmodelPackage.GEN_TYPE_PARAMETER__DOCUMENTATION:
			setDocumentation((String) newValue);
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
		case GenmodelPackage.GEN_TYPE_PARAMETER__ECORE_TYPE_PARAMETER:
			setEcoreTypeParameter((ETypeParameter) null);
			return;
		case GenmodelPackage.GEN_TYPE_PARAMETER__DOCUMENTATION:
			unsetDocumentation();
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
		case GenmodelPackage.GEN_TYPE_PARAMETER__ECORE_TYPE_PARAMETER:
			return ecoreTypeParameter != null;
		case GenmodelPackage.GEN_TYPE_PARAMETER__DOCUMENTATION:
			return isSetDocumentation();
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
		result.append(" (documentation: ");
		if (documentationESet)
			result.append(documentation);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GenTypeParameterImpl
