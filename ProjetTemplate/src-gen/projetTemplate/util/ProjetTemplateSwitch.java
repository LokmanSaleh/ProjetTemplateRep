/**
 */
package projetTemplate.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import projetTemplate.*;
import projetTemplate.Accuracy;
import projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction;
import projetTemplate.Component;
import projetTemplate.ComputationalRequirementValue;
import projetTemplate.Condition;
import projetTemplate.Conversion;
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
import projetTemplate.Explainability;
import projetTemplate.ExtendedBPMNModel;
import projetTemplate.FeatureConstruction;
import projetTemplate.FeatureSelection;
import projetTemplate.MLAlgorithm;
import projetTemplate.MLAlgorithmSolutionPattern;
import projetTemplate.MLProcChainSolutionPattern;
import projetTemplate.MLProject;
import projetTemplate.MissingValueTreatement;
import projetTemplate.ModelElement;
import projetTemplate.NoiseTreatement;
import projetTemplate.PostTreatement;
import projetTemplate.ProcessingChain;
import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RemoveUncessaryFileds;
import projetTemplate.RequirementMapping;
import projetTemplate.RequirementType;
import projetTemplate.Resultat;
import projetTemplate.Rule;
import projetTemplate.Schema;
import projetTemplate.SelectionCriterion;
import projetTemplate.SelectionCriterionValue;
import projetTemplate.SelectionCriterionValueSet;
import projetTemplate.Term;
import projetTemplate.connector;
import projetTemplate.variable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage
 * @generated
 */
