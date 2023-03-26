/**
 */
package projetTemplate.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
		public Adapter caseProcessingChainTemplate(ProcessingChainTemplate object) {
			return createProcessingChainTemplateAdapter();
		}

		@Override
		public Adapter caseMLProcChainSolutionPattern(MLProcChainSolutionPattern object) {
			return createMLProcChainSolutionPatternAdapter();
		}

		@Override
		public Adapter caseProcessingChain(ProcessingChain object) {
			return createProcessingChainAdapter();
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
		public Adapter caseExplainability(Explainability object) {
			return createExplainabilityAdapter();
		}

		@Override
		public Adapter caseAccuracy(Accuracy object) {
			return createAccuracyAdapter();
		}

		@Override
		public Adapter caseCollectedDataKnowledgeAboutTemplateConstruction(
				CollectedDataKnowledgeAboutTemplateConstruction object) {
			return createCollectedDataKnowledgeAboutTemplateConstructionAdapter();
		}

		@Override
		public Adapter caseRule(Rule object) {
			return createRuleAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseResultat(Resultat object) {
			return createResultatAdapter();
		}

		@Override
		public Adapter casevariable(variable object) {
			return createvariableAdapter();
		}

		@Override
		public Adapter caseTerm(Term object) {
			return createTermAdapter();
		}

		@Override
		public Adapter caseconnector(connector object) {
			return createconnectorAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseDataCleaning(DataCleaning object) {
			return createDataCleaningAdapter();
		}

		@Override
		public Adapter caseDataPretraitement(DataPretraitement object) {
			return createDataPretraitementAdapter();
		}

		@Override
		public Adapter caseFeatureSelection(FeatureSelection object) {
			return createFeatureSelectionAdapter();
		}

		@Override
		public Adapter caseFeatureConstruction(FeatureConstruction object) {
			return createFeatureConstructionAdapter();
		}

		@Override
		public Adapter casePostTreatement(PostTreatement object) {
			return createPostTreatementAdapter();
		}

		@Override
		public Adapter caseDeployement(Deployement object) {
			return createDeployementAdapter();
		}

		@Override
		public Adapter caseRemoveUncessaryFileds(RemoveUncessaryFileds object) {
			return createRemoveUncessaryFiledsAdapter();
		}

		@Override
		public Adapter caseConversion(Conversion object) {
			return createConversionAdapter();
		}

		@Override
		public Adapter caseNoiseTreatement(NoiseTreatement object) {
			return createNoiseTreatementAdapter();
		}

		@Override
		public Adapter caseMissingValueTreatement(MissingValueTreatement object) {
			return createMissingValueTreatementAdapter();
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
	 * Creates a new adapter for an object of class '{@link projetTemplate.Explainability <em>Explainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Explainability
	 * @generated
	 */
	public Adapter createExplainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Accuracy
	 * @generated
	 */
	public Adapter createAccuracyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction <em>Collected Data Knowledge About Template Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction
	 * @generated
	 */
	public Adapter createCollectedDataKnowledgeAboutTemplateConstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Resultat <em>Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Resultat
	 * @generated
	 */
	public Adapter createResultatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.variable <em>variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.variable
	 * @generated
	 */
	public Adapter createvariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.connector <em>connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.connector
	 * @generated
	 */
	public Adapter createconnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DataCleaning <em>Data Cleaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DataCleaning
	 * @generated
	 */
	public Adapter createDataCleaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.DataPretraitement <em>Data Pretraitement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.DataPretraitement
	 * @generated
	 */
	public Adapter createDataPretraitementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.FeatureSelection <em>Feature Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.FeatureSelection
	 * @generated
	 */
	public Adapter createFeatureSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.FeatureConstruction <em>Feature Construction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.FeatureConstruction
	 * @generated
	 */
	public Adapter createFeatureConstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.PostTreatement <em>Post Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.PostTreatement
	 * @generated
	 */
	public Adapter createPostTreatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Deployement <em>Deployement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Deployement
	 * @generated
	 */
	public Adapter createDeployementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.RemoveUncessaryFileds <em>Remove Uncessary Fileds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.RemoveUncessaryFileds
	 * @generated
	 */
	public Adapter createRemoveUncessaryFiledsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.Conversion
	 * @generated
	 */
	public Adapter createConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.NoiseTreatement <em>Noise Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.NoiseTreatement
	 * @generated
	 */
	public Adapter createNoiseTreatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projetTemplate.MissingValueTreatement <em>Missing Value Treatement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projetTemplate.MissingValueTreatement
	 * @generated
	 */
	public Adapter createMissingValueTreatementAdapter() {
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
