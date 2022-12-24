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
 *   <li>{@link projetTemplate.ProcessingChain#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChain#getMlalgorithm <em>Mlalgorithm</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChain#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
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
	 * Returns the value of the '<em><b>Mlalgorithm</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLAlgorithm}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.MLAlgorithm#getProcessingchain <em>Processingchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlalgorithm</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Mlalgorithm()
	 * @see projetTemplate.MLAlgorithm#getProcessingchain
	 * @model opposite="processingchain" required="true"
	 * @generated
	 */
	EList<MLAlgorithm> getMlalgorithm();

	/**
	 * Returns the value of the '<em><b>Processingchaintemplate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projetTemplate.ProcessingChainTemplate#getProcessingchain <em>Processingchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingchaintemplate</em>' reference.
	 * @see #setProcessingchaintemplate(ProcessingChainTemplate)
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChain_Processingchaintemplate()
	 * @see projetTemplate.ProcessingChainTemplate#getProcessingchain
	 * @model opposite="processingchain"
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

} // ProcessingChain
