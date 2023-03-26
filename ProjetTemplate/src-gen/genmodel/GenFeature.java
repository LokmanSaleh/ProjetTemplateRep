/**
 */
package genmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isNotify <em>Notify</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isCreateChild <em>Create Child</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyCategory <em>Property Category</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyFilterFlags <em>Property Filter Flags</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyDescription <em>Property Description</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isPropertyMultiLine <em>Property Multi Line</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isPropertySortChoices <em>Property Sort Choices</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getGenClass <em>Gen Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getEcoreFeature <em>Ecore Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedGetVisibility <em>Suppressed Get Visibility</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedSetVisibility <em>Suppressed Set Visibility</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedIsSetVisibility <em>Suppressed Is Set Visibility</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedUnsetVisibility <em>Suppressed Unset Visibility</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyEditorFactory <em>Property Editor Factory</em>}</li>
 * </ul>
 *
 * @see genmodel.GenmodelPackage#getGenFeature()
 * @model
 * @generated
 */
public interface GenFeature extends EObject, GenTypedElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * The literals are from the enumeration {@link genmodel.GenPropertyKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see genmodel.GenPropertyKind
	 * @see #setProperty(GenPropertyKind)
	 * @see genmodel.GenmodelPackage#getGenFeature_Property()
	 * @model
	 * @generated
	 */
	GenPropertyKind getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see genmodel.GenPropertyKind
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(GenPropertyKind value);

