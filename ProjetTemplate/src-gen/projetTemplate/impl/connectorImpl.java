/**
 */
package projetTemplate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import projetTemplate.EnumConnector;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.connectorImpl#getConneteur <em>Conneteur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class connectorImpl extends TermImpl implements connector {
	/**
	 * The default value of the '{@link #getConneteur() <em>Conneteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConneteur()
	 * @generated
	 * @ordered
	 */
	protected static final EnumConnector CONNETEUR_EDEFAULT = EnumConnector.OR;

	/**
	 * The cached value of the '{@link #getConneteur() <em>Conneteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConneteur()
	 * @generated
	 * @ordered
	 */
	protected EnumConnector conneteur = CONNETEUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected connectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConnector getConneteur() {
		return conneteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConneteur(EnumConnector newConneteur) {
		EnumConnector oldConneteur = conneteur;
		conneteur = newConneteur == null ? CONNETEUR_EDEFAULT : newConneteur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetTemplatePackage.CONNECTOR__CONNETEUR,
					oldConneteur, conneteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.CONNECTOR__CONNETEUR:
			return getConneteur();
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
		case ProjetTemplatePackage.CONNECTOR__CONNETEUR:
			setConneteur((EnumConnector) newValue);
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
		case ProjetTemplatePackage.CONNECTOR__CONNETEUR:
			setConneteur(CONNETEUR_EDEFAULT);
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
		case ProjetTemplatePackage.CONNECTOR__CONNETEUR:
			return conneteur != CONNETEUR_EDEFAULT;
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
		result.append(" (conneteur: ");
		result.append(conneteur);
		result.append(')');
		return result.toString();
	}

} //connectorImpl
