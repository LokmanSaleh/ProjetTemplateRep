/**
 */
package projetTemplate.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import projetTemplate.MLProcChainSolution;
import projetTemplate.ProjetTemplatePackage;

/**
 * This is the item provider adapter for a {@link projetTemplate.MLProcChainSolution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MLProcChainSolutionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLProcChainSolutionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDatapropertyvaluesetPropertyDescriptor(object);
			addX_processingchainPropertyDescriptor(object);
			addDataanalysisproblemtypePropertyDescriptor(object);
			addExecutedTemplatePropertyDescriptor(object);
			addX_collecteddataknowledgeabouttemplateconstructionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MLProcChainSolution_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MLProcChainSolution_name_feature",
						"_UI_MLProcChainSolution_type"),
				ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Datapropertyvalueset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatapropertyvaluesetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MLProcChainSolution_datapropertyvalueset_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MLProcChainSolution_datapropertyvalueset_feature", "_UI_MLProcChainSolution_type"),
						ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION__DATAPROPERTYVALUESET, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Xprocessingchain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX_processingchainPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MLProcChainSolution_X_processingchain_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MLProcChainSolution_X_processingchain_feature", "_UI_MLProcChainSolution_type"),
						ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION__XPROCESSINGCHAIN, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Dataanalysisproblemtype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataanalysisproblemtypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MLProcChainSolution_dataanalysisproblemtype_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MLProcChainSolution_dataanalysisproblemtype_feature", "_UI_MLProcChainSolution_type"),
				ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION__DATAANALYSISPROBLEMTYPE, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Executed Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutedTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MLProcChainSolution_ExecutedTemplate_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MLProcChainSolution_ExecutedTemplate_feature", "_UI_MLProcChainSolution_type"),
						ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION__EXECUTED_TEMPLATE, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Xcollecteddataknowledgeabouttemplateconstruction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addX_collecteddataknowledgeabouttemplateconstructionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MLProcChainSolution_X_collecteddataknowledgeabouttemplateconstruction_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_MLProcChainSolution_X_collecteddataknowledgeabouttemplateconstruction_feature",
						"_UI_MLProcChainSolution_type"),
				ProjetTemplatePackage.Literals.ML_PROC_CHAIN_SOLUTION__XCOLLECTEDDATAKNOWLEDGEABOUTTEMPLATECONSTRUCTION,
				true, false, true, null, null, null));
	}

	/**
	 * This returns MLProcChainSolution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MLProcChainSolution"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MLProcChainSolution) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MLProcChainSolution_type")
				: getString("_UI_MLProcChainSolution_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MLProcChainSolution.class)) {
		case ProjetTemplatePackage.ML_PROC_CHAIN_SOLUTION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProjetTemplateEditPlugin.INSTANCE;
	}

}
