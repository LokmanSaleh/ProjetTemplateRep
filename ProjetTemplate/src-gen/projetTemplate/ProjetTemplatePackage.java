/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplateFactory
 * @model kind="package"
 * @generated
 */
public interface ProjetTemplatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projetTemplate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projetTemplate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projetTemplate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetTemplatePackage eINSTANCE = projetTemplate.impl.ProjetTemplatePackageImpl.init();

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DomainProblemImpl <em>Domain Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DomainProblemImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDomainProblem()
	 * @generated
	 */
	int DOMAIN_PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROBLEM__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Domain Requirement Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROBLEM__DOMAIN_REQUIREMENT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Domain Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROBLEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DomainRequirementValueImpl <em>Domain Requirement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DomainRequirementValueImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDomainRequirementValue()
	 * @generated
	 */
	int DOMAIN_REQUIREMENT_VALUE = 1;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.RequirementTypeImpl <em>Requirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.RequirementTypeImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 2;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.MLProjectImpl <em>ML Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.MLProjectImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLProject()
	 * @generated
	 */
	int ML_PROJECT = 3;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataAnalysisProblemImpl <em>Data Analysis Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataAnalysisProblemImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataAnalysisProblem()
	 * @generated
	 */
	int DATA_ANALYSIS_PROBLEM = 4;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ComputationalRequirementValueImpl <em>Computational Requirement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ComputationalRequirementValueImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getComputationalRequirementValue()
	 * @generated
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE = 5;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.X_DatabaseImpl <em>XDatabase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.X_DatabaseImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getX_Database()
	 * @generated
	 */
	int XDATABASE = 6;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.SchemaImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 7;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getData()
	 * @generated
	 */
	int DATA = 8;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.RequirementMappingImpl <em>Requirement Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.RequirementMappingImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRequirementMapping()
	 * @generated
	 */
	int REQUIREMENT_MAPPING = 9;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ModelElementImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 10;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataPropertyValueSetImpl <em>Data Property Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataPropertyValueSetImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyValueSet()
	 * @generated
	 */
	int DATA_PROPERTY_VALUE_SET = 11;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataPropertyValueImpl <em>Data Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataPropertyValueImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyValue()
	 * @generated
	 */
	int DATA_PROPERTY_VALUE = 12;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataPropertyTypeImpl <em>Data Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataPropertyTypeImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyType()
	 * @generated
	 */
	int DATA_PROPERTY_TYPE = 13;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataAnalysisProblemTypeImpl <em>Data Analysis Problem Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataAnalysisProblemTypeImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataAnalysisProblemType()
	 * @generated
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE = 14;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ProcessingChainImpl <em>Processing Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ProcessingChainImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getProcessingChain()
	 * @generated
	 */
	int PROCESSING_CHAIN = 17;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ProcessingChainTemplateImpl <em>Processing Chain Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ProcessingChainTemplateImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getProcessingChainTemplate()
	 * @generated
	 */
	int PROCESSING_CHAIN_TEMPLATE = 15;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl <em>ML Algorithm Solution Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.MLAlgorithmSolutionPatternImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN = 18;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ComponentImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 33;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.MLAlgorithmImpl <em>ML Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.MLAlgorithmImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithm()
	 * @generated
	 */
	int ML_ALGORITHM = 19;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.SelectionCriterionValueSetImpl <em>Selection Criterion Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.SelectionCriterionValueSetImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterionValueSet()
	 * @generated
	 */
	int SELECTION_CRITERION_VALUE_SET = 20;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.SelectionCriterionValueImpl <em>Selection Criterion Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.SelectionCriterionValueImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterionValue()
	 * @generated
	 */
	int SELECTION_CRITERION_VALUE = 21;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.SelectionCriterionImpl <em>Selection Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.SelectionCriterionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterion()
	 * @generated
	 */
	int SELECTION_CRITERION = 22;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ExtendedBPMNModelImpl <em>Extended BPMN Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ExtendedBPMNModelImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getExtendedBPMNModel()
	 * @generated
	 */
	int EXTENDED_BPMN_MODEL = 23;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ExplainabilityImpl <em>Explainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ExplainabilityImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getExplainability()
	 * @generated
	 */
	int EXPLAINABILITY = 24;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.AccuracyImpl <em>Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.AccuracyImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getAccuracy()
	 * @generated
	 */
	int ACCURACY = 25;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.CollectedDataKnowledgeAboutTemplateConstructionImpl <em>Collected Data Knowledge About Template Construction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.CollectedDataKnowledgeAboutTemplateConstructionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getCollectedDataKnowledgeAboutTemplateConstruction()
	 * @generated
	 */
	int COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION = 26;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.RuleImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 27;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ConditionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 28;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ResultatImpl <em>Resultat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ResultatImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getResultat()
	 * @generated
	 */
	int RESULTAT = 29;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.TermImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 31;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.variableImpl <em>variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.variableImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getvariable()
	 * @generated
	 */
	int VARIABLE = 30;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.connectorImpl <em>connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.connectorImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getconnector()
	 * @generated
	 */
	int CONNECTOR = 32;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataCleaningImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataCleaning()
	 * @generated
	 */
	int DATA_CLEANING = 34;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataPretraitementImpl <em>Data Pretraitement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataPretraitementImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPretraitement()
	 * @generated
	 */
	int DATA_PRETRAITEMENT = 35;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.FeatureSelectionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getFeatureSelection()
	 * @generated
	 */
	int FEATURE_SELECTION = 36;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.FeatureConstructionImpl <em>Feature Construction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.FeatureConstructionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getFeatureConstruction()
	 * @generated
	 */
	int FEATURE_CONSTRUCTION = 37;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.PostTreatementImpl <em>Post Treatement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.PostTreatementImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getPostTreatement()
	 * @generated
	 */
	int POST_TREATEMENT = 38;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DeployementImpl <em>Deployement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DeployementImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDeployement()
	 * @generated
	 */
	int DEPLOYEMENT = 39;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.RemoveUncessaryFiledsImpl <em>Remove Uncessary Fileds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.RemoveUncessaryFiledsImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRemoveUncessaryFileds()
	 * @generated
	 */
	int REMOVE_UNCESSARY_FILEDS = 40;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ConversionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getConversion()
	 * @generated
	 */
	int CONVERSION = 41;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.NoiseTreatementImpl <em>Noise Treatement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.NoiseTreatementImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getNoiseTreatement()
	 * @generated
	 */
	int NOISE_TREATEMENT = 42;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.MissingValueTreatementImpl <em>Missing Value Treatement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.MissingValueTreatementImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMissingValueTreatement()
	 * @generated
	 */
	int MISSING_VALUE_TREATEMENT = 43;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.SelectionCriteriaImpl <em>Selection Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.SelectionCriteriaImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriteria()
	 * @generated
	 */
	int SELECTION_CRITERIA = 44;

	/**
	 * The feature id for the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERIA__CRITERIA_NAME = 0;

	/**
	 * The feature id for the '<em><b>Criteria Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERIA__CRITERIA_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERIA__ID = 2;

	/**
	 * The number of structural features of the '<em>Selection Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERIA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Selection Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERIA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE__CRITERIA_NAME = SELECTION_CRITERIA__CRITERIA_NAME;

	/**
	 * The feature id for the '<em><b>Criteria Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE__CRITERIA_VALUE = SELECTION_CRITERIA__CRITERIA_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE__ID = SELECTION_CRITERIA__ID;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE__EXPLANATION = SELECTION_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xrequirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE = SELECTION_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE_FEATURE_COUNT = SELECTION_CRITERIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Domain Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE_OPERATION_COUNT = SELECTION_CRITERIA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirementmapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REQUIREMENTMAPPING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__SCOPE = 4;

	/**
	 * The number of structural features of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Dataanalysisproblem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT__DATAANALYSISPROBLEM = 3;

	/**
	 * The feature id for the '<em><b>Domainproblem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT__DOMAINPROBLEM = 4;

	/**
	 * The feature id for the '<em><b>Databaseconnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT__DATABASECONNECTION = 5;

	/**
	 * The number of structural features of the '<em>ML Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ML Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM__DATE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Dataanalysisproblemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE = 3;

	/**
	 * The feature id for the '<em><b>Computationalrequirementvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE = 4;

	/**
	 * The feature id for the '<em><b>Mlprocchainsolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM__MLPROCCHAINSOLUTION = 5;

	/**
	 * The number of structural features of the '<em>Data Analysis Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Data Analysis Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Criteria Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__CRITERIA_NAME = SELECTION_CRITERIA__CRITERIA_NAME;

	/**
	 * The feature id for the '<em><b>Criteria Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__CRITERIA_VALUE = SELECTION_CRITERIA__CRITERIA_VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__ID = SELECTION_CRITERIA__ID;

	/**
	 * The feature id for the '<em><b>Formule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__FORMULE = SELECTION_CRITERIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xrequirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE = SELECTION_CRITERIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Computational Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE_FEATURE_COUNT = SELECTION_CRITERIA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Computational Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE_OPERATION_COUNT = SELECTION_CRITERIA_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATABASE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Credentias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATABASE__CREDENTIAS = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATABASE__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATABASE__DATA = 3;

	/**
	 * The number of structural features of the '<em>XDatabase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATABASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>XDatabase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATABASE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TECHNOLOGY = 0;

	/**
	 * The feature id for the '<em><b>Modelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MODELELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Credentias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__CREDENTIAS = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__RESTRICTIONS = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__RATIONALE = 1;

	/**
	 * The feature id for the '<em><b>Requirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__REQUIREMENTTYPE = 2;

	/**
	 * The feature id for the '<em><b>Datapropertyvalueset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__DATAPROPERTYVALUESET = 3;

	/**
	 * The number of structural features of the '<em>Requirement Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Requirement Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datapropertyvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DATAPROPERTYVALUE = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET__SET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Datapropertyvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE = 2;

	/**
	 * The number of structural features of the '<em>Data Property Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET___EVALUATE = 0;

	/**
	 * The number of operations of the '<em>Data Property Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datapropertytype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE__DATAPROPERTYTYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mlalgorithmsolutionpattern</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN = 1;

	/**
	 * The number of structural features of the '<em>Data Analysis Problem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Analysis Problem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Extendedbpmnmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL = 2;

	/**
	 * The feature id for the '<em><b>Processingchaintemplate</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE__PROCESSINGCHAINTEMPLATE = 3;

	/**
	 * The number of structural features of the '<em>Processing Chain Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Select The Right ML Algroithm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE___SELECT_THE_RIGHT_ML_ALGROITHM = 0;

	/**
	 * The number of operations of the '<em>Processing Chain Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.MLProcChainSolutionImpl <em>ML Proc Chain Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.MLProcChainSolutionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLProcChainSolution()
	 * @generated
	 */
	int ML_PROC_CHAIN_SOLUTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET = 1;

	/**
	 * The feature id for the '<em><b>Xprocessingchain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN = 2;

	/**
	 * The feature id for the '<em><b>Dataanalysisproblemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE = 3;

	/**
	 * The feature id for the '<em><b>Executed Template</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Xcollecteddataknowledgeabouttemplateconstruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION = 5;

	/**
	 * The number of structural features of the '<em>ML Proc Chain Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Construire Une Chaine De Traitement Initiale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION___CONSTRUIRE_UNE_CHAINE_DE_TRAITEMENT_INITIALE = 0;

	/**
	 * The operation id for the '<em>Merge Processing Chain And Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION___MERGE_PROCESSING_CHAIN_AND_TEMPLATE = 1;

	/**
	 * The number of operations of the '<em>ML Proc Chain Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Mlalgorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__MLALGORITHM = 2;

	/**
	 * The number of structural features of the '<em>Processing Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Processing Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION = 1;

	/**
	 * The feature id for the '<em><b>Mlalgorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>Xdatapropertyvalueset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__XDATAPROPERTYVALUESET = 3;

	/**
	 * The number of structural features of the '<em>ML Algorithm Solution Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ML Algorithm Solution Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Xselectioncriterionvalueset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__XSELECTIONCRITERIONVALUESET = 0;

	/**
	 * The feature id for the '<em><b>Xselectioncriterionvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__XSELECTIONCRITERIONVALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Extendedbpmnmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__EXTENDEDBPMNMODEL = 3;

	/**
	 * The feature id for the '<em><b>Criteriatochoosemlalgorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM = 4;

	/**
	 * The number of structural features of the '<em>ML Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>ML Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_SET__SET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_SET__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Selectioncriterionvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE = 2;

	/**
	 * The feature id for the '<em><b>Selectioncriterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION = 3;

	/**
	 * The number of structural features of the '<em>Selection Criterion Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Selection Criterion Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_SET_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Selectioncriterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE__SELECTIONCRITERION = 1;

	/**
	 * The number of structural features of the '<em>Selection Criterion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Selection Criterion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION__VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Selection Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Selection Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL__PATH = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Extended BPMN Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extended BPMN Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Explainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Explainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLAINABILITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE = 0;

	/**
	 * The number of structural features of the '<em>Collected Data Knowledge About Template Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Collected Data Knowledge About Template Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Resultat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RESULTAT = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TERM = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT__TERM = 0;

	/**
	 * The number of structural features of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resultat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULTAT_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALEUR = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conneteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNETEUR = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Cleaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLEANING_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRETRAITEMENT__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Pretraitement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRETRAITEMENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Pretraitement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRETRAITEMENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Feature Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRUCTION__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Feature Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRUCTION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Construction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRUCTION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TREATEMENT__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Post Treatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TREATEMENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Post Treatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_TREATEMENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYEMENT__NAME = COMPONENT__NAME;

	/**
	 * The number of structural features of the '<em>Deployement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYEMENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deployement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYEMENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UNCESSARY_FILEDS__NAME = DATA_CLEANING__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UNCESSARY_FILEDS__METHOD = DATA_CLEANING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Uncessary Fileds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UNCESSARY_FILEDS_FEATURE_COUNT = DATA_CLEANING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UNCESSARY_FILEDS___REMOVE_IDS = DATA_CLEANING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Special Characters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UNCESSARY_FILEDS___REMOVE_SPECIAL_CHARACTERS = DATA_CLEANING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Uncessary Fileds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_UNCESSARY_FILEDS_OPERATION_COUNT = DATA_CLEANING_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__NAME = DATA_PRETRAITEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION__METHOD = DATA_PRETRAITEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_FEATURE_COUNT = DATA_PRETRAITEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Convert Categorical Attributes To Continue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION___CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE = DATA_PRETRAITEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Convert Continue Attributes To Categorical</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION___CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL = DATA_PRETRAITEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Detect Attribute Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION___DETECT_ATTRIBUTE_TYPE = DATA_PRETRAITEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSION_OPERATION_COUNT = DATA_PRETRAITEMENT_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_TREATEMENT__NAME = DATA_PRETRAITEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_TREATEMENT__METHOD = DATA_PRETRAITEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Noise Treatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_TREATEMENT_FEATURE_COUNT = DATA_PRETRAITEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Noise From Fileds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_TREATEMENT___REMOVE_NOISE_FROM_FILEDS = DATA_PRETRAITEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Noise Treatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOISE_TREATEMENT_OPERATION_COUNT = DATA_PRETRAITEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Missing Value Treatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUE_TREATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Missing Value Treatement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUE_TREATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.MLAlgorithmSelectionCriteriaContainerImpl <em>ML Algorithm Selection Criteria Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.MLAlgorithmSelectionCriteriaContainerImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithmSelectionCriteriaContainer()
	 * @generated
	 */
	int ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER = 45;

	/**
	 * The feature id for the '<em><b>Selection Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__SELECTION_CRITERIA = 0;

	/**
	 * The feature id for the '<em><b>Regle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE = 1;

	/**
	 * The feature id for the '<em><b>Componenet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__COMPONENET = 2;

	/**
	 * The number of structural features of the '<em>ML Algorithm Selection Criteria Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ML Algorithm Selection Criteria Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DataBaseConnectionImpl <em>Data Base Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataBaseConnectionImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataBaseConnection()
	 * @generated
	 */
	int DATA_BASE_CONNECTION = 46;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONNECTION__URL = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONNECTION__USER = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONNECTION__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Data Base Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Base Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.Values1 <em>Values1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.Values1
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getValues1()
	 * @generated
	 */
	int VALUES1 = 47;

	/**
	 * The meta object id for the '{@link projetTemplate.Values2 <em>Values2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.Values2
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getValues2()
	 * @generated
	 */
	int VALUES2 = 48;

	/**
	 * The meta object id for the '{@link projetTemplate.RequirementTypeValues <em>Requirement Type Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.RequirementTypeValues
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRequirementTypeValues()
	 * @generated
	 */
	int REQUIREMENT_TYPE_VALUES = 49;

	/**
	 * The meta object id for the '{@link projetTemplate.EnumDataAnalysisProblemType <em>Enum Data Analysis Problem Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.EnumDataAnalysisProblemType
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getEnumDataAnalysisProblemType()
	 * @generated
	 */
	int ENUM_DATA_ANALYSIS_PROBLEM_TYPE = 50;

	/**
	 * The meta object id for the '{@link projetTemplate.EnumConnector <em>Enum Connector</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.EnumConnector
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getEnumConnector()
	 * @generated
	 */
	int ENUM_CONNECTOR = 51;

	/**
	 * The meta object id for the '{@link projetTemplate.ConversionEnum <em>Conversion Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.ConversionEnum
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getConversionEnum()
	 * @generated
	 */
	int CONVERSION_ENUM = 52;

	/**
	 * The meta object id for the '{@link projetTemplate.RemoveUncessaryFiledsEnum <em>Remove Uncessary Fileds Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.RemoveUncessaryFiledsEnum
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRemoveUncessaryFiledsEnum()
	 * @generated
	 */
	int REMOVE_UNCESSARY_FILEDS_ENUM = 53;

	/**
	 * The meta object id for the '{@link projetTemplate.NoiseTreatementEnum <em>Noise Treatement Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.NoiseTreatementEnum
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getNoiseTreatementEnum()
	 * @generated
	 */
	int NOISE_TREATEMENT_ENUM = 54;

	/**
	 * The meta object id for the '{@link projetTemplate.MissingValueTreatementEnum <em>Missing Value Treatement Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.MissingValueTreatementEnum
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMissingValueTreatementEnum()
	 * @generated
	 */
	int MISSING_VALUE_TREATEMENT_ENUM = 55;

	/**
	 * The meta object id for the '{@link projetTemplate.MLAlgorithms <em>ML Algorithms</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.MLAlgorithms
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithms()
	 * @generated
	 */
	int ML_ALGORITHMS = 56;

	/**
	 * The meta object id for the '{@link projetTemplate.Componenets <em>Componenets</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.Componenets
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getComponenets()
	 * @generated
	 */
	int COMPONENETS = 57;

	/**
	 * The meta object id for the '<em>New Data Type10</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getNewDataType10()
	 * @generated
	 */
	int NEW_DATA_TYPE10 = 58;

	/**
	 * Returns the meta object for class '{@link projetTemplate.DomainProblem <em>Domain Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Problem</em>'.
	 * @see projetTemplate.DomainProblem
	 * @generated
	 */
	EClass getDomainProblem();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DomainProblem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see projetTemplate.DomainProblem#getText()
	 * @see #getDomainProblem()
	 * @generated
	 */
	EAttribute getDomainProblem_Text();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.DomainProblem#getDomainRequirementValue <em>Domain Requirement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Requirement Value</em>'.
	 * @see projetTemplate.DomainProblem#getDomainRequirementValue()
	 * @see #getDomainProblem()
	 * @generated
	 */
	EReference getDomainProblem_DomainRequirementValue();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DomainRequirementValue <em>Domain Requirement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Requirement Value</em>'.
	 * @see projetTemplate.DomainRequirementValue
	 * @generated
	 */
	EClass getDomainRequirementValue();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DomainRequirementValue#getExplanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explanation</em>'.
	 * @see projetTemplate.DomainRequirementValue#getExplanation()
	 * @see #getDomainRequirementValue()
	 * @generated
	 */
	EAttribute getDomainRequirementValue_Explanation();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.DomainRequirementValue#getX_requirementtype <em>Xrequirementtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xrequirementtype</em>'.
	 * @see projetTemplate.DomainRequirementValue#getX_requirementtype()
	 * @see #getDomainRequirementValue()
	 * @generated
	 */
	EReference getDomainRequirementValue_X_requirementtype();

	/**
	 * Returns the meta object for class '{@link projetTemplate.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Type</em>'.
	 * @see projetTemplate.RequirementType
	 * @generated
	 */
	EClass getRequirementType();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.RequirementType#getRequirementmapping <em>Requirementmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirementmapping</em>'.
	 * @see projetTemplate.RequirementType#getRequirementmapping()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Requirementmapping();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.RequirementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.RequirementType#getName()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.RequirementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see projetTemplate.RequirementType#getDescription()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Description();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.RequirementType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see projetTemplate.RequirementType#getValueType()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.RequirementType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see projetTemplate.RequirementType#getScope()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Scope();

	/**
	 * Returns the meta object for class '{@link projetTemplate.MLProject <em>ML Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Project</em>'.
	 * @see projetTemplate.MLProject
	 * @generated
	 */
	EClass getMLProject();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.MLProject#getName()
	 * @see #getMLProject()
	 * @generated
	 */
	EAttribute getMLProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLProject#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see projetTemplate.MLProject#getDate()
	 * @see #getMLProject()
	 * @generated
	 */
	EAttribute getMLProject_Date();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLProject#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see projetTemplate.MLProject#getAuthor()
	 * @see #getMLProject()
	 * @generated
	 */
	EAttribute getMLProject_Author();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLProject#getDataanalysisproblem <em>Dataanalysisproblem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataanalysisproblem</em>'.
	 * @see projetTemplate.MLProject#getDataanalysisproblem()
	 * @see #getMLProject()
	 * @generated
	 */
	EReference getMLProject_Dataanalysisproblem();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLProject#getDomainproblem <em>Domainproblem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domainproblem</em>'.
	 * @see projetTemplate.MLProject#getDomainproblem()
	 * @see #getMLProject()
	 * @generated
	 */
	EReference getMLProject_Domainproblem();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLProject#getDatabaseconnection <em>Databaseconnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Databaseconnection</em>'.
	 * @see projetTemplate.MLProject#getDatabaseconnection()
	 * @see #getMLProject()
	 * @generated
	 */
	EReference getMLProject_Databaseconnection();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataAnalysisProblem <em>Data Analysis Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Analysis Problem</em>'.
	 * @see projetTemplate.DataAnalysisProblem
	 * @generated
	 */
	EClass getDataAnalysisProblem();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataAnalysisProblem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.DataAnalysisProblem#getName()
	 * @see #getDataAnalysisProblem()
	 * @generated
	 */
	EAttribute getDataAnalysisProblem_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataAnalysisProblem#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see projetTemplate.DataAnalysisProblem#getDate()
	 * @see #getDataAnalysisProblem()
	 * @generated
	 */
	EAttribute getDataAnalysisProblem_Date();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataAnalysisProblem#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see projetTemplate.DataAnalysisProblem#getAuthor()
	 * @see #getDataAnalysisProblem()
	 * @generated
	 */
	EAttribute getDataAnalysisProblem_Author();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.DataAnalysisProblem#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataanalysisproblemtype</em>'.
	 * @see projetTemplate.DataAnalysisProblem#getDataanalysisproblemtype()
	 * @see #getDataAnalysisProblem()
	 * @generated
	 */
	EReference getDataAnalysisProblem_Dataanalysisproblemtype();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.DataAnalysisProblem#getComputationalrequirementvalue <em>Computationalrequirementvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computationalrequirementvalue</em>'.
	 * @see projetTemplate.DataAnalysisProblem#getComputationalrequirementvalue()
	 * @see #getDataAnalysisProblem()
	 * @generated
	 */
	EReference getDataAnalysisProblem_Computationalrequirementvalue();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.DataAnalysisProblem#getMlprocchainsolution <em>Mlprocchainsolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mlprocchainsolution</em>'.
	 * @see projetTemplate.DataAnalysisProblem#getMlprocchainsolution()
	 * @see #getDataAnalysisProblem()
	 * @generated
	 */
	EReference getDataAnalysisProblem_Mlprocchainsolution();

	/**
	 * Returns the meta object for class '{@link projetTemplate.ComputationalRequirementValue <em>Computational Requirement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computational Requirement Value</em>'.
	 * @see projetTemplate.ComputationalRequirementValue
	 * @generated
	 */
	EClass getComputationalRequirementValue();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ComputationalRequirementValue#getFormule <em>Formule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formule</em>'.
	 * @see projetTemplate.ComputationalRequirementValue#getFormule()
	 * @see #getComputationalRequirementValue()
	 * @generated
	 */
	EAttribute getComputationalRequirementValue_Formule();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.ComputationalRequirementValue#getX_requirementtype <em>Xrequirementtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xrequirementtype</em>'.
	 * @see projetTemplate.ComputationalRequirementValue#getX_requirementtype()
	 * @see #getComputationalRequirementValue()
	 * @generated
	 */
	EReference getComputationalRequirementValue_X_requirementtype();

	/**
	 * Returns the meta object for class '{@link projetTemplate.X_Database <em>XDatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDatabase</em>'.
	 * @see projetTemplate.X_Database
	 * @generated
	 */
	EClass getX_Database();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.X_Database#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetTemplate.X_Database#getValue()
	 * @see #getX_Database()
	 * @generated
	 */
	EAttribute getX_Database_Value();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.X_Database#getCredentias <em>Credentias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentias</em>'.
	 * @see projetTemplate.X_Database#getCredentias()
	 * @see #getX_Database()
	 * @generated
	 */
	EAttribute getX_Database_Credentias();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.X_Database#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see projetTemplate.X_Database#getSchema()
	 * @see #getX_Database()
	 * @generated
	 */
	EReference getX_Database_Schema();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.X_Database#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see projetTemplate.X_Database#getData()
	 * @see #getX_Database()
	 * @generated
	 */
	EReference getX_Database_Data();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see projetTemplate.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Schema#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see projetTemplate.Schema#getTechnology()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Technology();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.Schema#getModelelement <em>Modelelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modelelement</em>'.
	 * @see projetTemplate.Schema#getModelelement()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Modelelement();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see projetTemplate.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetTemplate.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Data#getCredentias <em>Credentias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentias</em>'.
	 * @see projetTemplate.Data#getCredentias()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Credentias();

	/**
	 * Returns the meta object for class '{@link projetTemplate.RequirementMapping <em>Requirement Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Mapping</em>'.
	 * @see projetTemplate.RequirementMapping
	 * @generated
	 */
	EClass getRequirementMapping();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.RequirementMapping#getRestrictions <em>Restrictions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restrictions</em>'.
	 * @see projetTemplate.RequirementMapping#getRestrictions()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_Restrictions();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.RequirementMapping#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see projetTemplate.RequirementMapping#getRationale()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_Rationale();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.RequirementMapping#getRequirementtype <em>Requirementtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirementtype</em>'.
	 * @see projetTemplate.RequirementMapping#getRequirementtype()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EReference getRequirementMapping_Requirementtype();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.RequirementMapping#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datapropertyvalueset</em>'.
	 * @see projetTemplate.RequirementMapping#getDatapropertyvalueset()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EReference getRequirementMapping_Datapropertyvalueset();

	/**
	 * Returns the meta object for class '{@link projetTemplate.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see projetTemplate.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.ModelElement#getDatapropertyvalue <em>Datapropertyvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datapropertyvalue</em>'.
	 * @see projetTemplate.ModelElement#getDatapropertyvalue()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Datapropertyvalue();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataPropertyValueSet <em>Data Property Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Value Set</em>'.
	 * @see projetTemplate.DataPropertyValueSet
	 * @generated
	 */
	EClass getDataPropertyValueSet();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataPropertyValueSet#getSetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Type</em>'.
	 * @see projetTemplate.DataPropertyValueSet#getSetType()
	 * @see #getDataPropertyValueSet()
	 * @generated
	 */
	EAttribute getDataPropertyValueSet_SetType();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataPropertyValueSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see projetTemplate.DataPropertyValueSet#getValues()
	 * @see #getDataPropertyValueSet()
	 * @generated
	 */
	EAttribute getDataPropertyValueSet_Values();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.DataPropertyValueSet#getDatapropertyvalue <em>Datapropertyvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datapropertyvalue</em>'.
	 * @see projetTemplate.DataPropertyValueSet#getDatapropertyvalue()
	 * @see #getDataPropertyValueSet()
	 * @generated
	 */
	EReference getDataPropertyValueSet_Datapropertyvalue();

	/**
	 * Returns the meta object for the '{@link projetTemplate.DataPropertyValueSet#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see projetTemplate.DataPropertyValueSet#evaluate()
	 * @generated
	 */
	EOperation getDataPropertyValueSet__Evaluate();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataPropertyValue <em>Data Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Value</em>'.
	 * @see projetTemplate.DataPropertyValue
	 * @generated
	 */
	EClass getDataPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataPropertyValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.DataPropertyValue#getName()
	 * @see #getDataPropertyValue()
	 * @generated
	 */
	EAttribute getDataPropertyValue_Name();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.DataPropertyValue#getDatapropertytype <em>Datapropertytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datapropertytype</em>'.
	 * @see projetTemplate.DataPropertyValue#getDatapropertytype()
	 * @see #getDataPropertyValue()
	 * @generated
	 */
	EReference getDataPropertyValue_Datapropertytype();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataPropertyType <em>Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property Type</em>'.
	 * @see projetTemplate.DataPropertyType
	 * @generated
	 */
	EClass getDataPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataPropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.DataPropertyType#getName()
	 * @see #getDataPropertyType()
	 * @generated
	 */
	EAttribute getDataPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projetTemplate.DataPropertyType#getType()
	 * @see #getDataPropertyType()
	 * @generated
	 */
	EAttribute getDataPropertyType_Type();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataAnalysisProblemType <em>Data Analysis Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Analysis Problem Type</em>'.
	 * @see projetTemplate.DataAnalysisProblemType
	 * @generated
	 */
	EClass getDataAnalysisProblemType();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataAnalysisProblemType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.DataAnalysisProblemType#getName()
	 * @see #getDataAnalysisProblemType()
	 * @generated
	 */
	EAttribute getDataAnalysisProblemType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link projetTemplate.DataAnalysisProblemType#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mlalgorithmsolutionpattern</em>'.
	 * @see projetTemplate.DataAnalysisProblemType#getMlalgorithmsolutionpattern()
	 * @see #getDataAnalysisProblemType()
	 * @generated
	 */
	EReference getDataAnalysisProblemType_Mlalgorithmsolutionpattern();

	/**
	 * Returns the meta object for class '{@link projetTemplate.ProcessingChain <em>Processing Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Chain</em>'.
	 * @see projetTemplate.ProcessingChain
	 * @generated
	 */
	EClass getProcessingChain();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ProcessingChain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.ProcessingChain#getName()
	 * @see #getProcessingChain()
	 * @generated
	 */
	EAttribute getProcessingChain_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ProcessingChain#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see projetTemplate.ProcessingChain#getAuthor()
	 * @see #getProcessingChain()
	 * @generated
	 */
	EAttribute getProcessingChain_Author();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.ProcessingChain#getMlalgorithm <em>Mlalgorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlalgorithm</em>'.
	 * @see projetTemplate.ProcessingChain#getMlalgorithm()
	 * @see #getProcessingChain()
	 * @generated
	 */
	EReference getProcessingChain_Mlalgorithm();

	/**
	 * Returns the meta object for class '{@link projetTemplate.ProcessingChainTemplate <em>Processing Chain Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Chain Template</em>'.
	 * @see projetTemplate.ProcessingChainTemplate
	 * @generated
	 */
	EClass getProcessingChainTemplate();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ProcessingChainTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.ProcessingChainTemplate#getName()
	 * @see #getProcessingChainTemplate()
	 * @generated
	 */
	EAttribute getProcessingChainTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ProcessingChainTemplate#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see projetTemplate.ProcessingChainTemplate#getAuthor()
	 * @see #getProcessingChainTemplate()
	 * @generated
	 */
	EAttribute getProcessingChainTemplate_Author();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.ProcessingChainTemplate#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extendedbpmnmodel</em>'.
	 * @see projetTemplate.ProcessingChainTemplate#getExtendedbpmnmodel()
	 * @see #getProcessingChainTemplate()
	 * @generated
	 */
	EReference getProcessingChainTemplate_Extendedbpmnmodel();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.ProcessingChainTemplate#getProcessingchaintemplate <em>Processingchaintemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processingchaintemplate</em>'.
	 * @see projetTemplate.ProcessingChainTemplate#getProcessingchaintemplate()
	 * @see #getProcessingChainTemplate()
	 * @generated
	 */
	EReference getProcessingChainTemplate_Processingchaintemplate();

	/**
	 * Returns the meta object for the '{@link projetTemplate.ProcessingChainTemplate#SelectTheRightMLAlgroithm() <em>Select The Right ML Algroithm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Select The Right ML Algroithm</em>' operation.
	 * @see projetTemplate.ProcessingChainTemplate#SelectTheRightMLAlgroithm()
	 * @generated
	 */
	EOperation getProcessingChainTemplate__SelectTheRightMLAlgroithm();

	/**
	 * Returns the meta object for class '{@link projetTemplate.MLProcChainSolution <em>ML Proc Chain Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Proc Chain Solution</em>'.
	 * @see projetTemplate.MLProcChainSolution
	 * @generated
	 */
	EClass getMLProcChainSolution();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLProcChainSolution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.MLProcChainSolution#getName()
	 * @see #getMLProcChainSolution()
	 * @generated
	 */
	EAttribute getMLProcChainSolution_Name();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLProcChainSolution#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datapropertyvalueset</em>'.
	 * @see projetTemplate.MLProcChainSolution#getDatapropertyvalueset()
	 * @see #getMLProcChainSolution()
	 * @generated
	 */
	EReference getMLProcChainSolution_Datapropertyvalueset();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLProcChainSolution#getX_processingchain <em>Xprocessingchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Xprocessingchain</em>'.
	 * @see projetTemplate.MLProcChainSolution#getX_processingchain()
	 * @see #getMLProcChainSolution()
	 * @generated
	 */
	EReference getMLProcChainSolution_X_processingchain();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLProcChainSolution#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataanalysisproblemtype</em>'.
	 * @see projetTemplate.MLProcChainSolution#getDataanalysisproblemtype()
	 * @see #getMLProcChainSolution()
	 * @generated
	 */
	EReference getMLProcChainSolution_Dataanalysisproblemtype();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLProcChainSolution#getExecutedTemplate <em>Executed Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Template</em>'.
	 * @see projetTemplate.MLProcChainSolution#getExecutedTemplate()
	 * @see #getMLProcChainSolution()
	 * @generated
	 */
	EReference getMLProcChainSolution_ExecutedTemplate();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLProcChainSolution#getX_collecteddataknowledgeabouttemplateconstruction <em>Xcollecteddataknowledgeabouttemplateconstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Xcollecteddataknowledgeabouttemplateconstruction</em>'.
	 * @see projetTemplate.MLProcChainSolution#getX_collecteddataknowledgeabouttemplateconstruction()
	 * @see #getMLProcChainSolution()
	 * @generated
	 */
	EReference getMLProcChainSolution_X_collecteddataknowledgeabouttemplateconstruction();

	/**
	 * Returns the meta object for the '{@link projetTemplate.MLProcChainSolution#ConstruireUneChaineDeTraitementInitiale() <em>Construire Une Chaine De Traitement Initiale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Construire Une Chaine De Traitement Initiale</em>' operation.
	 * @see projetTemplate.MLProcChainSolution#ConstruireUneChaineDeTraitementInitiale()
	 * @generated
	 */
	EOperation getMLProcChainSolution__ConstruireUneChaineDeTraitementInitiale();

	/**
	 * Returns the meta object for the '{@link projetTemplate.MLProcChainSolution#MergeProcessingChainAndTemplate() <em>Merge Processing Chain And Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge Processing Chain And Template</em>' operation.
	 * @see projetTemplate.MLProcChainSolution#MergeProcessingChainAndTemplate()
	 * @generated
	 */
	EOperation getMLProcChainSolution__MergeProcessingChainAndTemplate();

	/**
	 * Returns the meta object for class '{@link projetTemplate.MLAlgorithmSolutionPattern <em>ML Algorithm Solution Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Algorithm Solution Pattern</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern
	 * @generated
	 */
	EClass getMLAlgorithmSolutionPattern();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLAlgorithmSolutionPattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getName()
	 * @see #getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	EAttribute getMLAlgorithmSolutionPattern_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLAlgorithmSolutionPattern#getExplanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explanation</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getExplanation()
	 * @see #getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	EAttribute getMLAlgorithmSolutionPattern_Explanation();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithmSolutionPattern#getMlalgorithm <em>Mlalgorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mlalgorithm</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getMlalgorithm()
	 * @see #getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	EReference getMLAlgorithmSolutionPattern_Mlalgorithm();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLAlgorithmSolutionPattern#getX_datapropertyvalueset <em>Xdatapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Xdatapropertyvalueset</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getX_datapropertyvalueset()
	 * @see #getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	EReference getMLAlgorithmSolutionPattern_X_datapropertyvalueset();

	/**
	 * Returns the meta object for class '{@link projetTemplate.MLAlgorithm <em>ML Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Algorithm</em>'.
	 * @see projetTemplate.MLAlgorithm
	 * @generated
	 */
	EClass getMLAlgorithm();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithm#getX_selectioncriterionvalueset <em>Xselectioncriterionvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xselectioncriterionvalueset</em>'.
	 * @see projetTemplate.MLAlgorithm#getX_selectioncriterionvalueset()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_X_selectioncriterionvalueset();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLAlgorithm#getX_selectioncriterionvalue <em>Xselectioncriterionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Xselectioncriterionvalue</em>'.
	 * @see projetTemplate.MLAlgorithm#getX_selectioncriterionvalue()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_X_selectioncriterionvalue();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLAlgorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.MLAlgorithm#getName()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EAttribute getMLAlgorithm_Name();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithm#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extendedbpmnmodel</em>'.
	 * @see projetTemplate.MLAlgorithm#getExtendedbpmnmodel()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_Extendedbpmnmodel();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithm#getCriteriatochoosemlalgorithm <em>Criteriatochoosemlalgorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criteriatochoosemlalgorithm</em>'.
	 * @see projetTemplate.MLAlgorithm#getCriteriatochoosemlalgorithm()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_Criteriatochoosemlalgorithm();

	/**
	 * Returns the meta object for class '{@link projetTemplate.SelectionCriterionValueSet <em>Selection Criterion Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Criterion Value Set</em>'.
	 * @see projetTemplate.SelectionCriterionValueSet
	 * @generated
	 */
	EClass getSelectionCriterionValueSet();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriterionValueSet#getSetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Type</em>'.
	 * @see projetTemplate.SelectionCriterionValueSet#getSetType()
	 * @see #getSelectionCriterionValueSet()
	 * @generated
	 */
	EAttribute getSelectionCriterionValueSet_SetType();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriterionValueSet#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see projetTemplate.SelectionCriterionValueSet#getValues()
	 * @see #getSelectionCriterionValueSet()
	 * @generated
	 */
	EAttribute getSelectionCriterionValueSet_Values();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.SelectionCriterionValueSet#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectioncriterionvalue</em>'.
	 * @see projetTemplate.SelectionCriterionValueSet#getSelectioncriterionvalue()
	 * @see #getSelectionCriterionValueSet()
	 * @generated
	 */
	EReference getSelectionCriterionValueSet_Selectioncriterionvalue();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.SelectionCriterionValueSet#getSelectioncriterion <em>Selectioncriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectioncriterion</em>'.
	 * @see projetTemplate.SelectionCriterionValueSet#getSelectioncriterion()
	 * @see #getSelectionCriterionValueSet()
	 * @generated
	 */
	EReference getSelectionCriterionValueSet_Selectioncriterion();

	/**
	 * Returns the meta object for class '{@link projetTemplate.SelectionCriterionValue <em>Selection Criterion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Criterion Value</em>'.
	 * @see projetTemplate.SelectionCriterionValue
	 * @generated
	 */
	EClass getSelectionCriterionValue();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriterionValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see projetTemplate.SelectionCriterionValue#getValues()
	 * @see #getSelectionCriterionValue()
	 * @generated
	 */
	EAttribute getSelectionCriterionValue_Values();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.SelectionCriterionValue#getSelectioncriterion <em>Selectioncriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectioncriterion</em>'.
	 * @see projetTemplate.SelectionCriterionValue#getSelectioncriterion()
	 * @see #getSelectionCriterionValue()
	 * @generated
	 */
	EReference getSelectionCriterionValue_Selectioncriterion();

	/**
	 * Returns the meta object for class '{@link projetTemplate.SelectionCriterion <em>Selection Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Criterion</em>'.
	 * @see projetTemplate.SelectionCriterion
	 * @generated
	 */
	EClass getSelectionCriterion();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriterion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.SelectionCriterion#getName()
	 * @see #getSelectionCriterion()
	 * @generated
	 */
	EAttribute getSelectionCriterion_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriterion#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see projetTemplate.SelectionCriterion#getValueType()
	 * @see #getSelectionCriterion()
	 * @generated
	 */
	EAttribute getSelectionCriterion_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriterion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see projetTemplate.SelectionCriterion#getDescription()
	 * @see #getSelectionCriterion()
	 * @generated
	 */
	EAttribute getSelectionCriterion_Description();

	/**
	 * Returns the meta object for class '{@link projetTemplate.ExtendedBPMNModel <em>Extended BPMN Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended BPMN Model</em>'.
	 * @see projetTemplate.ExtendedBPMNModel
	 * @generated
	 */
	EClass getExtendedBPMNModel();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ExtendedBPMNModel#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see projetTemplate.ExtendedBPMNModel#getPath()
	 * @see #getExtendedBPMNModel()
	 * @generated
	 */
	EAttribute getExtendedBPMNModel_Path();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ExtendedBPMNModel#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see projetTemplate.ExtendedBPMNModel#getAuthor()
	 * @see #getExtendedBPMNModel()
	 * @generated
	 */
	EAttribute getExtendedBPMNModel_Author();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ExtendedBPMNModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.ExtendedBPMNModel#getName()
	 * @see #getExtendedBPMNModel()
	 * @generated
	 */
	EAttribute getExtendedBPMNModel_Name();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Explainability <em>Explainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explainability</em>'.
	 * @see projetTemplate.Explainability
	 * @generated
	 */
	EClass getExplainability();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Explainability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetTemplate.Explainability#getValue()
	 * @see #getExplainability()
	 * @generated
	 */
	EAttribute getExplainability_Value();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accuracy</em>'.
	 * @see projetTemplate.Accuracy
	 * @generated
	 */
	EClass getAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Accuracy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetTemplate.Accuracy#getValue()
	 * @see #getAccuracy()
	 * @generated
	 */
	EAttribute getAccuracy_Value();

	/**
	 * Returns the meta object for class '{@link projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction <em>Collected Data Knowledge About Template Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collected Data Knowledge About Template Construction</em>'.
	 * @see projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction
	 * @generated
	 */
	EClass getCollectedDataKnowledgeAboutTemplateConstruction();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule</em>'.
	 * @see projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction#getRule()
	 * @see #getCollectedDataKnowledgeAboutTemplateConstruction()
	 * @generated
	 */
	EReference getCollectedDataKnowledgeAboutTemplateConstruction_Rule();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see projetTemplate.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see projetTemplate.Rule#getCondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Condition();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.Rule#getResultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resultat</em>'.
	 * @see projetTemplate.Rule#getResultat()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Resultat();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see projetTemplate.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.Condition#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term</em>'.
	 * @see projetTemplate.Condition#getTerm()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Term();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resultat</em>'.
	 * @see projetTemplate.Resultat
	 * @generated
	 */
	EClass getResultat();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.Resultat#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term</em>'.
	 * @see projetTemplate.Resultat#getTerm()
	 * @see #getResultat()
	 * @generated
	 */
	EReference getResultat_Term();

	/**
	 * Returns the meta object for class '{@link projetTemplate.variable <em>variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>variable</em>'.
	 * @see projetTemplate.variable
	 * @generated
	 */
	EClass getvariable();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.variable#getName()
	 * @see #getvariable()
	 * @generated
	 */
	EAttribute getvariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.variable#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see projetTemplate.variable#getValeur()
	 * @see #getvariable()
	 * @generated
	 */
	EAttribute getvariable_Valeur();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see projetTemplate.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link projetTemplate.connector <em>connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connector</em>'.
	 * @see projetTemplate.connector
	 * @generated
	 */
	EClass getconnector();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.connector#getConneteur <em>Conneteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conneteur</em>'.
	 * @see projetTemplate.connector#getConneteur()
	 * @see #getconnector()
	 * @generated
	 */
	EAttribute getconnector_Conneteur();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see projetTemplate.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Cleaning</em>'.
	 * @see projetTemplate.DataCleaning
	 * @generated
	 */
	EClass getDataCleaning();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataPretraitement <em>Data Pretraitement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pretraitement</em>'.
	 * @see projetTemplate.DataPretraitement
	 * @generated
	 */
	EClass getDataPretraitement();

	/**
	 * Returns the meta object for class '{@link projetTemplate.FeatureSelection <em>Feature Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Selection</em>'.
	 * @see projetTemplate.FeatureSelection
	 * @generated
	 */
	EClass getFeatureSelection();

	/**
	 * Returns the meta object for class '{@link projetTemplate.FeatureConstruction <em>Feature Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Construction</em>'.
	 * @see projetTemplate.FeatureConstruction
	 * @generated
	 */
	EClass getFeatureConstruction();

	/**
	 * Returns the meta object for class '{@link projetTemplate.PostTreatement <em>Post Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Treatement</em>'.
	 * @see projetTemplate.PostTreatement
	 * @generated
	 */
	EClass getPostTreatement();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Deployement <em>Deployement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployement</em>'.
	 * @see projetTemplate.Deployement
	 * @generated
	 */
	EClass getDeployement();

	/**
	 * Returns the meta object for class '{@link projetTemplate.RemoveUncessaryFileds <em>Remove Uncessary Fileds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Uncessary Fileds</em>'.
	 * @see projetTemplate.RemoveUncessaryFileds
	 * @generated
	 */
	EClass getRemoveUncessaryFileds();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.RemoveUncessaryFileds#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see projetTemplate.RemoveUncessaryFileds#getMethod()
	 * @see #getRemoveUncessaryFileds()
	 * @generated
	 */
	EAttribute getRemoveUncessaryFileds_Method();

	/**
	 * Returns the meta object for the '{@link projetTemplate.RemoveUncessaryFileds#removeIDs() <em>Remove IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove IDs</em>' operation.
	 * @see projetTemplate.RemoveUncessaryFileds#removeIDs()
	 * @generated
	 */
	EOperation getRemoveUncessaryFileds__RemoveIDs();

	/**
	 * Returns the meta object for the '{@link projetTemplate.RemoveUncessaryFileds#removeSpecialCharacters() <em>Remove Special Characters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Special Characters</em>' operation.
	 * @see projetTemplate.RemoveUncessaryFileds#removeSpecialCharacters()
	 * @generated
	 */
	EOperation getRemoveUncessaryFileds__RemoveSpecialCharacters();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see projetTemplate.Conversion
	 * @generated
	 */
	EClass getConversion();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Conversion#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see projetTemplate.Conversion#getMethod()
	 * @see #getConversion()
	 * @generated
	 */
	EAttribute getConversion_Method();

	/**
	 * Returns the meta object for the '{@link projetTemplate.Conversion#convertCategoricalAttributesToContinue() <em>Convert Categorical Attributes To Continue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert Categorical Attributes To Continue</em>' operation.
	 * @see projetTemplate.Conversion#convertCategoricalAttributesToContinue()
	 * @generated
	 */
	EOperation getConversion__ConvertCategoricalAttributesToContinue();

	/**
	 * Returns the meta object for the '{@link projetTemplate.Conversion#convertContinueAttributesToCategorical() <em>Convert Continue Attributes To Categorical</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert Continue Attributes To Categorical</em>' operation.
	 * @see projetTemplate.Conversion#convertContinueAttributesToCategorical()
	 * @generated
	 */
	EOperation getConversion__ConvertContinueAttributesToCategorical();

	/**
	 * Returns the meta object for the '{@link projetTemplate.Conversion#detectAttributeType() <em>Detect Attribute Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detect Attribute Type</em>' operation.
	 * @see projetTemplate.Conversion#detectAttributeType()
	 * @generated
	 */
	EOperation getConversion__DetectAttributeType();

	/**
	 * Returns the meta object for class '{@link projetTemplate.NoiseTreatement <em>Noise Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noise Treatement</em>'.
	 * @see projetTemplate.NoiseTreatement
	 * @generated
	 */
	EClass getNoiseTreatement();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.NoiseTreatement#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see projetTemplate.NoiseTreatement#getMethod()
	 * @see #getNoiseTreatement()
	 * @generated
	 */
	EAttribute getNoiseTreatement_Method();

	/**
	 * Returns the meta object for the '{@link projetTemplate.NoiseTreatement#removeNoiseFromFileds() <em>Remove Noise From Fileds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Noise From Fileds</em>' operation.
	 * @see projetTemplate.NoiseTreatement#removeNoiseFromFileds()
	 * @generated
	 */
	EOperation getNoiseTreatement__RemoveNoiseFromFileds();

	/**
	 * Returns the meta object for class '{@link projetTemplate.MissingValueTreatement <em>Missing Value Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missing Value Treatement</em>'.
	 * @see projetTemplate.MissingValueTreatement
	 * @generated
	 */
	EClass getMissingValueTreatement();

	/**
	 * Returns the meta object for class '{@link projetTemplate.SelectionCriteria <em>Selection Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Criteria</em>'.
	 * @see projetTemplate.SelectionCriteria
	 * @generated
	 */
	EClass getSelectionCriteria();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriteria#getCriteriaName <em>Criteria Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria Name</em>'.
	 * @see projetTemplate.SelectionCriteria#getCriteriaName()
	 * @see #getSelectionCriteria()
	 * @generated
	 */
	EAttribute getSelectionCriteria_CriteriaName();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriteria#getCriteriaValue <em>Criteria Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria Value</em>'.
	 * @see projetTemplate.SelectionCriteria#getCriteriaValue()
	 * @see #getSelectionCriteria()
	 * @generated
	 */
	EAttribute getSelectionCriteria_CriteriaValue();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.SelectionCriteria#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see projetTemplate.SelectionCriteria#getId()
	 * @see #getSelectionCriteria()
	 * @generated
	 */
	EAttribute getSelectionCriteria_Id();

	/**
	 * Returns the meta object for class '{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer <em>ML Algorithm Selection Criteria Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Algorithm Selection Criteria Container</em>'.
	 * @see projetTemplate.MLAlgorithmSelectionCriteriaContainer
	 * @generated
	 */
	EClass getMLAlgorithmSelectionCriteriaContainer();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getSelectionCriteria <em>Selection Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selection Criteria</em>'.
	 * @see projetTemplate.MLAlgorithmSelectionCriteriaContainer#getSelectionCriteria()
	 * @see #getMLAlgorithmSelectionCriteriaContainer()
	 * @generated
	 */
	EReference getMLAlgorithmSelectionCriteriaContainer_SelectionCriteria();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getRegle <em>Regle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regle</em>'.
	 * @see projetTemplate.MLAlgorithmSelectionCriteriaContainer#getRegle()
	 * @see #getMLAlgorithmSelectionCriteriaContainer()
	 * @generated
	 */
	EAttribute getMLAlgorithmSelectionCriteriaContainer_Regle();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLAlgorithmSelectionCriteriaContainer#getComponenet <em>Componenet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Componenet</em>'.
	 * @see projetTemplate.MLAlgorithmSelectionCriteriaContainer#getComponenet()
	 * @see #getMLAlgorithmSelectionCriteriaContainer()
	 * @generated
	 */
	EAttribute getMLAlgorithmSelectionCriteriaContainer_Componenet();

	/**
	 * Returns the meta object for class '{@link projetTemplate.DataBaseConnection <em>Data Base Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base Connection</em>'.
	 * @see projetTemplate.DataBaseConnection
	 * @generated
	 */
	EClass getDataBaseConnection();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataBaseConnection#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see projetTemplate.DataBaseConnection#getURL()
	 * @see #getDataBaseConnection()
	 * @generated
	 */
	EAttribute getDataBaseConnection_URL();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataBaseConnection#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see projetTemplate.DataBaseConnection#getUser()
	 * @see #getDataBaseConnection()
	 * @generated
	 */
	EAttribute getDataBaseConnection_User();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.DataBaseConnection#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see projetTemplate.DataBaseConnection#getPassword()
	 * @see #getDataBaseConnection()
	 * @generated
	 */
	EAttribute getDataBaseConnection_Password();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.Values1 <em>Values1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Values1</em>'.
	 * @see projetTemplate.Values1
	 * @generated
	 */
	EEnum getValues1();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.Values2 <em>Values2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Values2</em>'.
	 * @see projetTemplate.Values2
	 * @generated
	 */
	EEnum getValues2();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.RequirementTypeValues <em>Requirement Type Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement Type Values</em>'.
	 * @see projetTemplate.RequirementTypeValues
	 * @generated
	 */
	EEnum getRequirementTypeValues();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.EnumDataAnalysisProblemType <em>Enum Data Analysis Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Data Analysis Problem Type</em>'.
	 * @see projetTemplate.EnumDataAnalysisProblemType
	 * @generated
	 */
	EEnum getEnumDataAnalysisProblemType();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.EnumConnector <em>Enum Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Connector</em>'.
	 * @see projetTemplate.EnumConnector
	 * @generated
	 */
	EEnum getEnumConnector();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.ConversionEnum <em>Conversion Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conversion Enum</em>'.
	 * @see projetTemplate.ConversionEnum
	 * @generated
	 */
	EEnum getConversionEnum();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.RemoveUncessaryFiledsEnum <em>Remove Uncessary Fileds Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Remove Uncessary Fileds Enum</em>'.
	 * @see projetTemplate.RemoveUncessaryFiledsEnum
	 * @generated
	 */
	EEnum getRemoveUncessaryFiledsEnum();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.NoiseTreatementEnum <em>Noise Treatement Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Noise Treatement Enum</em>'.
	 * @see projetTemplate.NoiseTreatementEnum
	 * @generated
	 */
	EEnum getNoiseTreatementEnum();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.MissingValueTreatementEnum <em>Missing Value Treatement Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Missing Value Treatement Enum</em>'.
	 * @see projetTemplate.MissingValueTreatementEnum
	 * @generated
	 */
	EEnum getMissingValueTreatementEnum();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.MLAlgorithms <em>ML Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ML Algorithms</em>'.
	 * @see projetTemplate.MLAlgorithms
	 * @generated
	 */
	EEnum getMLAlgorithms();

	/**
	 * Returns the meta object for enum '{@link projetTemplate.Componenets <em>Componenets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Componenets</em>'.
	 * @see projetTemplate.Componenets
	 * @generated
	 */
	EEnum getComponenets();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>New Data Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>New Data Type10</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getNewDataType10();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjetTemplateFactory getProjetTemplateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DomainProblemImpl <em>Domain Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DomainProblemImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDomainProblem()
		 * @generated
		 */
		EClass DOMAIN_PROBLEM = eINSTANCE.getDomainProblem();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_PROBLEM__TEXT = eINSTANCE.getDomainProblem_Text();

		/**
		 * The meta object literal for the '<em><b>Domain Requirement Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PROBLEM__DOMAIN_REQUIREMENT_VALUE = eINSTANCE.getDomainProblem_DomainRequirementValue();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DomainRequirementValueImpl <em>Domain Requirement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DomainRequirementValueImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDomainRequirementValue()
		 * @generated
		 */
		EClass DOMAIN_REQUIREMENT_VALUE = eINSTANCE.getDomainRequirementValue();

		/**
		 * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_REQUIREMENT_VALUE__EXPLANATION = eINSTANCE.getDomainRequirementValue_Explanation();

		/**
		 * The meta object literal for the '<em><b>Xrequirementtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_REQUIREMENT_VALUE__XREQUIREMENTTYPE = eINSTANCE.getDomainRequirementValue_X_requirementtype();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.RequirementTypeImpl <em>Requirement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.RequirementTypeImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRequirementType()
		 * @generated
		 */
		EClass REQUIREMENT_TYPE = eINSTANCE.getRequirementType();

		/**
		 * The meta object literal for the '<em><b>Requirementmapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__REQUIREMENTMAPPING = eINSTANCE.getRequirementType_Requirementmapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__NAME = eINSTANCE.getRequirementType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__DESCRIPTION = eINSTANCE.getRequirementType_Description();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__VALUE_TYPE = eINSTANCE.getRequirementType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__SCOPE = eINSTANCE.getRequirementType_Scope();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.MLProjectImpl <em>ML Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.MLProjectImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLProject()
		 * @generated
		 */
		EClass ML_PROJECT = eINSTANCE.getMLProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_PROJECT__NAME = eINSTANCE.getMLProject_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_PROJECT__DATE = eINSTANCE.getMLProject_Date();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_PROJECT__AUTHOR = eINSTANCE.getMLProject_Author();

		/**
		 * The meta object literal for the '<em><b>Dataanalysisproblem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROJECT__DATAANALYSISPROBLEM = eINSTANCE.getMLProject_Dataanalysisproblem();

		/**
		 * The meta object literal for the '<em><b>Domainproblem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROJECT__DOMAINPROBLEM = eINSTANCE.getMLProject_Domainproblem();

		/**
		 * The meta object literal for the '<em><b>Databaseconnection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROJECT__DATABASECONNECTION = eINSTANCE.getMLProject_Databaseconnection();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataAnalysisProblemImpl <em>Data Analysis Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataAnalysisProblemImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataAnalysisProblem()
		 * @generated
		 */
		EClass DATA_ANALYSIS_PROBLEM = eINSTANCE.getDataAnalysisProblem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANALYSIS_PROBLEM__NAME = eINSTANCE.getDataAnalysisProblem_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANALYSIS_PROBLEM__DATE = eINSTANCE.getDataAnalysisProblem_Date();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANALYSIS_PROBLEM__AUTHOR = eINSTANCE.getDataAnalysisProblem_Author();

		/**
		 * The meta object literal for the '<em><b>Dataanalysisproblemtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE = eINSTANCE
				.getDataAnalysisProblem_Dataanalysisproblemtype();

		/**
		 * The meta object literal for the '<em><b>Computationalrequirementvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE = eINSTANCE
				.getDataAnalysisProblem_Computationalrequirementvalue();

		/**
		 * The meta object literal for the '<em><b>Mlprocchainsolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_PROBLEM__MLPROCCHAINSOLUTION = eINSTANCE.getDataAnalysisProblem_Mlprocchainsolution();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ComputationalRequirementValueImpl <em>Computational Requirement Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ComputationalRequirementValueImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getComputationalRequirementValue()
		 * @generated
		 */
		EClass COMPUTATIONAL_REQUIREMENT_VALUE = eINSTANCE.getComputationalRequirementValue();

		/**
		 * The meta object literal for the '<em><b>Formule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_REQUIREMENT_VALUE__FORMULE = eINSTANCE.getComputationalRequirementValue_Formule();

		/**
		 * The meta object literal for the '<em><b>Xrequirementtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATIONAL_REQUIREMENT_VALUE__XREQUIREMENTTYPE = eINSTANCE
				.getComputationalRequirementValue_X_requirementtype();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.X_DatabaseImpl <em>XDatabase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.X_DatabaseImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getX_Database()
		 * @generated
		 */
		EClass XDATABASE = eINSTANCE.getX_Database();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDATABASE__VALUE = eINSTANCE.getX_Database_Value();

		/**
		 * The meta object literal for the '<em><b>Credentias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XDATABASE__CREDENTIAS = eINSTANCE.getX_Database_Credentias();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDATABASE__SCHEMA = eINSTANCE.getX_Database_Schema();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDATABASE__DATA = eINSTANCE.getX_Database_Data();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.SchemaImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__TECHNOLOGY = eINSTANCE.getSchema_Technology();

		/**
		 * The meta object literal for the '<em><b>Modelelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__MODELELEMENT = eINSTANCE.getSchema_Modelelement();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '<em><b>Credentias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__CREDENTIAS = eINSTANCE.getData_Credentias();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.RequirementMappingImpl <em>Requirement Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.RequirementMappingImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRequirementMapping()
		 * @generated
		 */
		EClass REQUIREMENT_MAPPING = eINSTANCE.getRequirementMapping();

		/**
		 * The meta object literal for the '<em><b>Restrictions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__RESTRICTIONS = eINSTANCE.getRequirementMapping_Restrictions();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__RATIONALE = eINSTANCE.getRequirementMapping_Rationale();

		/**
		 * The meta object literal for the '<em><b>Requirementtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MAPPING__REQUIREMENTTYPE = eINSTANCE.getRequirementMapping_Requirementtype();

		/**
		 * The meta object literal for the '<em><b>Datapropertyvalueset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MAPPING__DATAPROPERTYVALUESET = eINSTANCE.getRequirementMapping_Datapropertyvalueset();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ModelElementImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Datapropertyvalue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__DATAPROPERTYVALUE = eINSTANCE.getModelElement_Datapropertyvalue();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataPropertyValueSetImpl <em>Data Property Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataPropertyValueSetImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyValueSet()
		 * @generated
		 */
		EClass DATA_PROPERTY_VALUE_SET = eINSTANCE.getDataPropertyValueSet();

		/**
		 * The meta object literal for the '<em><b>Set Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY_VALUE_SET__SET_TYPE = eINSTANCE.getDataPropertyValueSet_SetType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY_VALUE_SET__VALUES = eINSTANCE.getDataPropertyValueSet_Values();

		/**
		 * The meta object literal for the '<em><b>Datapropertyvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE = eINSTANCE.getDataPropertyValueSet_Datapropertyvalue();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PROPERTY_VALUE_SET___EVALUATE = eINSTANCE.getDataPropertyValueSet__Evaluate();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataPropertyValueImpl <em>Data Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataPropertyValueImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyValue()
		 * @generated
		 */
		EClass DATA_PROPERTY_VALUE = eINSTANCE.getDataPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY_VALUE__NAME = eINSTANCE.getDataPropertyValue_Name();

		/**
		 * The meta object literal for the '<em><b>Datapropertytype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_VALUE__DATAPROPERTYTYPE = eINSTANCE.getDataPropertyValue_Datapropertytype();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataPropertyTypeImpl <em>Data Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataPropertyTypeImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyType()
		 * @generated
		 */
		EClass DATA_PROPERTY_TYPE = eINSTANCE.getDataPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY_TYPE__NAME = eINSTANCE.getDataPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PROPERTY_TYPE__TYPE = eINSTANCE.getDataPropertyType_Type();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataAnalysisProblemTypeImpl <em>Data Analysis Problem Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataAnalysisProblemTypeImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataAnalysisProblemType()
		 * @generated
		 */
		EClass DATA_ANALYSIS_PROBLEM_TYPE = eINSTANCE.getDataAnalysisProblemType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ANALYSIS_PROBLEM_TYPE__NAME = eINSTANCE.getDataAnalysisProblemType_Name();

		/**
		 * The meta object literal for the '<em><b>Mlalgorithmsolutionpattern</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN = eINSTANCE
				.getDataAnalysisProblemType_Mlalgorithmsolutionpattern();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ProcessingChainImpl <em>Processing Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ProcessingChainImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getProcessingChain()
		 * @generated
		 */
		EClass PROCESSING_CHAIN = eINSTANCE.getProcessingChain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CHAIN__NAME = eINSTANCE.getProcessingChain_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CHAIN__AUTHOR = eINSTANCE.getProcessingChain_Author();

		/**
		 * The meta object literal for the '<em><b>Mlalgorithm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN__MLALGORITHM = eINSTANCE.getProcessingChain_Mlalgorithm();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ProcessingChainTemplateImpl <em>Processing Chain Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ProcessingChainTemplateImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getProcessingChainTemplate()
		 * @generated
		 */
		EClass PROCESSING_CHAIN_TEMPLATE = eINSTANCE.getProcessingChainTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CHAIN_TEMPLATE__NAME = eINSTANCE.getProcessingChainTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CHAIN_TEMPLATE__AUTHOR = eINSTANCE.getProcessingChainTemplate_Author();

		/**
		 * The meta object literal for the '<em><b>Extendedbpmnmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL = eINSTANCE
				.getProcessingChainTemplate_Extendedbpmnmodel();

		/**
		 * The meta object literal for the '<em><b>Processingchaintemplate</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN_TEMPLATE__PROCESSINGCHAINTEMPLATE = eINSTANCE
				.getProcessingChainTemplate_Processingchaintemplate();

		/**
		 * The meta object literal for the '<em><b>Select The Right ML Algroithm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_CHAIN_TEMPLATE___SELECT_THE_RIGHT_ML_ALGROITHM = eINSTANCE
				.getProcessingChainTemplate__SelectTheRightMLAlgroithm();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.MLProcChainSolutionImpl <em>ML Proc Chain Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.MLProcChainSolutionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLProcChainSolution()
		 * @generated
		 */
		EClass ML_PROC_CHAIN_SOLUTION = eINSTANCE.getMLProcChainSolution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_PROC_CHAIN_SOLUTION__NAME = eINSTANCE.getMLProcChainSolution_Name();

		/**
		 * The meta object literal for the '<em><b>Datapropertyvalueset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET = eINSTANCE
				.getMLProcChainSolution_Datapropertyvalueset();

		/**
		 * The meta object literal for the '<em><b>Xprocessingchain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN = eINSTANCE.getMLProcChainSolution_X_processingchain();

		/**
		 * The meta object literal for the '<em><b>Dataanalysisproblemtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE = eINSTANCE
				.getMLProcChainSolution_Dataanalysisproblemtype();

		/**
		 * The meta object literal for the '<em><b>Executed Template</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE = eINSTANCE.getMLProcChainSolution_ExecutedTemplate();

		/**
		 * The meta object literal for the '<em><b>Xcollecteddataknowledgeabouttemplateconstruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION = eINSTANCE
				.getMLProcChainSolution_X_collecteddataknowledgeabouttemplateconstruction();

		/**
		 * The meta object literal for the '<em><b>Construire Une Chaine De Traitement Initiale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML_PROC_CHAIN_SOLUTION___CONSTRUIRE_UNE_CHAINE_DE_TRAITEMENT_INITIALE = eINSTANCE
				.getMLProcChainSolution__ConstruireUneChaineDeTraitementInitiale();

		/**
		 * The meta object literal for the '<em><b>Merge Processing Chain And Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ML_PROC_CHAIN_SOLUTION___MERGE_PROCESSING_CHAIN_AND_TEMPLATE = eINSTANCE
				.getMLProcChainSolution__MergeProcessingChainAndTemplate();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.MLAlgorithmSolutionPatternImpl <em>ML Algorithm Solution Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.MLAlgorithmSolutionPatternImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithmSolutionPattern()
		 * @generated
		 */
		EClass ML_ALGORITHM_SOLUTION_PATTERN = eINSTANCE.getMLAlgorithmSolutionPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_ALGORITHM_SOLUTION_PATTERN__NAME = eINSTANCE.getMLAlgorithmSolutionPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION = eINSTANCE.getMLAlgorithmSolutionPattern_Explanation();

		/**
		 * The meta object literal for the '<em><b>Mlalgorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM = eINSTANCE.getMLAlgorithmSolutionPattern_Mlalgorithm();

		/**
		 * The meta object literal for the '<em><b>Xdatapropertyvalueset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM_SOLUTION_PATTERN__XDATAPROPERTYVALUESET = eINSTANCE
				.getMLAlgorithmSolutionPattern_X_datapropertyvalueset();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.MLAlgorithmImpl <em>ML Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.MLAlgorithmImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithm()
		 * @generated
		 */
		EClass ML_ALGORITHM = eINSTANCE.getMLAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Xselectioncriterionvalueset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__XSELECTIONCRITERIONVALUESET = eINSTANCE.getMLAlgorithm_X_selectioncriterionvalueset();

		/**
		 * The meta object literal for the '<em><b>Xselectioncriterionvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__XSELECTIONCRITERIONVALUE = eINSTANCE.getMLAlgorithm_X_selectioncriterionvalue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_ALGORITHM__NAME = eINSTANCE.getMLAlgorithm_Name();

		/**
		 * The meta object literal for the '<em><b>Extendedbpmnmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__EXTENDEDBPMNMODEL = eINSTANCE.getMLAlgorithm_Extendedbpmnmodel();

		/**
		 * The meta object literal for the '<em><b>Criteriatochoosemlalgorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM = eINSTANCE.getMLAlgorithm_Criteriatochoosemlalgorithm();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.SelectionCriterionValueSetImpl <em>Selection Criterion Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.SelectionCriterionValueSetImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterionValueSet()
		 * @generated
		 */
		EClass SELECTION_CRITERION_VALUE_SET = eINSTANCE.getSelectionCriterionValueSet();

		/**
		 * The meta object literal for the '<em><b>Set Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERION_VALUE_SET__SET_TYPE = eINSTANCE.getSelectionCriterionValueSet_SetType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERION_VALUE_SET__VALUES = eINSTANCE.getSelectionCriterionValueSet_Values();

		/**
		 * The meta object literal for the '<em><b>Selectioncriterionvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE = eINSTANCE
				.getSelectionCriterionValueSet_Selectioncriterionvalue();

		/**
		 * The meta object literal for the '<em><b>Selectioncriterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION = eINSTANCE
				.getSelectionCriterionValueSet_Selectioncriterion();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.SelectionCriterionValueImpl <em>Selection Criterion Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.SelectionCriterionValueImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterionValue()
		 * @generated
		 */
		EClass SELECTION_CRITERION_VALUE = eINSTANCE.getSelectionCriterionValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERION_VALUE__VALUES = eINSTANCE.getSelectionCriterionValue_Values();

		/**
		 * The meta object literal for the '<em><b>Selectioncriterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION_VALUE__SELECTIONCRITERION = eINSTANCE
				.getSelectionCriterionValue_Selectioncriterion();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.SelectionCriterionImpl <em>Selection Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.SelectionCriterionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterion()
		 * @generated
		 */
		EClass SELECTION_CRITERION = eINSTANCE.getSelectionCriterion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERION__NAME = eINSTANCE.getSelectionCriterion_Name();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERION__VALUE_TYPE = eINSTANCE.getSelectionCriterion_ValueType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERION__DESCRIPTION = eINSTANCE.getSelectionCriterion_Description();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ExtendedBPMNModelImpl <em>Extended BPMN Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ExtendedBPMNModelImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getExtendedBPMNModel()
		 * @generated
		 */
		EClass EXTENDED_BPMN_MODEL = eINSTANCE.getExtendedBPMNModel();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_BPMN_MODEL__PATH = eINSTANCE.getExtendedBPMNModel_Path();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_BPMN_MODEL__AUTHOR = eINSTANCE.getExtendedBPMNModel_Author();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_BPMN_MODEL__NAME = eINSTANCE.getExtendedBPMNModel_Name();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ExplainabilityImpl <em>Explainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ExplainabilityImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getExplainability()
		 * @generated
		 */
		EClass EXPLAINABILITY = eINSTANCE.getExplainability();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLAINABILITY__VALUE = eINSTANCE.getExplainability_Value();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.AccuracyImpl <em>Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.AccuracyImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getAccuracy()
		 * @generated
		 */
		EClass ACCURACY = eINSTANCE.getAccuracy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCURACY__VALUE = eINSTANCE.getAccuracy_Value();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.CollectedDataKnowledgeAboutTemplateConstructionImpl <em>Collected Data Knowledge About Template Construction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.CollectedDataKnowledgeAboutTemplateConstructionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getCollectedDataKnowledgeAboutTemplateConstruction()
		 * @generated
		 */
		EClass COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION = eINSTANCE
				.getCollectedDataKnowledgeAboutTemplateConstruction();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE = eINSTANCE
				.getCollectedDataKnowledgeAboutTemplateConstruction_Rule();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.RuleImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Resultat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RESULTAT = eINSTANCE.getRule_Resultat();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ConditionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__TERM = eINSTANCE.getCondition_Term();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ResultatImpl <em>Resultat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ResultatImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getResultat()
		 * @generated
		 */
		EClass RESULTAT = eINSTANCE.getResultat();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULTAT__TERM = eINSTANCE.getResultat_Term();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.variableImpl <em>variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.variableImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getvariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getvariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getvariable_Name();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALEUR = eINSTANCE.getvariable_Valeur();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.TermImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.connectorImpl <em>connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.connectorImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getconnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getconnector();

		/**
		 * The meta object literal for the '<em><b>Conneteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__CONNETEUR = eINSTANCE.getconnector_Conneteur();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ComponentImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataCleaningImpl <em>Data Cleaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataCleaningImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataCleaning()
		 * @generated
		 */
		EClass DATA_CLEANING = eINSTANCE.getDataCleaning();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataPretraitementImpl <em>Data Pretraitement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataPretraitementImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPretraitement()
		 * @generated
		 */
		EClass DATA_PRETRAITEMENT = eINSTANCE.getDataPretraitement();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.FeatureSelectionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getFeatureSelection()
		 * @generated
		 */
		EClass FEATURE_SELECTION = eINSTANCE.getFeatureSelection();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.FeatureConstructionImpl <em>Feature Construction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.FeatureConstructionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getFeatureConstruction()
		 * @generated
		 */
		EClass FEATURE_CONSTRUCTION = eINSTANCE.getFeatureConstruction();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.PostTreatementImpl <em>Post Treatement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.PostTreatementImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getPostTreatement()
		 * @generated
		 */
		EClass POST_TREATEMENT = eINSTANCE.getPostTreatement();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DeployementImpl <em>Deployement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DeployementImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDeployement()
		 * @generated
		 */
		EClass DEPLOYEMENT = eINSTANCE.getDeployement();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.RemoveUncessaryFiledsImpl <em>Remove Uncessary Fileds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.RemoveUncessaryFiledsImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRemoveUncessaryFileds()
		 * @generated
		 */
		EClass REMOVE_UNCESSARY_FILEDS = eINSTANCE.getRemoveUncessaryFileds();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_UNCESSARY_FILEDS__METHOD = eINSTANCE.getRemoveUncessaryFileds_Method();

		/**
		 * The meta object literal for the '<em><b>Remove IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REMOVE_UNCESSARY_FILEDS___REMOVE_IDS = eINSTANCE.getRemoveUncessaryFileds__RemoveIDs();

		/**
		 * The meta object literal for the '<em><b>Remove Special Characters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REMOVE_UNCESSARY_FILEDS___REMOVE_SPECIAL_CHARACTERS = eINSTANCE
				.getRemoveUncessaryFileds__RemoveSpecialCharacters();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.ConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.ConversionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getConversion()
		 * @generated
		 */
		EClass CONVERSION = eINSTANCE.getConversion();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSION__METHOD = eINSTANCE.getConversion_Method();

		/**
		 * The meta object literal for the '<em><b>Convert Categorical Attributes To Continue</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION___CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE = eINSTANCE
				.getConversion__ConvertCategoricalAttributesToContinue();

		/**
		 * The meta object literal for the '<em><b>Convert Continue Attributes To Categorical</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION___CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL = eINSTANCE
				.getConversion__ConvertContinueAttributesToCategorical();

		/**
		 * The meta object literal for the '<em><b>Detect Attribute Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONVERSION___DETECT_ATTRIBUTE_TYPE = eINSTANCE.getConversion__DetectAttributeType();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.NoiseTreatementImpl <em>Noise Treatement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.NoiseTreatementImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getNoiseTreatement()
		 * @generated
		 */
		EClass NOISE_TREATEMENT = eINSTANCE.getNoiseTreatement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOISE_TREATEMENT__METHOD = eINSTANCE.getNoiseTreatement_Method();

		/**
		 * The meta object literal for the '<em><b>Remove Noise From Fileds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOISE_TREATEMENT___REMOVE_NOISE_FROM_FILEDS = eINSTANCE.getNoiseTreatement__RemoveNoiseFromFileds();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.MissingValueTreatementImpl <em>Missing Value Treatement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.MissingValueTreatementImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMissingValueTreatement()
		 * @generated
		 */
		EClass MISSING_VALUE_TREATEMENT = eINSTANCE.getMissingValueTreatement();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.SelectionCriteriaImpl <em>Selection Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.SelectionCriteriaImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriteria()
		 * @generated
		 */
		EClass SELECTION_CRITERIA = eINSTANCE.getSelectionCriteria();

		/**
		 * The meta object literal for the '<em><b>Criteria Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERIA__CRITERIA_NAME = eINSTANCE.getSelectionCriteria_CriteriaName();

		/**
		 * The meta object literal for the '<em><b>Criteria Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERIA__CRITERIA_VALUE = eINSTANCE.getSelectionCriteria_CriteriaValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_CRITERIA__ID = eINSTANCE.getSelectionCriteria_Id();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.MLAlgorithmSelectionCriteriaContainerImpl <em>ML Algorithm Selection Criteria Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.MLAlgorithmSelectionCriteriaContainerImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithmSelectionCriteriaContainer()
		 * @generated
		 */
		EClass ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER = eINSTANCE.getMLAlgorithmSelectionCriteriaContainer();

		/**
		 * The meta object literal for the '<em><b>Selection Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__SELECTION_CRITERIA = eINSTANCE
				.getMLAlgorithmSelectionCriteriaContainer_SelectionCriteria();

		/**
		 * The meta object literal for the '<em><b>Regle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE = eINSTANCE
				.getMLAlgorithmSelectionCriteriaContainer_Regle();

		/**
		 * The meta object literal for the '<em><b>Componenet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__COMPONENET = eINSTANCE
				.getMLAlgorithmSelectionCriteriaContainer_Componenet();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DataBaseConnectionImpl <em>Data Base Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DataBaseConnectionImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataBaseConnection()
		 * @generated
		 */
		EClass DATA_BASE_CONNECTION = eINSTANCE.getDataBaseConnection();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE_CONNECTION__URL = eINSTANCE.getDataBaseConnection_URL();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE_CONNECTION__USER = eINSTANCE.getDataBaseConnection_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE_CONNECTION__PASSWORD = eINSTANCE.getDataBaseConnection_Password();

		/**
		 * The meta object literal for the '{@link projetTemplate.Values1 <em>Values1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.Values1
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getValues1()
		 * @generated
		 */
		EEnum VALUES1 = eINSTANCE.getValues1();

		/**
		 * The meta object literal for the '{@link projetTemplate.Values2 <em>Values2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.Values2
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getValues2()
		 * @generated
		 */
		EEnum VALUES2 = eINSTANCE.getValues2();

		/**
		 * The meta object literal for the '{@link projetTemplate.RequirementTypeValues <em>Requirement Type Values</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.RequirementTypeValues
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRequirementTypeValues()
		 * @generated
		 */
		EEnum REQUIREMENT_TYPE_VALUES = eINSTANCE.getRequirementTypeValues();

		/**
		 * The meta object literal for the '{@link projetTemplate.EnumDataAnalysisProblemType <em>Enum Data Analysis Problem Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.EnumDataAnalysisProblemType
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getEnumDataAnalysisProblemType()
		 * @generated
		 */
		EEnum ENUM_DATA_ANALYSIS_PROBLEM_TYPE = eINSTANCE.getEnumDataAnalysisProblemType();

		/**
		 * The meta object literal for the '{@link projetTemplate.EnumConnector <em>Enum Connector</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.EnumConnector
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getEnumConnector()
		 * @generated
		 */
		EEnum ENUM_CONNECTOR = eINSTANCE.getEnumConnector();

		/**
		 * The meta object literal for the '{@link projetTemplate.ConversionEnum <em>Conversion Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.ConversionEnum
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getConversionEnum()
		 * @generated
		 */
		EEnum CONVERSION_ENUM = eINSTANCE.getConversionEnum();

		/**
		 * The meta object literal for the '{@link projetTemplate.RemoveUncessaryFiledsEnum <em>Remove Uncessary Fileds Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.RemoveUncessaryFiledsEnum
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRemoveUncessaryFiledsEnum()
		 * @generated
		 */
		EEnum REMOVE_UNCESSARY_FILEDS_ENUM = eINSTANCE.getRemoveUncessaryFiledsEnum();

		/**
		 * The meta object literal for the '{@link projetTemplate.NoiseTreatementEnum <em>Noise Treatement Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.NoiseTreatementEnum
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getNoiseTreatementEnum()
		 * @generated
		 */
		EEnum NOISE_TREATEMENT_ENUM = eINSTANCE.getNoiseTreatementEnum();

		/**
		 * The meta object literal for the '{@link projetTemplate.MissingValueTreatementEnum <em>Missing Value Treatement Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.MissingValueTreatementEnum
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMissingValueTreatementEnum()
		 * @generated
		 */
		EEnum MISSING_VALUE_TREATEMENT_ENUM = eINSTANCE.getMissingValueTreatementEnum();

		/**
		 * The meta object literal for the '{@link projetTemplate.MLAlgorithms <em>ML Algorithms</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.MLAlgorithms
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLAlgorithms()
		 * @generated
		 */
		EEnum ML_ALGORITHMS = eINSTANCE.getMLAlgorithms();

		/**
		 * The meta object literal for the '{@link projetTemplate.Componenets <em>Componenets</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.Componenets
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getComponenets()
		 * @generated
		 */
		EEnum COMPONENETS = eINSTANCE.getComponenets();

		/**
		 * The meta object literal for the '<em>New Data Type10</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getNewDataType10()
		 * @generated
		 */
		EDataType NEW_DATA_TYPE10 = eINSTANCE.getNewDataType10();

	}

} //ProjetTemplatePackage
