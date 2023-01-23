/**
 */
package projetTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noise Treatement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.NoiseTreatement#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getNoiseTreatement()
 * @model
 * @generated
 */
public interface NoiseTreatement extends DataPretraitement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.NoiseTreatementEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see projetTemplate.NoiseTreatementEnum
	 * @see #setMethod(NoiseTreatementEnum)
	 * @see projetTemplate.ProjetTemplatePackage#getNoiseTreatement_Method()
	 * @model
	 * @generated
	 */
	NoiseTreatementEnum getMethod();

	/**
	 * Sets the value of the '{@link projetTemplate.NoiseTreatement#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see projetTemplate.NoiseTreatementEnum
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NoiseTreatementEnum value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeNoiseFromFileds();

} // NoiseTreatement
