/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.ProcessingChain#getDate <em>Date</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChain#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChain#getMlalgorithm <em>Mlalgorithm</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain()
 * @model
 * @generated
 */
public interface ProcessingChain extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChain#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChain#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Mlalgorithm</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlalgorithm</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Mlalgorithm()
	 * @model required="true"
	 * @generated
	 */
	EList<MLAlgorithm> getMlalgorithm();

} // ProcessingChain
