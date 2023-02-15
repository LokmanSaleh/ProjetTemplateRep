/**
 */
package genmodel.provider;

import genmodel.GenmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenFeatureItemProvider extends GenTypedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addPropertyPropertyDescriptor(object);
			addNotifyPropertyDescriptor(object);
			addChildrenPropertyDescriptor(object);
			addCreateChildPropertyDescriptor(object);
			addPropertyCategoryPropertyDescriptor(object);
			addPropertyFilterFlagsPropertyDescriptor(object);
			addPropertyDescriptionPropertyDescriptor(object);
			addPropertyMultiLinePropertyDescriptor(object);
			addPropertySortChoicesPropertyDescriptor(object);
			addEcoreFeaturePropertyDescriptor(object);
			addSuppressedGetVisibilityPropertyDescriptor(object);
			addSuppressedSetVisibilityPropertyDescriptor(object);
			addSuppressedIsSetVisibilityPropertyDescriptor(object);
			addSuppressedUnsetVisibilityPropertyDescriptor(object);
			addGetPropertyDescriptor(object);
			addPropertyEditorFactoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_property_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_property_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__PROPERTY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Notify feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotifyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_notify_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_notify_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__NOTIFY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_children_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_children_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__CHILDREN, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Create Child feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateChildPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_createChild_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_createChild_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__CREATE_CHILD, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_propertyCategory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_propertyCategory_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__PROPERTY_CATEGORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Filter Flags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyFilterFlagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_propertyFilterFlags_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_propertyFilterFlags_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__PROPERTY_FILTER_FLAGS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_propertyDescription_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_propertyDescription_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__PROPERTY_DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Multi Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyMultiLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_propertyMultiLine_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_propertyMultiLine_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__PROPERTY_MULTI_LINE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Sort Choices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertySortChoicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_propertySortChoices_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_propertySortChoices_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__PROPERTY_SORT_CHOICES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ecore Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEcoreFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_ecoreFeature_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_ecoreFeature_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__ECORE_FEATURE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Suppressed Get Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppressedGetVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GenFeature_suppressedGetVisibility_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_suppressedGetVisibility_feature",
						"_UI_GenFeature_type"),
				GenmodelPackage.Literals.GEN_FEATURE__SUPPRESSED_GET_VISIBILITY, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Suppressed Set Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppressedSetVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GenFeature_suppressedSetVisibility_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_suppressedSetVisibility_feature",
						"_UI_GenFeature_type"),
				GenmodelPackage.Literals.GEN_FEATURE__SUPPRESSED_SET_VISIBILITY, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Suppressed Is Set Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppressedIsSetVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GenFeature_suppressedIsSetVisibility_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_suppressedIsSetVisibility_feature",
						"_UI_GenFeature_type"),
				GenmodelPackage.Literals.GEN_FEATURE__SUPPRESSED_IS_SET_VISIBILITY, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Suppressed Unset Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuppressedUnsetVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GenFeature_suppressedUnsetVisibility_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_suppressedUnsetVisibility_feature",
						"_UI_GenFeature_type"),
				GenmodelPackage.Literals.GEN_FEATURE__SUPPRESSED_UNSET_VISIBILITY, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Get feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_get_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_get_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__GET, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Editor Factory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyEditorFactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GenFeature_propertyEditorFactory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GenFeature_propertyEditorFactory_feature",
								"_UI_GenFeature_type"),
						GenmodelPackage.Literals.GEN_FEATURE__PROPERTY_EDITOR_FACTORY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns GenFeature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenFeature"));
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
		String label = ((GenFeature) object).getDocumentation();
		return label == null || label.length() == 0 ? getString("_UI_GenFeature_type")
				: getString("_UI_GenFeature_type") + " " + label;
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

		switch (notification.getFeatureID(GenFeature.class)) {
		case GenmodelPackage.GEN_FEATURE__PROPERTY:
		case GenmodelPackage.GEN_FEATURE__NOTIFY:
		case GenmodelPackage.GEN_FEATURE__CHILDREN:
		case GenmodelPackage.GEN_FEATURE__CREATE_CHILD:
		case GenmodelPackage.GEN_FEATURE__PROPERTY_CATEGORY:
		case GenmodelPackage.GEN_FEATURE__PROPERTY_FILTER_FLAGS:
		case GenmodelPackage.GEN_FEATURE__PROPERTY_DESCRIPTION:
		case GenmodelPackage.GEN_FEATURE__PROPERTY_MULTI_LINE:
		case GenmodelPackage.GEN_FEATURE__PROPERTY_SORT_CHOICES:
		case GenmodelPackage.GEN_FEATURE__SUPPRESSED_GET_VISIBILITY:
		case GenmodelPackage.GEN_FEATURE__SUPPRESSED_SET_VISIBILITY:
		case GenmodelPackage.GEN_FEATURE__SUPPRESSED_IS_SET_VISIBILITY:
		case GenmodelPackage.GEN_FEATURE__SUPPRESSED_UNSET_VISIBILITY:
		case GenmodelPackage.GEN_FEATURE__GET:
		case GenmodelPackage.GEN_FEATURE__PROPERTY_EDITOR_FACTORY:
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

}
