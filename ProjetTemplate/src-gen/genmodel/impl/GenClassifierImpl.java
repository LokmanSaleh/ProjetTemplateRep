/**
 */
package genmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import genmodel.GenClassifier;
import genmodel.GenPackage;
import genmodel.GenTypeParameter;
import genmodel.GenmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genmodel.impl.GenClassifierImpl#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link genmodel.impl.GenClassifierImpl#getGenTypeParameters <em>Gen Type Parameters</em>}</li>
 *   <li>{@link genmodel.impl.GenClassifierImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GenClassifierImpl extends GenBaseImpl implements GenClassifier {
	/**
	 * The cached value of the '{@link #getGenTypeParameters() <em>Gen Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<GenTypeParameter> genTypeParameters;

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
	protected GenClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenmodelPackage.Literals.GEN_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage getGenPackage() {
		// TODO: implement this method to return the 'Gen Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenTypeParameter> getGenTypeParameters() {
		if (genTypeParameters == null) {
			genTypeParameters = new EObjectContainmentEList<GenTypeParameter>(GenTypeParameter.class, this,
					GenmodelPackage.GEN_CLASSIFIER__GEN_TYPE_PARAMETERS);
		}
		return genTypeParameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_CLASSIFIER__DOCUMENTATION,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GenmodelPackage.GEN_CLASSIFIER__DOCUMENTATION,
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GenmodelPackage.GEN_CLASSIFIER__GEN_TYPE_PARAMETERS:
			return ((InternalEList<?>) getGenTypeParameters()).basicRemove(otherEnd, msgs);
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
		case GenmodelPackage.GEN_CLASSIFIER__GEN_PACKAGE:
			return getGenPackage();
		case GenmodelPackage.GEN_CLASSIFIER__GEN_TYPE_PARAMETERS:
			return getGenTypeParameters();
		case GenmodelPackage.GEN_CLASSIFIER__DOCUMENTATION:
			return getDocumentation();
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
		case GenmodelPackage.GEN_CLASSIFIER__GEN_TYPE_PARAMETERS:
			getGenTypeParameters().clear();
			getGenTypeParameters().addAll((Collection<? extends GenTypeParameter>) newValue);
			return;
		case GenmodelPackage.GEN_CLASSIFIER__DOCUMENTATION:
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
		case GenmodelPackage.GEN_CLASSIFIER__GEN_TYPE_PARAMETERS:
			getGenTypeParameters().clear();
			return;
		case GenmodelPackage.GEN_CLASSIFIER__DOCUMENTATION:
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
		case GenmodelPackage.GEN_CLASSIFIER__GEN_PACKAGE:
			return getGenPackage() != null;
		case GenmodelPackage.GEN_CLASSIFIER__GEN_TYPE_PARAMETERS:
			return genTypeParameters != null && !genTypeParameters.isEmpty();
		case GenmodelPackage.GEN_CLASSIFIER__DOCUMENTATION:
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

} //GenClassifierImpl
