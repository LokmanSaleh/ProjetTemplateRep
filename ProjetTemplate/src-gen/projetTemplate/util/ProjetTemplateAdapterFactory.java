/**
 */
package projetTemplate.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import projetTemplate.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage
 * @generated
 */
public class ProjetTemplateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjetTemplatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTemplateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProjetTemplatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjetTemplateSwitch<Adapter> modelSwitch = new ProjetTemplateSwitch<Adapter>() {
		@Override
		public Adapter caseDomainProblem(DomainProblem object) {
			return createDomainProblemAdapter();
		}

		@Override
		public Adapter caseDomainRequirementValue(DomainRequirementValue object) {
			return createDomainRequirementValueAdapter();
		}

		@Override
		public Adapter caseRequirementType(RequirementType object) {
			return createRequirementTypeAdapter();
		}

		@Override
		public Adapter caseMLProject(MLProject object) {
			return createMLProjectAdapter();
		}

		@Override
		public Adapter caseDataAnalysisProblem(DataAnalysisProblem object) {
			return createDataAnalysisProblemAdapter();
		}

		@Override
		public Adapter caseComputationalRequirementValue(ComputationalRequirementValue object) {
			return createComputationalRequirementValueAdapter();
		}

		@Override
		public Adapter caseDatabase(Database object) {
			return createDatabaseAdapter();
		}

		@Override
		public Adapter caseSchema(Schema object) {
			return createSchemaAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseRequirementMapping(RequirementMapping object) {
			return createRequirementMappingAdapter();
		}

		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseDataPropertyValueSet(DataPropertyValueSet object) {
			return createDataPropertyValueSetAdapter();
		}

		@Override
		public Adapter caseDataPropertyValue(DataPropertyValue object) {
			return createDataPropertyValueAdapter();
		}

		@Override
		public Adapter caseDataPropertyType(DataPropertyType object) {
			return createDataPropertyTypeAdapter();
		}

		@Override
		public Adapter caseDataAnalysisProblemType(DataAnalysisProblemType object) {
			return createDataAnalysisProblemTypeAdapter();
		}

		@Override
		public Adapter caseProcessingChain(ProcessingChain object) {
			return createProcessingChainAdapter();
		}

		@Override
		public Adapter caseMLProcChainSolutionPattern(MLProcChainSolutionPattern object) {
			return createMLProcChainSolutionPatternAdapter();
		}

		@Override
		public Adapter caseProcessingChainTemplate(ProcessingChainTemplate object) {
			return createProcessingChainTemplateAdapter();
		}

		@Override
		public Adapter caseMLAlgorithmSolutionPattern(MLAlgorithmSolutionPattern object) {
			return createMLAlgorithmSolutionPatternAdapter();
		}

		@Override
		public Adapter caseMLAlgorithm(MLAlgorithm object) {
			return createMLAlgorithmAdapter();
		}

		@Override
		public Adapter caseSelectionCriterionValueSet(SelectionCriterionValueSet object) {
			return createSelectionCriterionValueSetAdapter();
		}

		@Override
		public Adapter caseSelectionCriterionValue(SelectionCriterionValue object) {
			return createSelectionCriterionValueAdapter();
		}

		@Override
		public Adapter caseSelectionCriterion(SelectionCriterion object) {
			return createSelectionCriterionAdapter();
		}

		@Override
		public Adapter caseExtendedBPMNModel(ExtendedBPMNModel object) {
			return createExtendedBPMNModelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DomainProblem <em>Domain Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DomainProblem
	 * @generated
	 */
	public Adapter createDomainProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DomainRequirementValue <em>Domain Requirement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DomainRequirementValue
	 * @generated
	 */
	public Adapter createDomainRequirementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.RequirementType
	 * @generated
	 */
	public Adapter createRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.MLProject <em>ML Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.MLProject
	 * @generated
	 */
	public Adapter createMLProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DataAnalysisProblem <em>Data Analysis Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DataAnalysisProblem
	 * @generated
	 */
	public Adapter createDataAnalysisProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.ComputationalRequirementValue <em>Computational Requirement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.ComputationalRequirementValue
	 * @generated
	 */
	public Adapter createComputationalRequirementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.RequirementMapping <em>Requirement Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.RequirementMapping
	 * @generated
	 */
	public Adapter createRequirementMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DataPropertyValueSet <em>Data Property Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DataPropertyValueSet
	 * @generated
	 */
	public Adapter createDataPropertyValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DataPropertyValue <em>Data Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DataPropertyValue
	 * @generated
	 */
	public Adapter createDataPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DataPropertyType <em>Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DataPropertyType
	 * @generated
	 */
	public Adapter createDataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DataAnalysisProblemType <em>Data Analysis Problem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DataAnalysisProblemType
	 * @generated
	 */
	public Adapter createDataAnalysisProblemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.ProcessingChain <em>Processing Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.ProcessingChain
	 * @generated
	 */
	public Adapter createProcessingChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.MLProcChainSolutionPattern <em>ML Proc Chain Solution Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.MLProcChainSolutionPattern
	 * @generated
	 */
	public Adapter createMLProcChainSolutionPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.ProcessingChainTemplate <em>Processing Chain Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.ProcessingChainTemplate
	 * @generated
	 */
	public Adapter createProcessingChainTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.MLAlgorithmSolutionPattern <em>ML Algorithm Solution Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.MLAlgorithmSolutionPattern
	 * @generated
	 */
	public Adapter createMLAlgorithmSolutionPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.MLAlgorithm <em>ML Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.MLAlgorithm
	 * @generated
	 */
	public Adapter createMLAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.SelectionCriterionValueSet <em>Selection Criterion Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.SelectionCriterionValueSet
	 * @generated
	 */
	public Adapter createSelectionCriterionValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.SelectionCriterionValue <em>Selection Criterion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.SelectionCriterionValue
	 * @generated
	 */
	public Adapter createSelectionCriterionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.SelectionCriterion <em>Selection Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.SelectionCriterion
	 * @generated
	 */
	public Adapter createSelectionCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.ExtendedBPMNModel <em>Extended BPMN Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.ExtendedBPMNModel
	 * @generated
	 */
	public Adapter createExtendedBPMNModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProjetTemplateAdapterFactory
