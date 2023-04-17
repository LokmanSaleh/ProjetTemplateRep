/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Algorithm Selection Criteria Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getDomainrequirementselectioncriteria <em>Domainrequirementselectioncriteria</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getRegle <em>Regle</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSelectionCriteriaContainer()
 * @model
 * @generated
 */
public interface MLAlgorithmSelectionCriteriaContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Domainrequirementselectioncriteria</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainrequirementselectioncriteria</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSelectionCriteriaContainer_Domainrequirementselectioncriteria()
	 * @model required="true"
	 * @generated
	 */
	EList<SelectionCriteria> getDomainrequirementselectioncriteria();

	/**
	 * Returns the value of the '<em><b>Regle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regle</em>' attribute.
	 * @see #setRegle(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSelectionCriteriaContainer_Regle()
	 * @model
	 * @generated
	 */
	String getRegle();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getRegle <em>Regle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regle</em>' attribute.
	 * @see #getRegle()
	 * @generated
	 */
	void setRegle(String value);

} // MLAlgorithmSelectionCriteriaContainer
