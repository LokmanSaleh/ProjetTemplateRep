/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage
 * @generated
 */
public interface ProjetTemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetTemplateFactory eINSTANCE = projetTemplate.impl.ProjetTemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Problem</em>'.
	 * @generated
	 */
	DomainProblem createDomainProblem();

	/**
	 * Returns a new object of class '<em>Domain Requirement Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Requirement Value</em>'.
	 * @generated
	 */
	DomainRequirementValue createDomainRequirementValue();

	/**
	 * Returns a new object of class '<em>Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Type</em>'.
	 * @generated
	 */
	RequirementType createRequirementType();

	/**
	 * Returns a new object of class '<em>ML Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML Project</em>'.
	 * @generated
	 */
	MLProject createMLProject();

	/**
	 * Returns a new object of class '<em>Data Analysis Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Analysis Problem</em>'.
	 * @generated
	 */
	DataAnalysisProblem createDataAnalysisProblem();

	/**
	 * Returns a new object of class '<em>Computational Requirement Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computational Requirement Value</em>'.
	 * @generated
	 */
	ComputationalRequirementValue createComputationalRequirementValue();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Requirement Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Mapping</em>'.
	 * @generated
	 */
	RequirementMapping createRequirementMapping();

	/**
	 * Returns a new object of class '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element</em>'.
	 * @generated
	 */
	ModelElement createModelElement();

	/**
	 * Returns a new object of class '<em>Data Property Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property Value Set</em>'.
	 * @generated
	 */
	DataPropertyValueSet createDataPropertyValueSet();

	/**
	 * Returns a new object of class '<em>Data Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property Value</em>'.
	 * @generated
	 */
	DataPropertyValue createDataPropertyValue();

	/**
	 * Returns a new object of class '<em>Data Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Property Type</em>'.
	 * @generated
	 */
	DataPropertyType createDataPropertyType();

	/**
	 * Returns a new object of class '<em>Data Analysis Problem Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Analysis Problem Type</em>'.
	 * @generated
	 */
	DataAnalysisProblemType createDataAnalysisProblemType();

	/**
	 * Returns a new object of class '<em>Processing Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Chain</em>'.
	 * @generated
	 */
	ProcessingChain createProcessingChain();

	/**
	 * Returns a new object of class '<em>ML Proc Chain Solution Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML Proc Chain Solution Pattern</em>'.
	 * @generated
	 */
	MLProcChainSolutionPattern createMLProcChainSolutionPattern();

	/**
	 * Returns a new object of class '<em>Processing Chain Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Chain Template</em>'.
	 * @generated
	 */
	ProcessingChainTemplate createProcessingChainTemplate();

	/**
	 * Returns a new object of class '<em>ML Algorithm Solution Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML Algorithm Solution Pattern</em>'.
	 * @generated
	 */
	MLAlgorithmSolutionPattern createMLAlgorithmSolutionPattern();

	/**
	 * Returns a new object of class '<em>ML Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML Algorithm</em>'.
	 * @generated
	 */
	MLAlgorithm createMLAlgorithm();

	/**
	 * Returns a new object of class '<em>Selection Criterion Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Criterion Value Set</em>'.
	 * @generated
	 */
	SelectionCriterionValueSet createSelectionCriterionValueSet();

	/**
	 * Returns a new object of class '<em>Selection Criterion Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Criterion Value</em>'.
	 * @generated
	 */
	SelectionCriterionValue createSelectionCriterionValue();

	/**
	 * Returns a new object of class '<em>Selection Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Criterion</em>'.
	 * @generated
	 */
	SelectionCriterion createSelectionCriterion();

	/**
	 * Returns a new object of class '<em>Extended BPMN Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended BPMN Model</em>'.
	 * @generated
	 */
	ExtendedBPMNModel createExtendedBPMNModel();

	/**
	 * Returns a new object of class '<em>Explainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explainability</em>'.
	 * @generated
	 */
	Explainability createExplainability();

	/**
	 * Returns a new object of class '<em>Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accuracy</em>'.
	 * @generated
	 */
	Accuracy createAccuracy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjetTemplatePackage getProjetTemplatePackage();

} //ProjetTemplateFactory
