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

import projetTemplate.ProjetTemplatePackage;
import projetTemplate.RequirementType;

/**
 * This is the item provider adapter for a {@link projetTemplate.RequirementType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementTypeItemProvider(AdapterFactory adapterFactory) {
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

			addRequirementmappingPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addValueTypePropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addDomainrequirementvaluePropertyDescriptor(object);
			addComputationalrequirementvaluePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Requirementmapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementmappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RequirementType_requirementmapping_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RequirementType_requirementmapping_feature", "_UI_RequirementType_type"),
						ProjetTemplatePackage.Literals.REQUIREMENT_TYPE__REQUIREMENTMAPPING, true, false, true, null,
						null, null));
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
						getResourceLocator(), getString("_UI_RequirementType_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_name_feature",
								"_UI_RequirementType_type"),
						ProjetTemplatePackage.Literals.REQUIREMENT_TYPE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequirementType_description_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_description_feature",
						"_UI_RequirementType_type"),
				ProjetTemplatePackage.Literals.REQUIREMENT_TYPE__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Value Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequirementType_valueType_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_valueType_feature",
						"_UI_RequirementType_type"),
				ProjetTemplatePackage.Literals.REQUIREMENT_TYPE__VALUE_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RequirementType_scope_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_scope_feature",
								"_UI_RequirementType_type"),
						ProjetTemplatePackage.Literals.REQUIREMENT_TYPE__SCOPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Domainrequirementvalue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainrequirementvaluePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RequirementType_domainrequirementvalue_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_RequirementType_domainrequirementvalue_feature", "_UI_RequirementType_type"),
						ProjetTemplatePackage.Literals.REQUIREMENT_TYPE__DOMAINREQUIREMENTVALUE, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Computationalrequirementvalue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputationalrequirementvaluePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequirementType_computationalrequirementvalue_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_RequirementType_computationalrequirementvalue_feature", "_UI_RequirementType_type"),
				ProjetTemplatePackage.Literals.REQUIREMENT_TYPE__COMPUTATIONALREQUIREMENTVALUE, true, false, true, null,
				null, null));
	}

	/**
	 * This returns RequirementType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequirementType"));
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
		String label = ((RequirementType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RequirementType_type")
				: getString("_UI_RequirementType_type") + " " + label;
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

		switch (notification.getFeatureID(RequirementType.class)) {
		case ProjetTemplatePackage.REQUIREMENT_TYPE__NAME:
		case ProjetTemplatePackage.REQUIREMENT_TYPE__DESCRIPTION:
		case ProjetTemplatePackage.REQUIREMENT_TYPE__VALUE_TYPE:
		case ProjetTemplatePackage.REQUIREMENT_TYPE__SCOPE:
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
