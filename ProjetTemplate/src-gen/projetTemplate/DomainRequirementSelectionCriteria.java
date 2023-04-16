/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Requirement Selection Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DomainRequirementSelectionCriteria#getCriteriaName <em>Criteria Name</em>}</li>
 *   <li>{@link projetTemplate.DomainRequirementSelectionCriteria#getCriteriaValue <em>Criteria Value</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementSelectionCriteria()
 * @model
 * @generated
 */
public interface DomainRequirementSelectionCriteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Name</em>' attribute.
	 * @see #setCriteriaName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementSelectionCriteria_CriteriaName()
	 * @model
	 * @generated
	 */
	String getCriteriaName();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainRequirementSelectionCriteria#getCriteriaName <em>Criteria Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Name</em>' attribute.
	 * @see #getCriteriaName()
	 * @generated
	 */
	void setCriteriaName(String value);

	/**
	 * Returns the value of the '<em><b>Criteria Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Value</em>' attribute.
	 * @see #setCriteriaValue(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementSelectionCriteria_CriteriaValue()
	 * @model
	 * @generated
	 */
	String getCriteriaValue();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainRequirementSelectionCriteria#getCriteriaValue <em>Criteria Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Value</em>' attribute.
	 * @see #getCriteriaValue()
	 * @generated
	 */
	void setCriteriaValue(String value);

} // DomainRequirementSelectionCriteria
