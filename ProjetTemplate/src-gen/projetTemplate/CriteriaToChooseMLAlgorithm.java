/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criteria To Choose ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.CriteriaToChooseMLAlgorithm#getDomainrequirementselectioncriteria <em>Domainrequirementselectioncriteria</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getCriteriaToChooseMLAlgorithm()
 * @model
 * @generated
 */
public interface CriteriaToChooseMLAlgorithm extends EObject {

	/**
	 * Returns the value of the '<em><b>Domainrequirementselectioncriteria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainrequirementselectioncriteria</em>' reference.
	 * @see #setDomainrequirementselectioncriteria(DomainRequirementSelectionCriteria)
	 * @see projetTemplate.ProjetTemplatePackage#getCriteriaToChooseMLAlgorithm_Domainrequirementselectioncriteria()
	 * @model required="true"
	 * @generated
	 */
	DomainRequirementSelectionCriteria getDomainrequirementselectioncriteria();

	/**
	 * Sets the value of the '{@link projetTemplate.CriteriaToChooseMLAlgorithm#getDomainrequirementselectioncriteria <em>Domainrequirementselectioncriteria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domainrequirementselectioncriteria</em>' reference.
	 * @see #getDomainrequirementselectioncriteria()
	 * @generated
	 */
	void setDomainrequirementselectioncriteria(DomainRequirementSelectionCriteria value);
} // CriteriaToChooseMLAlgorithm