	/**
	 * Returns the value of the '<em><b>Notify</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify</em>' attribute.
	 * @see #setNotify(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_Notify()
	 * @model default="true"
	 * @generated
	 */
	boolean isNotify();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isNotify <em>Notify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify</em>' attribute.
	 * @see #isNotify()
	 * @generated
	 */
	void setNotify(boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute.
	 * @see #setChildren(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_Children()
	 * @model
	 * @generated
	 */
	boolean isChildren();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isChildren <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' attribute.
	 * @see #isChildren()
	 * @generated
	 */
	void setChildren(boolean value);

	/**
	 * Returns the value of the '<em><b>Create Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Child</em>' attribute.
	 * @see #isSetCreateChild()
	 * @see #unsetCreateChild()
	 * @see #setCreateChild(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_CreateChild()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isCreateChild();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isCreateChild <em>Create Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Child</em>' attribute.
	 * @see #isSetCreateChild()
	 * @see #unsetCreateChild()
	 * @see #isCreateChild()
	 * @generated
	 */
	void setCreateChild(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isCreateChild <em>Create Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateChild()
	 * @see #isCreateChild()
	 * @see #setCreateChild(boolean)
	 * @generated
	 */
	void unsetCreateChild();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isCreateChild <em>Create Child</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Child</em>' attribute is set.
	 * @see #unsetCreateChild()
	 * @see #isCreateChild()
	 * @see #setCreateChild(boolean)
	 * @generated
	 */
	boolean isSetCreateChild();

	/**
	 * Returns the value of the '<em><b>Property Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Category</em>' attribute.
	 * @see #setPropertyCategory(String)
	 * @see genmodel.GenmodelPackage#getGenFeature_PropertyCategory()
	 * @model
	 * @generated
	 */
	String getPropertyCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyCategory <em>Property Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Category</em>' attribute.
	 * @see #getPropertyCategory()
	 * @generated
	 */
	void setPropertyCategory(String value);

	/**
	 * Returns the value of the '<em><b>Property Filter Flags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Filter Flags</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenFeature_PropertyFilterFlags()
	 * @model
	 * @generated
	 */
	EList<String> getPropertyFilterFlags();

	/**
	 * Returns the value of the '<em><b>Property Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Description</em>' attribute.
	 * @see #setPropertyDescription(String)
	 * @see genmodel.GenmodelPackage#getGenFeature_PropertyDescription()
	 * @model
	 * @generated
	 */
	String getPropertyDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyDescription <em>Property Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Description</em>' attribute.
	 * @see #getPropertyDescription()
	 * @generated
	 */
	void setPropertyDescription(String value);

	/**
	 * Returns the value of the '<em><b>Property Multi Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Multi Line</em>' attribute.
	 * @see #setPropertyMultiLine(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_PropertyMultiLine()
	 * @model
	 * @generated
	 */
	boolean isPropertyMultiLine();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isPropertyMultiLine <em>Property Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Multi Line</em>' attribute.
	 * @see #isPropertyMultiLine()
	 * @generated
	 */
	void setPropertyMultiLine(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Sort Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Sort Choices</em>' attribute.
	 * @see #setPropertySortChoices(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_PropertySortChoices()
	 * @model
	 * @generated
	 */
	boolean isPropertySortChoices();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isPropertySortChoices <em>Property Sort Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Sort Choices</em>' attribute.
	 * @see #isPropertySortChoices()
	 * @generated
	 */
	void setPropertySortChoices(boolean value);

	/**
	 * Returns the value of the '<em><b>Gen Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.codegen.ecore.genmodel.GenClass#getGenFeatures <em>Gen Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Class</em>' container reference.
	 * @see #setGenClass(GenClass)
	 * @see genmodel.GenmodelPackage#getGenFeature_GenClass()
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenClass#getGenFeatures
	 * @model opposite="genFeatures" resolveProxies="false" required="true"
	 * @generated
	 */
	GenClass getGenClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getGenClass <em>Gen Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Class</em>' container reference.
	 * @see #getGenClass()
	 * @generated
	 */
	void setGenClass(GenClass value);

	/**
	 * Returns the value of the '<em><b>Ecore Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Feature</em>' reference.
	 * @see #setEcoreFeature(EStructuralFeature)
	 * @see genmodel.GenmodelPackage#getGenFeature_EcoreFeature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getEcoreFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getEcoreFeature <em>Ecore Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Feature</em>' reference.
	 * @see #getEcoreFeature()
	 * @generated
	 */
	void setEcoreFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Suppressed Get Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppressed Get Visibility</em>' attribute.
	 * @see #isSetSuppressedGetVisibility()
	 * @see #unsetSuppressedGetVisibility()
	 * @see #setSuppressedGetVisibility(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_SuppressedGetVisibility()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isSuppressedGetVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedGetVisibility <em>Suppressed Get Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppressed Get Visibility</em>' attribute.
	 * @see #isSetSuppressedGetVisibility()
	 * @see #unsetSuppressedGetVisibility()
	 * @see #isSuppressedGetVisibility()
	 * @generated
	 */
	void setSuppressedGetVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedGetVisibility <em>Suppressed Get Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuppressedGetVisibility()
	 * @see #isSuppressedGetVisibility()
	 * @see #setSuppressedGetVisibility(boolean)
	 * @generated
	 */
	void unsetSuppressedGetVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedGetVisibility <em>Suppressed Get Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suppressed Get Visibility</em>' attribute is set.
	 * @see #unsetSuppressedGetVisibility()
	 * @see #isSuppressedGetVisibility()
	 * @see #setSuppressedGetVisibility(boolean)
	 * @generated
	 */
	boolean isSetSuppressedGetVisibility();

	/**
	 * Returns the value of the '<em><b>Suppressed Set Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppressed Set Visibility</em>' attribute.
	 * @see #isSetSuppressedSetVisibility()
	 * @see #unsetSuppressedSetVisibility()
	 * @see #setSuppressedSetVisibility(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_SuppressedSetVisibility()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isSuppressedSetVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedSetVisibility <em>Suppressed Set Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppressed Set Visibility</em>' attribute.
	 * @see #isSetSuppressedSetVisibility()
	 * @see #unsetSuppressedSetVisibility()
	 * @see #isSuppressedSetVisibility()
	 * @generated
	 */
	void setSuppressedSetVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedSetVisibility <em>Suppressed Set Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuppressedSetVisibility()
	 * @see #isSuppressedSetVisibility()
	 * @see #setSuppressedSetVisibility(boolean)
	 * @generated
	 */
	void unsetSuppressedSetVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedSetVisibility <em>Suppressed Set Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suppressed Set Visibility</em>' attribute is set.
	 * @see #unsetSuppressedSetVisibility()
	 * @see #isSuppressedSetVisibility()
	 * @see #setSuppressedSetVisibility(boolean)
	 * @generated
	 */
	boolean isSetSuppressedSetVisibility();

	/**
	 * Returns the value of the '<em><b>Suppressed Is Set Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppressed Is Set Visibility</em>' attribute.
	 * @see #isSetSuppressedIsSetVisibility()
	 * @see #unsetSuppressedIsSetVisibility()
	 * @see #setSuppressedIsSetVisibility(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_SuppressedIsSetVisibility()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isSuppressedIsSetVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedIsSetVisibility <em>Suppressed Is Set Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppressed Is Set Visibility</em>' attribute.
	 * @see #isSetSuppressedIsSetVisibility()
	 * @see #unsetSuppressedIsSetVisibility()
	 * @see #isSuppressedIsSetVisibility()
	 * @generated
	 */
	void setSuppressedIsSetVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedIsSetVisibility <em>Suppressed Is Set Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuppressedIsSetVisibility()
	 * @see #isSuppressedIsSetVisibility()
	 * @see #setSuppressedIsSetVisibility(boolean)
	 * @generated
	 */
	void unsetSuppressedIsSetVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedIsSetVisibility <em>Suppressed Is Set Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suppressed Is Set Visibility</em>' attribute is set.
	 * @see #unsetSuppressedIsSetVisibility()
	 * @see #isSuppressedIsSetVisibility()
	 * @see #setSuppressedIsSetVisibility(boolean)
	 * @generated
	 */
	boolean isSetSuppressedIsSetVisibility();

	/**
	 * Returns the value of the '<em><b>Suppressed Unset Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppressed Unset Visibility</em>' attribute.
	 * @see #isSetSuppressedUnsetVisibility()
	 * @see #unsetSuppressedUnsetVisibility()
	 * @see #setSuppressedUnsetVisibility(boolean)
	 * @see genmodel.GenmodelPackage#getGenFeature_SuppressedUnsetVisibility()
	 * @model unsettable="true"
	 * @generated
	 */
	boolean isSuppressedUnsetVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedUnsetVisibility <em>Suppressed Unset Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppressed Unset Visibility</em>' attribute.
	 * @see #isSetSuppressedUnsetVisibility()
	 * @see #unsetSuppressedUnsetVisibility()
	 * @see #isSuppressedUnsetVisibility()
	 * @generated
	 */
	void setSuppressedUnsetVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedUnsetVisibility <em>Suppressed Unset Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuppressedUnsetVisibility()
	 * @see #isSuppressedUnsetVisibility()
	 * @see #setSuppressedUnsetVisibility(boolean)
	 * @generated
	 */
	void unsetSuppressedUnsetVisibility();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#isSuppressedUnsetVisibility <em>Suppressed Unset Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suppressed Unset Visibility</em>' attribute is set.
	 * @see #unsetSuppressedUnsetVisibility()
	 * @see #isSuppressedUnsetVisibility()
	 * @see #setSuppressedUnsetVisibility(boolean)
	 * @generated
	 */
	boolean isSetSuppressedUnsetVisibility();

	/**
	 * Returns the value of the '<em><b>Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' attribute.
	 * @see #isSetGet()
	 * @see #unsetGet()
	 * @see #setGet(String)
	 * @see genmodel.GenmodelPackage#getGenFeature_Get()
	 * @model unsettable="true"
	 * @generated
	 */
	String getGet();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getGet <em>Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' attribute.
	 * @see #isSetGet()
	 * @see #unsetGet()
	 * @see #getGet()
	 * @generated
	 */
	void setGet(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getGet <em>Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGet()
	 * @see #getGet()
	 * @see #setGet(String)
	 * @generated
	 */
	void unsetGet();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getGet <em>Get</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Get</em>' attribute is set.
	 * @see #unsetGet()
	 * @see #getGet()
	 * @see #setGet(String)
	 * @generated
	 */
	boolean isSetGet();

	/**
	 * Returns the value of the '<em><b>Property Editor Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Editor Factory</em>' attribute.
	 * @see #isSetPropertyEditorFactory()
	 * @see #unsetPropertyEditorFactory()
	 * @see #setPropertyEditorFactory(String)
	 * @see genmodel.GenmodelPackage#getGenFeature_PropertyEditorFactory()
	 * @model unsettable="true" dataType="genmodel.PropertyEditorFactory"
	 * @generated
	 */
	String getPropertyEditorFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyEditorFactory <em>Property Editor Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Editor Factory</em>' attribute.
	 * @see #isSetPropertyEditorFactory()
	 * @see #unsetPropertyEditorFactory()
	 * @see #getPropertyEditorFactory()
	 * @generated
	 */
	void setPropertyEditorFactory(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyEditorFactory <em>Property Editor Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyEditorFactory()
	 * @see #getPropertyEditorFactory()
	 * @see #setPropertyEditorFactory(String)
	 * @generated
	 */
	void unsetPropertyEditorFactory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature#getPropertyEditorFactory <em>Property Editor Factory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Editor Factory</em>' attribute is set.
	 * @see #unsetPropertyEditorFactory()
	 * @see #getPropertyEditorFactory()
	 * @see #setPropertyEditorFactory(String)
	 * @generated
	 */
	boolean isSetPropertyEditorFactory();

} // GenFeature
