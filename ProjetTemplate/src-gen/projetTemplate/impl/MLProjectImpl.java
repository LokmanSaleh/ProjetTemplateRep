/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projetTemplate.DataAnalysisProblem;
import projetTemplate.Database;
import projetTemplate.DomainProblem;
import projetTemplate.MLProject;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.MLProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProjectImpl#getDate <em>Date</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProjectImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProjectImpl#getDataanalysisproblem <em>Dataanalysisproblem</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProjectImpl#getDomainproblem <em>Domainproblem</em>}</li>
 *   <li>{@link projetTemplate.impl.MLProjectImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLProjectImpl extends MinimalEObjectImpl.Container implements MLProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataanalysisproblem() <em>Dataanalysisproblem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataanalysisproblem()
	 * @generated
	 * @ordered
	 */
	protected DataAnalysisProblem dataanalysisproblem;

	/**
	 * The cached value of the '{@link #getDomainproblem() <em>Domainproblem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainproblem()
	 * @generated
	 * @ordered
	 */
	protected DomainProblem domainproblem;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.ML_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_PROJECT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_PROJECT__DATE, oldDate,
					date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_PROJECT__AUTHOR, oldAuthor,
					author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblem getDataanalysisproblem() {
		if (dataanalysisproblem != null && dataanalysisproblem.eIsProxy()) {
			InternalEObject oldDataanalysisproblem = (InternalEObject) dataanalysisproblem;
			dataanalysisproblem = (DataAnalysisProblem) eResolveProxy(oldDataanalysisproblem);
			if (dataanalysisproblem != oldDataanalysisproblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_PROJECT__DATAANALYSISPROBLEM, oldDataanalysisproblem,
							dataanalysisproblem));
			}
		}
		return dataanalysisproblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblem basicGetDataanalysisproblem() {
		return dataanalysisproblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataanalysisproblem(DataAnalysisProblem newDataanalysisproblem) {
		DataAnalysisProblem oldDataanalysisproblem = dataanalysisproblem;
		dataanalysisproblem = newDataanalysisproblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_PROJECT__DATAANALYSISPROBLEM,
					oldDataanalysisproblem, dataanalysisproblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainProblem getDomainproblem() {
		if (domainproblem != null && domainproblem.eIsProxy()) {
			InternalEObject oldDomainproblem = (InternalEObject) domainproblem;
			domainproblem = (DomainProblem) eResolveProxy(oldDomainproblem);
			if (domainproblem != oldDomainproblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_PROJECT__DOMAINPROBLEM, oldDomainproblem, domainproblem));
			}
		}
		return domainproblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainProblem basicGetDomainproblem() {
		return domainproblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainproblem(DomainProblem newDomainproblem) {
		DomainProblem oldDomainproblem = domainproblem;
		domainproblem = newDomainproblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_PROJECT__DOMAINPROBLEM,
					oldDomainproblem, domainproblem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject) database;
			database = (Database) eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.ML_PROJECT__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.ML_PROJECT__DATABASE,
					oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.ML_PROJECT__NAME:
			return getName();
		case ProjetTemplatePackage.ML_PROJECT__DATE:
			return getDate();
		case ProjetTemplatePackage.ML_PROJECT__AUTHOR:
			return getAuthor();
		case ProjetTemplatePackage.ML_PROJECT__DATAANALYSISPROBLEM:
			if (resolve)
				return getDataanalysisproblem();
			return basicGetDataanalysisproblem();
		case ProjetTemplatePackage.ML_PROJECT__DOMAINPROBLEM:
			if (resolve)
				return getDomainproblem();
			return basicGetDomainproblem();
		case ProjetTemplatePackage.ML_PROJECT__DATABASE:
			if (resolve)
				return getDatabase();
			return basicGetDatabase();
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
		case ProjetTemplatePackage.ML_PROJECT__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DATE:
			setDate((String) newValue);
			return;
		case ProjetTemplatePackage.ML_PROJECT__AUTHOR:
			setAuthor((String) newValue);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DATAANALYSISPROBLEM:
			setDataanalysisproblem((DataAnalysisProblem) newValue);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DOMAINPROBLEM:
			setDomainproblem((DomainProblem) newValue);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DATABASE:
			setDatabase((Database) newValue);
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
		case ProjetTemplatePackage.ML_PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_PROJECT__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DATAANALYSISPROBLEM:
			setDataanalysisproblem((DataAnalysisProblem) null);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DOMAINPROBLEM:
			setDomainproblem((DomainProblem) null);
			return;
		case ProjetTemplatePackage.ML_PROJECT__DATABASE:
			setDatabase((Database) null);
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
		case ProjetTemplatePackage.ML_PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.ML_PROJECT__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case ProjetTemplatePackage.ML_PROJECT__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case ProjetTemplatePackage.ML_PROJECT__DATAANALYSISPROBLEM:
			return dataanalysisproblem != null;
		case ProjetTemplatePackage.ML_PROJECT__DOMAINPROBLEM:
			return domainproblem != null;
		case ProjetTemplatePackage.ML_PROJECT__DATABASE:
			return database != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", author: ");
		result.append(author);
		result.append(')');
		return result.toString();
	}

} //MLProjectImpl
