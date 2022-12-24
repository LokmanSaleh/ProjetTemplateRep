/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.SelectionCriterion#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterion#getValueType <em>Value Type</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterion#getDescription <em>Description</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterion#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriterion#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterion()
 * @model
 * @generated
 */
public interface SelectionCriterion extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterion_ValueType()
	 * @model
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterion#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriterion#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalueset</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriterionValueSet}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.SelectionCriterionValueSet#getSelectioncriterion <em>Selectioncriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalueset</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterion_Selectioncriterionvalueset()
	 * @see projetTemplate.SelectionCriterionValueSet#getSelectioncriterion
	 * @model opposite="selectioncriterion"
	 * @generated
	 */
	EList<SelectionCriterionValueSet> getSelectioncriterionvalueset();

	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalue</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriterionValue}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.SelectionCriterionValue#getSelectioncriterion <em>Selectioncriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriterion_Selectioncriterionvalue()
	 * @see projetTemplate.SelectionCriterionValue#getSelectioncriterion
	 * @model opposite="selectioncriterion"
	 * @generated
	 */
	EList<SelectionCriterionValue> getSelectioncriterionvalue();

} // SelectionCriterion
