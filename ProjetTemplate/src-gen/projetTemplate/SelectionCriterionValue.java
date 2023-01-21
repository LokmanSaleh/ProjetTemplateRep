/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Criterion Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.SelectionCriterionValue#getValues <em>Values</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterionValue#getSelectioncriterion <em>Selectioncriterion</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValue()
 * @model
 * @generated
 */
public interface SelectionCriterionValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValue_Values()
	 * @model
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterionValue#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

	/**
	 * Returns the value of the '<em><b>Selectioncriterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterion</em>' reference.
	 * @see #setSelectioncriterion(SelectionCriterion)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValue_Selectioncriterion()
	 * @model required="true"
	 * @generated
	 */
	SelectionCriterion getSelectioncriterion();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterionValue#getSelectioncriterion <em>Selectioncriterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectioncriterion</em>' reference.
	 * @see #getSelectioncriterion()
	 * @generated
	 */
	void setSelectioncriterion(SelectionCriterion value);

} // SelectionCriterionValue
