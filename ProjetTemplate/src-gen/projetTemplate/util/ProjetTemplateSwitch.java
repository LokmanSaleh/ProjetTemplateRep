/**
 */
package projetTemplate.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import projetTemplate.*;

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
		case ProjetTemplatePackage.PROCESSING_CHAIN: {
			ProcessingChain processingChain = (ProcessingChain) theEObject;
			T result = caseProcessingChain(processingChain);
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
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE: {
			ProcessingChainTemplate processingChainTemplate = (ProcessingChainTemplate) theEObject;
			T result = caseProcessingChainTemplate(processingChainTemplate);
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
