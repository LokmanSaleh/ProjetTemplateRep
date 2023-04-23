/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.Data;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.Schema;
import projetTemplate.X_Database;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDatabase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.X_DatabaseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.impl.X_DatabaseImpl#getCredentias <em>Credentias</em>}</li>
 *   <li>{@link projetTemplate.impl.X_DatabaseImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link projetTemplate.impl.X_DatabaseImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class X_DatabaseImpl extends MinimalEObjectImpl.Container implements X_Database {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected X_DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.XDATABASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.XDATABASE__VALUE, oldValue,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.XDATABASE__CREDENTIAS,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetTemplatePackage.XDATABASE__SCHEMA,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.XDATABASE__SCHEMA, oldSchema,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjetTemplatePackage.XDATABASE__DATA,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.XDATABASE__DATA, oldData,
					data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.XDATABASE__VALUE:
			return getValue();
		case ProjetTemplatePackage.XDATABASE__CREDENTIAS:
			return getCredentias();
		case ProjetTemplatePackage.XDATABASE__SCHEMA:
			if (resolve)
				return getSchema();
			return basicGetSchema();
		case ProjetTemplatePackage.XDATABASE__DATA:
			if (resolve)
				return getData();
			return basicGetData();
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
		case ProjetTemplatePackage.XDATABASE__VALUE:
			setValue((String) newValue);
			return;
		case ProjetTemplatePackage.XDATABASE__CREDENTIAS:
			setCredentias((String) newValue);
			return;
		case ProjetTemplatePackage.XDATABASE__SCHEMA:
			setSchema((Schema) newValue);
			return;
		case ProjetTemplatePackage.XDATABASE__DATA:
			setData((Data) newValue);
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
		case ProjetTemplatePackage.XDATABASE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ProjetTemplatePackage.XDATABASE__CREDENTIAS:
			setCredentias(CREDENTIAS_EDEFAULT);
			return;
		case ProjetTemplatePackage.XDATABASE__SCHEMA:
			setSchema((Schema) null);
			return;
		case ProjetTemplatePackage.XDATABASE__DATA:
			setData((Data) null);
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
		case ProjetTemplatePackage.XDATABASE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ProjetTemplatePackage.XDATABASE__CREDENTIAS:
			return CREDENTIAS_EDEFAULT == null ? credentias != null : !CREDENTIAS_EDEFAULT.equals(credentias);
		case ProjetTemplatePackage.XDATABASE__SCHEMA:
			return schema != null;
		case ProjetTemplatePackage.XDATABASE__DATA:
			return data != null;
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

} //X_DatabaseImpl
