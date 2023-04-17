/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.SelectionCriteria#getCriteriaName <em>Criteria Name</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriteria#getCriteriaValue <em>Criteria Value</em>}</li>
 *   <li>{@link projetTemplate.SelectionCriteria#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriteria()
 * @model
 * @generated
 */
public interface SelectionCriteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Name</em>' attribute.
	 * @see #setCriteriaName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriteria_CriteriaName()
	 * @model
	 * @generated
	 */
	String getCriteriaName();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriteria#getCriteriaName <em>Criteria Name</em>}' attribute.
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
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriteria_CriteriaValue()
	 * @model
	 * @generated
	 */
	String getCriteriaValue();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriteria#getCriteriaValue <em>Criteria Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria Value</em>' attribute.
	 * @see #getCriteriaValue()
	 * @generated
	 */
	void setCriteriaValue(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSelectionCriteria_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link projetTemplate.SelectionCriteria#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SelectionCriteria
