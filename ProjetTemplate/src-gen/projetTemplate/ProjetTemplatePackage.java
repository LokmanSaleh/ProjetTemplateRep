/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Domainrequirementvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PROBLEM__DOMAINREQUIREMENTVALUE = 1;

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
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE__EXPLANATION = 1;

	/**
	 * The number of structural features of the '<em>Domain Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Domain Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_REQUIREMENT_VALUE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Domainrequirementvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE = 5;

	/**
	 * The feature id for the '<em><b>Computationalrequirementvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE = 6;

	/**
	 * The number of structural features of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROJECT__DATABASE = 5;

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
	 * The meta object id for the '{@link projetTemplate.impl.DataAnalysisProblemImpl <em>Data Analysis Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataAnalysisProblemImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataAnalysisProblem()
	 * @generated
	 */
	int DATA_ANALYSIS_PROBLEM = 4;

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
	 * The feature id for the '<em><b>Processingchain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN = 5;

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
	 * The meta object id for the '{@link projetTemplate.impl.ComputationalRequirementValueImpl <em>Computational Requirement Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ComputationalRequirementValueImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getComputationalRequirementValue()
	 * @generated
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE = 1;

	/**
	 * The feature id for the '<em><b>Requirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE = 2;

	/**
	 * The number of structural features of the '<em>Computational Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Computational Requirement Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_REQUIREMENT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DatabaseImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Credentias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CREDENTIAS = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATA = 3;

	/**
	 * The feature id for the '<em><b>Mlproject</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__MLPROJECT = 4;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link projetTemplate.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getData()
	 * @generated
	 */
	int DATA = 8;

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
	 * The meta object id for the '{@link projetTemplate.impl.RequirementMappingImpl <em>Requirement Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.RequirementMappingImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getRequirementMapping()
	 * @generated
	 */
	int REQUIREMENT_MAPPING = 9;

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
	 * The meta object id for the '{@link projetTemplate.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ModelElementImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 10;

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
	 * The meta object id for the '{@link projetTemplate.impl.DataPropertyValueSetImpl <em>Data Property Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataPropertyValueSetImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyValueSet()
	 * @generated
	 */
	int DATA_PROPERTY_VALUE_SET = 11;

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
	 * The feature id for the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN = 3;

	/**
	 * The feature id for the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN = 4;

	/**
	 * The number of structural features of the '<em>Data Property Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_SET_FEATURE_COUNT = 5;

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
	 * The meta object id for the '{@link projetTemplate.impl.DataPropertyValueImpl <em>Data Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataPropertyValueImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataPropertyValue()
	 * @generated
	 */
	int DATA_PROPERTY_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET = 1;

	/**
	 * The feature id for the '<em><b>Datapropertytype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE__DATAPROPERTYTYPE = 2;

	/**
	 * The number of structural features of the '<em>Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_VALUE_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link projetTemplate.impl.DataAnalysisProblemTypeImpl <em>Data Analysis Problem Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.DataAnalysisProblemTypeImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDataAnalysisProblemType()
	 * @generated
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN = 1;

	/**
	 * The feature id for the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE__MLALGORITHMSOLUTIONPATTERN = 2;

	/**
	 * The number of structural features of the '<em>Data Analysis Problem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Analysis Problem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ANALYSIS_PROBLEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ProcessingChainImpl <em>Processing Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ProcessingChainImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getProcessingChain()
	 * @generated
	 */
	int PROCESSING_CHAIN = 15;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__DATE = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Extendedbpmnmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__EXTENDEDBPMNMODEL = 2;

	/**
	 * The feature id for the '<em><b>Mlalgorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__MLALGORITHM = 3;

	/**
	 * The feature id for the '<em><b>Processingchaintemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE = 4;

	/**
	 * The number of structural features of the '<em>Processing Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Processing Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.MLProcChainSolutionPatternImpl <em>ML Proc Chain Solution Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.MLProcChainSolutionPatternImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLProcChainSolutionPattern()
	 * @generated
	 */
	int ML_PROC_CHAIN_SOLUTION_PATTERN = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_PATTERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION = 1;

	/**
	 * The feature id for the '<em><b>Dataanalysisproblemtype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE = 2;

	/**
	 * The feature id for the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET = 3;

	/**
	 * The number of structural features of the '<em>ML Proc Chain Solution Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ML Proc Chain Solution Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_PROC_CHAIN_SOLUTION_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projetTemplate.impl.ProcessingChainTemplateImpl <em>Processing Chain Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.ProcessingChainTemplateImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getProcessingChainTemplate()
	 * @generated
	 */
	int PROCESSING_CHAIN_TEMPLATE = 17;

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
	 * The feature id for the '<em><b>Processingchain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE__PROCESSINGCHAIN = 3;

	/**
	 * The feature id for the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN = 4;

	/**
	 * The number of structural features of the '<em>Processing Chain Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Processing Chain Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_CHAIN_TEMPLATE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Processingchaintemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Datapropertyvalueset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET = 3;

	/**
	 * The feature id for the '<em><b>Dataanalysisproblemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE = 4;

	/**
	 * The feature id for the '<em><b>Mlalgorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM = 5;

	/**
	 * The number of structural features of the '<em>ML Algorithm Solution Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ML Algorithm Solution Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM_SOLUTION_PATTERN_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Selectioncriterionvalueset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__SELECTIONCRITERIONVALUESET = 1;

	/**
	 * The feature id for the '<em><b>Selectioncriterionvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__SELECTIONCRITERIONVALUE = 2;

	/**
	 * The feature id for the '<em><b>Processingchain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__PROCESSINGCHAIN = 3;

	/**
	 * The feature id for the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN = 4;

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
	 * The meta object id for the '{@link projetTemplate.impl.SelectionCriterionValueSetImpl <em>Selection Criterion Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.SelectionCriterionValueSetImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterionValueSet()
	 * @generated
	 */
	int SELECTION_CRITERION_VALUE_SET = 20;

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
	 * The meta object id for the '{@link projetTemplate.impl.SelectionCriterionValueImpl <em>Selection Criterion Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projetTemplate.impl.SelectionCriterionValueImpl
	 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getSelectionCriterionValue()
	 * @generated
	 */
	int SELECTION_CRITERION_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Selectioncriterionvalueset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET = 1;

	/**
	 * The feature id for the '<em><b>Selectioncriterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE__SELECTIONCRITERION = 2;

	/**
	 * The number of structural features of the '<em>Selection Criterion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Selection Criterion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_VALUE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Selectioncriterionvalueset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION__SELECTIONCRITERIONVALUESET = 3;

	/**
	 * The feature id for the '<em><b>Selectioncriterionvalue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION__SELECTIONCRITERIONVALUE = 4;

	/**
	 * The number of structural features of the '<em>Selection Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Selection Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CRITERION_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL__AUTHOR = 1;

	/**
	 * The number of structural features of the '<em>Extended BPMN Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extended BPMN Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_BPMN_MODEL_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the reference list '{@link projetTemplate.DomainProblem#getDomainrequirementvalue <em>Domainrequirementvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domainrequirementvalue</em>'.
	 * @see projetTemplate.DomainProblem#getDomainrequirementvalue()
	 * @see #getDomainProblem()
	 * @generated
	 */
	EReference getDomainProblem_Domainrequirementvalue();

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
	 * Returns the meta object for the attribute '{@link projetTemplate.DomainRequirementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetTemplate.DomainRequirementValue#getValue()
	 * @see #getDomainRequirementValue()
	 * @generated
	 */
	EAttribute getDomainRequirementValue_Value();

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
	 * Returns the meta object for the reference list '{@link projetTemplate.RequirementType#getDomainrequirementvalue <em>Domainrequirementvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domainrequirementvalue</em>'.
	 * @see projetTemplate.RequirementType#getDomainrequirementvalue()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Domainrequirementvalue();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.RequirementType#getComputationalrequirementvalue <em>Computationalrequirementvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computationalrequirementvalue</em>'.
	 * @see projetTemplate.RequirementType#getComputationalrequirementvalue()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Computationalrequirementvalue();

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
	 * Returns the meta object for the reference '{@link projetTemplate.MLProject#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see projetTemplate.MLProject#getDatabase()
	 * @see #getMLProject()
	 * @generated
	 */
	EReference getMLProject_Database();

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
	 * Returns the meta object for the reference '{@link projetTemplate.DataAnalysisProblem#getProcessingchain <em>Processingchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processingchain</em>'.
	 * @see projetTemplate.DataAnalysisProblem#getProcessingchain()
	 * @see #getDataAnalysisProblem()
	 * @generated
	 */
	EReference getDataAnalysisProblem_Processingchain();

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
	 * Returns the meta object for the attribute '{@link projetTemplate.ComputationalRequirementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetTemplate.ComputationalRequirementValue#getValue()
	 * @see #getComputationalRequirementValue()
	 * @generated
	 */
	EAttribute getComputationalRequirementValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.ComputationalRequirementValue#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see projetTemplate.ComputationalRequirementValue#getRationale()
	 * @see #getComputationalRequirementValue()
	 * @generated
	 */
	EAttribute getComputationalRequirementValue_Rationale();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.ComputationalRequirementValue#getRequirementtype <em>Requirementtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirementtype</em>'.
	 * @see projetTemplate.ComputationalRequirementValue#getRequirementtype()
	 * @see #getComputationalRequirementValue()
	 * @generated
	 */
	EReference getComputationalRequirementValue_Requirementtype();

	/**
	 * Returns the meta object for class '{@link projetTemplate.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see projetTemplate.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Database#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projetTemplate.Database#getValue()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Value();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.Database#getCredentias <em>Credentias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credentias</em>'.
	 * @see projetTemplate.Database#getCredentias()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Credentias();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.Database#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see projetTemplate.Database#getSchema()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Schema();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.Database#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see projetTemplate.Database#getData()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Data();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.Database#getMlproject <em>Mlproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlproject</em>'.
	 * @see projetTemplate.Database#getMlproject()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Mlproject();

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
	 * Returns the meta object for the reference list '{@link projetTemplate.DataPropertyValueSet#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlalgorithmsolutionpattern</em>'.
	 * @see projetTemplate.DataPropertyValueSet#getMlalgorithmsolutionpattern()
	 * @see #getDataPropertyValueSet()
	 * @generated
	 */
	EReference getDataPropertyValueSet_Mlalgorithmsolutionpattern();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.DataPropertyValueSet#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlprocchainsolutionpattern</em>'.
	 * @see projetTemplate.DataPropertyValueSet#getMlprocchainsolutionpattern()
	 * @see #getDataPropertyValueSet()
	 * @generated
	 */
	EReference getDataPropertyValueSet_Mlprocchainsolutionpattern();

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
	 * Returns the meta object for the reference list '{@link projetTemplate.DataPropertyValue#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datapropertyvalueset</em>'.
	 * @see projetTemplate.DataPropertyValue#getDatapropertyvalueset()
	 * @see #getDataPropertyValue()
	 * @generated
	 */
	EReference getDataPropertyValue_Datapropertyvalueset();

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
	 * Returns the meta object for the reference list '{@link projetTemplate.DataAnalysisProblemType#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlprocchainsolutionpattern</em>'.
	 * @see projetTemplate.DataAnalysisProblemType#getMlprocchainsolutionpattern()
	 * @see #getDataAnalysisProblemType()
	 * @generated
	 */
	EReference getDataAnalysisProblemType_Mlprocchainsolutionpattern();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.DataAnalysisProblemType#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlalgorithmsolutionpattern</em>'.
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
	 * Returns the meta object for the attribute '{@link projetTemplate.ProcessingChain#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see projetTemplate.ProcessingChain#getDate()
	 * @see #getProcessingChain()
	 * @generated
	 */
	EAttribute getProcessingChain_Date();

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
	 * Returns the meta object for the reference '{@link projetTemplate.ProcessingChain#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extendedbpmnmodel</em>'.
	 * @see projetTemplate.ProcessingChain#getExtendedbpmnmodel()
	 * @see #getProcessingChain()
	 * @generated
	 */
	EReference getProcessingChain_Extendedbpmnmodel();

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
	 * Returns the meta object for the reference '{@link projetTemplate.ProcessingChain#getProcessingchaintemplate <em>Processingchaintemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processingchaintemplate</em>'.
	 * @see projetTemplate.ProcessingChain#getProcessingchaintemplate()
	 * @see #getProcessingChain()
	 * @generated
	 */
	EReference getProcessingChain_Processingchaintemplate();

	/**
	 * Returns the meta object for class '{@link projetTemplate.MLProcChainSolutionPattern <em>ML Proc Chain Solution Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Proc Chain Solution Pattern</em>'.
	 * @see projetTemplate.MLProcChainSolutionPattern
	 * @generated
	 */
	EClass getMLProcChainSolutionPattern();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLProcChainSolutionPattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projetTemplate.MLProcChainSolutionPattern#getName()
	 * @see #getMLProcChainSolutionPattern()
	 * @generated
	 */
	EAttribute getMLProcChainSolutionPattern_Name();

	/**
	 * Returns the meta object for the attribute '{@link projetTemplate.MLProcChainSolutionPattern#getExplanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explanation</em>'.
	 * @see projetTemplate.MLProcChainSolutionPattern#getExplanation()
	 * @see #getMLProcChainSolutionPattern()
	 * @generated
	 */
	EAttribute getMLProcChainSolutionPattern_Explanation();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLProcChainSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataanalysisproblemtype</em>'.
	 * @see projetTemplate.MLProcChainSolutionPattern#getDataanalysisproblemtype()
	 * @see #getMLProcChainSolutionPattern()
	 * @generated
	 */
	EReference getMLProcChainSolutionPattern_Dataanalysisproblemtype();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLProcChainSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datapropertyvalueset</em>'.
	 * @see projetTemplate.MLProcChainSolutionPattern#getDatapropertyvalueset()
	 * @see #getMLProcChainSolutionPattern()
	 * @generated
	 */
	EReference getMLProcChainSolutionPattern_Datapropertyvalueset();

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
	 * Returns the meta object for the reference list '{@link projetTemplate.ProcessingChainTemplate#getProcessingchain <em>Processingchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processingchain</em>'.
	 * @see projetTemplate.ProcessingChainTemplate#getProcessingchain()
	 * @see #getProcessingChainTemplate()
	 * @generated
	 */
	EReference getProcessingChainTemplate_Processingchain();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.ProcessingChainTemplate#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlprocchainsolutionpattern</em>'.
	 * @see projetTemplate.ProcessingChainTemplate#getMlprocchainsolutionpattern()
	 * @see #getProcessingChainTemplate()
	 * @generated
	 */
	EReference getProcessingChainTemplate_Mlprocchainsolutionpattern();

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
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithmSolutionPattern#getProcessingchaintemplate <em>Processingchaintemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processingchaintemplate</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getProcessingchaintemplate()
	 * @see #getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	EReference getMLAlgorithmSolutionPattern_Processingchaintemplate();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLAlgorithmSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datapropertyvalueset</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getDatapropertyvalueset()
	 * @see #getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	EReference getMLAlgorithmSolutionPattern_Datapropertyvalueset();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithmSolutionPattern#getDataanalysisproblemtype <em>Dataanalysisproblemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataanalysisproblemtype</em>'.
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getDataanalysisproblemtype()
	 * @see #getMLAlgorithmSolutionPattern()
	 * @generated
	 */
	EReference getMLAlgorithmSolutionPattern_Dataanalysisproblemtype();

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
	 * Returns the meta object for class '{@link projetTemplate.MLAlgorithm <em>ML Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ML Algorithm</em>'.
	 * @see projetTemplate.MLAlgorithm
	 * @generated
	 */
	EClass getMLAlgorithm();

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
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectioncriterionvalueset</em>'.
	 * @see projetTemplate.MLAlgorithm#getSelectioncriterionvalueset()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_Selectioncriterionvalueset();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLAlgorithm#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectioncriterionvalue</em>'.
	 * @see projetTemplate.MLAlgorithm#getSelectioncriterionvalue()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_Selectioncriterionvalue();

	/**
	 * Returns the meta object for the reference '{@link projetTemplate.MLAlgorithm#getProcessingchain <em>Processingchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processingchain</em>'.
	 * @see projetTemplate.MLAlgorithm#getProcessingchain()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_Processingchain();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.MLAlgorithm#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mlalgorithmsolutionpattern</em>'.
	 * @see projetTemplate.MLAlgorithm#getMlalgorithmsolutionpattern()
	 * @see #getMLAlgorithm()
	 * @generated
	 */
	EReference getMLAlgorithm_Mlalgorithmsolutionpattern();

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
	 * Returns the meta object for the reference list '{@link projetTemplate.SelectionCriterionValue#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectioncriterionvalueset</em>'.
	 * @see projetTemplate.SelectionCriterionValue#getSelectioncriterionvalueset()
	 * @see #getSelectionCriterionValue()
	 * @generated
	 */
	EReference getSelectionCriterionValue_Selectioncriterionvalueset();

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
	 * Returns the meta object for the reference list '{@link projetTemplate.SelectionCriterion#getSelectioncriterionvalueset <em>Selectioncriterionvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectioncriterionvalueset</em>'.
	 * @see projetTemplate.SelectionCriterion#getSelectioncriterionvalueset()
	 * @see #getSelectionCriterion()
	 * @generated
	 */
	EReference getSelectionCriterion_Selectioncriterionvalueset();

	/**
	 * Returns the meta object for the reference list '{@link projetTemplate.SelectionCriterion#getSelectioncriterionvalue <em>Selectioncriterionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selectioncriterionvalue</em>'.
	 * @see projetTemplate.SelectionCriterion#getSelectioncriterionvalue()
	 * @see #getSelectionCriterion()
	 * @generated
	 */
	EReference getSelectionCriterion_Selectioncriterionvalue();

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
		 * The meta object literal for the '<em><b>Domainrequirementvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PROBLEM__DOMAINREQUIREMENTVALUE = eINSTANCE.getDomainProblem_Domainrequirementvalue();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_REQUIREMENT_VALUE__VALUE = eINSTANCE.getDomainRequirementValue_Value();

		/**
		 * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_REQUIREMENT_VALUE__EXPLANATION = eINSTANCE.getDomainRequirementValue_Explanation();

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
		 * The meta object literal for the '<em><b>Domainrequirementvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE = eINSTANCE.getRequirementType_Domainrequirementvalue();

		/**
		 * The meta object literal for the '<em><b>Computationalrequirementvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE = eINSTANCE
				.getRequirementType_Computationalrequirementvalue();

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
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROJECT__DATABASE = eINSTANCE.getMLProject_Database();

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
		 * The meta object literal for the '<em><b>Processingchain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_PROBLEM__PROCESSINGCHAIN = eINSTANCE.getDataAnalysisProblem_Processingchain();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_REQUIREMENT_VALUE__VALUE = eINSTANCE.getComputationalRequirementValue_Value();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_REQUIREMENT_VALUE__RATIONALE = eINSTANCE.getComputationalRequirementValue_Rationale();

		/**
		 * The meta object literal for the '<em><b>Requirementtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATIONAL_REQUIREMENT_VALUE__REQUIREMENTTYPE = eINSTANCE
				.getComputationalRequirementValue_Requirementtype();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.DatabaseImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__VALUE = eINSTANCE.getDatabase_Value();

		/**
		 * The meta object literal for the '<em><b>Credentias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__CREDENTIAS = eINSTANCE.getDatabase_Credentias();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__SCHEMA = eINSTANCE.getDatabase_Schema();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__DATA = eINSTANCE.getDatabase_Data();

		/**
		 * The meta object literal for the '<em><b>Mlproject</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__MLPROJECT = eINSTANCE.getDatabase_Mlproject();

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
		 * The meta object literal for the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_VALUE_SET__MLALGORITHMSOLUTIONPATTERN = eINSTANCE
				.getDataPropertyValueSet_Mlalgorithmsolutionpattern();

		/**
		 * The meta object literal for the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_VALUE_SET__MLPROCCHAINSOLUTIONPATTERN = eINSTANCE
				.getDataPropertyValueSet_Mlprocchainsolutionpattern();

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
		 * The meta object literal for the '<em><b>Datapropertyvalueset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PROPERTY_VALUE__DATAPROPERTYVALUESET = eINSTANCE.getDataPropertyValue_Datapropertyvalueset();

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
		 * The meta object literal for the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ANALYSIS_PROBLEM_TYPE__MLPROCCHAINSOLUTIONPATTERN = eINSTANCE
				.getDataAnalysisProblemType_Mlprocchainsolutionpattern();

		/**
		 * The meta object literal for the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CHAIN__DATE = eINSTANCE.getProcessingChain_Date();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_CHAIN__AUTHOR = eINSTANCE.getProcessingChain_Author();

		/**
		 * The meta object literal for the '<em><b>Extendedbpmnmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN__EXTENDEDBPMNMODEL = eINSTANCE.getProcessingChain_Extendedbpmnmodel();

		/**
		 * The meta object literal for the '<em><b>Mlalgorithm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN__MLALGORITHM = eINSTANCE.getProcessingChain_Mlalgorithm();

		/**
		 * The meta object literal for the '<em><b>Processingchaintemplate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN__PROCESSINGCHAINTEMPLATE = eINSTANCE.getProcessingChain_Processingchaintemplate();

		/**
		 * The meta object literal for the '{@link projetTemplate.impl.MLProcChainSolutionPatternImpl <em>ML Proc Chain Solution Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projetTemplate.impl.MLProcChainSolutionPatternImpl
		 * @see projetTemplate.impl.ProjetTemplatePackageImpl#getMLProcChainSolutionPattern()
		 * @generated
		 */
		EClass ML_PROC_CHAIN_SOLUTION_PATTERN = eINSTANCE.getMLProcChainSolutionPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_PROC_CHAIN_SOLUTION_PATTERN__NAME = eINSTANCE.getMLProcChainSolutionPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_PROC_CHAIN_SOLUTION_PATTERN__EXPLANATION = eINSTANCE.getMLProcChainSolutionPattern_Explanation();

		/**
		 * The meta object literal for the '<em><b>Dataanalysisproblemtype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROC_CHAIN_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE = eINSTANCE
				.getMLProcChainSolutionPattern_Dataanalysisproblemtype();

		/**
		 * The meta object literal for the '<em><b>Datapropertyvalueset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_PROC_CHAIN_SOLUTION_PATTERN__DATAPROPERTYVALUESET = eINSTANCE
				.getMLProcChainSolutionPattern_Datapropertyvalueset();

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
		 * The meta object literal for the '<em><b>Processingchain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN_TEMPLATE__PROCESSINGCHAIN = eINSTANCE.getProcessingChainTemplate_Processingchain();

		/**
		 * The meta object literal for the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN = eINSTANCE
				.getProcessingChainTemplate_Mlprocchainsolutionpattern();

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
		 * The meta object literal for the '<em><b>Processingchaintemplate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM_SOLUTION_PATTERN__PROCESSINGCHAINTEMPLATE = eINSTANCE
				.getMLAlgorithmSolutionPattern_Processingchaintemplate();

		/**
		 * The meta object literal for the '<em><b>Datapropertyvalueset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM_SOLUTION_PATTERN__DATAPROPERTYVALUESET = eINSTANCE
				.getMLAlgorithmSolutionPattern_Datapropertyvalueset();

		/**
		 * The meta object literal for the '<em><b>Dataanalysisproblemtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM_SOLUTION_PATTERN__DATAANALYSISPROBLEMTYPE = eINSTANCE
				.getMLAlgorithmSolutionPattern_Dataanalysisproblemtype();

		/**
		 * The meta object literal for the '<em><b>Mlalgorithm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM_SOLUTION_PATTERN__MLALGORITHM = eINSTANCE.getMLAlgorithmSolutionPattern_Mlalgorithm();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ML_ALGORITHM__NAME = eINSTANCE.getMLAlgorithm_Name();

		/**
		 * The meta object literal for the '<em><b>Selectioncriterionvalueset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__SELECTIONCRITERIONVALUESET = eINSTANCE.getMLAlgorithm_Selectioncriterionvalueset();

		/**
		 * The meta object literal for the '<em><b>Selectioncriterionvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__SELECTIONCRITERIONVALUE = eINSTANCE.getMLAlgorithm_Selectioncriterionvalue();

		/**
		 * The meta object literal for the '<em><b>Processingchain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__PROCESSINGCHAIN = eINSTANCE.getMLAlgorithm_Processingchain();

		/**
		 * The meta object literal for the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ML_ALGORITHM__MLALGORITHMSOLUTIONPATTERN = eINSTANCE.getMLAlgorithm_Mlalgorithmsolutionpattern();

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
		 * The meta object literal for the '<em><b>Selectioncriterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERION = eINSTANCE
				.getSelectionCriterionValueSet_Selectioncriterion();

		/**
		 * The meta object literal for the '<em><b>Selectioncriterionvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION_VALUE_SET__SELECTIONCRITERIONVALUE = eINSTANCE
				.getSelectionCriterionValueSet_Selectioncriterionvalue();

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
		 * The meta object literal for the '<em><b>Selectioncriterionvalueset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION_VALUE__SELECTIONCRITERIONVALUESET = eINSTANCE
				.getSelectionCriterionValue_Selectioncriterionvalueset();

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
		 * The meta object literal for the '<em><b>Selectioncriterionvalueset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION__SELECTIONCRITERIONVALUESET = eINSTANCE
				.getSelectionCriterion_Selectioncriterionvalueset();

		/**
		 * The meta object literal for the '<em><b>Selectioncriterionvalue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_CRITERION__SELECTIONCRITERIONVALUE = eINSTANCE
				.getSelectionCriterion_Selectioncriterionvalue();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_BPMN_MODEL__NAME = eINSTANCE.getExtendedBPMNModel_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_BPMN_MODEL__AUTHOR = eINSTANCE.getExtendedBPMNModel_Author();

	}

} //ProjetTemplatePackage
