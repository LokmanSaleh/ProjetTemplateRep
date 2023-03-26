/**
 */
package projetTemplate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projetTemplate.Accuracy;
import projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction;
import projetTemplate.Component;
import projetTemplate.ComputationalRequirementValue;
import projetTemplate.Condition;
import projetTemplate.Conversion;
import projetTemplate.ConversionEnum;
import projetTemplate.Data;
import projetTemplate.DataAnalysisProblem;
import projetTemplate.DataAnalysisProblemType;
import projetTemplate.DataCleaning;
import projetTemplate.DataPretraitement;
import projetTemplate.DataPropertyType;
import projetTemplate.DataPropertyValue;
import projetTemplate.DataPropertyValueSet;
import projetTemplate.Database;
import projetTemplate.Deployement;
import projetTemplate.DomainProblem;
import projetTemplate.DomainRequirementValue;
import projetTemplate.EnumConnector;
import projetTemplate.EnumDataAnalysisProblemType;
import projetTemplate.Explainability;
import projetTemplate.ExtendedBPMNModel;
import projetTemplate.FeatureConstruction;
import projetTemplate.FeatureSelection;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLAlgorithms;
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.MLProject;
import projetTemplate.MissingValueTreatement;
import projetTemplate.MissingValueTreatementEnum;
import projetTemplate.ModelElement;
import projetTemplate.NoiseTreatement;
import projetTemplate.NoiseTreatementEnum;
import projetTemplate.PostTreatement;
import projetTemplate.ProcessingChain;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplateFactory;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RemoveUncessaryFileds;
import projetTemplate.RemoveUncessaryFiledsEnum;
import projetTemplate.RequirementMapping;
import projetTemplate.RequirementType;
import projetTemplate.RequirementTypeValues;
import projetTemplate.Resultat;
import projetTemplate.Rule;
import projetTemplate.Schema;
import projetTemplate.SelectionCriterion;
import projetTemplate.SelectionCriterionValue;
import projetTemplate.SelectionCriterionValueSet;
import projetTemplate.Term;
import projetTemplate.Values1;
import projetTemplate.Values2;
import projetTemplate.connector;
import projetTemplate.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetTemplateFactoryImpl extends EFactoryImpl implements ProjetTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjetTemplateFactory init() {
		try {
			ProjetTemplateFactory theProjetTemplateFactory = (ProjetTemplateFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProjetTemplatePackage.eNS_URI);
			if (theProjetTemplateFactory != null) {
				return theProjetTemplateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjetTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTemplateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProjetTemplatePackage.DOMAIN_PROBLEM:
			return createDomainProblem();
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE:
			return createDomainRequirementValue();
		case ProjetTemplatePackage.REQUIREMENT_TYPE:
			return createRequirementType();
		case ProjetTemplatePackage.ML_PROJECT:
			return createMLProject();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM:
			return createDataAnalysisProblem();
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE:
			return createComputationalRequirementValue();
		case ProjetTemplatePackage.DATABASE:
			return createDatabase();
		case ProjetTemplatePackage.SCHEMA:
			return createSchema();
		case ProjetTemplatePackage.DATA:
			return createData();
		case ProjetTemplatePackage.REQUIREMENT_MAPPING:
			return createRequirementMapping();
		case ProjetTemplatePackage.MODEL_ELEMENT:
			return createModelElement();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET:
			return createDataPropertyValueSet();
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE:
			return createDataPropertyValue();
		case ProjetTemplatePackage.DATA_PROPERTY_TYPE:
			return createDataPropertyType();
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE:
			return createDataAnalysisProblemType();
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE:
			return createProcessingChainTemplate();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN:
			return createMLProcChainSolutionPattern();
		case ProjetTemplatePackage.PROCESSING_CHAIN:
			return createProcessingChain();
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN:
			return createMLAlgorithmSolutionPattern();
		case ProjetTemplatePackage.ML_ALGORITHM:
			return createMLAlgorithm();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET:
			return createSelectionCriterionValueSet();
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE:
			return createSelectionCriterionValue();
		case ProjetTemplatePackage.SELECTION_CRITERION:
			return createSelectionCriterion();
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL:
			return createExtendedBPMNModel();
		case ProjetTemplatePackage.EXPLAINABILITY:
			return createExplainability();
		case ProjetTemplatePackage.ACCURACY:
			return createAccuracy();
		case ProjetTemplatePackage.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION:
			return createCollectedDataKnowledgeAboutTemplateConstruction();
		case ProjetTemplatePackage.RULE:
			return createRule();
		case ProjetTemplatePackage.CONDITION:
			return createCondition();
		case ProjetTemplatePackage.RESULTAT:
			return createResultat();
		case ProjetTemplatePackage.VARIABLE:
			return createvariable();
		case ProjetTemplatePackage.TERM:
			return createTerm();
		case ProjetTemplatePackage.CONNECTOR:
			return createconnector();
		case ProjetTemplatePackage.COMPONENT:
			return createComponent();
		case ProjetTemplatePackage.DATA_CLEANING:
			return createDataCleaning();
		case ProjetTemplatePackage.DATA_PRETRAITEMENT:
			return createDataPretraitement();
		case ProjetTemplatePackage.FEATURE_SELECTION:
			return createFeatureSelection();
		case ProjetTemplatePackage.FEATURE_CONSTRUCTION:
			return createFeatureConstruction();
		case ProjetTemplatePackage.POST_TREATEMENT:
			return createPostTreatement();
		case ProjetTemplatePackage.DEPLOYEMENT:
			return createDeployement();
		case ProjetTemplatePackage.REMOVE_UNCESSARY_FILEDS:
			return createRemoveUncessaryFileds();
		case ProjetTemplatePackage.CONVERSION:
			return createConversion();
		case ProjetTemplatePackage.NOISE_TREATEMENT:
			return createNoiseTreatement();
		case ProjetTemplatePackage.MISSING_VALUE_TREATEMENT:
			return createMissingValueTreatement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ProjetTemplatePackage.VALUES1:
			return createValues1FromString(eDataType, initialValue);
		case ProjetTemplatePackage.VALUES2:
			return createValues2FromString(eDataType, initialValue);
		case ProjetTemplatePackage.REQUIREMENT_TYPE_VALUES:
			return createRequirementTypeValuesFromString(eDataType, initialValue);
		case ProjetTemplatePackage.ENUM_DATA_ANALYSIS_PROBLEM_TYPE:
			return createEnumDataAnalysisProblemTypeFromString(eDataType, initialValue);
		case ProjetTemplatePackage.ENUM_CONNECTOR:
			return createEnumConnectorFromString(eDataType, initialValue);
		case ProjetTemplatePackage.CONVERSION_ENUM:
			return createConversionEnumFromString(eDataType, initialValue);
		case ProjetTemplatePackage.REMOVE_UNCESSARY_FILEDS_ENUM:
			return createRemoveUncessaryFiledsEnumFromString(eDataType, initialValue);
		case ProjetTemplatePackage.NOISE_TREATEMENT_ENUM:
			return createNoiseTreatementEnumFromString(eDataType, initialValue);
		case ProjetTemplatePackage.MISSING_VALUE_TREATEMENT_ENUM:
			return createMissingValueTreatementEnumFromString(eDataType, initialValue);
		case ProjetTemplatePackage.ML_ALGORITHMS:
			return createMLAlgorithmsFromString(eDataType, initialValue);
		case ProjetTemplatePackage.NEW_DATA_TYPE10:
			return createNewDataType10FromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ProjetTemplatePackage.VALUES1:
			return convertValues1ToString(eDataType, instanceValue);
		case ProjetTemplatePackage.VALUES2:
			return convertValues2ToString(eDataType, instanceValue);
		case ProjetTemplatePackage.REQUIREMENT_TYPE_VALUES:
			return convertRequirementTypeValuesToString(eDataType, instanceValue);
		case ProjetTemplatePackage.ENUM_DATA_ANALYSIS_PROBLEM_TYPE:
			return convertEnumDataAnalysisProblemTypeToString(eDataType, instanceValue);
		case ProjetTemplatePackage.ENUM_CONNECTOR:
			return convertEnumConnectorToString(eDataType, instanceValue);
		case ProjetTemplatePackage.CONVERSION_ENUM:
			return convertConversionEnumToString(eDataType, instanceValue);
		case ProjetTemplatePackage.REMOVE_UNCESSARY_FILEDS_ENUM:
			return convertRemoveUncessaryFiledsEnumToString(eDataType, instanceValue);
		case ProjetTemplatePackage.NOISE_TREATEMENT_ENUM:
			return convertNoiseTreatementEnumToString(eDataType, instanceValue);
		case ProjetTemplatePackage.MISSING_VALUE_TREATEMENT_ENUM:
			return convertMissingValueTreatementEnumToString(eDataType, instanceValue);
		case ProjetTemplatePackage.ML_ALGORITHMS:
			return convertMLAlgorithmsToString(eDataType, instanceValue);
		case ProjetTemplatePackage.NEW_DATA_TYPE10:
			return convertNewDataType10ToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainProblem createDomainProblem() {
		DomainProblemImpl domainProblem = new DomainProblemImpl();
		return domainProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRequirementValue createDomainRequirementValue() {
		DomainRequirementValueImpl domainRequirementValue = new DomainRequirementValueImpl();
		return domainRequirementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType createRequirementType() {
		RequirementTypeImpl requirementType = new RequirementTypeImpl();
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLProject createMLProject() {
		MLProjectImpl mlProject = new MLProjectImpl();
		return mlProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblem createDataAnalysisProblem() {
		DataAnalysisProblemImpl dataAnalysisProblem = new DataAnalysisProblemImpl();
		return dataAnalysisProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationalRequirementValue createComputationalRequirementValue() {
		ComputationalRequirementValueImpl computationalRequirementValue = new ComputationalRequirementValueImpl();
		return computationalRequirementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementMapping createRequirementMapping() {
		RequirementMappingImpl requirementMapping = new RequirementMappingImpl();
		return requirementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyValueSet createDataPropertyValueSet() {
		DataPropertyValueSetImpl dataPropertyValueSet = new DataPropertyValueSetImpl();
		return dataPropertyValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyValue createDataPropertyValue() {
		DataPropertyValueImpl dataPropertyValue = new DataPropertyValueImpl();
		return dataPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyType createDataPropertyType() {
		DataPropertyTypeImpl dataPropertyType = new DataPropertyTypeImpl();
		return dataPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalysisProblemType createDataAnalysisProblemType() {
		DataAnalysisProblemTypeImpl dataAnalysisProblemType = new DataAnalysisProblemTypeImpl();
		return dataAnalysisProblemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChain createProcessingChain() {
		ProcessingChainImpl processingChain = new ProcessingChainImpl();
		return processingChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLProcChainSolutionPattern createMLProcChainSolutionPattern() {
		MLProcChainSolutionPatternImpl mlProcChainSolutionPattern = new MLProcChainSolutionPatternImpl();
		return mlProcChainSolutionPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplate createProcessingChainTemplate() {
		ProcessingChainTemplateImpl processingChainTemplate = new ProcessingChainTemplateImpl();
		return processingChainTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLAlgorithmSolutionPattern createMLAlgorithmSolutionPattern() {
		MLAlgorithmSolutionPatternImpl mlAlgorithmSolutionPattern = new MLAlgorithmSolutionPatternImpl();
		return mlAlgorithmSolutionPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLAlgorithm createMLAlgorithm() {
		MLAlgorithmImpl mlAlgorithm = new MLAlgorithmImpl();
		return mlAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterionValueSet createSelectionCriterionValueSet() {
		SelectionCriterionValueSetImpl selectionCriterionValueSet = new SelectionCriterionValueSetImpl();
		return selectionCriterionValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterionValue createSelectionCriterionValue() {
		SelectionCriterionValueImpl selectionCriterionValue = new SelectionCriterionValueImpl();
		return selectionCriterionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionCriterion createSelectionCriterion() {
		SelectionCriterionImpl selectionCriterion = new SelectionCriterionImpl();
		return selectionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedBPMNModel createExtendedBPMNModel() {
		ExtendedBPMNModelImpl extendedBPMNModel = new ExtendedBPMNModelImpl();
		return extendedBPMNModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Explainability createExplainability() {
		ExplainabilityImpl explainability = new ExplainabilityImpl();
		return explainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accuracy createAccuracy() {
		AccuracyImpl accuracy = new AccuracyImpl();
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectedDataKnowledgeAboutTemplateConstruction createCollectedDataKnowledgeAboutTemplateConstruction() {
		CollectedDataKnowledgeAboutTemplateConstructionImpl collectedDataKnowledgeAboutTemplateConstruction = new CollectedDataKnowledgeAboutTemplateConstructionImpl();
		return collectedDataKnowledgeAboutTemplateConstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultat createResultat() {
		ResultatImpl resultat = new ResultatImpl();
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public variable createvariable() {
		variableImpl variable = new variableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public connector createconnector() {
		connectorImpl connector = new connectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCleaning createDataCleaning() {
		DataCleaningImpl dataCleaning = new DataCleaningImpl();
		return dataCleaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPretraitement createDataPretraitement() {
		DataPretraitementImpl dataPretraitement = new DataPretraitementImpl();
		return dataPretraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSelection createFeatureSelection() {
		FeatureSelectionImpl featureSelection = new FeatureSelectionImpl();
		return featureSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureConstruction createFeatureConstruction() {
		FeatureConstructionImpl featureConstruction = new FeatureConstructionImpl();
		return featureConstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostTreatement createPostTreatement() {
		PostTreatementImpl postTreatement = new PostTreatementImpl();
		return postTreatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployement createDeployement() {
		DeployementImpl deployement = new DeployementImpl();
		return deployement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveUncessaryFileds createRemoveUncessaryFileds() {
		RemoveUncessaryFiledsImpl removeUncessaryFileds = new RemoveUncessaryFiledsImpl();
		return removeUncessaryFileds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversion createConversion() {
		ConversionImpl conversion = new ConversionImpl();
		return conversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoiseTreatement createNoiseTreatement() {
		NoiseTreatementImpl noiseTreatement = new NoiseTreatementImpl();
		return noiseTreatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingValueTreatement createMissingValueTreatement() {
		MissingValueTreatementImpl missingValueTreatement = new MissingValueTreatementImpl();
		return missingValueTreatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Values1 createValues1FromString(EDataType eDataType, String initialValue) {
		Values1 result = Values1.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValues1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Values2 createValues2FromString(EDataType eDataType, String initialValue) {
		Values2 result = Values2.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValues2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementTypeValues createRequirementTypeValuesFromString(EDataType eDataType, String initialValue) {
		RequirementTypeValues result = RequirementTypeValues.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequirementTypeValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDataAnalysisProblemType createEnumDataAnalysisProblemTypeFromString(EDataType eDataType,
			String initialValue) {
		EnumDataAnalysisProblemType result = EnumDataAnalysisProblemType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumDataAnalysisProblemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConnector createEnumConnectorFromString(EDataType eDataType, String initialValue) {
		EnumConnector result = EnumConnector.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumConnectorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversionEnum createConversionEnumFromString(EDataType eDataType, String initialValue) {
		ConversionEnum result = ConversionEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConversionEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveUncessaryFiledsEnum createRemoveUncessaryFiledsEnumFromString(EDataType eDataType,
			String initialValue) {
		RemoveUncessaryFiledsEnum result = RemoveUncessaryFiledsEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemoveUncessaryFiledsEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoiseTreatementEnum createNoiseTreatementEnumFromString(EDataType eDataType, String initialValue) {
		NoiseTreatementEnum result = NoiseTreatementEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoiseTreatementEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingValueTreatementEnum createMissingValueTreatementEnumFromString(EDataType eDataType,
			String initialValue) {
		MissingValueTreatementEnum result = MissingValueTreatementEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMissingValueTreatementEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLAlgorithms createMLAlgorithmsFromString(EDataType eDataType, String initialValue) {
		MLAlgorithms result = MLAlgorithms.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMLAlgorithmsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNewDataType10FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewDataType10ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTemplatePackage getProjetTemplatePackage() {
		return (ProjetTemplatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjetTemplatePackage getPackage() {
		return ProjetTemplatePackage.eINSTANCE;
	}

} //ProjetTemplateFactoryImpl