public class ProjetTemplateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjetTemplatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTemplateSwitch() {
		if (modelPackage == null) {
			modelPackage = ProjetTemplatePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ProjetTemplatePackage.DOMAIN_PROBLEM: {
			DomainProblem domainProblem = (DomainProblem) theEObject;
			T result = caseDomainProblem(domainProblem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_VALUE: {
			DomainRequirementValue domainRequirementValue = (DomainRequirementValue) theEObject;
			T result = caseDomainRequirementValue(domainRequirementValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.REQUIREMENT_TYPE: {
			RequirementType requirementType = (RequirementType) theEObject;
			T result = caseRequirementType(requirementType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.ML_PROJECT: {
			MLProject mlProject = (MLProject) theEObject;
			T result = caseMLProject(mlProject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM: {
			DataAnalysisProblem dataAnalysisProblem = (DataAnalysisProblem) theEObject;
			T result = caseDataAnalysisProblem(dataAnalysisProblem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.COMPUTATIONAL_REQUIREMENT_VALUE: {
			ComputationalRequirementValue computationalRequirementValue = (ComputationalRequirementValue) theEObject;
			T result = caseComputationalRequirementValue(computationalRequirementValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATABASE: {
			Database database = (Database) theEObject;
			T result = caseDatabase(database);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.SCHEMA: {
			Schema schema = (Schema) theEObject;
			T result = caseSchema(schema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.REQUIREMENT_MAPPING: {
			RequirementMapping requirementMapping = (RequirementMapping) theEObject;
			T result = caseRequirementMapping(requirementMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T result = caseModelElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE_SET: {
			DataPropertyValueSet dataPropertyValueSet = (DataPropertyValueSet) theEObject;
			T result = caseDataPropertyValueSet(dataPropertyValueSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA_PROPERTY_VALUE: {
			DataPropertyValue dataPropertyValue = (DataPropertyValue) theEObject;
			T result = caseDataPropertyValue(dataPropertyValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA_PROPERTY_TYPE: {
			DataPropertyType dataPropertyType = (DataPropertyType) theEObject;
			T result = caseDataPropertyType(dataPropertyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA_ANALYSIS_PROBLEM_TYPE: {
			DataAnalysisProblemType dataAnalysisProblemType = (DataAnalysisProblemType) theEObject;
			T result = caseDataAnalysisProblemType(dataAnalysisProblemType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE: {
			ProcessingChainTemplate processingChainTemplate = (ProcessingChainTemplate) theEObject;
			T result = caseProcessingChainTemplate(processingChainTemplate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION_PATTERN: {
			MLProcChainSolutionPattern mlProcChainSolutionPattern = (MLProcChainSolutionPattern) theEObject;
			T result = caseMLProcChainSolutionPattern(mlProcChainSolutionPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.PROCESSING_CHAIN: {
			ProcessingChain processingChain = (ProcessingChain) theEObject;
			T result = caseProcessingChain(processingChain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.ML_ALGORITHM_SOLUTION_PATTERN: {
			MLAlgorithmSolutionPattern mlAlgorithmSolutionPattern = (MLAlgorithmSolutionPattern) theEObject;
			T result = caseMLAlgorithmSolutionPattern(mlAlgorithmSolutionPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.ML_ALGORITHM: {
			MLAlgorithm mlAlgorithm = (MLAlgorithm) theEObject;
			T result = caseMLAlgorithm(mlAlgorithm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE_SET: {
			SelectionCriterionValueSet selectionCriterionValueSet = (SelectionCriterionValueSet) theEObject;
			T result = caseSelectionCriterionValueSet(selectionCriterionValueSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.SELECTION_CRITERION_VALUE: {
			SelectionCriterionValue selectionCriterionValue = (SelectionCriterionValue) theEObject;
			T result = caseSelectionCriterionValue(selectionCriterionValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.SELECTION_CRITERION: {
			SelectionCriterion selectionCriterion = (SelectionCriterion) theEObject;
			T result = caseSelectionCriterion(selectionCriterion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.EXTENDED_BPMN_MODEL: {
			ExtendedBPMNModel extendedBPMNModel = (ExtendedBPMNModel) theEObject;
			T result = caseExtendedBPMNModel(extendedBPMNModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.EXPLAINABILITY: {
			Explainability explainability = (Explainability) theEObject;
			T result = caseExplainability(explainability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.ACCURACY: {
			Accuracy accuracy = (Accuracy) theEObject;
			T result = caseAccuracy(accuracy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION: {
			CollectedDataKnowledgeAboutTemplateConstruction collectedDataKnowledgeAboutTemplateConstruction = (CollectedDataKnowledgeAboutTemplateConstruction) theEObject;
			T result = caseCollectedDataKnowledgeAboutTemplateConstruction(
					collectedDataKnowledgeAboutTemplateConstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.RULE: {
			Rule rule = (Rule) theEObject;
			T result = caseRule(rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.RESULTAT: {
			Resultat resultat = (Resultat) theEObject;
			T result = caseResultat(resultat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.VARIABLE: {
			variable variable = (variable) theEObject;
			T result = casevariable(variable);
			if (result == null)
				result = caseTerm(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.TERM: {
			Term term = (Term) theEObject;
			T result = caseTerm(term);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.CONNECTOR: {
			connector connector = (connector) theEObject;
			T result = caseconnector(connector);
			if (result == null)
				result = caseTerm(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA_CLEANING: {
			DataCleaning dataCleaning = (DataCleaning) theEObject;
			T result = caseDataCleaning(dataCleaning);
			if (result == null)
				result = caseComponent(dataCleaning);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DATA_PRETRAITEMENT: {
			DataPretraitement dataPretraitement = (DataPretraitement) theEObject;
			T result = caseDataPretraitement(dataPretraitement);
			if (result == null)
				result = caseComponent(dataPretraitement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.FEATURE_SELECTION: {
			FeatureSelection featureSelection = (FeatureSelection) theEObject;
			T result = caseFeatureSelection(featureSelection);
			if (result == null)
				result = caseComponent(featureSelection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.FEATURE_CONSTRUCTION: {
			FeatureConstruction featureConstruction = (FeatureConstruction) theEObject;
			T result = caseFeatureConstruction(featureConstruction);
			if (result == null)
				result = caseComponent(featureConstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.POST_TREATEMENT: {
			PostTreatement postTreatement = (PostTreatement) theEObject;
			T result = casePostTreatement(postTreatement);
			if (result == null)
				result = caseComponent(postTreatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DEPLOYEMENT: {
			Deployement deployement = (Deployement) theEObject;
			T result = caseDeployement(deployement);
			if (result == null)
				result = caseComponent(deployement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.REMOVE_UNCESSARY_FILEDS: {
			RemoveUncessaryFileds removeUncessaryFileds = (RemoveUncessaryFileds) theEObject;
			T result = caseRemoveUncessaryFileds(removeUncessaryFileds);
			if (result == null)
				result = caseDataCleaning(removeUncessaryFileds);
			if (result == null)
				result = caseComponent(removeUncessaryFileds);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.CONVERSION: {
			Conversion conversion = (Conversion) theEObject;
			T result = caseConversion(conversion);
			if (result == null)
				result = caseDataPretraitement(conversion);
			if (result == null)
				result = caseComponent(conversion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.NOISE_TREATEMENT: {
			NoiseTreatement noiseTreatement = (NoiseTreatement) theEObject;
			T result = caseNoiseTreatement(noiseTreatement);
			if (result == null)
				result = caseDataPretraitement(noiseTreatement);
			if (result == null)
				result = caseComponent(noiseTreatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.MISSING_VALUE_TREATEMENT: {
			MissingValueTreatement missingValueTreatement = (MissingValueTreatement) theEObject;
			T result = caseMissingValueTreatement(missingValueTreatement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.DOMAIN_REQUIREMENT_SELECTION_CRITERIA: {
			DomainRequirementSelectionCriteria domainRequirementSelectionCriteria = (DomainRequirementSelectionCriteria) theEObject;
			T result = caseDomainRequirementSelectionCriteria(domainRequirementSelectionCriteria);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ProjetTemplatePackage.CRITERIA_TO_CHOOSE_ML_ALGORITHM: {
			CriteriaToChooseMLAlgorithm criteriaToChooseMLAlgorithm = (CriteriaToChooseMLAlgorithm) theEObject;
			T result = caseCriteriaToChooseMLAlgorithm(criteriaToChooseMLAlgorithm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainProblem(DomainProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Requirement Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Requirement Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainRequirementValue(DomainRequirementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementType(RequirementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLProject(MLProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Analysis Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Analysis Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAnalysisProblem(DataAnalysisProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computational Requirement Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computational Requirement Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputationalRequirementValue(ComputationalRequirementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementMapping(RequirementMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyValueSet(DataPropertyValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyValue(DataPropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyType(DataPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Analysis Problem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Analysis Problem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAnalysisProblemType(DataAnalysisProblemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingChain(ProcessingChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Proc Chain Solution Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Proc Chain Solution Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLProcChainSolutionPattern(MLProcChainSolutionPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Chain Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Chain Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingChainTemplate(ProcessingChainTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Algorithm Solution Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Algorithm Solution Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLAlgorithmSolutionPattern(MLAlgorithmSolutionPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLAlgorithm(MLAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Criterion Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Criterion Value Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionCriterionValueSet(SelectionCriterionValueSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Criterion Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Criterion Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionCriterionValue(SelectionCriterionValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionCriterion(SelectionCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended BPMN Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended BPMN Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedBPMNModel(ExtendedBPMNModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplainability(Explainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accuracy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccuracy(Accuracy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collected Data Knowledge About Template Construction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collected Data Knowledge About Template Construction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectedDataKnowledgeAboutTemplateConstruction(
			CollectedDataKnowledgeAboutTemplateConstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resultat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultat(Resultat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevariable(variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnector(connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Cleaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Cleaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataCleaning(DataCleaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pretraitement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pretraitement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPretraitement(DataPretraitement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSelection(FeatureSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Construction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Construction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureConstruction(FeatureConstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Treatement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Treatement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostTreatement(PostTreatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployement(Deployement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Uncessary Fileds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Uncessary Fileds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveUncessaryFileds(RemoveUncessaryFileds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversion(Conversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noise Treatement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noise Treatement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoiseTreatement(NoiseTreatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missing Value Treatement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missing Value Treatement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissingValueTreatement(MissingValueTreatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Requirement Selection Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Requirement Selection Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainRequirementSelectionCriteria(DomainRequirementSelectionCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criteria To Choose ML Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criteria To Choose ML Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriteriaToChooseMLAlgorithm(CriteriaToChooseMLAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProjetTemplateSwitch
