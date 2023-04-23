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
 *   <li>{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getSelectionCriteria <em>Selection Criteria</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getRegle <em>Regle</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getComponenet <em>Componenet</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSelectionCriteriaContainer()
 * @model
 * @generated
 */
public interface MLAlgorithmSelectionCriteriaContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Selection Criteria</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Criteria</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSelectionCriteriaContainer_SelectionCriteria()
	 * @model required="true"
	 * @generated
	 */
	EList<SelectionCriteria> getSelectionCriteria();

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

	/**
	 * Returns the value of the '<em><b>Componenet</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.Componenets}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componenet</em>' attribute.
	 * @see projetTemplate.Componenets
	 * @see #setComponenet(Componenets)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSelectionCriteriaContainer_Componenet()
	 * @model
	 * @generated
	 */
	Componenets getComponenet();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getComponenet <em>Componenet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Componenet</em>' attribute.
	 * @see projetTemplate.Componenets
	 * @see #getComponenet()
	 * @generated
	 */
	void setComponenet(Componenets value);

} // MLAlgorithmSelectionCriteriaContainer
