/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.RequirementType#getRequirementmapping <em>Requirementmapping</em>}</li>
 *   <li>{@link projetTemplate.RequirementType#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.RequirementType#getDescription <em>Description</em>}</li>
 *   <li>{@link projetTemplate.RequirementType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link projetTemplate.RequirementType#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getRequirementType()
 * @model
 * @generated
 */
public interface RequirementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirementmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirementmapping</em>' reference.
	 * @see #setRequirementmapping(RequirementMapping)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementType_Requirementmapping()
	 * @model required="true"
	 * @generated
	 */
	RequirementMapping getRequirementmapping();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementType#getRequirementmapping <em>Requirementmapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirementmapping</em>' reference.
	 * @see #getRequirementmapping()
	 * @generated
	 */
	void setRequirementmapping(RequirementMapping value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.RequirementTypeValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see projetTemplate.RequirementTypeValues
	 * @see #setValueType(RequirementTypeValues)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementType_ValueType()
	 * @model
	 * @generated
	 */
	RequirementTypeValues getValueType();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementType#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see projetTemplate.RequirementTypeValues
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(RequirementTypeValues value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementType_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

} // RequirementType
