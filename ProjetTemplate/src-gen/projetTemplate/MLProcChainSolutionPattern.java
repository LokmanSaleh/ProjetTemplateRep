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
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
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
	 * Returns the value of the '<em><b>Dataanalysisproblemtype</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DataAnalysisProblemType}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.DataAnalysisProblemType#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataanalysisproblemtype</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Dataanalysisproblemtype()
	 * @see projetTemplate.DataAnalysisProblemType#getMlprocchainsolutionpattern
	 * @model opposite="mlprocchainsolutionpattern" required="true"
	 * @generated
	 */
	EList<DataAnalysisProblemType> getDataanalysisproblemtype();

	/**
	 * Returns the value of the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DataPropertyValueSet}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.DataPropertyValueSet#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalueset</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolutionPattern_Datapropertyvalueset()
	 * @see projetTemplate.DataPropertyValueSet#getMlprocchainsolutionpattern
	 * @model opposite="mlprocchainsolutionpattern" required="true"
	 * @generated
	 */
	EList<DataPropertyValueSet> getDatapropertyvalueset();

} // MLProcChainSolutionPattern
