/**
 */
package projetTemplate.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import projetTemplate.util.ProjetTemplateAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetTemplateItemProviderAdapterFactory extends ProjetTemplateAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetTemplateItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DomainProblem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainProblemItemProvider domainProblemItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DomainProblem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainProblemAdapter() {
		if (domainProblemItemProvider == null) {
			domainProblemItemProvider = new DomainProblemItemProvider(this);
		}

		return domainProblemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DomainRequirementValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainRequirementValueItemProvider domainRequirementValueItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DomainRequirementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainRequirementValueAdapter() {
		if (domainRequirementValueItemProvider == null) {
			domainRequirementValueItemProvider = new DomainRequirementValueItemProvider(this);
		}

		return domainRequirementValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.RequirementType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementTypeItemProvider requirementTypeItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.RequirementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementTypeAdapter() {
		if (requirementTypeItemProvider == null) {
			requirementTypeItemProvider = new RequirementTypeItemProvider(this);
		}

		return requirementTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.MLProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLProjectItemProvider mlProjectItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.MLProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMLProjectAdapter() {
		if (mlProjectItemProvider == null) {
			mlProjectItemProvider = new MLProjectItemProvider(this);
		}

		return mlProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DataAnalysisProblem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAnalysisProblemItemProvider dataAnalysisProblemItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DataAnalysisProblem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAnalysisProblemAdapter() {
		if (dataAnalysisProblemItemProvider == null) {
			dataAnalysisProblemItemProvider = new DataAnalysisProblemItemProvider(this);
		}

		return dataAnalysisProblemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.ComputationalRequirementValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationalRequirementValueItemProvider computationalRequirementValueItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.ComputationalRequirementValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComputationalRequirementValueAdapter() {
		if (computationalRequirementValueItemProvider == null) {
			computationalRequirementValueItemProvider = new ComputationalRequirementValueItemProvider(this);
		}

		return computationalRequirementValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Database} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseItemProvider databaseItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatabaseAdapter() {
		if (databaseItemProvider == null) {
			databaseItemProvider = new DatabaseItemProvider(this);
		}

		return databaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Schema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaItemProvider schemaItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchemaAdapter() {
		if (schemaItemProvider == null) {
			schemaItemProvider = new SchemaItemProvider(this);
		}

		return schemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Data} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemProvider dataItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAdapter() {
		if (dataItemProvider == null) {
			dataItemProvider = new DataItemProvider(this);
		}

		return dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.RequirementMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementMappingItemProvider requirementMappingItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.RequirementMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementMappingAdapter() {
		if (requirementMappingItemProvider == null) {
			requirementMappingItemProvider = new RequirementMappingItemProvider(this);
		}

		return requirementMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.ModelElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementItemProvider modelElementItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelElementAdapter() {
		if (modelElementItemProvider == null) {
			modelElementItemProvider = new ModelElementItemProvider(this);
		}

		return modelElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DataPropertyValueSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyValueSetItemProvider dataPropertyValueSetItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DataPropertyValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPropertyValueSetAdapter() {
		if (dataPropertyValueSetItemProvider == null) {
			dataPropertyValueSetItemProvider = new DataPropertyValueSetItemProvider(this);
		}

		return dataPropertyValueSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DataPropertyValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyValueItemProvider dataPropertyValueItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DataPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPropertyValueAdapter() {
		if (dataPropertyValueItemProvider == null) {
			dataPropertyValueItemProvider = new DataPropertyValueItemProvider(this);
		}

		return dataPropertyValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DataPropertyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPropertyTypeItemProvider dataPropertyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DataPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPropertyTypeAdapter() {
		if (dataPropertyTypeItemProvider == null) {
			dataPropertyTypeItemProvider = new DataPropertyTypeItemProvider(this);
		}

		return dataPropertyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DataAnalysisProblemType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAnalysisProblemTypeItemProvider dataAnalysisProblemTypeItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DataAnalysisProblemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAnalysisProblemTypeAdapter() {
		if (dataAnalysisProblemTypeItemProvider == null) {
			dataAnalysisProblemTypeItemProvider = new DataAnalysisProblemTypeItemProvider(this);
		}

		return dataAnalysisProblemTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.ProcessingChain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingChainItemProvider processingChainItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.ProcessingChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessingChainAdapter() {
		if (processingChainItemProvider == null) {
			processingChainItemProvider = new ProcessingChainItemProvider(this);
		}

		return processingChainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.MLProcChainSolutionPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLProcChainSolutionPatternItemProvider mlProcChainSolutionPatternItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.MLProcChainSolutionPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMLProcChainSolutionPatternAdapter() {
		if (mlProcChainSolutionPatternItemProvider == null) {
			mlProcChainSolutionPatternItemProvider = new MLProcChainSolutionPatternItemProvider(this);
		}

		return mlProcChainSolutionPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.ProcessingChainTemplate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingChainTemplateItemProvider processingChainTemplateItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.ProcessingChainTemplate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessingChainTemplateAdapter() {
		if (processingChainTemplateItemProvider == null) {
			processingChainTemplateItemProvider = new ProcessingChainTemplateItemProvider(this);
		}

		return processingChainTemplateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.MLAlgorithmSolutionPattern} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLAlgorithmSolutionPatternItemProvider mlAlgorithmSolutionPatternItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.MLAlgorithmSolutionPattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMLAlgorithmSolutionPatternAdapter() {
		if (mlAlgorithmSolutionPatternItemProvider == null) {
			mlAlgorithmSolutionPatternItemProvider = new MLAlgorithmSolutionPatternItemProvider(this);
		}

		return mlAlgorithmSolutionPatternItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.MLAlgorithm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLAlgorithmItemProvider mlAlgorithmItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.MLAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMLAlgorithmAdapter() {
		if (mlAlgorithmItemProvider == null) {
			mlAlgorithmItemProvider = new MLAlgorithmItemProvider(this);
		}

		return mlAlgorithmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.SelectionCriterionValueSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionCriterionValueSetItemProvider selectionCriterionValueSetItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.SelectionCriterionValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionCriterionValueSetAdapter() {
		if (selectionCriterionValueSetItemProvider == null) {
			selectionCriterionValueSetItemProvider = new SelectionCriterionValueSetItemProvider(this);
		}

		return selectionCriterionValueSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.SelectionCriterionValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionCriterionValueItemProvider selectionCriterionValueItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.SelectionCriterionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionCriterionValueAdapter() {
		if (selectionCriterionValueItemProvider == null) {
			selectionCriterionValueItemProvider = new SelectionCriterionValueItemProvider(this);
		}

		return selectionCriterionValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.SelectionCriterion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionCriterionItemProvider selectionCriterionItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.SelectionCriterion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionCriterionAdapter() {
		if (selectionCriterionItemProvider == null) {
			selectionCriterionItemProvider = new SelectionCriterionItemProvider(this);
		}

		return selectionCriterionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.ExtendedBPMNModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedBPMNModelItemProvider extendedBPMNModelItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.ExtendedBPMNModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtendedBPMNModelAdapter() {
		if (extendedBPMNModelItemProvider == null) {
			extendedBPMNModelItemProvider = new ExtendedBPMNModelItemProvider(this);
		}

		return extendedBPMNModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Explainability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplainabilityItemProvider explainabilityItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Explainability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExplainabilityAdapter() {
		if (explainabilityItemProvider == null) {
			explainabilityItemProvider = new ExplainabilityItemProvider(this);
		}

		return explainabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Accuracy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccuracyItemProvider accuracyItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Accuracy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAccuracyAdapter() {
		if (accuracyItemProvider == null) {
			accuracyItemProvider = new AccuracyItemProvider(this);
		}

		return accuracyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectedDataKnowledgeAboutTemplateConstructionItemProvider collectedDataKnowledgeAboutTemplateConstructionItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollectedDataKnowledgeAboutTemplateConstructionAdapter() {
		if (collectedDataKnowledgeAboutTemplateConstructionItemProvider == null) {
			collectedDataKnowledgeAboutTemplateConstructionItemProvider = new CollectedDataKnowledgeAboutTemplateConstructionItemProvider(
					this);
		}

		return collectedDataKnowledgeAboutTemplateConstructionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Resultat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultatItemProvider resultatItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Resultat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResultatAdapter() {
		if (resultatItemProvider == null) {
			resultatItemProvider = new ResultatItemProvider(this);
		}

		return resultatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected variableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createvariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new variableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Term} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermItemProvider termItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Term}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTermAdapter() {
		if (termItemProvider == null) {
			termItemProvider = new TermItemProvider(this);
		}

		return termItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.connector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected connectorItemProvider connectorItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createconnectorAdapter() {
		if (connectorItemProvider == null) {
			connectorItemProvider = new connectorItemProvider(this);
		}

		return connectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DataCleaning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCleaningItemProvider dataCleaningItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DataCleaning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataCleaningAdapter() {
		if (dataCleaningItemProvider == null) {
			dataCleaningItemProvider = new DataCleaningItemProvider(this);
		}

		return dataCleaningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.DataPretraitement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPretraitementItemProvider dataPretraitementItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.DataPretraitement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPretraitementAdapter() {
		if (dataPretraitementItemProvider == null) {
			dataPretraitementItemProvider = new DataPretraitementItemProvider(this);
		}

		return dataPretraitementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.FeatureSelection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSelectionItemProvider featureSelectionItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.FeatureSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureSelectionAdapter() {
		if (featureSelectionItemProvider == null) {
			featureSelectionItemProvider = new FeatureSelectionItemProvider(this);
		}

		return featureSelectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.FeatureConstruction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConstructionItemProvider featureConstructionItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.FeatureConstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureConstructionAdapter() {
		if (featureConstructionItemProvider == null) {
			featureConstructionItemProvider = new FeatureConstructionItemProvider(this);
		}

		return featureConstructionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.PostTreatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostTreatementItemProvider postTreatementItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.PostTreatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPostTreatementAdapter() {
		if (postTreatementItemProvider == null) {
			postTreatementItemProvider = new PostTreatementItemProvider(this);
		}

		return postTreatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Deployement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployementItemProvider deployementItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Deployement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeployementAdapter() {
		if (deployementItemProvider == null) {
			deployementItemProvider = new DeployementItemProvider(this);
		}

		return deployementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.RemoveUncessaryFileds} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveUncessaryFiledsItemProvider removeUncessaryFiledsItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.RemoveUncessaryFileds}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRemoveUncessaryFiledsAdapter() {
		if (removeUncessaryFiledsItemProvider == null) {
			removeUncessaryFiledsItemProvider = new RemoveUncessaryFiledsItemProvider(this);
		}

		return removeUncessaryFiledsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.Conversion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionItemProvider conversionItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.Conversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConversionAdapter() {
		if (conversionItemProvider == null) {
			conversionItemProvider = new ConversionItemProvider(this);
		}

		return conversionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.NoiseTreatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoiseTreatementItemProvider noiseTreatementItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.NoiseTreatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNoiseTreatementAdapter() {
		if (noiseTreatementItemProvider == null) {
			noiseTreatementItemProvider = new NoiseTreatementItemProvider(this);
		}

		return noiseTreatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.MissingValueTreatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissingValueTreatementItemProvider missingValueTreatementItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.MissingValueTreatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMissingValueTreatementAdapter() {
		if (missingValueTreatementItemProvider == null) {
			missingValueTreatementItemProvider = new MissingValueTreatementItemProvider(this);
		}

		return missingValueTreatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.SelectionCriteria} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionCriteriaItemProvider selectionCriteriaItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.SelectionCriteria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionCriteriaAdapter() {
		if (selectionCriteriaItemProvider == null) {
			selectionCriteriaItemProvider = new SelectionCriteriaItemProvider(this);
		}

		return selectionCriteriaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projetTemplate.MLAlgorithmSelectionCriteriaContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLAlgorithmSelectionCriteriaContainerItemProvider mlAlgorithmSelectionCriteriaContainerItemProvider;

	/**
	 * This creates an adapter for a {@link projetTemplate.MLAlgorithmSelectionCriteriaContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMLAlgorithmSelectionCriteriaContainerAdapter() {
		if (mlAlgorithmSelectionCriteriaContainerItemProvider == null) {
			mlAlgorithmSelectionCriteriaContainerItemProvider = new MLAlgorithmSelectionCriteriaContainerItemProvider(
					this);
		}

		return mlAlgorithmSelectionCriteriaContainerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (domainProblemItemProvider != null)
			domainProblemItemProvider.dispose();
		if (domainRequirementValueItemProvider != null)
			domainRequirementValueItemProvider.dispose();
		if (requirementTypeItemProvider != null)
			requirementTypeItemProvider.dispose();
		if (mlProjectItemProvider != null)
			mlProjectItemProvider.dispose();
		if (dataAnalysisProblemItemProvider != null)
			dataAnalysisProblemItemProvider.dispose();
		if (computationalRequirementValueItemProvider != null)
			computationalRequirementValueItemProvider.dispose();
		if (databaseItemProvider != null)
			databaseItemProvider.dispose();
		if (schemaItemProvider != null)
			schemaItemProvider.dispose();
		if (dataItemProvider != null)
			dataItemProvider.dispose();
		if (requirementMappingItemProvider != null)
			requirementMappingItemProvider.dispose();
		if (modelElementItemProvider != null)
			modelElementItemProvider.dispose();
		if (dataPropertyValueSetItemProvider != null)
			dataPropertyValueSetItemProvider.dispose();
		if (dataPropertyValueItemProvider != null)
			dataPropertyValueItemProvider.dispose();
		if (dataPropertyTypeItemProvider != null)
			dataPropertyTypeItemProvider.dispose();
		if (dataAnalysisProblemTypeItemProvider != null)
			dataAnalysisProblemTypeItemProvider.dispose();
		if (processingChainTemplateItemProvider != null)
			processingChainTemplateItemProvider.dispose();
		if (mlProcChainSolutionPatternItemProvider != null)
			mlProcChainSolutionPatternItemProvider.dispose();
		if (processingChainItemProvider != null)
			processingChainItemProvider.dispose();
		if (mlAlgorithmSolutionPatternItemProvider != null)
			mlAlgorithmSolutionPatternItemProvider.dispose();
		if (mlAlgorithmItemProvider != null)
			mlAlgorithmItemProvider.dispose();
		if (selectionCriterionValueSetItemProvider != null)
			selectionCriterionValueSetItemProvider.dispose();
		if (selectionCriterionValueItemProvider != null)
			selectionCriterionValueItemProvider.dispose();
		if (selectionCriterionItemProvider != null)
			selectionCriterionItemProvider.dispose();
		if (extendedBPMNModelItemProvider != null)
			extendedBPMNModelItemProvider.dispose();
		if (explainabilityItemProvider != null)
			explainabilityItemProvider.dispose();
		if (accuracyItemProvider != null)
			accuracyItemProvider.dispose();
		if (collectedDataKnowledgeAboutTemplateConstructionItemProvider != null)
			collectedDataKnowledgeAboutTemplateConstructionItemProvider.dispose();
		if (ruleItemProvider != null)
			ruleItemProvider.dispose();
		if (conditionItemProvider != null)
			conditionItemProvider.dispose();
		if (resultatItemProvider != null)
			resultatItemProvider.dispose();
		if (variableItemProvider != null)
			variableItemProvider.dispose();
		if (termItemProvider != null)
			termItemProvider.dispose();
		if (connectorItemProvider != null)
			connectorItemProvider.dispose();
		if (componentItemProvider != null)
			componentItemProvider.dispose();
		if (dataCleaningItemProvider != null)
			dataCleaningItemProvider.dispose();
		if (dataPretraitementItemProvider != null)
			dataPretraitementItemProvider.dispose();
		if (featureSelectionItemProvider != null)
			featureSelectionItemProvider.dispose();
		if (featureConstructionItemProvider != null)
			featureConstructionItemProvider.dispose();
		if (postTreatementItemProvider != null)
			postTreatementItemProvider.dispose();
		if (deployementItemProvider != null)
			deployementItemProvider.dispose();
		if (removeUncessaryFiledsItemProvider != null)
			removeUncessaryFiledsItemProvider.dispose();
		if (conversionItemProvider != null)
			conversionItemProvider.dispose();
		if (noiseTreatementItemProvider != null)
			noiseTreatementItemProvider.dispose();
		if (missingValueTreatementItemProvider != null)
			missingValueTreatementItemProvider.dispose();
		if (selectionCriteriaItemProvider != null)
			selectionCriteriaItemProvider.dispose();
		if (mlAlgorithmSelectionCriteriaContainerItemProvider != null)
			mlAlgorithmSelectionCriteriaContainerItemProvider.dispose();
	}

}
