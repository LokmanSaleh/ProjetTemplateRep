/**
 */
package projetTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DomainRequirementValue#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.DomainRequirementValue#getX_requirementtype <em>Xrequirementtype</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue()
 * @model
 * @generated
 */
public interface DomainRequirementValue extends SelectionCriteria {
	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #setExplanation(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue_Explanation()
	 * @model
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainRequirementValue#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Xrequirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xrequirementtype</em>' reference.
	 * @see #setX_requirementtype(RequirementType)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue_X_requirementtype()
	 * @model required="true"
	 * @generated
	 */
	RequirementType getX_requirementtype();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainRequirementValue#getX_requirementtype <em>Xrequirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xrequirementtype</em>' reference.
	 * @see #getX_requirementtype()
	 * @generated
	 */
	void setX_requirementtype(RequirementType value);

} // DomainRequirementValue
