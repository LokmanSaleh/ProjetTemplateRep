/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link projetTemplate.DomainRequirementValue#getRequirementtype <em>Requirementtype</em>}</li>
 *   <li>{@link projetTemplate.DomainRequirementValue#getDomainrequirementselectioncriteria <em>Domainrequirementselectioncriteria</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue()
 * @model
 * @generated
 */
public interface DomainRequirementValue extends EObject {
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
	 * Returns the value of the '<em><b>Requirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirementtype</em>' reference.
	 * @see #setRequirementtype(RequirementType)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue_Requirementtype()
	 * @model required="true"
	 * @generated
	 */
	RequirementType getRequirementtype();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainRequirementValue#getRequirementtype <em>Requirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirementtype</em>' reference.
	 * @see #getRequirementtype()
	 * @generated
	 */
	void setRequirementtype(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Domainrequirementselectioncriteria</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainrequirementselectioncriteria</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue_Domainrequirementselectioncriteria()
	 * @model required="true"
	 * @generated
	 */
	EList<SelectionCriteria> getDomainrequirementselectioncriteria();

} // DomainRequirementValue
