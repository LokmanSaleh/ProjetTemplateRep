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
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getMlalgorithm <em>Mlalgorithm</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithmSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
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
	 * Returns the value of the '<em><b>Mlalgorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlalgorithm</em>' reference.
	 * @see #setMlalgorithm(MLAlgorithm)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Mlalgorithm()
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DataPropertyValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalueset</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithmSolutionPattern_Datapropertyvalueset()
	 * @model required="true"
	 * @generated
	 */
	EList<DataPropertyValueSet> getDatapropertyvalueset();

} // MLAlgorithmSolutionPattern
