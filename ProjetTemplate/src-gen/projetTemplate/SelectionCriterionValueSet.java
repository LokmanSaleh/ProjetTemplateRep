/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Criterion Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.SelectionCriterionValueSet#getSetType <em>Set Type</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterionValueSet#getValues <em>Values</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterionValueSet#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterionValueSet#getSelectioncriterion <em>Selectioncriterion</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValueSet()
 * @model
 * @generated
 */
public interface SelectionCriterionValueSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Type</em>' attribute.
	 * @see #setSetType(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValueSet_SetType()
	 * @model
	 * @generated
	 */
	String getSetType();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterionValueSet#getSetType <em>Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Type</em>' attribute.
	 * @see #getSetType()
	 * @generated
	 */
	void setSetType(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValueSet_Values()
	 * @model
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterionValueSet#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalue</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriterionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValueSet_Selectioncriterionvalue()
	 * @model required="true"
	 * @generated
	 */
	EList<SelectionCriterionValue> getSelectioncriterionvalue();

	/**
	 * Returns the value of the '<em><b>Selectioncriterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterion</em>' reference.
	 * @see #setSelectioncriterion(SelectionCriterion)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterionValueSet_Selectioncriterion()
	 * @model required="true"
	 * @generated
	 */
	SelectionCriterion getSelectioncriterion();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterionValueSet#getSelectioncriterion <em>Selectioncriterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectioncriterion</em>' reference.
	 * @see #getSelectioncriterion()
	 * @generated
	 */
	void setSelectioncriterion(SelectionCriterion value);

} // SelectionCriterionValueSet
