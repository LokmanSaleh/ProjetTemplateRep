/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DomainProblem#getText <em>Text</em>}</li>
 *   <li>{@link projetTemplate.DomainProblem#getDomainRequirementValue <em>Domain Requirement Value</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDomainProblem()
 * @model
 * @generated
 */
public interface DomainProblem extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDomainProblem_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link projetTemplate.DomainProblem#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Domain Requirement Value</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DomainRequirementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Requirement Value</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDomainProblem_DomainRequirementValue()
	 * @model
	 * @generated
	 */
	EList<DomainRequirementValue> getDomainRequirementValue();

} // DomainProblem
