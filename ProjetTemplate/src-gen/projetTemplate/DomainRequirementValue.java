/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Requirement Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DomainRequirementValue#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.DomainRequirementValue#getExplanation <em>Explanation</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue()
 * @model
 * @generated
 */
public interface DomainRequirementValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainRequirementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #setExplanation(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainRequirementValue_Explanation()
	 * @model
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainRequirementValue#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

} // DomainRequirementValue
