/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computational Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.ComputationalRequirementValue#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.ComputationalRequirementValue#getRationale <em>Rationale</em>}</li>
 *   <li>{@link projetTemplate.ComputationalRequirementValue#getRequirementtype <em>Requirementtype</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getComputationalRequirementValue()
 * @model
 * @generated
 */
public interface ComputationalRequirementValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see projetTemplate.ProjetTemplatePackage#getComputationalRequirementValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link projetTemplate.ComputationalRequirementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see projetTemplate.ProjetTemplatePackage#getComputationalRequirementValue_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link projetTemplate.ComputationalRequirementValue#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Requirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirementtype</em>' reference.
	 * @see #setRequirementtype(RequirementType)
	 * @see projetTemplate.ProjetTemplatePackage#getComputationalRequirementValue_Requirementtype()
	 * @model
	 * @generated
	 */
	RequirementType getRequirementtype();

	/**
	 * Sets the value of the '{@link projetTemplate.ComputationalRequirementValue#getRequirementtype <em>Requirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirementtype</em>' reference.
	 * @see #getRequirementtype()
	 * @generated
	 */
	void setRequirementtype(RequirementType value);

} // ComputationalRequirementValue
