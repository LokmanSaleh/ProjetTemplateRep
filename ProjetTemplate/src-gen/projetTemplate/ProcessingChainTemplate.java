/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Chain Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.ProcessingChainTemplate#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChainTemplate#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChainTemplate#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChainTemplate#getProcessingchain <em>Processingchain</em>}</li>
 *   <li>{@link projetTemplate.ProcessingChainTemplate#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getProcessingChainTemplate()
 * @model
 * @generated
 */
public interface ProcessingChainTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChainTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChainTemplate#getName <em>Name</em>}' attribute.
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
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChainTemplate_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChainTemplate#getAuthor <em>Author</em>}' attribute.
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
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChainTemplate_Extendedbpmnmodel()
	 * @model required="true"
	 * @generated
	 */
	ExtendedBPMNModel getExtendedbpmnmodel();

	/**
	 * Sets the value of the '{@link projetTemplate.ProcessingChainTemplate#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendedbpmnmodel</em>' reference.
	 * @see #getExtendedbpmnmodel()
	 * @generated
	 */
	void setExtendedbpmnmodel(ExtendedBPMNModel value);

	/**
	 * Returns the value of the '<em><b>Processingchain</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.ProcessingChain}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.ProcessingChain#getProcessingchaintemplate <em>Processingchaintemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingchain</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChainTemplate_Processingchain()
	 * @see projetTemplate.ProcessingChain#getProcessingchaintemplate
	 * @model opposite="processingchaintemplate"
	 * @generated
	 */
	EList<ProcessingChain> getProcessingchain();

	/**
	 * Returns the value of the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLProcChainSolutionPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlprocchainsolutionpattern</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getProcessingChainTemplate_Mlprocchainsolutionpattern()
	 * @model required="true"
	 * @generated
	 */
	EList<MLProcChainSolutionPattern> getMlprocchainsolutionpattern();

} // ProcessingChainTemplate
