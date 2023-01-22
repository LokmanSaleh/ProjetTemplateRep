/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Analysis Problem Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DataAnalysisProblemType#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.DataAnalysisProblemType#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblemType()
 * @model
 * @generated
 */
public interface DataAnalysisProblemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.EnumDataAnalysisProblemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see projetTemplate.EnumDataAnalysisProblemType
	 * @see #setName(EnumDataAnalysisProblemType)
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblemType_Name()
	 * @model
	 * @generated
	 */
	EnumDataAnalysisProblemType getName();

	/**
	 * Sets the value of the '{@link projetTemplate.DataAnalysisProblemType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see projetTemplate.EnumDataAnalysisProblemType
	 * @see #getName()
	 * @generated
	 */
	void setName(EnumDataAnalysisProblemType value);

	/**
	 * Returns the value of the '<em><b>Mlalgorithmsolutionpattern</b></em>' containment reference list.
	 * The list contents are of type {@link projetTemplate.MLAlgorithmSolutionPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlalgorithmsolutionpattern</em>' containment reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblemType_Mlalgorithmsolutionpattern()
	 * @model containment="true"
	 * @generated
	 */
	EList<MLAlgorithmSolutionPattern> getMlalgorithmsolutionpattern();

} // DataAnalysisProblemType
