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
import projetTemplate.Data;
import projetTemplate.Database;
import projetTemplate.MLProject;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DatabaseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.impl.DatabaseImpl#getCredentias <em>Credentias</em>}</li>
 *   <li>{@link projetTemplate.impl.DatabaseImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link projetTemplate.impl.DatabaseImpl#getData <em>Data</em>}</li>
 *   <li>{@link projetTemplate.impl.DatabaseImpl#getMlproject <em>Mlproject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredentias() <em>Credentias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentias()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDENTIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCredentias() <em>Credentias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentias()
	 * @generated
	 * @ordered
	 */
	protected String credentias = CREDENTIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getMlproject() <em>Mlproject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlproject()
	 * @generated
	 * @ordered
	 */
	protected EList<MLProject> mlproject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATABASE__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCredentias() {
		return credentias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredentias(String newCredentias) {
		String oldCredentias = credentias;
		credentias = newCredentias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATABASE__CREDENTIAS,
					oldCredentias, credentias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (schema != null && schema.eIsProxy()) {
			InternalEObject oldSchema = (InternalEObject) schema;
			schema = (Schema) eResolveProxy(oldSchema);
			if (schema != oldSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetTemplatePackage.DATABASE__SCHEMA,
							oldSchema, schema));
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		Schema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATABASE__SCHEMA, oldSchema,
					schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject) data;
			data = (Data) eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetTemplatePackage.DATABASE__DATA,
							oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATABASE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLProject> getMlproject() {
		if (mlproject == null) {
			mlproject = new EObjectWithInverseResolvingEList<MLProject>(MLProject.class, this,
					ProjetTemplatePackage.DATABASE__MLPROJECT, ProjetTemplatePackage.ML_PROJECT__DATABASE);
		}
		return mlproject;
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
		case ProjetTemplatePackage.DATABASE__MLPROJECT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMlproject()).basicAdd(otherEnd, msgs);
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
		case ProjetTemplatePackage.DATABASE__MLPROJECT:
			return ((InternalEList<?>) getMlproject()).basicRemove(otherEnd, msgs);
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
		case ProjetTemplatePackage.DATABASE__VALUE:
			return getValue();
		case ProjetTemplatePackage.DATABASE__CREDENTIAS:
			return getCredentias();
		case ProjetTemplatePackage.DATABASE__SCHEMA:
			if (resolve)
				return getSchema();
			return basicGetSchema();
		case ProjetTemplatePackage.DATABASE__DATA:
			if (resolve)
				return getData();
			return basicGetData();
		case ProjetTemplatePackage.DATABASE__MLPROJECT:
			return getMlproject();
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
		case ProjetTemplatePackage.DATABASE__VALUE:
			setValue((String) newValue);
			return;
		case ProjetTemplatePackage.DATABASE__CREDENTIAS:
			setCredentias((String) newValue);
			return;
		case ProjetTemplatePackage.DATABASE__SCHEMA:
			setSchema((Schema) newValue);
			return;
		case ProjetTemplatePackage.DATABASE__DATA:
			setData((Data) newValue);
			return;
		case ProjetTemplatePackage.DATABASE__MLPROJECT:
			getMlproject().clear();
			getMlproject().addAll((Collection<? extends MLProject>) newValue);
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
		case ProjetTemplatePackage.DATABASE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATABASE__CREDENTIAS:
			setCredentias(CREDENTIAS_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATABASE__SCHEMA:
			setSchema((Schema) null);
			return;
		case ProjetTemplatePackage.DATABASE__DATA:
			setData((Data) null);
			return;
		case ProjetTemplatePackage.DATABASE__MLPROJECT:
			getMlproject().clear();
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
		case ProjetTemplatePackage.DATABASE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ProjetTemplatePackage.DATABASE__CREDENTIAS:
			return CREDENTIAS_EDEFAULT == null ? credentias != null : !CREDENTIAS_EDEFAULT.equals(credentias);
		case ProjetTemplatePackage.DATABASE__SCHEMA:
			return schema != null;
		case ProjetTemplatePackage.DATABASE__DATA:
			return data != null;
		case ProjetTemplatePackage.DATABASE__MLPROJECT:
			return mlproject != null && !mlproject.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", credentias: ");
		result.append(credentias);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
