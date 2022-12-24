/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Algorithm Solution Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getMlalgorithm <em>Mlalgorithm</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern()
 * @model
 * @generated
 */
public interface MLAlgorithmSolutionPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithmSolutionPattern#getName <em>Name</em>}' attribute.
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
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Explanation()
	 * @model
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithmSolutionPattern#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

	/**
	 * Returns the value of the '<em><b>Processingchaintemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingchaintemplate</em>' reference.
	 * @see #setProcessingchaintemplate(ProcessingChainTemplate)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Processingchaintemplate()
	 * @model required="true"
	 * @generated
	 */
	ProcessingChainTemplate getProcessingchaintemplate();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithmSolutionPattern#getProcessingchaintemplate <em>Processingchaintemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingchaintemplate</em>' reference.
	 * @see #getProcessingchaintemplate()
	 * @generated
	 */
	void setProcessingchaintemplate(ProcessingChainTemplate value);

	/**
	 * Returns the value of the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DataPropertyValueSet}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.DataPropertyValueSet#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalueset</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Datapropertyvalueset()
	 * @see projetTemplate.DataPropertyValueSet#getMlalgorithmsolutionpattern
	 * @model opposite="mlalgorithmsolutionpattern" required="true"
	 * @generated
	 */
	EList<DataPropertyValueSet> getDatapropertyvalueset();

	/**
	 * Returns the value of the '<em><b>Dataanalysisproblemtype</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projetTemplate.DataAnalysisProblemType#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #setDataanalysisproblemtype(DataAnalysisProblemType)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Dataanalysisproblemtype()
	 * @see projetTemplate.DataAnalysisProblemType#getMlalgorithmsolutionpattern
	 * @model opposite="mlalgorithmsolutionpattern" required="true"
	 * @generated
	 */
	DataAnalysisProblemType getDataanalysisproblemtype();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithmSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 */
	void setDataanalysisproblemtype(DataAnalysisProblemType value);

	/**
	 * Returns the value of the '<em><b>Mlalgorithm</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projetTemplate.MLAlgorithm#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlalgorithm</em>' reference.
	 * @see #setMlalgorithm(MLAlgorithm)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Mlalgorithm()
	 * @see projetTemplate.MLAlgorithm#getMlalgorithmsolutionpattern
	 * @model opposite="mlalgorithmsolutionpattern" required="true"
	 * @generated
	 */
	MLAlgorithm getMlalgorithm();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithmSolutionPattern#getMlalgorithm <em>Mlalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mlalgorithm</em>' reference.
	 * @see #getMlalgorithm()
	 * @generated
	 */
	void setMlalgorithm(MLAlgorithm value);

} // MLAlgorithmSolutionPattern
