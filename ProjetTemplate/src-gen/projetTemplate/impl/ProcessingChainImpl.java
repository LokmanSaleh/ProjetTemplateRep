/**
 */
package projetTemplate.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import projetTemplate.ExtendedBPMNModel;
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
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainImpl#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingChainImpl extends MinimalEObjectImpl.Container implements ProcessingChain {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.PROCESSING_CHAIN__NAME, oldName,
					name));
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
	public void SelectTheRightMLAlgroithm() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.PROCESSING_CHAIN__NAME:
			return getName();
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			return getAuthor();
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			if (resolve)
				return getExtendedbpmnmodel();
			return basicGetExtendedbpmnmodel();
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
		case ProjetTemplatePackage.PROCESSING_CHAIN__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			setAuthor((String) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) newValue);
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
		case ProjetTemplatePackage.PROCESSING_CHAIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) null);
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
		case ProjetTemplatePackage.PROCESSING_CHAIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.PROCESSING_CHAIN__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case ProjetTemplatePackage.PROCESSING_CHAIN__EXTENDEDBPMNMODEL:
			return extendedbpmnmodel != null;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ProjetTemplatePackage.PROCESSING_CHAIN___SELECT_THE_RIGHT_ML_ALGROITHM:
			SelectTheRightMLAlgroithm();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", author: ");
		result.append(author);
		result.append(')');
		return result.toString();
	}

} //ProcessingChainImpl
