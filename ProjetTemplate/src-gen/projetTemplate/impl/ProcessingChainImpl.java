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

import projetTemplate.ExtendedBPMNModel;
import projetTemplate.MLAlgorithm;
import projetTemplate.ProcessingChain;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getDate <em>Date</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getMlalgorithm <em>Mlalgorithm</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingChainImpl extends MinimalEObjectImpl.Container implements ProcessingChain {
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
	 * The cached value of the '{@link #getExtendedbpmnmodel() <em>Extendedbpmnmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedbpmnmodel()
	 * @generated
	 * @ordered
	 */
	protected ExtendedBPMNModel extendedbpmnmodel;

	/**
	 * The cached value of the '{@link #getMlalgorithm() <em>Mlalgorithm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlalgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<MLAlgorithm> mlalgorithm;

	/**
	 * The cached value of the '{@link #getProcessingchaintemplate() <em>Processingchaintemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingchaintemplate()
	 * @generated
	 * @ordered
	 */
	protected ProcessingChainTemplate processingchaintemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.PROCESSING_CHAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.PROCESSING_CHAIN__DATE, oldDate,
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR,
					oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedBPMNModel getExtendedbpmnmodel() {
		if (extendedbpmnmodel != null && extendedbpmnmodel.eIsProxy()) {
			InternalEObject oldExtendedbpmnmodel = (InternalEObject) extendedbpmnmodel;
			extendedbpmnmodel = (ExtendedBPMNModel) eResolveProxy(oldExtendedbpmnmodel);
			if (extendedbpmnmodel != oldExtendedbpmnmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL, oldExtendedbpmnmodel,
							extendedbpmnmodel));
			}
		}
		return extendedbpmnmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedBPMNModel basicGetExtendedbpmnmodel() {
		return extendedbpmnmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedbpmnmodel(ExtendedBPMNModel newExtendedbpmnmodel) {
		ExtendedBPMNModel oldExtendedbpmnmodel = extendedbpmnmodel;
		extendedbpmnmodel = newExtendedbpmnmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL, oldExtendedbpmnmodel,
					extendedbpmnmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLAlgorithm> getMlalgorithm() {
		if (mlalgorithm == null) {
			mlalgorithm = new EObjectResolvingEList<MLAlgorithm>(MLAlgorithm.class, this,
					ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM);
		}
		return mlalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplate getProcessingchaintemplate() {
		if (processingchaintemplate != null && processingchaintemplate.eIsProxy()) {
			InternalEObject oldProcessingchaintemplate = (InternalEObject) processingchaintemplate;
			processingchaintemplate = (ProcessingChainTemplate) eResolveProxy(oldProcessingchaintemplate);
			if (processingchaintemplate != oldProcessingchaintemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ProjetTemplatePackage.PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE, oldProcessingchaintemplate,
							processingchaintemplate));
			}
		}
		return processingchaintemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplate basicGetProcessingchaintemplate() {
		return processingchaintemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingchaintemplate(ProcessingChainTemplate newProcessingchaintemplate) {
		ProcessingChainTemplate oldProcessingchaintemplate = processingchaintemplate;
		processingchaintemplate = newProcessingchaintemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE, oldProcessingchaintemplate,
					processingchaintemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.PROCESSING_CHAIN__DATE:
			return getDate();
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			return getAuthor();
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			if (resolve)
				return getExtendedbpmnmodel();
			return basicGetExtendedbpmnmodel();
		case ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM:
			return getMlalgorithm();
		case ProjetTemplatePackage.PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE:
			if (resolve)
				return getProcessingchaintemplate();
			return basicGetProcessingchaintemplate();
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
		case ProjetTemplatePackage.PROCESSING_CHAIN__DATE:
			setDate((String) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			setAuthor((String) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM:
			getMlalgorithm().clear();
			getMlalgorithm().addAll((Collection<? extends MLAlgorithm>) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE:
			setProcessingchaintemplate((ProcessingChainTemplate) newValue);
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
		case ProjetTemplatePackage.PROCESSING_CHAIN__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) null);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM:
			getMlalgorithm().clear();
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE:
			setProcessingchaintemplate((ProcessingChainTemplate) null);
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
		case ProjetTemplatePackage.PROCESSING_CHAIN__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			return extendedbpmnmodel != null;
		case ProjetTemplatePackage.PROCESSING_CHAIN__MLALGORITHM:
			return mlalgorithm != null && !mlalgorithm.isEmpty();
		case ProjetTemplatePackage.PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE:
			return processingchaintemplate != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", author: ");
		result.append(author);
		result.append(')');
		return result.toString();
	}

} //ProcessingChainImpl
