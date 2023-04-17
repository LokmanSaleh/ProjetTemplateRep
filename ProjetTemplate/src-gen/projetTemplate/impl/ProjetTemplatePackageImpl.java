/**
 */
package projetTemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import genmodel.GenmodelPackage;
import genmodel.impl.GenmodelPackageImpl;
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
import projetTemplate.MLAlgorithmSelectionCriteriaContainer;
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
import projetTemplate.SelectionCriteria;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetTemplatePackageImpl extends EPackageImpl implements ProjetTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRequirementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnalysisProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationalRequirementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnalysisProblemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlProcChainSolutionPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingChainTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlAlgorithmSolutionPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionCriterionValueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionCriterionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedBPMNModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accuracyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectedDataKnowledgeAboutTemplateConstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCleaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPretraitementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postTreatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeUncessaryFiledsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noiseTreatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missingValueTreatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionCriteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlAlgorithmSelectionCriteriaContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum values1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum values2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requirementTypeValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumDataAnalysisProblemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumConnectorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conversionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum removeUncessaryFiledsEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noiseTreatementEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum missingValueTreatementEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mlAlgorithmsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType newDataType10EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see projetTemplate.ProjetTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProjetTemplatePackageImpl() {
		super(eNS_URI, ProjetTemplateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProjetTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProjetTemplatePackage init() {
		if (isInited)
			return (ProjetTemplatePackage) EPackage.Registry.INSTANCE.getEPackage(ProjetTemplatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProjetTemplatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProjetTemplatePackageImpl theProjetTemplatePackage = registeredProjetTemplatePackage instanceof ProjetTemplatePackageImpl
				? (ProjetTemplatePackageImpl) registeredProjetTemplatePackage
				: new ProjetTemplatePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenmodelPackage.eNS_URI);
		GenmodelPackageImpl theGenmodelPackage = (GenmodelPackageImpl) (registeredPackage instanceof GenmodelPackageImpl
				? registeredPackage
				: GenmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theProjetTemplatePackage.createPackageContents();
		theGenmodelPackage.createPackageContents();

		// Initialize created meta-data
		theProjetTemplatePackage.initializePackageContents();
		theGenmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProjetTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProjetTemplatePackage.eNS_URI, theProjetTemplatePackage);
		return theProjetTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainProblem() {
		return domainProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainProblem_Text() {
		return (EAttribute) domainProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainProblem_DomainRequirementValue() {
		return (EReference) domainProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainRequirementValue() {
		return domainRequirementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRequirementValue_Explanation() {
		return (EAttribute) domainRequirementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainRequirementValue_Requirementtype() {
		return (EReference) domainRequirementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainRequirementValue_Domainrequirementselectioncriteria() {
		return (EReference) domainRequirementValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementType() {
		return requirementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementType_Requirementmapping() {
		return (EReference) requirementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_Name() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_Description() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_ValueType() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_Scope() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLProject() {
		return mlProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProject_Name() {
		return (EAttribute) mlProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProject_Date() {
		return (EAttribute) mlProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProject_Author() {
		return (EAttribute) mlProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProject_Dataanalysisproblem() {
		return (EReference) mlProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProject_Domainproblem() {
		return (EReference) mlProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProject_Database() {
		return (EReference) mlProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAnalysisProblem() {
		return dataAnalysisProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblem_Name() {
		return (EAttribute) dataAnalysisProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblem_Date() {
		return (EAttribute) dataAnalysisProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblem_Author() {
		return (EAttribute) dataAnalysisProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblem_Dataanalysisproblemtype() {
		return (EReference) dataAnalysisProblemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblem_Computationalrequirementvalue() {
		return (EReference) dataAnalysisProblemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblem_Mlprocchainsolutionpattern() {
		return (EReference) dataAnalysisProblemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationalRequirementValue() {
		return computationalRequirementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputationalRequirementValue_Value() {
		return (EAttribute) computationalRequirementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputationalRequirementValue_Rationale() {
		return (EAttribute) computationalRequirementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputationalRequirementValue_Requirementtype() {
		return (EReference) computationalRequirementValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Value() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Credentias() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Schema() {
		return (EReference) databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Data() {
		return (EReference) databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Technology() {
		return (EAttribute) schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Modelelement() {
		return (EReference) schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Value() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Credentias() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementMapping() {
		return requirementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementMapping_Restrictions() {
		return (EAttribute) requirementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementMapping_Rationale() {
		return (EAttribute) requirementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementMapping_Requirementtype() {
		return (EReference) requirementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementMapping_Datapropertyvalueset() {
		return (EReference) requirementMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Datapropertyvalue() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyValueSet() {
		return dataPropertyValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyValueSet_SetType() {
		return (EAttribute) dataPropertyValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyValueSet_Values() {
		return (EAttribute) dataPropertyValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyValueSet_Datapropertyvalue() {
		return (EReference) dataPropertyValueSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataPropertyValueSet__Evaluate() {
		return dataPropertyValueSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyValue() {
		return dataPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyValue_Name() {
		return (EAttribute) dataPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyValue_Datapropertytype() {
		return (EReference) dataPropertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyType() {
		return dataPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyType_Name() {
		return (EAttribute) dataPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyType_Type() {
		return (EAttribute) dataPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAnalysisProblemType() {
		return dataAnalysisProblemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblemType_Name() {
		return (EAttribute) dataAnalysisProblemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblemType_Mlalgorithmsolutionpattern() {
		return (EReference) dataAnalysisProblemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingChain() {
		return processingChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChain_Name() {
		return (EAttribute) processingChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChain_Author() {
		return (EAttribute) processingChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChain_Mlalgorithm() {
		return (EReference) processingChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLProcChainSolutionPattern() {
		return mlProcChainSolutionPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProcChainSolutionPattern_Name() {
		return (EAttribute) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProcChainSolutionPattern_Datapropertyvalueset() {
		return (EReference) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProcChainSolutionPattern_Processingchain() {
		return (EReference) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProcChainSolutionPattern_Dataanalysisproblemtype() {
		return (EReference) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProcChainSolutionPattern_ExecutedTemplate() {
		return (EReference) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProcChainSolutionPattern_Collecteddataknowledgeabouttemplateconstruction() {
		return (EReference) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMLProcChainSolutionPattern__ConstruireUneChaineDeTraitementInitiale() {
		return mlProcChainSolutionPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMLProcChainSolutionPattern__MergeProcessingChainAndTemplate() {
		return mlProcChainSolutionPatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingChainTemplate() {
		return processingChainTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChainTemplate_Name() {
		return (EAttribute) processingChainTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChainTemplate_Author() {
		return (EAttribute) processingChainTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChainTemplate_Extendedbpmnmodel() {
		return (EReference) processingChainTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChainTemplate_Processingchaintemplate() {
		return (EReference) processingChainTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProcessingChainTemplate__SelectTheRightMLAlgroithm() {
		return processingChainTemplateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLAlgorithmSolutionPattern() {
		return mlAlgorithmSolutionPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLAlgorithmSolutionPattern_Name() {
		return (EAttribute) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLAlgorithmSolutionPattern_Explanation() {
		return (EAttribute) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithmSolutionPattern_Mlalgorithm() {
		return (EReference) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithmSolutionPattern_Datapropertyvalueset() {
		return (EReference) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLAlgorithm() {
		return mlAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Selectioncriterionvalueset() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Selectioncriterionvalue() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLAlgorithm_Name() {
		return (EAttribute) mlAlgorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Extendedbpmnmodel() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Criteriatochoosemlalgorithm() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionCriterionValueSet() {
		return selectionCriterionValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterionValueSet_SetType() {
		return (EAttribute) selectionCriterionValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterionValueSet_Values() {
		return (EAttribute) selectionCriterionValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterionValueSet_Selectioncriterionvalue() {
		return (EReference) selectionCriterionValueSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterionValueSet_Selectioncriterion() {
		return (EReference) selectionCriterionValueSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionCriterionValue() {
		return selectionCriterionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterionValue_Values() {
		return (EAttribute) selectionCriterionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterionValue_Selectioncriterion() {
		return (EReference) selectionCriterionValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionCriterion() {
		return selectionCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterion_Name() {
		return (EAttribute) selectionCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterion_ValueType() {
		return (EAttribute) selectionCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterion_Description() {
		return (EAttribute) selectionCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedBPMNModel() {
		return extendedBPMNModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedBPMNModel_Path() {
		return (EAttribute) extendedBPMNModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedBPMNModel_Author() {
		return (EAttribute) extendedBPMNModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplainability() {
		return explainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExplainability_Value() {
		return (EAttribute) explainabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccuracy() {
		return accuracyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccuracy_Value() {
		return (EAttribute) accuracyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectedDataKnowledgeAboutTemplateConstruction() {
		return collectedDataKnowledgeAboutTemplateConstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectedDataKnowledgeAboutTemplateConstruction_Rule() {
		return (EReference) collectedDataKnowledgeAboutTemplateConstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Condition() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Resultat() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Term() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultat() {
		return resultatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultat_Term() {
		return (EReference) resultatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvariable_Valeur() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getconnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getconnector_Conneteur() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCleaning() {
		return dataCleaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPretraitement() {
		return dataPretraitementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSelection() {
		return featureSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureConstruction() {
		return featureConstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostTreatement() {
		return postTreatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployement() {
		return deployementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveUncessaryFileds() {
		return removeUncessaryFiledsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveUncessaryFileds_Method() {
		return (EAttribute) removeUncessaryFiledsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRemoveUncessaryFileds__RemoveIDs() {
		return removeUncessaryFiledsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRemoveUncessaryFileds__RemoveSpecialCharacters() {
		return removeUncessaryFiledsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversion() {
		return conversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConversion_Method() {
		return (EAttribute) conversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversion__ConvertCategoricalAttributesToContinue() {
		return conversionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversion__ConvertContinueAttributesToCategorical() {
		return conversionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversion__DetectAttributeType() {
		return conversionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoiseTreatement() {
		return noiseTreatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoiseTreatement_Method() {
		return (EAttribute) noiseTreatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNoiseTreatement__RemoveNoiseFromFileds() {
		return noiseTreatementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissingValueTreatement() {
		return missingValueTreatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionCriteria() {
		return selectionCriteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriteria_CriteriaName() {
		return (EAttribute) selectionCriteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriteria_CriteriaValue() {
		return (EAttribute) selectionCriteriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriteria_Id() {
		return (EAttribute) selectionCriteriaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLAlgorithmSelectionCriteriaContainer() {
		return mlAlgorithmSelectionCriteriaContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithmSelectionCriteriaContainer_Domainrequirementselectioncriteria() {
		return (EReference) mlAlgorithmSelectionCriteriaContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLAlgorithmSelectionCriteriaContainer_Regle() {
		return (EAttribute) mlAlgorithmSelectionCriteriaContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValues1() {
		return values1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValues2() {
		return values2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequirementTypeValues() {
		return requirementTypeValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumDataAnalysisProblemType() {
		return enumDataAnalysisProblemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumConnector() {
		return enumConnectorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConversionEnum() {
		return conversionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRemoveUncessaryFiledsEnum() {
		return removeUncessaryFiledsEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoiseTreatementEnum() {
		return noiseTreatementEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMissingValueTreatementEnum() {
		return missingValueTreatementEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMLAlgorithms() {
		return mlAlgorithmsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNewDataType10() {
		return newDataType10EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTemplateFactory getProjetTemplateFactory() {
		return (ProjetTemplateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		domainProblemEClass = createEClass(DOMAIN_PROBLEM);
		createEAttribute(domainProblemEClass, DOMAIN_PROBLEM__TEXT);
		createEReference(domainProblemEClass, DOMAIN_PROBLEM__DOMAIN_REQUIREMENT_VALUE);

		domainRequirementValueEClass = createEClass(DOMAIN_REQUIREMENT_VALUE);
		createEAttribute(domainRequirementValueEClass, DOMAIN_REQUIREMENT_VALUE__EXPLANATION);
		createEReference(domainRequirementValueEClass, DOMAIN_REQUIREMENT_VALUE__REQUIREMENTTYPE);
		createEReference(domainRequirementValueEClass, DOMAIN_REQUIREMENT_VALUE__DOMAINREQUIREMENTSELECTIONCRITERIA);

		requirementTypeEClass = createEClass(REQUIREMENT_TYPE);
		createEReference(requirementTypeEClass, REQUIREMENT_TYPE__REQUIREMENTMAPPING);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__NAME);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__DESCRIPTION);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__VALUE_TYPE);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__SCOPE);

		mlProjectEClass = createEClass(ML_PROJECT);
		createEAttribute(mlProjectEClass, ML_PROJECT__NAME);
		createEAttribute(mlProjectEClass, ML_PROJECT__DATE);
		createEAttribute(mlProjectEClass, ML_PROJECT__AUTHOR);
		createEReference(mlProjectEClass, ML_PROJECT__DATAANALYSISPROBLEM);
		createEReference(mlProjectEClass, ML_PROJECT__DOMAINPROBLEM);
		createEReference(mlProjectEClass, ML_PROJECT__DATABASE);

		dataAnalysisProblemEClass = createEClass(DATA_ANALYSIS_PROBLEM);
		createEAttribute(dataAnalysisProblemEClass, DATA_ANALYSIS_PROBLEM__NAME);
		createEAttribute(dataAnalysisProblemEClass, DATA_ANALYSIS_PROBLEM__DATE);
		createEAttribute(dataAnalysisProblemEClass, DATA_ANALYSIS_PROBLEM__AUTHOR);
		createEReference(dataAnalysisProblemEClass, DATA_ANALYSIS_PROBLEM__DATAANALYSISPROBLEMTYPE);
		createEReference(dataAnalysisProblemEClass, DATA_ANALYSIS_PROBLEM__COMPUTATIONALREQUIREMENTVALUE);
		createEReference(dataAnalysisProblemEClass, DATA_ANALYSIS_PROBLEM__MLPROCCHAINSOLUTIONPATTERN);

		computationalRequirementValueEClass = createEClass(COMPUTATIONAL_REQUIREMENT_VALUE);
		createEAttribute(computationalRequirementValueEClass, COMPUTATIONAL_REQUIREMENT_VALUE__VALUE);
		createEAttribute(computationalRequirementValueEClass, COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE);
		createEReference(computationalRequirementValueEClass, COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__VALUE);
		createEAttribute(databaseEClass, DATABASE__CREDENTIAS);
		createEReference(databaseEClass, DATABASE__SCHEMA);
		createEReference(databaseEClass, DATABASE__DATA);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__TECHNOLOGY);
		createEReference(schemaEClass, SCHEMA__MODELELEMENT);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__VALUE);
		createEAttribute(dataEClass, DATA__CREDENTIAS);

		requirementMappingEClass = createEClass(REQUIREMENT_MAPPING);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__RESTRICTIONS);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__RATIONALE);
		createEReference(requirementMappingEClass, REQUIREMENT_MAPPING__REQUIREMENTTYPE);
		createEReference(requirementMappingEClass, REQUIREMENT_MAPPING__DATAPROPERTYVALUESET);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__DATAPROPERTYVALUE);

		dataPropertyValueSetEClass = createEClass(DATA_PROPERTY_VALUE_SET);
		createEAttribute(dataPropertyValueSetEClass, DATA_PROPERTY_VALUE_SET__SET_TYPE);
		createEAttribute(dataPropertyValueSetEClass, DATA_PROPERTY_VALUE_SET__VALUES);
		createEReference(dataPropertyValueSetEClass, DATA_PROPERTY_VALUE_SET__DATAPROPERTYVALUE);
		createEOperation(dataPropertyValueSetEClass, DATA_PROPERTY_VALUE_SET___EVALUATE);

		dataPropertyValueEClass = createEClass(DATA_PROPERTY_VALUE);
		createEAttribute(dataPropertyValueEClass, DATA_PROPERTY_VALUE__NAME);
		createEReference(dataPropertyValueEClass, DATA_PROPERTY_VALUE__DATAPROPERTYTYPE);

		dataPropertyTypeEClass = createEClass(DATA_PROPERTY_TYPE);
		createEAttribute(dataPropertyTypeEClass, DATA_PROPERTY_TYPE__NAME);
		createEAttribute(dataPropertyTypeEClass, DATA_PROPERTY_TYPE__TYPE);

		dataAnalysisProblemTypeEClass = createEClass(DATA_ANALYSIS_PROBLEM_TYPE);
		createEAttribute(dataAnalysisProblemTypeEClass, DATA_ANALYSIS_PROBLEM_TYPE__NAME);
		createEReference(dataAnalysisProblemTypeEClass, DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN);

		processingChainTemplateEClass = createEClass(PROCESSING_CHAIN_TEMPLATE);
		createEAttribute(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__NAME);
		createEAttribute(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__AUTHOR);
		createEReference(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL);
		createEReference(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__PROCESSINGCHAINTEMPLATE);
		createEOperation(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE___SELECT_THE_RIGHT_ML_ALGROITHM);

		mlProcChainSolutionPatternEClass = createEClass(ML_PROC_CHAIN_SOLUTION_PATTERN);
		createEAttribute(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__NAME);
		createEReference(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET);
		createEReference(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__PROCESSINGCHAIN);
		createEReference(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE);
		createEReference(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__EXECUTED_TEMPLATE);
		createEReference(mlProcChainSolutionPatternEClass,
				ML_PROC_CHAIN_SOLUTION_PATTERN__COLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION);
		createEOperation(mlProcChainSolutionPatternEClass,
				ML_PROC_CHAIN_SOLUTION_PATTERN___CONSTRUIRE_UNE_CHAINE_DE_TRAITEMENT_INITIALE);
		createEOperation(mlProcChainSolutionPatternEClass,
				ML_PROC_CHAIN_SOLUTION_PATTERN___MERGE_PROCESSING_CHAIN_AND_TEMPLATE);

		processingChainEClass = createEClass(PROCESSING_CHAIN);
		createEAttribute(processingChainEClass, PROCESSING_CHAIN__NAME);
		createEAttribute(processingChainEClass, PROCESSING_CHAIN__AUTHOR);
		createEReference(processingChainEClass, PROCESSING_CHAIN__MLALGORITHM);

		mlAlgorithmSolutionPatternEClass = createEClass(ML_ALGORITHM_SOLUTION_PATTERN);
		createEAttribute(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__NAME);
		createEAttribute(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION);
		createEReference(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM);
		createEReference(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET);

		mlAlgorithmEClass = createEClass(ML_ALGORITHM);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__SELECTIONCRITERIONVALUESET);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__SELECTIONCRITERIONVALUE);
		createEAttribute(mlAlgorithmEClass, ML_ALGORITHM__NAME);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__EXTENDEDBPMNMODEL);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__CRITERIATOCHOOSEMLALGORITHM);

		selectionCriterionValueSetEClass = createEClass(SELECTION_CRITERION_VALUE_SET);
		createEAttribute(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__SET_TYPE);
		createEAttribute(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__VALUES);
		createEReference(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE);
		createEReference(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION);

		selectionCriterionValueEClass = createEClass(SELECTION_CRITERION_VALUE);
		createEAttribute(selectionCriterionValueEClass, SELECTION_CRITERION_VALUE__VALUES);
		createEReference(selectionCriterionValueEClass, SELECTION_CRITERION_VALUE__SELECTIONCRITERION);

		selectionCriterionEClass = createEClass(SELECTION_CRITERION);
		createEAttribute(selectionCriterionEClass, SELECTION_CRITERION__NAME);
		createEAttribute(selectionCriterionEClass, SELECTION_CRITERION__VALUE_TYPE);
		createEAttribute(selectionCriterionEClass, SELECTION_CRITERION__DESCRIPTION);

		extendedBPMNModelEClass = createEClass(EXTENDED_BPMN_MODEL);
		createEAttribute(extendedBPMNModelEClass, EXTENDED_BPMN_MODEL__PATH);
		createEAttribute(extendedBPMNModelEClass, EXTENDED_BPMN_MODEL__AUTHOR);

		explainabilityEClass = createEClass(EXPLAINABILITY);
		createEAttribute(explainabilityEClass, EXPLAINABILITY__VALUE);

		accuracyEClass = createEClass(ACCURACY);
		createEAttribute(accuracyEClass, ACCURACY__VALUE);

		collectedDataKnowledgeAboutTemplateConstructionEClass = createEClass(
				COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION);
		createEReference(collectedDataKnowledgeAboutTemplateConstructionEClass,
				COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__CONDITION);
		createEReference(ruleEClass, RULE__RESULTAT);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__TERM);

		resultatEClass = createEClass(RESULTAT);
		createEReference(resultatEClass, RESULTAT__TERM);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALEUR);

		termEClass = createEClass(TERM);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__CONNETEUR);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);

		dataCleaningEClass = createEClass(DATA_CLEANING);

		dataPretraitementEClass = createEClass(DATA_PRETRAITEMENT);

		featureSelectionEClass = createEClass(FEATURE_SELECTION);

		featureConstructionEClass = createEClass(FEATURE_CONSTRUCTION);

		postTreatementEClass = createEClass(POST_TREATEMENT);

		deployementEClass = createEClass(DEPLOYEMENT);

		removeUncessaryFiledsEClass = createEClass(REMOVE_UNCESSARY_FILEDS);
		createEAttribute(removeUncessaryFiledsEClass, REMOVE_UNCESSARY_FILEDS__METHOD);
		createEOperation(removeUncessaryFiledsEClass, REMOVE_UNCESSARY_FILEDS___REMOVE_IDS);
		createEOperation(removeUncessaryFiledsEClass, REMOVE_UNCESSARY_FILEDS___REMOVE_SPECIAL_CHARACTERS);

		conversionEClass = createEClass(CONVERSION);
		createEAttribute(conversionEClass, CONVERSION__METHOD);
		createEOperation(conversionEClass, CONVERSION___CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE);
		createEOperation(conversionEClass, CONVERSION___CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL);
		createEOperation(conversionEClass, CONVERSION___DETECT_ATTRIBUTE_TYPE);

		noiseTreatementEClass = createEClass(NOISE_TREATEMENT);
		createEAttribute(noiseTreatementEClass, NOISE_TREATEMENT__METHOD);
		createEOperation(noiseTreatementEClass, NOISE_TREATEMENT___REMOVE_NOISE_FROM_FILEDS);

		missingValueTreatementEClass = createEClass(MISSING_VALUE_TREATEMENT);

		selectionCriteriaEClass = createEClass(SELECTION_CRITERIA);
		createEAttribute(selectionCriteriaEClass, SELECTION_CRITERIA__CRITERIA_NAME);
		createEAttribute(selectionCriteriaEClass, SELECTION_CRITERIA__CRITERIA_VALUE);
		createEAttribute(selectionCriteriaEClass, SELECTION_CRITERIA__ID);

		mlAlgorithmSelectionCriteriaContainerEClass = createEClass(ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER);
		createEReference(mlAlgorithmSelectionCriteriaContainerEClass,
				ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__DOMAINREQUIREMENTSELECTIONCRITERIA);
		createEAttribute(mlAlgorithmSelectionCriteriaContainerEClass, ML_ALGORITHM_SELECTION_CRITERIA_CONTAINER__REGLE);

		// Create enums
		values1EEnum = createEEnum(VALUES1);
		values2EEnum = createEEnum(VALUES2);
		requirementTypeValuesEEnum = createEEnum(REQUIREMENT_TYPE_VALUES);
		enumDataAnalysisProblemTypeEEnum = createEEnum(ENUM_DATA_ANALYSIS_PROBLEM_TYPE);
		enumConnectorEEnum = createEEnum(ENUM_CONNECTOR);
		conversionEnumEEnum = createEEnum(CONVERSION_ENUM);
		removeUncessaryFiledsEnumEEnum = createEEnum(REMOVE_UNCESSARY_FILEDS_ENUM);
		noiseTreatementEnumEEnum = createEEnum(NOISE_TREATEMENT_ENUM);
		missingValueTreatementEnumEEnum = createEEnum(MISSING_VALUE_TREATEMENT_ENUM);
		mlAlgorithmsEEnum = createEEnum(ML_ALGORITHMS);

		// Create data types
		newDataType10EDataType = createEDataType(NEW_DATA_TYPE10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(this.getTerm());
		connectorEClass.getESuperTypes().add(this.getTerm());
		dataCleaningEClass.getESuperTypes().add(this.getComponent());
		dataPretraitementEClass.getESuperTypes().add(this.getComponent());
		featureSelectionEClass.getESuperTypes().add(this.getComponent());
		featureConstructionEClass.getESuperTypes().add(this.getComponent());
		postTreatementEClass.getESuperTypes().add(this.getComponent());
		deployementEClass.getESuperTypes().add(this.getComponent());
		removeUncessaryFiledsEClass.getESuperTypes().add(this.getDataCleaning());
		conversionEClass.getESuperTypes().add(this.getDataPretraitement());
		noiseTreatementEClass.getESuperTypes().add(this.getDataPretraitement());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainProblemEClass, DomainProblem.class, "DomainProblem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainProblem_Text(), ecorePackage.getEString(), "text", null, 0, 1, DomainProblem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainProblem_DomainRequirementValue(), this.getDomainRequirementValue(), null,
				"DomainRequirementValue", null, 0, -1, DomainProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainRequirementValueEClass, DomainRequirementValue.class, "DomainRequirementValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainRequirementValue_Explanation(), ecorePackage.getEString(), "explanation", null, 0, 1,
				DomainRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainRequirementValue_Requirementtype(), this.getRequirementType(), null, "requirementtype",
				null, 1, 1, DomainRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainRequirementValue_Domainrequirementselectioncriteria(), this.getSelectionCriteria(),
				null, "domainrequirementselectioncriteria", null, 1, -1, DomainRequirementValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(requirementTypeEClass, RequirementType.class, "RequirementType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementType_Requirementmapping(), this.getRequirementMapping(), null,
				"requirementmapping", null, 1, 1, RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RequirementType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementType_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementType_ValueType(), this.getRequirementTypeValues(), "valueType", null, 0, 1,
				RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementType_Scope(), ecorePackage.getEString(), "scope", null, 0, 1,
				RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mlProjectEClass, MLProject.class, "MLProject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, MLProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLProject_Date(), ecorePackage.getEString(), "date", null, 0, 1, MLProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLProject_Author(), ecorePackage.getEString(), "author", null, 0, 1, MLProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProject_Dataanalysisproblem(), this.getDataAnalysisProblem(), null, "dataanalysisproblem",
				null, 1, 1, MLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProject_Domainproblem(), this.getDomainProblem(), null, "domainproblem", null, 1, 1,
				MLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProject_Database(), this.getDatabase(), null, "database", null, 0, 1, MLProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAnalysisProblemEClass, DataAnalysisProblem.class, "DataAnalysisProblem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAnalysisProblem_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DataAnalysisProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAnalysisProblem_Date(), ecorePackage.getEString(), "date", null, 0, 1,
				DataAnalysisProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAnalysisProblem_Author(), ecorePackage.getEString(), "author", null, 0, 1,
				DataAnalysisProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalysisProblem_Dataanalysisproblemtype(), this.getDataAnalysisProblemType(), null,
				"dataanalysisproblemtype", null, 1, 1, DataAnalysisProblem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalysisProblem_Computationalrequirementvalue(), this.getComputationalRequirementValue(),
				null, "computationalrequirementvalue", null, 0, -1, DataAnalysisProblem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDataAnalysisProblem_Mlprocchainsolutionpattern(), this.getMLProcChainSolutionPattern(), null,
				"mlprocchainsolutionpattern", null, 0, 1, DataAnalysisProblem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computationalRequirementValueEClass, ComputationalRequirementValue.class,
				"ComputationalRequirementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputationalRequirementValue_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				ComputationalRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalRequirementValue_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1,
				ComputationalRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputationalRequirementValue_Requirementtype(), this.getRequirementType(), null,
				"requirementtype", null, 0, 1, ComputationalRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Value(), ecorePackage.getEString(), "value", null, 0, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Credentias(), ecorePackage.getEString(), "credentias", null, 0, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Schema(), this.getSchema(), null, "schema", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Data(), this.getData(), null, "data", null, 1, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_Technology(), ecorePackage.getEString(), "technology", null, 0, 1, Schema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Modelelement(), this.getModelElement(), null, "modelelement", null, 1, 1, Schema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Value(), ecorePackage.getEString(), "value", null, 0, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Credentias(), ecorePackage.getEString(), "credentias", null, 0, 1, Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementMappingEClass, RequirementMapping.class, "RequirementMapping", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementMapping_Restrictions(), ecorePackage.getEString(), "restrictions", null, 0, 1,
				RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementMapping_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1,
				RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementMapping_Requirementtype(), this.getRequirementType(), null, "requirementtype",
				null, 1, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementMapping_Datapropertyvalueset(), this.getDataPropertyValueSet(), null,
				"datapropertyvalueset", null, 1, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Datapropertyvalue(), this.getDataPropertyValue(), null, "datapropertyvalue",
				null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyValueSetEClass, DataPropertyValueSet.class, "DataPropertyValueSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPropertyValueSet_SetType(), ecorePackage.getEString(), "setType", null, 0, 1,
				DataPropertyValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPropertyValueSet_Values(), ecorePackage.getEString(), "values", null, 0, 1,
				DataPropertyValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyValueSet_Datapropertyvalue(), this.getDataPropertyValue(), null,
				"datapropertyvalue", null, 0, -1, DataPropertyValueSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataPropertyValueSet__Evaluate(), null, "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataPropertyValueEClass, DataPropertyValue.class, "DataPropertyValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPropertyValue_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DataPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyValue_Datapropertytype(), this.getDataPropertyType(), null, "datapropertytype",
				null, 1, 1, DataPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPropertyTypeEClass, DataPropertyType.class, "DataPropertyType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPropertyType_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPropertyType_Type(), ecorePackage.getEString(), "type", null, 0, 1,
				DataPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataAnalysisProblemTypeEClass, DataAnalysisProblemType.class, "DataAnalysisProblemType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAnalysisProblemType_Name(), this.getEnumDataAnalysisProblemType(), "Name", null, 0, 1,
				DataAnalysisProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalysisProblemType_Mlalgorithmsolutionpattern(), this.getMLAlgorithmSolutionPattern(),
				null, "mlalgorithmsolutionpattern", null, 0, -1, DataAnalysisProblemType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(processingChainTemplateEClass, ProcessingChainTemplate.class, "ProcessingChainTemplate",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingChainTemplate_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ProcessingChainTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingChainTemplate_Author(), ecorePackage.getEString(), "author", null, 0, 1,
				ProcessingChainTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingChainTemplate_Extendedbpmnmodel(), this.getExtendedBPMNModel(), null,
				"extendedbpmnmodel", null, 1, 1, ProcessingChainTemplate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingChainTemplate_Processingchaintemplate(), this.getProcessingChain(), null,
				"processingchaintemplate", null, 1, -1, ProcessingChainTemplate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcessingChainTemplate__SelectTheRightMLAlgroithm(), null, "SelectTheRightMLAlgroithm", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(mlProcChainSolutionPatternEClass, MLProcChainSolutionPattern.class, "MLProcChainSolutionPattern",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLProcChainSolutionPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProcChainSolutionPattern_Datapropertyvalueset(), this.getDataPropertyValueSet(), null,
				"datapropertyvalueset", null, 1, -1, MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProcChainSolutionPattern_Processingchain(), this.getProcessingChainTemplate(), null,
				"processingchain", null, 1, -1, MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProcChainSolutionPattern_Dataanalysisproblemtype(), this.getDataAnalysisProblemType(), null,
				"dataanalysisproblemtype", null, 0, 1, MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProcChainSolutionPattern_ExecutedTemplate(), this.getExtendedBPMNModel(), null,
				"ExecutedTemplate", null, 0, 1, MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProcChainSolutionPattern_Collecteddataknowledgeabouttemplateconstruction(),
				this.getCollectedDataKnowledgeAboutTemplateConstruction(), null,
				"collecteddataknowledgeabouttemplateconstruction", null, 1, -1, MLProcChainSolutionPattern.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMLProcChainSolutionPattern__ConstruireUneChaineDeTraitementInitiale(),
				this.getProcessingChainTemplate(), "ConstruireUneChaineDeTraitementInitiale", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getMLProcChainSolutionPattern__MergeProcessingChainAndTemplate(), this.getExtendedBPMNModel(),
				"MergeProcessingChainAndTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(processingChainEClass, ProcessingChain.class, "ProcessingChain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingChain_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessingChain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingChain_Author(), ecorePackage.getEString(), "author", null, 0, 1,
				ProcessingChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingChain_Mlalgorithm(), this.getMLAlgorithm(), null, "mlalgorithm", null, 1, -1,
				ProcessingChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mlAlgorithmSolutionPatternEClass, MLAlgorithmSolutionPattern.class, "MLAlgorithmSolutionPattern",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLAlgorithmSolutionPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLAlgorithmSolutionPattern_Explanation(), ecorePackage.getEString(), "explanation", null, 0,
				1, MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithmSolutionPattern_Mlalgorithm(), this.getMLAlgorithm(), null, "mlalgorithm", null, 1,
				1, MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithmSolutionPattern_Datapropertyvalueset(), this.getDataPropertyValueSet(), null,
				"datapropertyvalueset", null, 1, -1, MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mlAlgorithmEClass, MLAlgorithm.class, "MLAlgorithm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMLAlgorithm_Selectioncriterionvalueset(), this.getSelectionCriterionValueSet(), null,
				"selectioncriterionvalueset", null, 0, 1, MLAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithm_Selectioncriterionvalue(), this.getSelectionCriterionValue(), null,
				"selectioncriterionvalue", null, 0, -1, MLAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLAlgorithm_Name(), this.getMLAlgorithms(), "name", null, 0, 1, MLAlgorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithm_Extendedbpmnmodel(), this.getExtendedBPMNModel(), null, "extendedbpmnmodel", null,
				1, 1, MLAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithm_Criteriatochoosemlalgorithm(), this.getMLAlgorithmSelectionCriteriaContainer(),
				null, "criteriatochoosemlalgorithm", null, 1, 1, MLAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionCriterionValueSetEClass, SelectionCriterionValueSet.class, "SelectionCriterionValueSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionCriterionValueSet_SetType(), ecorePackage.getEString(), "setType", null, 0, 1,
				SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionCriterionValueSet_Values(), ecorePackage.getEString(), "values", null, 0, 1,
				SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterionValueSet_Selectioncriterionvalue(), this.getSelectionCriterionValue(), null,
				"selectioncriterionvalue", null, 1, -1, SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterionValueSet_Selectioncriterion(), this.getSelectionCriterion(), null,
				"selectioncriterion", null, 1, 1, SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionCriterionValueEClass, SelectionCriterionValue.class, "SelectionCriterionValue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionCriterionValue_Values(), ecorePackage.getEString(), "values", null, 0, 1,
				SelectionCriterionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterionValue_Selectioncriterion(), this.getSelectionCriterion(), null,
				"selectioncriterion", null, 1, 1, SelectionCriterionValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionCriterionEClass, SelectionCriterion.class, "SelectionCriterion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionCriterion_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				SelectionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionCriterion_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1,
				SelectionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionCriterion_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SelectionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(extendedBPMNModelEClass, ExtendedBPMNModel.class, "ExtendedBPMNModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedBPMNModel_Path(), ecorePackage.getEString(), "path", null, 0, 1,
				ExtendedBPMNModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedBPMNModel_Author(), ecorePackage.getEString(), "author", null, 0, 1,
				ExtendedBPMNModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(explainabilityEClass, Explainability.class, "Explainability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExplainability_Value(), this.getValues1(), "value", null, 0, 1, Explainability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accuracyEClass, Accuracy.class, "Accuracy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccuracy_Value(), this.getValues2(), "value", null, 0, 1, Accuracy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectedDataKnowledgeAboutTemplateConstructionEClass,
				CollectedDataKnowledgeAboutTemplateConstruction.class,
				"CollectedDataKnowledgeAboutTemplateConstruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectedDataKnowledgeAboutTemplateConstruction_Rule(), this.getRule(), null, "rule", null, 0,
				-1, CollectedDataKnowledgeAboutTemplateConstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Condition(), this.getCondition(), null, "condition", null, 1, 1, Rule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Resultat(), this.getResultat(), null, "resultat", null, 1, 1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Term(), this.getTerm(), null, "term", null, 1, -1, Condition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(resultatEClass, Resultat.class, "Resultat", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultat_Term(), this.getTerm(), null, "term", null, 1, -1, Resultat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(variableEClass, variable.class, "variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getvariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvariable_Valeur(), ecorePackage.getEString(), "valeur", null, 0, 1, variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, connector.class, "connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getconnector_Conneteur(), this.getEnumConnector(), "conneteur", null, 0, 1, connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCleaningEClass, DataCleaning.class, "DataCleaning", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataPretraitementEClass, DataPretraitement.class, "DataPretraitement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureSelectionEClass, FeatureSelection.class, "FeatureSelection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureConstructionEClass, FeatureConstruction.class, "FeatureConstruction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postTreatementEClass, PostTreatement.class, "PostTreatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deployementEClass, Deployement.class, "Deployement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeUncessaryFiledsEClass, RemoveUncessaryFileds.class, "RemoveUncessaryFileds", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveUncessaryFileds_Method(), this.getRemoveUncessaryFiledsEnum(), "method", null, 0, 1,
				RemoveUncessaryFileds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRemoveUncessaryFileds__RemoveIDs(), null, "removeIDs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRemoveUncessaryFileds__RemoveSpecialCharacters(), null, "removeSpecialCharacters", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(conversionEClass, Conversion.class, "Conversion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversion_Method(), this.getConversionEnum(), "method", null, 0, 1, Conversion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConversion__ConvertCategoricalAttributesToContinue(), null,
				"convertCategoricalAttributesToContinue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConversion__ConvertContinueAttributesToCategorical(), null,
				"convertContinueAttributesToCategorical", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConversion__DetectAttributeType(), null, "detectAttributeType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(noiseTreatementEClass, NoiseTreatement.class, "NoiseTreatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoiseTreatement_Method(), this.getNoiseTreatementEnum(), "method", null, 0, 1,
				NoiseTreatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getNoiseTreatement__RemoveNoiseFromFileds(), null, "removeNoiseFromFileds", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(missingValueTreatementEClass, MissingValueTreatement.class, "MissingValueTreatement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionCriteriaEClass, SelectionCriteria.class, "SelectionCriteria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionCriteria_CriteriaName(), ecorePackage.getEString(), "criteriaName", null, 0, 1,
				SelectionCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionCriteria_CriteriaValue(), ecorePackage.getEString(), "criteriaValue", null, 0, 1,
				SelectionCriteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionCriteria_Id(), ecorePackage.getEString(), "Id", null, 0, 1, SelectionCriteria.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mlAlgorithmSelectionCriteriaContainerEClass, MLAlgorithmSelectionCriteriaContainer.class,
				"MLAlgorithmSelectionCriteriaContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMLAlgorithmSelectionCriteriaContainer_Domainrequirementselectioncriteria(),
				this.getSelectionCriteria(), null, "domainrequirementselectioncriteria", null, 1, -1,
				MLAlgorithmSelectionCriteriaContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLAlgorithmSelectionCriteriaContainer_Regle(), ecorePackage.getEString(), "Regle", null, 0, 1,
				MLAlgorithmSelectionCriteriaContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(values1EEnum, Values1.class, "Values1");
		addEEnumLiteral(values1EEnum, Values1.YES);
		addEEnumLiteral(values1EEnum, Values1.NO);

		initEEnum(values2EEnum, Values2.class, "Values2");
		addEEnumLiteral(values2EEnum, Values2.HIGH);
		addEEnumLiteral(values2EEnum, Values2.MODERATE);
		addEEnumLiteral(values2EEnum, Values2.LOW);

		initEEnum(requirementTypeValuesEEnum, RequirementTypeValues.class, "RequirementTypeValues");
		addEEnumLiteral(requirementTypeValuesEEnum, RequirementTypeValues.EXPLINABILITY);
		addEEnumLiteral(requirementTypeValuesEEnum, RequirementTypeValues.ACCURACY);

		initEEnum(enumDataAnalysisProblemTypeEEnum, EnumDataAnalysisProblemType.class, "EnumDataAnalysisProblemType");
		addEEnumLiteral(enumDataAnalysisProblemTypeEEnum, EnumDataAnalysisProblemType.CLASSIFICATION);
		addEEnumLiteral(enumDataAnalysisProblemTypeEEnum, EnumDataAnalysisProblemType.REGRESSION);
		addEEnumLiteral(enumDataAnalysisProblemTypeEEnum, EnumDataAnalysisProblemType.CLUSTERING);
		addEEnumLiteral(enumDataAnalysisProblemTypeEEnum, EnumDataAnalysisProblemType.FEATURE_CONSTRUCTION);

		initEEnum(enumConnectorEEnum, EnumConnector.class, "EnumConnector");
		addEEnumLiteral(enumConnectorEEnum, EnumConnector.OR);
		addEEnumLiteral(enumConnectorEEnum, EnumConnector.AND);
		addEEnumLiteral(enumConnectorEEnum, EnumConnector.ACCOLAD_OUVERT);
		addEEnumLiteral(enumConnectorEEnum, EnumConnector.ACCOLAD_FERME);

		initEEnum(conversionEnumEEnum, ConversionEnum.class, "ConversionEnum");
		addEEnumLiteral(conversionEnumEEnum, ConversionEnum.CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE);
		addEEnumLiteral(conversionEnumEEnum, ConversionEnum.CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL);
		addEEnumLiteral(conversionEnumEEnum, ConversionEnum.DETECT_ATTRIBUTE_TYPE);

		initEEnum(removeUncessaryFiledsEnumEEnum, RemoveUncessaryFiledsEnum.class, "RemoveUncessaryFiledsEnum");
		addEEnumLiteral(removeUncessaryFiledsEnumEEnum, RemoveUncessaryFiledsEnum.REMOVE_IDS);
		addEEnumLiteral(removeUncessaryFiledsEnumEEnum, RemoveUncessaryFiledsEnum.REMOVE_SPECIAL_CHARACTERS);

		initEEnum(noiseTreatementEnumEEnum, NoiseTreatementEnum.class, "NoiseTreatementEnum");
		addEEnumLiteral(noiseTreatementEnumEEnum, NoiseTreatementEnum.REMOVE_NOISE_FROM_FILEDS);

		initEEnum(missingValueTreatementEnumEEnum, MissingValueTreatementEnum.class, "MissingValueTreatementEnum");
		addEEnumLiteral(missingValueTreatementEnumEEnum, MissingValueTreatementEnum.REPLACE_BY_MEAN);
		addEEnumLiteral(missingValueTreatementEnumEEnum, MissingValueTreatementEnum.REPLACE_BY_ZERO);

		initEEnum(mlAlgorithmsEEnum, MLAlgorithms.class, "MLAlgorithms");
		addEEnumLiteral(mlAlgorithmsEEnum, MLAlgorithms.NAIVE_BAYES);
		addEEnumLiteral(mlAlgorithmsEEnum, MLAlgorithms.DECISION_TREE);
		addEEnumLiteral(mlAlgorithmsEEnum, MLAlgorithms.KNN);
		addEEnumLiteral(mlAlgorithmsEEnum, MLAlgorithms.BAYESIAN_NETWORK);
		addEEnumLiteral(mlAlgorithmsEEnum, MLAlgorithms.NEURAL_NETROWK);
		addEEnumLiteral(mlAlgorithmsEEnum, MLAlgorithms.SVM);

		// Initialize data types
		initEDataType(newDataType10EDataType, Object.class, "NewDataType10", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProjetTemplatePackageImpl
