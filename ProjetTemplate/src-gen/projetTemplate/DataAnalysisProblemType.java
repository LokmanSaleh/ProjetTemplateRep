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
 *   <li>{@link projetTemplate.DataAnalysisProblemType#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblemType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.DataAnalysisProblemType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLProcChainSolutionPattern}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.MLProcChainSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlprocchainsolutionpattern</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblemType_Mlprocchainsolutionpattern()
	 * @see projetTemplate.MLProcChainSolutionPattern#getDataanalysisproblemtype
	 * @model opposite="dataanalysisproblemtype" required="true"
	 * @generated
	 */
	EList<MLProcChainSolutionPattern> getMlprocchainsolutionpattern();

	/**
	 * Returns the value of the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLAlgorithmSolutionPattern}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.MLAlgorithmSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlalgorithmsolutionpattern</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataAnalysisProblemType_Mlalgorithmsolutionpattern()
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getDataanalysisproblemtype
	 * @model opposite="dataanalysisproblemtype"
	 * @generated
	 */
	EList<MLAlgorithmSolutionPattern> getMlalgorithmsolutionpattern();

} // DataAnalysisProblemType
