/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resultat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Resultat#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getResultat()
 * @model
 * @generated
 */
public interface Resultat extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.Term}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getResultat_Term()
	 * @model required="true"
	 * @generated
	 */
	EList<Term> getTerm();

} // Resultat
