/**
 */
package projetTemplate.impl;

import java.lang.reflect.InvocationTargetException;

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

import projetTemplate.DataPropertyValue;
import projetTemplate.DataPropertyValueSet;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Property Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DataPropertyValueSetImpl#getSetType <em>Set Type</em>}</li>
 *   <li>{@link projetTemplate.impl.DataPropertyValueSetImpl#getValues <em>Values</em>}</li>
 *   <li>{@link projetTemplate.impl.DataPropertyValueSetImpl#getDatapropertyvalue <em>Datapropertyvalue</em>}</li>
 *   <li>{@link projetTemplate.impl.DataPropertyValueSetImpl#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}</li>
 *   <li>{@link projetTemplate.impl.DataPropertyValueSetImpl#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPropertyValueSetImpl extends MinimalEObjectImpl.Container implements DataPropertyValueSet {
	/**
	 * The default value of the '{@link #getSetType() <em>Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetType()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetType() <em>Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetType()
	 * @generated
	 * @ordered
	 */
	protected String setType = SET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected String values = VALUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatapropertyvalue() <em>Datapropertyvalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapropertyvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPropertyValue> datapropertyvalue;

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
	 * The cached value of the '{@link #getMlprocchainsolutionpattern() <em>Mlprocchainsolutionpattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlprocchainsolutionpattern()
	 * @generated
	 * @ordered
	 */
	protected EList<MLProcChainSolutionPattern> mlprocchainsolutionpattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DATA_PROPERTY_VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetType() {
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetType(String newSetType) {
		String oldSetType = setType;
		setType = newSetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__SET_TYPE, oldSetType, setType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValues(String newValues) {
		String oldValues = values;
		values = newValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__VALUES,
					oldValues, values));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPropertyValue> getDatapropertyvalue() {
		if (datapropertyvalue == null) {
			datapropertyvalue = new EObjectWithInverseResolvingEList.ManyInverse<DataPropertyValue>(
					DataPropertyValue.class, this, ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE,
					ProjetTemplatePackage.DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET);
		}
		return datapropertyvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLAlgorithmSolutionPattern> getMlalgorithmsolutionpattern() {
		if (mlalgorithmsolutionpattern == null) {
			mlalgorithmsolutionpattern = new EObjectWithInverseResolvingEList.ManyInverse<MLAlgorithmSolutionPattern>(
					MLAlgorithmSolutionPattern.class, this,
					ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN,
					ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET);
		}
		return mlalgorithmsolutionpattern;
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
					ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN,
					ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET);
		}
		return mlprocchainsolutionpattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void evaluate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDatapropertyvalue()).basicAdd(otherEnd,
					msgs);
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMlalgorithmsolutionpattern())
					.basicAdd(otherEnd, msgs);
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMlprocchainsolutionpattern())
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE:
			return ((InternalEList<?>) getDatapropertyvalue()).basicRemove(otherEnd, msgs);
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN:
			return ((InternalEList<?>) getMlalgorithmsolutionpattern()).basicRemove(otherEnd, msgs);
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN:
			return ((InternalEList<?>) getMlprocchainsolutionpattern()).basicRemove(otherEnd, msgs);
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__SET_TYPE:
			return getSetType();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__VALUES:
			return getValues();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE:
			return getDatapropertyvalue();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN:
			return getMlalgorithmsolutionpattern();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN:
			return getMlprocchainsolutionpattern();
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__SET_TYPE:
			setSetType((String) newValue);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__VALUES:
			setValues((String) newValue);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE:
			getDatapropertyvalue().clear();
			getDatapropertyvalue().addAll((Collection<? extends DataPropertyValue>) newValue);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN:
			getMlalgorithmsolutionpattern().clear();
			getMlalgorithmsolutionpattern().addAll((Collection<? extends MLAlgorithmSolutionPattern>) newValue);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN:
			getMlprocchainsolutionpattern().clear();
			getMlprocchainsolutionpattern().addAll((Collection<? extends MLProcChainSolutionPattern>) newValue);
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__SET_TYPE:
			setSetType(SET_TYPE_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__VALUES:
			setValues(VALUES_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE:
			getDatapropertyvalue().clear();
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN:
			getMlalgorithmsolutionpattern().clear();
			return;
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN:
			getMlprocchainsolutionpattern().clear();
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
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__SET_TYPE:
			return SET_TYPE_EDEFAULT == null ? setType != null : !SET_TYPE_EDEFAULT.equals(setType);
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__VALUES:
			return VALUES_EDEFAULT == null ? values != null : !VALUES_EDEFAULT.equals(values);
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE:
			return datapropertyvalue != null && !datapropertyvalue.isEmpty();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN:
			return mlalgorithmsolutionpattern != null && !mlalgorithmsolutionpattern.isEmpty();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN:
			return mlprocchainsolutionpattern != null && !mlprocchainsolutionpattern.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET___EVALUATE:
			evaluate();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (setType: ");
		result.append(setType);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //DataPropertyValueSetImpl
