/**
 */
package projetTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.connector#getConneteur <em>Conneteur</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getconnector()
 * @model
 * @generated
 */
public interface connector extends Term {
	/**
	 * Returns the value of the '<em><b>Conneteur</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.EnumConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conneteur</em>' attribute.
	 * @see projetTemplate.EnumConnector
	 * @see #setConneteur(EnumConnector)
	 * @see projetTemplate.ProjetTemplatePackage#getconnector_Conneteur()
	 * @model
	 * @generated
	 */
	EnumConnector getConneteur();

	/**
	 * Sets the value of the '{@link projetTemplate.connector#getConneteur <em>Conneteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conneteur</em>' attribute.
	 * @see projetTemplate.EnumConnector
	 * @see #getConneteur()
	 * @generated
	 */
	void setConneteur(EnumConnector value);

} // connector
