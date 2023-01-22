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

import projetTemplate.ProcessingChainTemplate;
import projetTemplate.ProjetTemplatePackage;

/**
 * This is the item provider adapter for a {@link projetTemplate.ProcessingChainTemplate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingChainTemplateItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingChainTemplateItemProvider(AdapterFactory adapterFactory) {
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
			addAuthorPropertyDescriptor(object);
			addExtendedbpmnmodelPropertyDescriptor(object);
			addComponentPropertyDescriptor(object);
			addMlprocchainsolutionpatternPropertyDescriptor(object);
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
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProcessingChainTemplate_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ProcessingChainTemplate_name_feature",
								"_UI_ProcessingChainTemplate_type"),
						ProjetTemplatePackage.Literals.PROCESSING_CHAIN_TEMPLATE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProcessingChainTemplate_author_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ProcessingChainTemplate_author_feature",
								"_UI_ProcessingChainTemplate_type"),
						ProjetTemplatePackage.Literals.PROCESSING_CHAIN_TEMPLATE__AUTHOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Extendedbpmnmodel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedbpmnmodelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ProcessingChainTemplate_extendedbpmnmodel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ProcessingChainTemplate_extendedbpmnmodel_feature",
						"_UI_ProcessingChainTemplate_type"),
				ProjetTemplatePackage.Literals.PROCESSING_CHAIN_TEMPLATE__EXTENDEDBPMNMODEL, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProcessingChainTemplate_component_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ProcessingChainTemplate_component_feature",
								"_UI_ProcessingChainTemplate_type"),
						ProjetTemplatePackage.Literals.PROCESSING_CHAIN_TEMPLATE__COMPONENT, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Mlprocchainsolutionpattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMlprocchainsolutionpatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ProcessingChainTemplate_mlprocchainsolutionpattern_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ProcessingChainTemplate_mlprocchainsolutionpattern_feature",
						"_UI_ProcessingChainTemplate_type"),
				ProjetTemplatePackage.Literals.PROCESSING_CHAIN_TEMPLATE__MLPROCCHAINSOLUTIONPATTERN, true, false, true,
				null, null, null));
	}

	/**
	 * This returns ProcessingChainTemplate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessingChainTemplate"));
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
		String label = ((ProcessingChainTemplate) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ProcessingChainTemplate_type")
				: getString("_UI_ProcessingChainTemplate_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessingChainTemplate.class)) {
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__NAME:
		case ProjetTemplatePackage.PROCESSING_CHAIN_TEMPLATE__AUTHOR:
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
