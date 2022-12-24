/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Analysis Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DataAnalysisProblem#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.DataAnalysisProblem#getDate <em>Date</em>}</li>
 *   <li>{@link projetTemplate.DataAnalysisProblem#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.DataAnalysisProblem#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.DataAnalysisProblem#getComputationalrequirementvalue <em>Computationalrequirementvalue</em>}</li>
 *   <li>{@link projetTemplate.DataAnalysisProblem#getProcessingchain <em>Processingchain</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblem()
 * @model
 * @generated
 */
public interface DataAnalysisProblem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.DataAnalysisProblem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblem_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link projetTemplate.DataAnalysisProblem#getDate <em>Date</em>}' attribute.
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
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblem_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link projetTemplate.DataAnalysisProblem#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Dataanalysisproblemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #setDataanalysisproblemtype(DataAnalysisProblemType)
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblem_Dataanalysisproblemtype()
	 * @model required="true"
	 * @generated
	 */
	DataAnalysisProblemType getDataanalysisproblemtype();

	/**
	 * Sets the value of the '{@link projetTemplate.DataAnalysisProblem#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 */
	void setDataanalysisproblemtype(DataAnalysisProblemType value);

	/**
	 * Returns the value of the '<em><b>Computationalrequirementvalue</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.ComputationalRequirementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computationalrequirementvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblem_Computationalrequirementvalue()
	 * @model
	 * @generated
	 */
	EList<ComputationalRequirementValue> getComputationalrequirementvalue();

	/**
	 * Returns the value of the '<em><b>Processingchain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingchain</em>' reference.
	 * @see #setProcessingchain(ProcessingChain)
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblem_Processingchain()
	 * @model required="true"
	 * @generated
	 */
	ProcessingChain getProcessingchain();

	/**
	 * Sets the value of the '{@link projetTemplate.DataAnalysisProblem#getProcessingchain <em>Processingchain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingchain</em>' reference.
	 * @see #getProcessingchain()
	 * @generated
	 */
	void setProcessingchain(ProcessingChain value);

} // DataAnalysisProblem
