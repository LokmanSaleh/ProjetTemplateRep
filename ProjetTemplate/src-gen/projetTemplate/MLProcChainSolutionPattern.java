/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Proc Chain Solution Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getProcessingchain <em>Processingchain</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getSelectedProcessingChainTemplateForTheMLAlgorithm <em>Selected Processing Chain Template For The ML Algorithm</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getCollecteddataknowledgeabouttemplateconstruction <em>Collecteddataknowledgeabouttemplateconstruction</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern()
 * @model
 * @generated
 */
public interface MLProcChainSolutionPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolutionPattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #setExplanation(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Explanation()
	 * @model
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolutionPattern#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DataPropertyValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalueset</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Datapropertyvalueset()
	 * @model required="true"
	 * @generated
	 */
	EList<DataPropertyValueSet> getDatapropertyvalueset();

	/**
	 * Returns the value of the '<em><b>Processingchain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingchain</em>' reference.
	 * @see #setProcessingchain(ProcessingChain)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Processingchain()
	 * @model required="true"
	 * @generated
	 */
	ProcessingChain getProcessingchain();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolutionPattern#getProcessingchain <em>Processingchain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingchain</em>' reference.
	 * @see #getProcessingchain()
	 * @generated
	 */
	void setProcessingchain(ProcessingChain value);

	/**
	 * Returns the value of the '<em><b>Dataanalysisproblemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #setDataanalysisproblemtype(DataAnalysisProblemType)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Dataanalysisproblemtype()
	 * @model
	 * @generated
	 */
	DataAnalysisProblemType getDataanalysisproblemtype();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 */
	void setDataanalysisproblemtype(DataAnalysisProblemType value);

	/**
	 * Returns the value of the '<em><b>Selected Processing Chain Template For The ML Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Processing Chain Template For The ML Algorithm</em>' reference.
	 * @see #setSelectedProcessingChainTemplateForTheMLAlgorithm(ProcessingChainTemplate)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_SelectedProcessingChainTemplateForTheMLAlgorithm()
	 * @model required="true"
	 * @generated
	 */
	ProcessingChainTemplate getSelectedProcessingChainTemplateForTheMLAlgorithm();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolutionPattern#getSelectedProcessingChainTemplateForTheMLAlgorithm <em>Selected Processing Chain Template For The ML Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Processing Chain Template For The ML Algorithm</em>' reference.
	 * @see #getSelectedProcessingChainTemplateForTheMLAlgorithm()
	 * @generated
	 */
	void setSelectedProcessingChainTemplateForTheMLAlgorithm(ProcessingChainTemplate value);

	/**
	 * Returns the value of the '<em><b>Collecteddataknowledgeabouttemplateconstruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collecteddataknowledgeabouttemplateconstruction</em>' reference.
	 * @see #setCollecteddataknowledgeabouttemplateconstruction(CollectedDataKnowledgeAboutTemplateConstruction)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Collecteddataknowledgeabouttemplateconstruction()
	 * @model
	 * @generated
	 */
	CollectedDataKnowledgeAboutTemplateConstruction getCollecteddataknowledgeabouttemplateconstruction();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolutionPattern#getCollecteddataknowledgeabouttemplateconstruction <em>Collecteddataknowledgeabouttemplateconstruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collecteddataknowledgeabouttemplateconstruction</em>' reference.
	 * @see #getCollecteddataknowledgeabouttemplateconstruction()
	 * @generated
	 */
	void setCollecteddataknowledgeabouttemplateconstruction(CollectedDataKnowledgeAboutTemplateConstruction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SelectMLAlgorithm();

} // MLProcChainSolutionPattern
