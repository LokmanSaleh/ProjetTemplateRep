/**
 */
package projetTemplate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetTemplate.ComputationalRequirementValue;
import projetTemplate.DataAnalysisProblem;
import projetTemplate.DataAnalysisProblemType;
import projetTemplate.ProcessingChain;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Analysis Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemImpl#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemImpl#getComputationalrequirementvalue <em>Computationalrequirementvalue</em>}</li>
 *   <li>{@link projetTemplate.impl.DataAnalysisProblemImpl#getProcessingchain <em>Processingchain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAnalysisProblemImpl extends MinimalEObjectImpl.Container implements DataAnalysisProblem {
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
	 * The cached value of the '{@link #getDataanalysisproblemtype() <em>Dataanalysisproblemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 * @ordered
	 */
	protected DataAnalysisProblemType dataanalysisproblemtype;

	/**
	 * The cached value of the '{@link #getComputationalrequirementvalue() <em>Computationalrequirementvalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationalrequirementvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputationalRequirementValue> computationalrequirementvalue;

	/**
	 * The cached value of the '{@link #getProcessingchain() <em>Processingchain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingchain()
	 * @generated
	 * @ordered
	 */
	protected ProcessingChain processingchain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAnalysisProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.DATA_ANALYSIS_PROBLEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__NAME,
					oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATE,
					oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__AUTHOR,
					oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblemType getDataanalysisproblemtype() {
		if (dataanalysisproblemtype != null && dataanalysisproblemtype.eIsProxy()) {
			InternalEObject oldDataanalysisproblemtype = (InternalEObject) dataanalysisproblemtype;
			dataanalysisproblemtype = (DataAnalysisProblemType) eResolveProxy(oldDataanalysisproblemtype);
			if (dataanalysisproblemtype != oldDataanalysisproblemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE,
							oldDataanalysisproblemtype, dataanalysisproblemtype));
			}
		}
		return dataanalysisproblemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblemType basicGetDataanalysisproblemtype() {
		return dataanalysisproblemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataanalysisproblemtype(DataAnalysisProblemType newDataanalysisproblemtype) {
		DataAnalysisProblemType oldDataanalysisproblemtype = dataanalysisproblemtype;
		dataanalysisproblemtype = newDataanalysisproblemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE, oldDataanalysisproblemtype,
					dataanalysisproblemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputationalRequirementValue> getComputationalrequirementvalue() {
		if (computationalrequirementvalue == null) {
			computationalrequirementvalue = new EObjectResolvingEList<ComputationalRequirementValue>(
					ComputationalRequirementValue.class, this,
					ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE);
		}
		return computationalrequirementvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChain getProcessingchain() {
		if (processingchain != null && processingchain.eIsProxy()) {
			InternalEObject oldProcessingchain = (InternalEObject) processingchain;
			processingchain = (ProcessingChain) eResolveProxy(oldProcessingchain);
			if (processingchain != oldProcessingchain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN, oldProcessingchain,
							processingchain));
			}
		}
		return processingchain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChain basicGetProcessingchain() {
		return processingchain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingchain(ProcessingChain newProcessingchain) {
		ProcessingChain oldProcessingchain = processingchain;
		processingchain = newProcessingchain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN, oldProcessingchain, processingchain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__NAME:
			return getName();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATE:
			return getDate();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__AUTHOR:
			return getAuthor();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE:
			if (resolve)
				return getDataanalysisproblemtype();
			return basicGetDataanalysisproblemtype();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE:
			return getComputationalrequirementvalue();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN:
			if (resolve)
				return getProcessingchain();
			return basicGetProcessingchain();
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATE:
			setDate((String) newValue);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__AUTHOR:
			setAuthor((String) newValue);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) newValue);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE:
			getComputationalrequirementvalue().clear();
			getComputationalrequirementvalue().addAll((Collection<? extends ComputationalRequirementValue>) newValue);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN:
			setProcessingchain((ProcessingChain) newValue);
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE:
			setDataanalysisproblemtype((DataAnalysisProblemType) null);
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE:
			getComputationalrequirementvalue().clear();
			return;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN:
			setProcessingchain((ProcessingChain) null);
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
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE:
			return dataanalysisproblemtype != null;
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE:
			return computationalrequirementvalue != null && !computationalrequirementvalue.isEmpty();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN:
			return processingchain != null;
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

} //DataAnalysisProblemImpl
