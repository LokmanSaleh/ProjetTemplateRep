/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link projetTemplate.SelectionCriterionValue#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link projetTemplate.SelectionCriterion#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterion</em>' reference.
	 * @see #setSelectioncriterion(SelectionCriterion)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValue_Selectioncriterion()
	 * @see projetTemplate.SelectionCriterion#getSelectioncriterionvalue
	 * @model opposite="selectioncriterionvalue" required="true"
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

	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalueset</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriterionValueSet}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.SelectionCriterionValueSet#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalueset</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValue_Selectioncriterionvalueset()
	 * @see projetTemplate.SelectionCriterionValueSet#getSelectioncriterionvalue
	 * @model opposite="selectioncriterionvalue"
	 * @generated
	 */
	EList<SelectionCriterionValueSet> getSelectioncriterionvalueset();

} // SelectionCriterionValue
