/**
 */
package projetTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Conversion#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getConversion()
 * @model
 * @generated
 */
public interface Conversion extends DataPretraitement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.ConversionEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see projetTemplate.ConversionEnum
	 * @see #setMethod(ConversionEnum)
	 * @see projetTemplate.ProjetTemplatePackage#getConversion_Method()
	 * @model
	 * @generated
	 */
	ConversionEnum getMethod();

	/**
	 * Sets the value of the '{@link projetTemplate.Conversion#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see projetTemplate.ConversionEnum
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(ConversionEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void convertCategoricalAttributesToContinue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void convertContinueAttributesToCategorical();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void detectAttributeType();

} // Conversion
