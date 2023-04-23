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
	 * Returns a new object of class '<em>XDatabase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDatabase</em>'.
	 * @generated
	 */
	X_Database createX_Database();

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
	 * Returns a new object of class '<em>Processing Chain Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Chain Template</em>'.
	 * @generated
	 */
	ProcessingChainTemplate createProcessingChainTemplate();

	/**
	 * Returns a new object of class '<em>ML Proc Chain Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML Proc Chain Solution</em>'.
	 * @generated
	 */
	MLProcChainSolution createMLProcChainSolution();

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
	 * Returns a new object of class '<em>Collected Data Knowledge About Template Construction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collected Data Knowledge About Template Construction</em>'.
	 * @generated
	 */
	CollectedDataKnowledgeAboutTemplateConstruction createCollectedDataKnowledgeAboutTemplateConstruction();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resultat</em>'.
	 * @generated
	 */
	Resultat createResultat();

	/**
	 * Returns a new object of class '<em>variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>variable</em>'.
	 * @generated
	 */
	variable createvariable();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>connector</em>'.
	 * @generated
	 */
	connector createconnector();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Data Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Cleaning</em>'.
	 * @generated
	 */
	DataCleaning createDataCleaning();

	/**
	 * Returns a new object of class '<em>Data Pretraitement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Pretraitement</em>'.
	 * @generated
	 */
	DataPretraitement createDataPretraitement();

	/**
	 * Returns a new object of class '<em>Feature Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Selection</em>'.
	 * @generated
	 */
	FeatureSelection createFeatureSelection();

	/**
	 * Returns a new object of class '<em>Feature Construction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Construction</em>'.
	 * @generated
	 */
	FeatureConstruction createFeatureConstruction();

	/**
	 * Returns a new object of class '<em>Post Treatement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Treatement</em>'.
	 * @generated
	 */
	PostTreatement createPostTreatement();

	/**
	 * Returns a new object of class '<em>Deployement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployement</em>'.
	 * @generated
	 */
	Deployement createDeployement();

	/**
	 * Returns a new object of class '<em>Remove Uncessary Fileds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Uncessary Fileds</em>'.
	 * @generated
	 */
	RemoveUncessaryFileds createRemoveUncessaryFileds();

	/**
	 * Returns a new object of class '<em>Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conversion</em>'.
	 * @generated
	 */
	Conversion createConversion();

	/**
	 * Returns a new object of class '<em>Noise Treatement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Noise Treatement</em>'.
	 * @generated
	 */
	NoiseTreatement createNoiseTreatement();

	/**
	 * Returns a new object of class '<em>Missing Value Treatement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Missing Value Treatement</em>'.
	 * @generated
	 */
	MissingValueTreatement createMissingValueTreatement();

	/**
	 * Returns a new object of class '<em>ML Algorithm Selection Criteria Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ML Algorithm Selection Criteria Container</em>'.
	 * @generated
	 */
	MLAlgorithmSelectionCriteriaContainer createMLAlgorithmSelectionCriteriaContainer();

	/**
	 * Returns a new object of class '<em>Data Base Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Base Connection</em>'.
	 * @generated
	 */
	DataBaseConnection createDataBaseConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjetTemplatePackage getProjetTemplatePackage();

} //ProjetTemplateFactory
