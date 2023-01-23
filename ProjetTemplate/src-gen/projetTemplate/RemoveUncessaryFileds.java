/**
 */
package projetTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Uncessary Fileds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.RemoveUncessaryFileds#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getRemoveUncessaryFileds()
 * @model
 * @generated
 */
public interface RemoveUncessaryFileds extends DataCleaning {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.RemoveUncessaryFiledsEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see projetTemplate.RemoveUncessaryFiledsEnum
	 * @see #setMethod(RemoveUncessaryFiledsEnum)
	 * @see projetTemplate.ProjetTemplatePackage#getRemoveUncessaryFileds_Method()
	 * @model
	 * @generated
	 */
	RemoveUncessaryFiledsEnum getMethod();

	/**
	 * Sets the value of the '{@link projetTemplate.RemoveUncessaryFileds#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see projetTemplate.RemoveUncessaryFiledsEnum
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(RemoveUncessaryFiledsEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeSpecialCharacters();

} // RemoveUncessaryFileds
