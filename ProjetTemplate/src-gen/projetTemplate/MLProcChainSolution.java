/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Proc Chain Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLProcChainSolution#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolution#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolution#getX_processingchain <em>Xprocessingchain</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolution#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolution#getExecutedTemplate <em>Executed Template</em>}</li>
 *   <li>{@link projetTemplate.MLProcChainSolution#getX_collecteddataknowledgeabouttemplateconstruction <em>Xcollecteddataknowledgeabouttemplateconstruction</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolution()
 * @model
 * @generated
 */
public interface MLProcChainSolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolution_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DataPropertyValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalueset</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolution_Datapropertyvalueset()
	 * @model required="true"
	 * @generated
	 */
	EList<DataPropertyValueSet> getDatapropertyvalueset();

	/**
	 * Returns the value of the '<em><b>Xprocessingchain</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.ProcessingChainTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xprocessingchain</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolution_X_processingchain()
	 * @model required="true"
	 * @generated
	 */
	EList<ProcessingChainTemplate> getX_processingchain();

	/**
	 * Returns the value of the '<em><b>Dataanalysisproblemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #setDataanalysisproblemtype(DataAnalysisProblemType)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolution_Dataanalysisproblemtype()
	 * @model
	 * @generated
	 */
	DataAnalysisProblemType getDataanalysisproblemtype();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProcChainSolution#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataanalysisproblemtype</em>' reference.
	 * @see #getDataanalysisproblemtype()
	 * @generated
	 */
	void setDataanalysisproblemtype(DataAnalysisProblemType value);

	/**
	 * Returns the value of the '<em><b>Executed Template</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.ExtendedBPMNModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Template</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolution_ExecutedTemplate()
	 * @model required="true"
	 * @generated
	 */
	EList<ExtendedBPMNModel> getExecutedTemplate();

	/**
	 * Returns the value of the '<em><b>Xcollecteddataknowledgeabouttemplateconstruction</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xcollecteddataknowledgeabouttemplateconstruction</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLProcChainSolution_X_collecteddataknowledgeabouttemplateconstruction()
	 * @model required="true"
	 * @generated
	 */
	EList<CollectedDataKnowledgeAboutTemplateConstruction> getX_collecteddataknowledgeabouttemplateconstruction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ProcessingChainTemplate ConstruireUneChaineDeTraitementInitiale();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ExtendedBPMNModel MergeProcessingChainAndTemplate();

} // MLProcChainSolution
