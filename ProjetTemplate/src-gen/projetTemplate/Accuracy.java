/**
 */
package projetTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accuracy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Accuracy#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getAccuracy()
 * @model
 * @generated
 */
public interface Accuracy extends DomainRequirementValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.Values2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see projetTemplate.Values2
	 * @see #setValue(Values2)
	 * @see projetTemplate.ProjetTemplatePackage#getAccuracy_Value()
	 * @model
	 * @generated
	 */
	Values2 getValue();

	/**
	 * Sets the value of the '{@link projetTemplate.Accuracy#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see projetTemplate.Values2
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Values2 value);

} // Accuracy
