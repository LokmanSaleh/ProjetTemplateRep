/**
 */
package projetTemplate.impl;

import java.sql.SQLException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projetTemplate.*;

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
		case ProjetTemplatePackage.PROCESSING_CHAIN:
			return createProcessingChain();
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN:
			return createMLProcChainSolutionPattern();
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE:
			return createProcessingChainTemplate();
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
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
		SchemaImpl schema = null;
		try {
			schema = new SchemaImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
