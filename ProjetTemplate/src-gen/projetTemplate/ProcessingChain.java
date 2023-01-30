/**
 */
package projetTemplate;

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
 *   <li>{@link projetTemplate.ProcessingChain#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChain#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChain#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChain#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain()
 * @model
 * @generated
 */
public interface ProcessingChain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Extendedbpmnmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extendedbpmnmodel</em>' reference.
	 * @see #setExtendedbpmnmodel(ExtendedBPMNModel)
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Extendedbpmnmodel()
	 * @model required="true"
	 * @generated
	 */
	ExtendedBPMNModel getExtendedbpmnmodel();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChain#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendedbpmnmodel</em>' reference.
	 * @see #getExtendedbpmnmodel()
	 * @generated
	 */
	void setExtendedbpmnmodel(ExtendedBPMNModel value);

	/**
	 * Returns the value of the '<em><b>Processingchaintemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingchaintemplate</em>' reference.
	 * @see #setProcessingchaintemplate(ProcessingChainTemplate)
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Processingchaintemplate()
	 * @model
	 * @generated
	 */
	ProcessingChainTemplate getProcessingchaintemplate();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChain#getProcessingchaintemplate <em>Processingchaintemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingchaintemplate</em>' reference.
	 * @see #getProcessingchaintemplate()
	 * @generated
	 */
	void setProcessingchaintemplate(ProcessingChainTemplate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SelectTheRightMLAlgroithm();

} // ProcessingChain
