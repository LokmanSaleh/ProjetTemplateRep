/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getProcessingchaintemplate <em>Processingchaintemplate</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm()
 * @model
 * @generated
 */
public interface MLAlgorithm extends Component {
	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalueset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalueset</em>' reference.
	 * @see #setSelectioncriterionvalueset(SelectionCriterionValueSet)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Selectioncriterionvalueset()
	 * @model
	 * @generated
	 */
	SelectionCriterionValueSet getSelectioncriterionvalueset();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectioncriterionvalueset</em>' reference.
	 * @see #getSelectioncriterionvalueset()
	 * @generated
	 */
	void setSelectioncriterionvalueset(SelectionCriterionValueSet value);

	/**
	 * Returns the value of the '<em><b>Selectioncriterionvalue</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriterionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectioncriterionvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Selectioncriterionvalue()
	 * @model
	 * @generated
	 */
	EList<SelectionCriterionValue> getSelectioncriterionvalue();

	/**
	 * Returns the value of the '<em><b>Processingchaintemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingchaintemplate</em>' reference.
	 * @see #setProcessingchaintemplate(ProcessingChainTemplate)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Processingchaintemplate()
	 * @model required="true"
	 * @generated
	 */
	ProcessingChainTemplate getProcessingchaintemplate();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getProcessingchaintemplate <em>Processingchaintemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingchaintemplate</em>' reference.
	 * @see #getProcessingchaintemplate()
	 * @generated
	 */
	void setProcessingchaintemplate(ProcessingChainTemplate value);

} // MLAlgorithm
