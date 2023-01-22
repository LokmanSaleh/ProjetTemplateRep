/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Rule#getCondition <em>Condition</em>}</li>
 *   <li>{@link projetTemplate.Rule#getResultat <em>Resultat</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see projetTemplate.ProjetTemplatePackage#getRule_Condition()
	 * @model required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link projetTemplate.Rule#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Resultat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultat</em>' reference.
	 * @see #setResultat(Resultat)
	 * @see projetTemplate.ProjetTemplatePackage#getRule_Resultat()
	 * @model required="true"
	 * @generated
	 */
	Resultat getResultat();

	/**
	 * Sets the value of the '{@link projetTemplate.Rule#getResultat <em>Resultat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultat</em>' reference.
	 * @see #getResultat()
	 * @generated
	 */
	void setResultat(Resultat value);

} // Rule
