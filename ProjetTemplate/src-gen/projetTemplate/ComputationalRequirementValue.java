/**
 */
package projetTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computational Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.ComputationalRequirementValue#getFormule <em>Formule</em>}</li>
 *   <li>{@link projetTemplate.ComputationalRequirementValue#getX_requirementtype <em>Xrequirementtype</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getComputationalRequirementValue()
 * @model
 * @generated
 */
public interface ComputationalRequirementValue extends SelectionCriteria {
	/**
	 * Returns the value of the '<em><b>Formule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formule</em>' attribute.
	 * @see #setFormule(String)
	 * @see projetTemplate.ProjetTemplatePackage#getComputationalRequirementValue_Formule()
	 * @model
	 * @generated
	 */
	String getFormule();

	/**
	 * Sets the value of the '{@link projetTemplate.ComputationalRequirementValue#getFormule <em>Formule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formule</em>' attribute.
	 * @see #getFormule()
	 * @generated
	 */
	void setFormule(String value);

	/**
	 * Returns the value of the '<em><b>Xrequirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xrequirementtype</em>' reference.
	 * @see #setX_requirementtype(RequirementType)
	 * @see projetTemplate.ProjetTemplatePackage#getComputationalRequirementValue_X_requirementtype()
	 * @model
	 * @generated
	 */
	RequirementType getX_requirementtype();

	/**
	 * Sets the value of the '{@link projetTemplate.ComputationalRequirementValue#getX_requirementtype <em>Xrequirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xrequirementtype</em>' reference.
	 * @see #getX_requirementtype()
	 * @generated
	 */
	void setX_requirementtype(RequirementType value);

} // ComputationalRequirementValue
