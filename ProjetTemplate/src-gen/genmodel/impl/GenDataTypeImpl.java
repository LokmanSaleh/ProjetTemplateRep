/**
 */
package genmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import genmodel.GenDataType;
import genmodel.GenmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genmodel.impl.GenDataTypeImpl#getEcoreDataType <em>Ecore Data Type</em>}</li>
 *   <li>{@link genmodel.impl.GenDataTypeImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link genmodel.impl.GenDataTypeImpl#getConvert <em>Convert</em>}</li>
 *   <li>{@link genmodel.impl.GenDataTypeImpl#getPropertyEditorFactory <em>Property Editor Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenDataTypeImpl extends GenClassifierImpl implements GenDataType {
	/**
	 * The cached value of the '{@link #getEcoreDataType() <em>Ecore Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcoreDataType()
	 * @generated
	 * @ordered
	 */
	protected EDataType ecoreDataType;

	/**
	 * The default value of the '{@link #getCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate()
	 * @generated
	 * @ordered
	 */
	protected String create = CREATE_EDEFAULT;

	/**
	 * This is true if the Create attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean createESet;

	/**
	 * The default value of the '{@link #getConvert() <em>Convert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvert()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvert() <em>Convert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvert()
	 * @generated
	 * @ordered
	 */
	protected String convert = CONVERT_EDEFAULT;

	/**
	 * This is true if the Convert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean convertESet;

	/**
	 * The default value of the '{@link #getPropertyEditorFactory() <em>Property Editor Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyEditorFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDITOR_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyEditorFactory() <em>Property Editor Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyEditorFactory()
	 * @generated
	 * @ordered
	 */
	protected String propertyEditorFactory = PROPERTY_EDITOR_FACTORY_EDEFAULT;

	/**
	 * This is true if the Property Editor Factory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propertyEditorFactoryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenmodelPackage.Literals.GEN_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEcoreDataType() {
		if (ecoreDataType != null && ecoreDataType.eIsProxy()) {
			InternalEObject oldEcoreDataType = (InternalEObject) ecoreDataType;
			ecoreDataType = (EDataType) eResolveProxy(oldEcoreDataType);
			if (ecoreDataType != oldEcoreDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GenmodelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE, oldEcoreDataType, ecoreDataType));
			}
		}
		return ecoreDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType basicGetEcoreDataType() {
		return ecoreDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcoreDataType(EDataType newEcoreDataType) {
		EDataType oldEcoreDataType = ecoreDataType;
		ecoreDataType = newEcoreDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE,
					oldEcoreDataType, ecoreDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreate(String newCreate) {
		String oldCreate = create;
		create = newCreate;
		boolean oldCreateESet = createESet;
		createESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_DATA_TYPE__CREATE, oldCreate,
					create, !oldCreateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreate() {
		String oldCreate = create;
		boolean oldCreateESet = createESet;
		create = CREATE_EDEFAULT;
		createESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GenmodelPackage.GEN_DATA_TYPE__CREATE, oldCreate,
					CREATE_EDEFAULT, oldCreateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreate() {
		return createESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConvert() {
		return convert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvert(String newConvert) {
		String oldConvert = convert;
		convert = newConvert;
		boolean oldConvertESet = convertESet;
		convertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_DATA_TYPE__CONVERT, oldConvert,
					convert, !oldConvertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConvert() {
		String oldConvert = convert;
		boolean oldConvertESet = convertESet;
		convert = CONVERT_EDEFAULT;
		convertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GenmodelPackage.GEN_DATA_TYPE__CONVERT, oldConvert,
					CONVERT_EDEFAULT, oldConvertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConvert() {
		return convertESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyEditorFactory() {
		return propertyEditorFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyEditorFactory(String newPropertyEditorFactory) {
		String oldPropertyEditorFactory = propertyEditorFactory;
		propertyEditorFactory = newPropertyEditorFactory;
		boolean oldPropertyEditorFactoryESet = propertyEditorFactoryESet;
		propertyEditorFactoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenmodelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY, oldPropertyEditorFactory,
					propertyEditorFactory, !oldPropertyEditorFactoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropertyEditorFactory() {
		String oldPropertyEditorFactory = propertyEditorFactory;
		boolean oldPropertyEditorFactoryESet = propertyEditorFactoryESet;
		propertyEditorFactory = PROPERTY_EDITOR_FACTORY_EDEFAULT;
		propertyEditorFactoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					GenmodelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY, oldPropertyEditorFactory,
					PROPERTY_EDITOR_FACTORY_EDEFAULT, oldPropertyEditorFactoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropertyEditorFactory() {
		return propertyEditorFactoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GenmodelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
			if (resolve)
				return getEcoreDataType();
			return basicGetEcoreDataType();
		case GenmodelPackage.GEN_DATA_TYPE__CREATE:
			return getCreate();
		case GenmodelPackage.GEN_DATA_TYPE__CONVERT:
			return getConvert();
		case GenmodelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
			return getPropertyEditorFactory();
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
		case GenmodelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
			setEcoreDataType((EDataType) newValue);
			return;
		case GenmodelPackage.GEN_DATA_TYPE__CREATE:
			setCreate((String) newValue);
			return;
		case GenmodelPackage.GEN_DATA_TYPE__CONVERT:
			setConvert((String) newValue);
			return;
		case GenmodelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
			setPropertyEditorFactory((String) newValue);
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
		case GenmodelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
			setEcoreDataType((EDataType) null);
			return;
		case GenmodelPackage.GEN_DATA_TYPE__CREATE:
			unsetCreate();
			return;
		case GenmodelPackage.GEN_DATA_TYPE__CONVERT:
			unsetConvert();
			return;
		case GenmodelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
			unsetPropertyEditorFactory();
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
		case GenmodelPackage.GEN_DATA_TYPE__ECORE_DATA_TYPE:
			return ecoreDataType != null;
		case GenmodelPackage.GEN_DATA_TYPE__CREATE:
			return isSetCreate();
		case GenmodelPackage.GEN_DATA_TYPE__CONVERT:
			return isSetConvert();
		case GenmodelPackage.GEN_DATA_TYPE__PROPERTY_EDITOR_FACTORY:
			return isSetPropertyEditorFactory();
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
		result.append(" (create: ");
		if (createESet)
			result.append(create);
		else
			result.append("<unset>");
		result.append(", convert: ");
		if (convertESet)
			result.append(convert);
		else
			result.append("<unset>");
		result.append(", propertyEditorFactory: ");
		if (propertyEditorFactoryESet)
			result.append(propertyEditorFactory);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GenDataTypeImpl
