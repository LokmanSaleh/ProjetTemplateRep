/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Groupe Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.GroupeCriteria#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.GroupeCriteria#getCriteriavalues <em>Criteriavalues</em>}</li>
 *   <li>{@link projetTemplate.GroupeCriteria#getSelectedcriteriavalues <em>Selectedcriteriavalues</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getGroupeCriteria()
 * @model
 * @generated
 */
public interface GroupeCriteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getGroupeCriteria_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.GroupeCriteria#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Criteriavalues</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.CriteriaValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteriavalues</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getGroupeCriteria_Criteriavalues()
	 * @model required="true"
	 * @generated
	 */
	EList<CriteriaValues> getCriteriavalues();

	/**
	 * Returns the value of the '<em><b>Selectedcriteriavalues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectedcriteriavalues</em>' reference.
	 * @see #setSelectedcriteriavalues(CriteriaValues)
	 * @see projetTemplate.ProjetTemplatePackage#getGroupeCriteria_Selectedcriteriavalues()
	 * @model
	 * @generated
	 */
	CriteriaValues getSelectedcriteriavalues();

	/**
	 * Sets the value of the '{@link projetTemplate.GroupeCriteria#getSelectedcriteriavalues <em>Selectedcriteriavalues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectedcriteriavalues</em>' reference.
	 * @see #getSelectedcriteriavalues()
	 * @generated
	 */
	void setSelectedcriteriavalues(CriteriaValues value);

} // GroupeCriteria
