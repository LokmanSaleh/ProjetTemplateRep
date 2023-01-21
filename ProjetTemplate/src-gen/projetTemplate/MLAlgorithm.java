/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLAlgorithm#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm()
 * @model
 * @generated
 */
public interface MLAlgorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalueset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalueset</em>' reference.
	 * @see #setSelectioncriterionvalueset(SelectionCriterionValueSet)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Selectioncriterionvalueset()
	 * @model
	 * @generated
	 */
	SelectionCriterionValueSet getSelectioncriterionvalueset();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectioncriterionvalueset</em>' reference.
	 * @see #getSelectioncriterionvalueset()
	 * @generated
	 */
	void setSelectioncriterionvalueset(SelectionCriterionValueSet value);

	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalue</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriterionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Selectioncriterionvalue()
	 * @model
	 * @generated
	 */
	EList<SelectionCriterionValue> getSelectioncriterionvalue();

} // MLAlgorithm
