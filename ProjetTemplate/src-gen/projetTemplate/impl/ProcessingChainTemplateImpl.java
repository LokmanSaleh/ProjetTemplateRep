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
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Chain Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.ProcessingChainTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainTemplateImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainTemplateImpl#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.impl.ProcessingChainTemplateImpl#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingChainTemplateImpl extends MinimalEObjectImpl.Container implements ProcessingChainTemplate {
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
	protected ProcessingChainTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.PROCESSING_CHAIN_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__NAME,
					oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__AUTHOR, oldAuthor, author));
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
							ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL, oldExtendedbpmnmodel,
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
					ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL, oldExtendedbpmnmodel,
					extendedbpmnmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLProcChainSolutionPattern> getMlprocchainsolutionpattern() {
		if (mlprocchainsolutionpattern == null) {
			mlprocchainsolutionpattern = new EObjectResolvingEList<MLProcChainSolutionPattern>(
					MLProcChainSolutionPattern.class, this,
					ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN);
		}
		return mlprocchainsolutionpattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__NAME:
			return getName();
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__AUTHOR:
			return getAuthor();
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL:
			if (resolve)
				return getExtendedbpmnmodel();
			return basicGetExtendedbpmnmodel();
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__NAME:
			setName((String) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__AUTHOR:
			setAuthor((String) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) newValue);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL:
			setExtendedbpmnmodel((ExtendedBPMNModel) null);
			return;
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN:
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
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL:
			return extendedbpmnmodel != null;
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN:
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

} //ProcessingChainTemplateImpl
