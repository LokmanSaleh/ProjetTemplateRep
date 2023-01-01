/**
 */
package projetTemplate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import projetTemplate.ComputationalRequirementValue;
import projetTemplate.Data;
import projetTemplate.DataAnalysisProblem;
import projetTemplate.DataAnalysisProblemType;
import projetTemplate.DataPropertyType;
import projetTemplate.DataPropertyValue;
import projetTemplate.DataPropertyValueSet;
import projetTemplate.Database;
import projetTemplate.DomainProblem;
import projetTemplate.DomainRequirementValue;
import projetTemplate.ExtendedBPMNModel;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.MLProject;
import projetTemplate.ModelElement;
import projetTemplate.ProcessingChain;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplateFactory;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementMapping;
import projetTemplate.RequirementType;
import projetTemplate.Schema;
import projetTemplate.SelectionCriterion;
import projetTemplate.SelectionCriterionValue;
import projetTemplate.SelectionCriterionValueSet;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ProjetTemplatePackageImpl extends EPackageImpl implements ProjetTemplatePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainProblemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRequirementValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlProjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnalysisProblemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationalRequirementValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementMappingEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyValueSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAnalysisProblemTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingChainEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlProcChainSolutionPatternEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingChainTemplateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlAlgorithmSolutionPatternEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionCriterionValueSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionCriterionValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionCriterionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedBPMNModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see projetTemplate.ProjetTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProjetTemplatePackageImpl() {
		super(eNS_URI, ProjetTemplateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and
	 * for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link ProjetTemplatePackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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

		// Create package meta-data objects
		theProjetTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theProjetTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProjetTemplatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProjetTemplatePackage.eNS_URI, theProjetTemplatePackage);
		return theProjetTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainProblem() {
		return domainProblemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainProblem_Text() {
		return (EAttribute) domainProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainProblem_Domainrequirementvalue() {
		return (EReference) domainProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainRequirementValue() {
		return domainRequirementValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRequirementValue_Value() {
		return (EAttribute) domainRequirementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainRequirementValue_Explanation() {
		return (EAttribute) domainRequirementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementType() {
		return requirementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementType_Requirementmapping() {
		return (EReference) requirementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_Name() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_Description() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_ValueType() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_Scope() {
		return (EAttribute) requirementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementType_Domainrequirementvalue() {
		return (EReference) requirementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementType_Computationalrequirementvalue() {
		return (EReference) requirementTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLProject() {
		return mlProjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProject_Name() {
		return (EAttribute) mlProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProject_Date() {
		return (EAttribute) mlProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProject_Author() {
		return (EAttribute) mlProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProject_Dataanalysisproblem() {
		return (EReference) mlProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProject_Domainproblem() {
		return (EReference) mlProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProject_Database() {
		return (EReference) mlProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAnalysisProblem() {
		return dataAnalysisProblemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblem_Name() {
		return (EAttribute) dataAnalysisProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblem_Date() {
		return (EAttribute) dataAnalysisProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblem_Author() {
		return (EAttribute) dataAnalysisProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblem_Dataanalysisproblemtype() {
		return (EReference) dataAnalysisProblemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblem_Computationalrequirementvalue() {
		return (EReference) dataAnalysisProblemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblem_Processingchain() {
		return (EReference) dataAnalysisProblemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationalRequirementValue() {
		return computationalRequirementValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputationalRequirementValue_Value() {
		return (EAttribute) computationalRequirementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputationalRequirementValue_Rationale() {
		return (EAttribute) computationalRequirementValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputationalRequirementValue_Requirementtype() {
		return (EReference) computationalRequirementValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Value() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Credentias() {
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Schema() {
		return (EReference) databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Data() {
		return (EReference) databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Mlproject() {
		return (EReference) databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchema_Technology() {
		return (EAttribute) schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Modelelement() {
		return (EReference) schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Value() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_Credentias() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementMapping() {
		return requirementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementMapping_Restrictions() {
		return (EAttribute) requirementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementMapping_Rationale() {
		return (EAttribute) requirementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementMapping_Requirementtype() {
		return (EReference) requirementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementMapping_Datapropertyvalueset() {
		return (EReference) requirementMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Datapropertyvalue() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyValueSet() {
		return dataPropertyValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyValueSet_SetType() {
		return (EAttribute) dataPropertyValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyValueSet_Values() {
		return (EAttribute) dataPropertyValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyValueSet_Datapropertyvalue() {
		return (EReference) dataPropertyValueSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyValueSet_Mlalgorithmsolutionpattern() {
		return (EReference) dataPropertyValueSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyValueSet_Mlprocchainsolutionpattern() {
		return (EReference) dataPropertyValueSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataPropertyValueSet__Evaluate() {
		return dataPropertyValueSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyValue() {
		return dataPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyValue_Name() {
		return (EAttribute) dataPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyValue_Datapropertyvalueset() {
		return (EReference) dataPropertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPropertyValue_Datapropertytype() {
		return (EReference) dataPropertyValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPropertyType() {
		return dataPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyType_Name() {
		return (EAttribute) dataPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPropertyType_Type() {
		return (EAttribute) dataPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAnalysisProblemType() {
		return dataAnalysisProblemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAnalysisProblemType_Name() {
		return (EAttribute) dataAnalysisProblemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblemType_Mlprocchainsolutionpattern() {
		return (EReference) dataAnalysisProblemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAnalysisProblemType_Mlalgorithmsolutionpattern() {
		return (EReference) dataAnalysisProblemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingChain() {
		return processingChainEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChain_Date() {
		return (EAttribute) processingChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChain_Author() {
		return (EAttribute) processingChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChain_Extendedbpmnmodel() {
		return (EReference) processingChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChain_Mlalgorithm() {
		return (EReference) processingChainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChain_Processingchaintemplate() {
		return (EReference) processingChainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLProcChainSolutionPattern() {
		return mlProcChainSolutionPatternEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProcChainSolutionPattern_Name() {
		return (EAttribute) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLProcChainSolutionPattern_Explanation() {
		return (EAttribute) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProcChainSolutionPattern_Dataanalysisproblemtype() {
		return (EReference) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLProcChainSolutionPattern_Datapropertyvalueset() {
		return (EReference) mlProcChainSolutionPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingChainTemplate() {
		return processingChainTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChainTemplate_Name() {
		return (EAttribute) processingChainTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingChainTemplate_Author() {
		return (EAttribute) processingChainTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChainTemplate_Extendedbpmnmodel() {
		return (EReference) processingChainTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChainTemplate_Processingchain() {
		return (EReference) processingChainTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingChainTemplate_Mlprocchainsolutionpattern() {
		return (EReference) processingChainTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLAlgorithmSolutionPattern() {
		return mlAlgorithmSolutionPatternEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLAlgorithmSolutionPattern_Name() {
		return (EAttribute) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLAlgorithmSolutionPattern_Explanation() {
		return (EAttribute) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithmSolutionPattern_Processingchaintemplate() {
		return (EReference) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithmSolutionPattern_Datapropertyvalueset() {
		return (EReference) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithmSolutionPattern_Dataanalysisproblemtype() {
		return (EReference) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithmSolutionPattern_Mlalgorithm() {
		return (EReference) mlAlgorithmSolutionPatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLAlgorithm() {
		return mlAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMLAlgorithm_Name() {
		return (EAttribute) mlAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Selectioncriterionvalueset() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Selectioncriterionvalue() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Processingchain() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLAlgorithm_Mlalgorithmsolutionpattern() {
		return (EReference) mlAlgorithmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionCriterionValueSet() {
		return selectionCriterionValueSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterionValueSet_SetType() {
		return (EAttribute) selectionCriterionValueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterionValueSet_Values() {
		return (EAttribute) selectionCriterionValueSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterionValueSet_Selectioncriterion() {
		return (EReference) selectionCriterionValueSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterionValueSet_Selectioncriterionvalue() {
		return (EReference) selectionCriterionValueSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionCriterionValue() {
		return selectionCriterionValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterionValue_Values() {
		return (EAttribute) selectionCriterionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterionValue_Selectioncriterion() {
		return (EReference) selectionCriterionValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterionValue_Selectioncriterionvalueset() {
		return (EReference) selectionCriterionValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionCriterion() {
		return selectionCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterion_Name() {
		return (EAttribute) selectionCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterion_ValueType() {
		return (EAttribute) selectionCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionCriterion_Description() {
		return (EAttribute) selectionCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterion_Selectioncriterionvalueset() {
		return (EReference) selectionCriterionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionCriterion_Selectioncriterionvalue() {
		return (EReference) selectionCriterionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedBPMNModel() {
		return extendedBPMNModelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedBPMNModel_Name() {
		return (EAttribute) extendedBPMNModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedBPMNModel_Author() {
		return (EAttribute) extendedBPMNModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTemplateFactory getProjetTemplateFactory() {
		return (ProjetTemplateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		domainProblemEClass = createEClass(DOMAIN_PROBLEM);
		createEAttribute(domainProblemEClass, DOMAIN_PROBLEM__TEXT);
		createEReference(domainProblemEClass, DOMAIN_PROBLEM__DOMAINREQUIREMENTVALUE);

		domainRequirementValueEClass = createEClass(DOMAIN_REQUIREMENT_VALUE);
		createEAttribute(domainRequirementValueEClass, DOMAIN_REQUIREMENT_VALUE__VALUE);
		createEAttribute(domainRequirementValueEClass, DOMAIN_REQUIREMENT_VALUE__EXPLANATION);

		requirementTypeEClass = createEClass(REQUIREMENT_TYPE);
		createEReference(requirementTypeEClass, REQUIREMENT_TYPE__REQUIREMENTMAPPING);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__NAME);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__DESCRIPTION);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__VALUE_TYPE);
		createEAttribute(requirementTypeEClass, REQUIREMENT_TYPE__SCOPE);
		createEReference(requirementTypeEClass, REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE);
		createEReference(requirementTypeEClass, REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE);

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
		createEReference(dataAnalysisProblemEClass, DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN);

		computationalRequirementValueEClass = createEClass(COMPUTATIONAL_REQUIREMENT_VALUE);
		createEAttribute(computationalRequirementValueEClass, COMPUTATIONAL_REQUIREMENT_VALUE__VALUE);
		createEAttribute(computationalRequirementValueEClass, COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE);
		createEReference(computationalRequirementValueEClass, COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__VALUE);
		createEAttribute(databaseEClass, DATABASE__CREDENTIAS);
		createEReference(databaseEClass, DATABASE__SCHEMA);
		createEReference(databaseEClass, DATABASE__DATA);
		createEReference(databaseEClass, DATABASE__MLPROJECT);

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
		createEReference(dataPropertyValueSetEClass, DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN);
		createEReference(dataPropertyValueSetEClass, DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN);
		createEOperation(dataPropertyValueSetEClass, DATA_PROPERTY_VALUE_SET___EVALUATE);

		dataPropertyValueEClass = createEClass(DATA_PROPERTY_VALUE);
		createEAttribute(dataPropertyValueEClass, DATA_PROPERTY_VALUE__NAME);
		createEReference(dataPropertyValueEClass, DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET);
		createEReference(dataPropertyValueEClass, DATA_PROPERTY_VALUE__DATAPROPERTYTYPE);

		dataPropertyTypeEClass = createEClass(DATA_PROPERTY_TYPE);
		createEAttribute(dataPropertyTypeEClass, DATA_PROPERTY_TYPE__NAME);
		createEAttribute(dataPropertyTypeEClass, DATA_PROPERTY_TYPE__TYPE);

		dataAnalysisProblemTypeEClass = createEClass(DATA_ANALYSIS_PROBLEM_TYPE);
		createEAttribute(dataAnalysisProblemTypeEClass, DATA_ANALYSIS_PROBLEM_TYPE__NAME);
		createEReference(dataAnalysisProblemTypeEClass, DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN);
		createEReference(dataAnalysisProblemTypeEClass, DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN);

		processingChainEClass = createEClass(PROCESSING_CHAIN);
		createEAttribute(processingChainEClass, PROCESSING_CHAIN__DATE);
		createEAttribute(processingChainEClass, PROCESSING_CHAIN__AUTHOR);
		createEReference(processingChainEClass, PROCESSING_CHAIN__EXTENDEDBPMNMODEL);
		createEReference(processingChainEClass, PROCESSING_CHAIN__MLALGORITHM);
		createEReference(processingChainEClass, PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE);

		mlProcChainSolutionPatternEClass = createEClass(ML_PROC_CHAIN_SOLUTION_PATTERN);
		createEAttribute(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__NAME);
		createEAttribute(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION);
		createEReference(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE);
		createEReference(mlProcChainSolutionPatternEClass, ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET);

		processingChainTemplateEClass = createEClass(PROCESSING_CHAIN_TEMPLATE);
		createEAttribute(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__NAME);
		createEAttribute(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__AUTHOR);
		createEReference(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL);
		createEReference(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__PROCESSINGCHAIN);
		createEReference(processingChainTemplateEClass, PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN);

		mlAlgorithmSolutionPatternEClass = createEClass(ML_ALGORITHM_SOLUTION_PATTERN);
		createEAttribute(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__NAME);
		createEAttribute(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__EXPLANATION);
		createEReference(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE);
		createEReference(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET);
		createEReference(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE);
		createEReference(mlAlgorithmSolutionPatternEClass, ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM);

		mlAlgorithmEClass = createEClass(ML_ALGORITHM);
		createEAttribute(mlAlgorithmEClass, ML_ALGORITHM__NAME);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__SELECTIONCRITERIONVALUESET);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__SELECTIONCRITERIONVALUE);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__PROCESSINGCHAIN);
		createEReference(mlAlgorithmEClass, ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN);

		selectionCriterionValueSetEClass = createEClass(SELECTION_CRITERION_VALUE_SET);
		createEAttribute(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__SET_TYPE);
		createEAttribute(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__VALUES);
		createEReference(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE);
		createEReference(selectionCriterionValueSetEClass, SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION);

		selectionCriterionValueEClass = createEClass(SELECTION_CRITERION_VALUE);
		createEAttribute(selectionCriterionValueEClass, SELECTION_CRITERION_VALUE__VALUES);
		createEReference(selectionCriterionValueEClass, SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET);
		createEReference(selectionCriterionValueEClass, SELECTION_CRITERION_VALUE__SELECTIONCRITERION);

		selectionCriterionEClass = createEClass(SELECTION_CRITERION);
		createEAttribute(selectionCriterionEClass, SELECTION_CRITERION__NAME);
		createEAttribute(selectionCriterionEClass, SELECTION_CRITERION__VALUE_TYPE);
		createEAttribute(selectionCriterionEClass, SELECTION_CRITERION__DESCRIPTION);
		createEReference(selectionCriterionEClass, SELECTION_CRITERION__SELECTIONCRITERIONVALUESET);
		createEReference(selectionCriterionEClass, SELECTION_CRITERION__SELECTIONCRITERIONVALUE);

		extendedBPMNModelEClass = createEClass(EXTENDED_BPMN_MODEL);
		createEAttribute(extendedBPMNModelEClass, EXTENDED_BPMN_MODEL__NAME);
		createEAttribute(extendedBPMNModelEClass, EXTENDED_BPMN_MODEL__AUTHOR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is
	 * guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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

		// Initialize classes, features, and operations; add parameters
		initEClass(domainProblemEClass, DomainProblem.class, "DomainProblem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainProblem_Text(), ecorePackage.getEString(), "text", null, 0, 1, DomainProblem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainProblem_Domainrequirementvalue(), this.getDomainRequirementValue(), null,
				"domainrequirementvalue", null, 0, -1, DomainProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainRequirementValueEClass, DomainRequirementValue.class, "DomainRequirementValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainRequirementValue_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				DomainRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainRequirementValue_Explanation(), ecorePackage.getEString(), "explanation", null, 0, 1,
				DomainRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getRequirementType_ValueType(), ecorePackage.getEString(), "valueType", null, 0, 1,
				RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementType_Scope(), ecorePackage.getEString(), "scope", null, 0, 1,
				RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementType_Domainrequirementvalue(), this.getDomainRequirementValue(), null,
				"domainrequirementvalue", null, 0, -1, RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementType_Computationalrequirementvalue(), this.getComputationalRequirementValue(),
				this.getComputationalRequirementValue_Requirementtype(), "computationalrequirementvalue", null, 0, -1,
				RequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getMLProject_Database(), this.getDatabase(), this.getDatabase_Mlproject(), "database", null, 1,
				1, MLProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDataAnalysisProblem_Processingchain(), this.getProcessingChain(), null, "processingchain",
				null, 1, 1, DataAnalysisProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computationalRequirementValueEClass, ComputationalRequirementValue.class,
				"ComputationalRequirementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputationalRequirementValue_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				ComputationalRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputationalRequirementValue_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1,
				ComputationalRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputationalRequirementValue_Requirementtype(), this.getRequirementType(),
				this.getRequirementType_Computationalrequirementvalue(), "requirementtype", null, 1, 1,
				ComputationalRequirementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDatabase_Mlproject(), this.getMLProject(), this.getMLProject_Database(), "mlproject", null, 0,
				-1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDataPropertyValueSet_Datapropertyvalue(), this.getDataPropertyValue(),
				this.getDataPropertyValue_Datapropertyvalueset(), "datapropertyvalue", null, 0, -1,
				DataPropertyValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyValueSet_Mlalgorithmsolutionpattern(), this.getMLAlgorithmSolutionPattern(),
				this.getMLAlgorithmSolutionPattern_Datapropertyvalueset(), "mlalgorithmsolutionpattern", null, 0, -1,
				DataPropertyValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyValueSet_Mlprocchainsolutionpattern(), this.getMLProcChainSolutionPattern(),
				this.getMLProcChainSolutionPattern_Datapropertyvalueset(), "mlprocchainsolutionpattern", null, 0, -1,
				DataPropertyValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataPropertyValueSet__Evaluate(), null, "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataPropertyValueEClass, DataPropertyValue.class, "DataPropertyValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataPropertyValue_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				DataPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDataPropertyValue_Datapropertyvalueset(), this.getDataPropertyValueSet(),
				this.getDataPropertyValueSet_Datapropertyvalue(), "datapropertyvalueset", null, 0, -1,
				DataPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getDataAnalysisProblemType_Name(), ecorePackage.getEString(), "Name", null, 0, 1,
				DataAnalysisProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalysisProblemType_Mlprocchainsolutionpattern(), this.getMLProcChainSolutionPattern(),
				this.getMLProcChainSolutionPattern_Dataanalysisproblemtype(), "mlprocchainsolutionpattern", null, 1, -1,
				DataAnalysisProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalysisProblemType_Mlalgorithmsolutionpattern(), this.getMLAlgorithmSolutionPattern(),
				this.getMLAlgorithmSolutionPattern_Dataanalysisproblemtype(), "mlalgorithmsolutionpattern", null, 0, -1,
				DataAnalysisProblemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingChainEClass, ProcessingChain.class, "ProcessingChain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingChain_Date(), ecorePackage.getEString(), "date", null, 0, 1, ProcessingChain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingChain_Author(), ecorePackage.getEString(), "author", null, 0, 1,
				ProcessingChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingChain_Extendedbpmnmodel(), this.getExtendedBPMNModel(), null, "extendedbpmnmodel",
				null, 1, 1, ProcessingChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingChain_Mlalgorithm(), this.getMLAlgorithm(), this.getMLAlgorithm_Processingchain(),
				"mlalgorithm", null, 1, -1, ProcessingChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingChain_Processingchaintemplate(), this.getProcessingChainTemplate(),
				this.getProcessingChainTemplate_Processingchain(), "processingchaintemplate", null, 0, 1,
				ProcessingChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mlProcChainSolutionPatternEClass, MLProcChainSolutionPattern.class, "MLProcChainSolutionPattern",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLProcChainSolutionPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLProcChainSolutionPattern_Explanation(), ecorePackage.getEString(), "explanation", null, 0,
				1, MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProcChainSolutionPattern_Dataanalysisproblemtype(), this.getDataAnalysisProblemType(),
				this.getDataAnalysisProblemType_Mlprocchainsolutionpattern(), "dataanalysisproblemtype", null, 1, -1,
				MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLProcChainSolutionPattern_Datapropertyvalueset(), this.getDataPropertyValueSet(),
				this.getDataPropertyValueSet_Mlprocchainsolutionpattern(), "datapropertyvalueset", null, 1, -1,
				MLProcChainSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getProcessingChainTemplate_Processingchain(), this.getProcessingChain(),
				this.getProcessingChain_Processingchaintemplate(), "processingchain", null, 0, -1,
				ProcessingChainTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingChainTemplate_Mlprocchainsolutionpattern(), this.getMLProcChainSolutionPattern(),
				null, "mlprocchainsolutionpattern", null, 1, -1, ProcessingChainTemplate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mlAlgorithmSolutionPatternEClass, MLAlgorithmSolutionPattern.class, "MLAlgorithmSolutionPattern",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLAlgorithmSolutionPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMLAlgorithmSolutionPattern_Explanation(), ecorePackage.getEString(), "explanation", null, 0,
				1, MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithmSolutionPattern_Processingchaintemplate(), this.getProcessingChainTemplate(), null,
				"processingchaintemplate", null, 1, 1, MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithmSolutionPattern_Datapropertyvalueset(), this.getDataPropertyValueSet(),
				this.getDataPropertyValueSet_Mlalgorithmsolutionpattern(), "datapropertyvalueset", null, 1, -1,
				MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithmSolutionPattern_Dataanalysisproblemtype(), this.getDataAnalysisProblemType(),
				this.getDataAnalysisProblemType_Mlalgorithmsolutionpattern(), "dataanalysisproblemtype", null, 1, 1,
				MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithmSolutionPattern_Mlalgorithm(), this.getMLAlgorithm(),
				this.getMLAlgorithm_Mlalgorithmsolutionpattern(), "mlalgorithm", null, 1, 1,
				MLAlgorithmSolutionPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mlAlgorithmEClass, MLAlgorithm.class, "MLAlgorithm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMLAlgorithm_Name(), ecorePackage.getEString(), "name", null, 0, 1, MLAlgorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithm_Selectioncriterionvalueset(), this.getSelectionCriterionValueSet(), null,
				"selectioncriterionvalueset", null, 0, 1, MLAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithm_Selectioncriterionvalue(), this.getSelectionCriterionValue(), null,
				"selectioncriterionvalue", null, 0, -1, MLAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLAlgorithm_Processingchain(), this.getProcessingChain(),
				this.getProcessingChain_Mlalgorithm(), "processingchain", null, 0, 1, MLAlgorithm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMLAlgorithm_Mlalgorithmsolutionpattern(), this.getMLAlgorithmSolutionPattern(),
				this.getMLAlgorithmSolutionPattern_Mlalgorithm(), "mlalgorithmsolutionpattern", null, 1, -1,
				MLAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionCriterionValueSetEClass, SelectionCriterionValueSet.class, "SelectionCriterionValueSet",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionCriterionValueSet_SetType(), ecorePackage.getEString(), "setType", null, 0, 1,
				SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionCriterionValueSet_Values(), ecorePackage.getEString(), "values", null, 0, 1,
				SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterionValueSet_Selectioncriterionvalue(), this.getSelectionCriterionValue(),
				this.getSelectionCriterionValue_Selectioncriterionvalueset(), "selectioncriterionvalue", null, 1, -1,
				SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterionValueSet_Selectioncriterion(), this.getSelectionCriterion(),
				this.getSelectionCriterion_Selectioncriterionvalueset(), "selectioncriterion", null, 1, 1,
				SelectionCriterionValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionCriterionValueEClass, SelectionCriterionValue.class, "SelectionCriterionValue",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionCriterionValue_Values(), ecorePackage.getEString(), "values", null, 0, 1,
				SelectionCriterionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterionValue_Selectioncriterionvalueset(), this.getSelectionCriterionValueSet(),
				this.getSelectionCriterionValueSet_Selectioncriterionvalue(), "selectioncriterionvalueset", null, 0, -1,
				SelectionCriterionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterionValue_Selectioncriterion(), this.getSelectionCriterion(),
				this.getSelectionCriterion_Selectioncriterionvalue(), "selectioncriterion", null, 1, 1,
				SelectionCriterionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getSelectionCriterion_Selectioncriterionvalueset(), this.getSelectionCriterionValueSet(),
				this.getSelectionCriterionValueSet_Selectioncriterion(), "selectioncriterionvalueset", null, 0, -1,
				SelectionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectionCriterion_Selectioncriterionvalue(), this.getSelectionCriterionValue(),
				this.getSelectionCriterionValue_Selectioncriterion(), "selectioncriterionvalue", null, 0, -1,
				SelectionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedBPMNModelEClass, ExtendedBPMNModel.class, "ExtendedBPMNModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedBPMNModel_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ExtendedBPMNModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedBPMNModel_Author(), ecorePackage.getEString(), "author", null, 0, 1,
				ExtendedBPMNModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // ProjetTemplatePackageImpl
