/**
 */
package genmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelDirectory <em>Model Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCreationCommands <em>Creation Commands</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCreationIcons <em>Creation Icons</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCreationSubmenus <em>Creation Submenus</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditDirectory <em>Edit Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorDirectory <em>Editor Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelPluginID <em>Model Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTemplateDirectory <em>Template Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRuntimeJar <em>Runtime Jar</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getForeignModel <em>Foreign Model</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isDynamicTemplates <em>Dynamic Templates</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRedirection <em>Redirection</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isForceOverwrite <em>Force Overwrite</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getNonExternalizedStringTag <em>Non Externalized String Tag</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelPluginClass <em>Model Plugin Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditPluginClass <em>Edit Plugin Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorPluginClass <em>Editor Plugin Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isUpdateClasspath <em>Update Classpath</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isGenerateSchema <em>Generate Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isNonNLSMarkers <em>Non NLS Markers</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getStaticPackages <em>Static Packages</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelPluginVariables <em>Model Plugin Variables</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRootExtendsInterface <em>Root Extends Interface</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRootExtendsClass <em>Root Extends Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRootImplementsInterface <em>Root Implements Interface</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressEMFTypes <em>Suppress EMF Types</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressEMFMetaData <em>Suppress EMF Meta Data</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressEMFModelTags <em>Suppress EMF Model Tags</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressInterfaces <em>Suppress Interfaces</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureMapWrapperInterface <em>Feature Map Wrapper Interface</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureMapWrapperInternalInterface <em>Feature Map Wrapper Internal Interface</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureMapWrapperClass <em>Feature Map Wrapper Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRuntimeCompatibility <em>Runtime Compatibility</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRichClientPlatform <em>Rich Client Platform</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isReflectiveDelegation <em>Reflective Delegation</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCodeFormatting <em>Code Formatting</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCommentFormatting <em>Comment Formatting</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestsDirectory <em>Tests Directory</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestSuiteClass <em>Test Suite Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getBooleanFlagsField <em>Boolean Flags Field</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getBooleanFlagsReservedBits <em>Boolean Flags Reserved Bits</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getImporterID <em>Importer ID</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isBundleManifest <em>Bundle Manifest</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureDelegation <em>Feature Delegation</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isContainmentProxies <em>Containment Proxies</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isMinimalReflectiveMethods <em>Minimal Reflective Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressContainment <em>Suppress Containment</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressNotification <em>Suppress Notification</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isArrayAccessors <em>Array Accessors</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressUnsettable <em>Suppress Unsettable</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFacadeHelperClass <em>Facade Helper Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getComplianceLevel <em>Compliance Level</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressGenModelAnnotations <em>Suppress Gen Model Annotations</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCopyrightFields <em>Copyright Fields</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isBinaryCompatibleReflectiveMethods <em>Binary Compatible Reflective Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isPublicConstructors <em>Public Constructors</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTemplatePluginVariables <em>Template Plugin Variables</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getProviderRootExtendsClass <em>Provider Root Extends Class</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditPluginID <em>Edit Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditPluginVariables <em>Edit Plugin Variables</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorPluginID <em>Editor Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorPluginVariables <em>Editor Plugin Variables</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestsPluginID <em>Tests Plugin ID</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestsPluginVariables <em>Tests Plugin Variables</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isOptimizedHasChildren <em>Optimized Has Children</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isTableProviders <em>Table Providers</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isColorProviders <em>Color Providers</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isFontProviders <em>Font Providers</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRuntimeVersion <em>Runtime Version</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isPackedEnums <em>Packed Enums</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getGenPackages <em>Gen Packages</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getUsedGenPackages <em>Used Gen Packages</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getInterfaceNamePattern <em>Interface Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getClassNamePattern <em>Class Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isOperationReflection <em>Operation Reflection</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRichAjaxPlatform <em>Rich Ajax Platform</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRuntimePlatform <em>Runtime Platform</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isImportOrganizing <em>Import Organizing</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getPluginKey <em>Plugin Key</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getDecoration <em>Decoration</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isStyleProviders <em>Style Providers</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCleanup <em>Cleanup</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isOSGiCompatible <em>OS Gi Compatible</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEclipsePlatformVersion <em>Eclipse Platform Version</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelDocumentation <em>Model Documentation</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isAutoResizeProperties <em>Auto Resize Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getAutoExpandProperties <em>Auto Expand Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isFindAction <em>Find Action</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isExpandAllAction <em>Expand All Action</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCollapseAllAction <em>Collapse All Action</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRevertAction <em>Revert Action</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getCodeStyle <em>Code Style</em>}</li>
 * </ul>
 *
 * @see genmodel.GenmodelPackage#getGenModel()
 * @model
 * @generated
 */
public interface GenModel extends EObject, GenBase {
	/**
	 * Returns the value of the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Text</em>' attribute.
	 * @see #setCopyrightText(String)
	 * @see genmodel.GenmodelPackage#getGenModel_CopyrightText()
	 * @model
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

	/**
	 * Returns the value of the '<em><b>Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Directory</em>' attribute.
	 * @see #setModelDirectory(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ModelDirectory()
	 * @model dataType="genmodel.Path"
	 * @generated
	 */
	String getModelDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelDirectory <em>Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Directory</em>' attribute.
	 * @see #getModelDirectory()
	 * @generated
	 */
	void setModelDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Creation Commands</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Commands</em>' attribute.
	 * @see #setCreationCommands(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_CreationCommands()
	 * @model default="true"
	 * @generated
	 */
	boolean isCreationCommands();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCreationCommands <em>Creation Commands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Commands</em>' attribute.
	 * @see #isCreationCommands()
	 * @generated
	 */
	void setCreationCommands(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Icons</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Icons</em>' attribute.
	 * @see #setCreationIcons(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_CreationIcons()
	 * @model default="true"
	 * @generated
	 */
	boolean isCreationIcons();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCreationIcons <em>Creation Icons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Icons</em>' attribute.
	 * @see #isCreationIcons()
	 * @generated
	 */
	void setCreationIcons(boolean value);

	/**
	 * Returns the value of the '<em><b>Creation Submenus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Submenus</em>' attribute.
	 * @see #setCreationSubmenus(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_CreationSubmenus()
	 * @model
	 * @generated
	 */
	boolean isCreationSubmenus();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCreationSubmenus <em>Creation Submenus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Submenus</em>' attribute.
	 * @see #isCreationSubmenus()
	 * @generated
	 */
	void setCreationSubmenus(boolean value);

	/**
	 * Returns the value of the '<em><b>Edit Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Directory</em>' attribute.
	 * @see #isSetEditDirectory()
	 * @see #unsetEditDirectory()
	 * @see #setEditDirectory(String)
	 * @see genmodel.GenmodelPackage#getGenModel_EditDirectory()
	 * @model unsettable="true" dataType="genmodel.Path"
	 * @generated
	 */
	String getEditDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditDirectory <em>Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Directory</em>' attribute.
	 * @see #isSetEditDirectory()
	 * @see #unsetEditDirectory()
	 * @see #getEditDirectory()
	 * @generated
	 */
	void setEditDirectory(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditDirectory <em>Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditDirectory()
	 * @see #getEditDirectory()
	 * @see #setEditDirectory(String)
	 * @generated
	 */
	void unsetEditDirectory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditDirectory <em>Edit Directory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edit Directory</em>' attribute is set.
	 * @see #unsetEditDirectory()
	 * @see #getEditDirectory()
	 * @see #setEditDirectory(String)
	 * @generated
	 */
	boolean isSetEditDirectory();

	/**
	 * Returns the value of the '<em><b>Editor Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Directory</em>' attribute.
	 * @see #isSetEditorDirectory()
	 * @see #unsetEditorDirectory()
	 * @see #setEditorDirectory(String)
	 * @see genmodel.GenmodelPackage#getGenModel_EditorDirectory()
	 * @model unsettable="true" dataType="genmodel.Path"
	 * @generated
	 */
	String getEditorDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorDirectory <em>Editor Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Directory</em>' attribute.
	 * @see #isSetEditorDirectory()
	 * @see #unsetEditorDirectory()
	 * @see #getEditorDirectory()
	 * @generated
	 */
	void setEditorDirectory(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorDirectory <em>Editor Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditorDirectory()
	 * @see #getEditorDirectory()
	 * @see #setEditorDirectory(String)
	 * @generated
	 */
	void unsetEditorDirectory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorDirectory <em>Editor Directory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Editor Directory</em>' attribute is set.
	 * @see #unsetEditorDirectory()
	 * @see #getEditorDirectory()
	 * @see #setEditorDirectory(String)
	 * @generated
	 */
	boolean isSetEditorDirectory();

	/**
	 * Returns the value of the '<em><b>Model Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Plugin ID</em>' attribute.
	 * @see #setModelPluginID(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ModelPluginID()
	 * @model
	 * @generated
	 */
	String getModelPluginID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelPluginID <em>Model Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Plugin ID</em>' attribute.
	 * @see #getModelPluginID()
	 * @generated
	 */
	void setModelPluginID(String value);

	/**
	 * Returns the value of the '<em><b>Template Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Directory</em>' attribute.
	 * @see #setTemplateDirectory(String)
	 * @see genmodel.GenmodelPackage#getGenModel_TemplateDirectory()
	 * @model
	 * @generated
	 */
	String getTemplateDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTemplateDirectory <em>Template Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Directory</em>' attribute.
	 * @see #getTemplateDirectory()
	 * @generated
	 */
	void setTemplateDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Jar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Jar</em>' attribute.
	 * @see #setRuntimeJar(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_RuntimeJar()
	 * @model
	 * @generated
	 */
	boolean isRuntimeJar();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRuntimeJar <em>Runtime Jar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Jar</em>' attribute.
	 * @see #isRuntimeJar()
	 * @generated
	 */
	void setRuntimeJar(boolean value);

	/**
	 * Returns the value of the '<em><b>Foreign Model</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Model</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenModel_ForeignModel()
	 * @model
	 * @generated
	 */
	EList<String> getForeignModel();

	/**
	 * Returns the value of the '<em><b>Dynamic Templates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Templates</em>' attribute.
	 * @see #setDynamicTemplates(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_DynamicTemplates()
	 * @model
	 * @generated
	 */
	boolean isDynamicTemplates();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isDynamicTemplates <em>Dynamic Templates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Templates</em>' attribute.
	 * @see #isDynamicTemplates()
	 * @generated
	 */
	void setDynamicTemplates(boolean value);

	/**
	 * Returns the value of the '<em><b>Redirection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirection</em>' attribute.
	 * @see #setRedirection(String)
	 * @see genmodel.GenmodelPackage#getGenModel_Redirection()
	 * @model
	 * @generated
	 */
	String getRedirection();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRedirection <em>Redirection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirection</em>' attribute.
	 * @see #getRedirection()
	 * @generated
	 */
	void setRedirection(String value);

	/**
	 * Returns the value of the '<em><b>Force Overwrite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Overwrite</em>' attribute.
	 * @see #setForceOverwrite(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_ForceOverwrite()
	 * @model
	 * @generated
	 */
	boolean isForceOverwrite();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isForceOverwrite <em>Force Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Overwrite</em>' attribute.
	 * @see #isForceOverwrite()
	 * @generated
	 */
	void setForceOverwrite(boolean value);

	/**
	 * Returns the value of the '<em><b>Non Externalized String Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Externalized String Tag</em>' attribute.
	 * @see #setNonExternalizedStringTag(String)
	 * @see genmodel.GenmodelPackage#getGenModel_NonExternalizedStringTag()
	 * @model
	 * @generated
	 */
	String getNonExternalizedStringTag();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getNonExternalizedStringTag <em>Non Externalized String Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Externalized String Tag</em>' attribute.
	 * @see #getNonExternalizedStringTag()
	 * @generated
	 */
	void setNonExternalizedStringTag(String value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Model Plugin Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Plugin Class</em>' attribute.
	 * @see #setModelPluginClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ModelPluginClass()
	 * @model
	 * @generated
	 */
	String getModelPluginClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelPluginClass <em>Model Plugin Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Plugin Class</em>' attribute.
	 * @see #getModelPluginClass()
	 * @generated
	 */
	void setModelPluginClass(String value);

	/**
	 * Returns the value of the '<em><b>Edit Plugin Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Plugin Class</em>' attribute.
	 * @see #isSetEditPluginClass()
	 * @see #unsetEditPluginClass()
	 * @see #setEditPluginClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_EditPluginClass()
	 * @model unsettable="true"
	 * @generated
	 */
	String getEditPluginClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditPluginClass <em>Edit Plugin Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Plugin Class</em>' attribute.
	 * @see #isSetEditPluginClass()
	 * @see #unsetEditPluginClass()
	 * @see #getEditPluginClass()
	 * @generated
	 */
	void setEditPluginClass(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditPluginClass <em>Edit Plugin Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditPluginClass()
	 * @see #getEditPluginClass()
	 * @see #setEditPluginClass(String)
	 * @generated
	 */
	void unsetEditPluginClass();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditPluginClass <em>Edit Plugin Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edit Plugin Class</em>' attribute is set.
	 * @see #unsetEditPluginClass()
	 * @see #getEditPluginClass()
	 * @see #setEditPluginClass(String)
	 * @generated
	 */
	boolean isSetEditPluginClass();

	/**
	 * Returns the value of the '<em><b>Editor Plugin Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Plugin Class</em>' attribute.
	 * @see #isSetEditorPluginClass()
	 * @see #unsetEditorPluginClass()
	 * @see #setEditorPluginClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_EditorPluginClass()
	 * @model unsettable="true"
	 * @generated
	 */
	String getEditorPluginClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorPluginClass <em>Editor Plugin Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Plugin Class</em>' attribute.
	 * @see #isSetEditorPluginClass()
	 * @see #unsetEditorPluginClass()
	 * @see #getEditorPluginClass()
	 * @generated
	 */
	void setEditorPluginClass(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorPluginClass <em>Editor Plugin Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditorPluginClass()
	 * @see #getEditorPluginClass()
	 * @see #setEditorPluginClass(String)
	 * @generated
	 */
	void unsetEditorPluginClass();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorPluginClass <em>Editor Plugin Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Editor Plugin Class</em>' attribute is set.
	 * @see #unsetEditorPluginClass()
	 * @see #getEditorPluginClass()
	 * @see #setEditorPluginClass(String)
	 * @generated
	 */
	boolean isSetEditorPluginClass();

	/**
	 * Returns the value of the '<em><b>Update Classpath</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Classpath</em>' attribute.
	 * @see #setUpdateClasspath(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_UpdateClasspath()
	 * @model default="true"
	 * @generated
	 */
	boolean isUpdateClasspath();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isUpdateClasspath <em>Update Classpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Classpath</em>' attribute.
	 * @see #isUpdateClasspath()
	 * @generated
	 */
	void setUpdateClasspath(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Schema</em>' attribute.
	 * @see #setGenerateSchema(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_GenerateSchema()
	 * @model
	 * @generated
	 */
	boolean isGenerateSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isGenerateSchema <em>Generate Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Schema</em>' attribute.
	 * @see #isGenerateSchema()
	 * @generated
	 */
	void setGenerateSchema(boolean value);

	/**
	 * Returns the value of the '<em><b>Non NLS Markers</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non NLS Markers</em>' attribute.
	 * @see #setNonNLSMarkers(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_NonNLSMarkers()
	 * @model default="false"
	 * @generated
	 */
	boolean isNonNLSMarkers();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isNonNLSMarkers <em>Non NLS Markers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non NLS Markers</em>' attribute.
	 * @see #isNonNLSMarkers()
	 * @generated
	 */
	void setNonNLSMarkers(boolean value);

	/**
	 * Returns the value of the '<em><b>Static Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Packages</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenModel_StaticPackages()
	 * @model
	 * @generated
	 */
	EList<String> getStaticPackages();

	/**
	 * Returns the value of the '<em><b>Model Plugin Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Plugin Variables</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenModel_ModelPluginVariables()
	 * @model
	 * @generated
	 */
	EList<String> getModelPluginVariables();

	/**
	 * Returns the value of the '<em><b>Root Extends Interface</b></em>' attribute.
	 * The default value is <code>"org.eclipse.emf.ecore.EObject"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Extends Interface</em>' attribute.
	 * @see #setRootExtendsInterface(String)
	 * @see genmodel.GenmodelPackage#getGenModel_RootExtendsInterface()
	 * @model default="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	String getRootExtendsInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRootExtendsInterface <em>Root Extends Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Extends Interface</em>' attribute.
	 * @see #getRootExtendsInterface()
	 * @generated
	 */
	void setRootExtendsInterface(String value);

	/**
	 * Returns the value of the '<em><b>Root Extends Class</b></em>' attribute.
	 * The default value is <code>"org.eclipse.emf.ecore.impl.EObjectImpl"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Extends Class</em>' attribute.
	 * @see #setRootExtendsClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_RootExtendsClass()
	 * @model default="org.eclipse.emf.ecore.impl.EObjectImpl"
	 * @generated
	 */
	String getRootExtendsClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRootExtendsClass <em>Root Extends Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Extends Class</em>' attribute.
	 * @see #getRootExtendsClass()
	 * @generated
	 */
	void setRootExtendsClass(String value);

	/**
	 * Returns the value of the '<em><b>Root Implements Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Implements Interface</em>' attribute.
	 * @see #setRootImplementsInterface(String)
	 * @see genmodel.GenmodelPackage#getGenModel_RootImplementsInterface()
	 * @model
	 * @generated
	 */
	String getRootImplementsInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRootImplementsInterface <em>Root Implements Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Implements Interface</em>' attribute.
	 * @see #getRootImplementsInterface()
	 * @generated
	 */
	void setRootImplementsInterface(String value);

	/**
	 * Returns the value of the '<em><b>Suppress EMF Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress EMF Types</em>' attribute.
	 * @see #setSuppressEMFTypes(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressEMFTypes()
	 * @model
	 * @generated
	 */
	boolean isSuppressEMFTypes();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressEMFTypes <em>Suppress EMF Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress EMF Types</em>' attribute.
	 * @see #isSuppressEMFTypes()
	 * @generated
	 */
	void setSuppressEMFTypes(boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress EMF Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress EMF Meta Data</em>' attribute.
	 * @see #setSuppressEMFMetaData(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressEMFMetaData()
	 * @model
	 * @generated
	 */
	boolean isSuppressEMFMetaData();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressEMFMetaData <em>Suppress EMF Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress EMF Meta Data</em>' attribute.
	 * @see #isSuppressEMFMetaData()
	 * @generated
	 */
	void setSuppressEMFMetaData(boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress EMF Model Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress EMF Model Tags</em>' attribute.
	 * @see #setSuppressEMFModelTags(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressEMFModelTags()
	 * @model
	 * @generated
	 */
	boolean isSuppressEMFModelTags();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressEMFModelTags <em>Suppress EMF Model Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress EMF Model Tags</em>' attribute.
	 * @see #isSuppressEMFModelTags()
	 * @generated
	 */
	void setSuppressEMFModelTags(boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Interfaces</em>' attribute.
	 * @see #setSuppressInterfaces(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressInterfaces()
	 * @model
	 * @generated
	 */
	boolean isSuppressInterfaces();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressInterfaces <em>Suppress Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Interfaces</em>' attribute.
	 * @see #isSuppressInterfaces()
	 * @generated
	 */
	void setSuppressInterfaces(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature Map Wrapper Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Map Wrapper Interface</em>' attribute.
	 * @see #setFeatureMapWrapperInterface(String)
	 * @see genmodel.GenmodelPackage#getGenModel_FeatureMapWrapperInterface()
	 * @model
	 * @generated
	 */
	String getFeatureMapWrapperInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureMapWrapperInterface <em>Feature Map Wrapper Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Map Wrapper Interface</em>' attribute.
	 * @see #getFeatureMapWrapperInterface()
	 * @generated
	 */
	void setFeatureMapWrapperInterface(String value);

	/**
	 * Returns the value of the '<em><b>Feature Map Wrapper Internal Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Map Wrapper Internal Interface</em>' attribute.
	 * @see #setFeatureMapWrapperInternalInterface(String)
	 * @see genmodel.GenmodelPackage#getGenModel_FeatureMapWrapperInternalInterface()
	 * @model
	 * @generated
	 */
	String getFeatureMapWrapperInternalInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureMapWrapperInternalInterface <em>Feature Map Wrapper Internal Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Map Wrapper Internal Interface</em>' attribute.
	 * @see #getFeatureMapWrapperInternalInterface()
	 * @generated
	 */
	void setFeatureMapWrapperInternalInterface(String value);

	/**
	 * Returns the value of the '<em><b>Feature Map Wrapper Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Map Wrapper Class</em>' attribute.
	 * @see #setFeatureMapWrapperClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_FeatureMapWrapperClass()
	 * @model
	 * @generated
	 */
	String getFeatureMapWrapperClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureMapWrapperClass <em>Feature Map Wrapper Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Map Wrapper Class</em>' attribute.
	 * @see #getFeatureMapWrapperClass()
	 * @generated
	 */
	void setFeatureMapWrapperClass(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Compatibility</em>' attribute.
	 * @see #setRuntimeCompatibility(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_RuntimeCompatibility()
	 * @model
	 * @generated
	 */
	boolean isRuntimeCompatibility();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRuntimeCompatibility <em>Runtime Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Compatibility</em>' attribute.
	 * @see #isRuntimeCompatibility()
	 * @generated
	 */
	void setRuntimeCompatibility(boolean value);

	/**
	 * Returns the value of the '<em><b>Rich Client Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rich Client Platform</em>' attribute.
	 * @see #setRichClientPlatform(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_RichClientPlatform()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRichClientPlatform();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRichClientPlatform <em>Rich Client Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rich Client Platform</em>' attribute.
	 * @see #isRichClientPlatform()
	 * @generated
	 */
	void setRichClientPlatform(boolean value);

	/**
	 * Returns the value of the '<em><b>Reflective Delegation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflective Delegation</em>' attribute.
	 * @see #setReflectiveDelegation(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_ReflectiveDelegation()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	boolean isReflectiveDelegation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isReflectiveDelegation <em>Reflective Delegation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflective Delegation</em>' attribute.
	 * @see #isReflectiveDelegation()
	 * @generated
	 */
	void setReflectiveDelegation(boolean value);

	/**
	 * Returns the value of the '<em><b>Code Formatting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Formatting</em>' attribute.
	 * @see #setCodeFormatting(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_CodeFormatting()
	 * @model
	 * @generated
	 */
	boolean isCodeFormatting();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCodeFormatting <em>Code Formatting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Formatting</em>' attribute.
	 * @see #isCodeFormatting()
	 * @generated
	 */
	void setCodeFormatting(boolean value);

	/**
	 * Returns the value of the '<em><b>Comment Formatting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Formatting</em>' attribute.
	 * @see #setCommentFormatting(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_CommentFormatting()
	 * @model
	 * @generated
	 */
	boolean isCommentFormatting();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCommentFormatting <em>Comment Formatting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Formatting</em>' attribute.
	 * @see #isCommentFormatting()
	 * @generated
	 */
	void setCommentFormatting(boolean value);

	/**
	 * Returns the value of the '<em><b>Tests Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Directory</em>' attribute.
	 * @see #isSetTestsDirectory()
	 * @see #unsetTestsDirectory()
	 * @see #setTestsDirectory(String)
	 * @see genmodel.GenmodelPackage#getGenModel_TestsDirectory()
	 * @model unsettable="true" dataType="genmodel.Path"
	 * @generated
	 */
	String getTestsDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestsDirectory <em>Tests Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests Directory</em>' attribute.
	 * @see #isSetTestsDirectory()
	 * @see #unsetTestsDirectory()
	 * @see #getTestsDirectory()
	 * @generated
	 */
	void setTestsDirectory(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestsDirectory <em>Tests Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTestsDirectory()
	 * @see #getTestsDirectory()
	 * @see #setTestsDirectory(String)
	 * @generated
	 */
	void unsetTestsDirectory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestsDirectory <em>Tests Directory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tests Directory</em>' attribute is set.
	 * @see #unsetTestsDirectory()
	 * @see #getTestsDirectory()
	 * @see #setTestsDirectory(String)
	 * @generated
	 */
	boolean isSetTestsDirectory();

	/**
	 * Returns the value of the '<em><b>Test Suite Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Suite Class</em>' attribute.
	 * @see #isSetTestSuiteClass()
	 * @see #unsetTestSuiteClass()
	 * @see #setTestSuiteClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_TestSuiteClass()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTestSuiteClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestSuiteClass <em>Test Suite Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Suite Class</em>' attribute.
	 * @see #isSetTestSuiteClass()
	 * @see #unsetTestSuiteClass()
	 * @see #getTestSuiteClass()
	 * @generated
	 */
	void setTestSuiteClass(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestSuiteClass <em>Test Suite Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTestSuiteClass()
	 * @see #getTestSuiteClass()
	 * @see #setTestSuiteClass(String)
	 * @generated
	 */
	void unsetTestSuiteClass();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestSuiteClass <em>Test Suite Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test Suite Class</em>' attribute is set.
	 * @see #unsetTestSuiteClass()
	 * @see #getTestSuiteClass()
	 * @see #setTestSuiteClass(String)
	 * @generated
	 */
	boolean isSetTestSuiteClass();

	/**
	 * Returns the value of the '<em><b>Boolean Flags Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Flags Field</em>' attribute.
	 * @see #setBooleanFlagsField(String)
	 * @see genmodel.GenmodelPackage#getGenModel_BooleanFlagsField()
	 * @model
	 * @generated
	 */
	String getBooleanFlagsField();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getBooleanFlagsField <em>Boolean Flags Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Flags Field</em>' attribute.
	 * @see #getBooleanFlagsField()
	 * @generated
	 */
	void setBooleanFlagsField(String value);

	/**
	 * Returns the value of the '<em><b>Boolean Flags Reserved Bits</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Flags Reserved Bits</em>' attribute.
	 * @see #setBooleanFlagsReservedBits(int)
	 * @see genmodel.GenmodelPackage#getGenModel_BooleanFlagsReservedBits()
	 * @model default="-1"
	 * @generated
	 */
	int getBooleanFlagsReservedBits();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getBooleanFlagsReservedBits <em>Boolean Flags Reserved Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Flags Reserved Bits</em>' attribute.
	 * @see #getBooleanFlagsReservedBits()
	 * @generated
	 */
	void setBooleanFlagsReservedBits(int value);

	/**
	 * Returns the value of the '<em><b>Importer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importer ID</em>' attribute.
	 * @see #setImporterID(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ImporterID()
	 * @model
	 * @generated
	 */
	String getImporterID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getImporterID <em>Importer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer ID</em>' attribute.
	 * @see #getImporterID()
	 * @generated
	 */
	void setImporterID(String value);

	/**
	 * Returns the value of the '<em><b>Bundle Manifest</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle Manifest</em>' attribute.
	 * @see #setBundleManifest(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_BundleManifest()
	 * @model default="true"
	 * @generated
	 */
	boolean isBundleManifest();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isBundleManifest <em>Bundle Manifest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle Manifest</em>' attribute.
	 * @see #isBundleManifest()
	 * @generated
	 */
	void setBundleManifest(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature Delegation</b></em>' attribute.
	 * The literals are from the enumeration {@link genmodel.GenDelegationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Delegation</em>' attribute.
	 * @see genmodel.GenDelegationKind
	 * @see #setFeatureDelegation(GenDelegationKind)
	 * @see genmodel.GenmodelPackage#getGenModel_FeatureDelegation()
	 * @model
	 * @generated
	 */
	GenDelegationKind getFeatureDelegation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFeatureDelegation <em>Feature Delegation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Delegation</em>' attribute.
	 * @see genmodel.GenDelegationKind
	 * @see #getFeatureDelegation()
	 * @generated
	 */
	void setFeatureDelegation(GenDelegationKind value);

	/**
	 * Returns the value of the '<em><b>Containment Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Proxies</em>' attribute.
	 * @see #setContainmentProxies(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_ContainmentProxies()
	 * @model
	 * @generated
	 */
	boolean isContainmentProxies();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isContainmentProxies <em>Containment Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Proxies</em>' attribute.
	 * @see #isContainmentProxies()
	 * @generated
	 */
	void setContainmentProxies(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimal Reflective Methods</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimal Reflective Methods</em>' attribute.
	 * @see #setMinimalReflectiveMethods(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_MinimalReflectiveMethods()
	 * @model default="true"
	 * @generated
	 */
	boolean isMinimalReflectiveMethods();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isMinimalReflectiveMethods <em>Minimal Reflective Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimal Reflective Methods</em>' attribute.
	 * @see #isMinimalReflectiveMethods()
	 * @generated
	 */
	void setMinimalReflectiveMethods(boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Containment</em>' attribute.
	 * @see #setSuppressContainment(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressContainment()
	 * @model
	 * @generated
	 */
	boolean isSuppressContainment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressContainment <em>Suppress Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Containment</em>' attribute.
	 * @see #isSuppressContainment()
	 * @generated
	 */
	void setSuppressContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Notification</em>' attribute.
	 * @see #setSuppressNotification(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressNotification()
	 * @model
	 * @generated
	 */
	boolean isSuppressNotification();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressNotification <em>Suppress Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Notification</em>' attribute.
	 * @see #isSuppressNotification()
	 * @generated
	 */
	void setSuppressNotification(boolean value);

	/**
	 * Returns the value of the '<em><b>Array Accessors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Accessors</em>' attribute.
	 * @see #setArrayAccessors(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_ArrayAccessors()
	 * @model
	 * @generated
	 */
	boolean isArrayAccessors();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isArrayAccessors <em>Array Accessors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Accessors</em>' attribute.
	 * @see #isArrayAccessors()
	 * @generated
	 */
	void setArrayAccessors(boolean value);

	/**
	 * Returns the value of the '<em><b>Suppress Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Unsettable</em>' attribute.
	 * @see #setSuppressUnsettable(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressUnsettable()
	 * @model
	 * @generated
	 */
	boolean isSuppressUnsettable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressUnsettable <em>Suppress Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Unsettable</em>' attribute.
	 * @see #isSuppressUnsettable()
	 * @generated
	 */
	void setSuppressUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Facade Helper Class</b></em>' attribute.
	 * The default value is <code>"org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facade Helper Class</em>' attribute.
	 * @see #setFacadeHelperClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_FacadeHelperClass()
	 * @model default="org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper"
	 * @generated
	 */
	String getFacadeHelperClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getFacadeHelperClass <em>Facade Helper Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facade Helper Class</em>' attribute.
	 * @see #getFacadeHelperClass()
	 * @generated
	 */
	void setFacadeHelperClass(String value);

	/**
	 * Returns the value of the '<em><b>Compliance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link genmodel.GenJDKLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance Level</em>' attribute.
	 * @see genmodel.GenJDKLevel
	 * @see #setComplianceLevel(GenJDKLevel)
	 * @see genmodel.GenmodelPackage#getGenModel_ComplianceLevel()
	 * @model
	 * @generated
	 */
	GenJDKLevel getComplianceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getComplianceLevel <em>Compliance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Level</em>' attribute.
	 * @see genmodel.GenJDKLevel
	 * @see #getComplianceLevel()
	 * @generated
	 */
	void setComplianceLevel(GenJDKLevel value);

	/**
	 * Returns the value of the '<em><b>Suppress Gen Model Annotations</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress Gen Model Annotations</em>' attribute.
	 * @see #setSuppressGenModelAnnotations(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_SuppressGenModelAnnotations()
	 * @model default="true"
	 * @generated
	 */
	boolean isSuppressGenModelAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isSuppressGenModelAnnotations <em>Suppress Gen Model Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress Gen Model Annotations</em>' attribute.
	 * @see #isSuppressGenModelAnnotations()
	 * @generated
	 */
	void setSuppressGenModelAnnotations(boolean value);

	/**
	 * Returns the value of the '<em><b>Copyright Fields</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Fields</em>' attribute.
	 * @see #setCopyrightFields(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_CopyrightFields()
	 * @model default="true"
	 * @generated
	 */
	boolean isCopyrightFields();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCopyrightFields <em>Copyright Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Fields</em>' attribute.
	 * @see #isCopyrightFields()
	 * @generated
	 */
	void setCopyrightFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Binary Compatible Reflective Methods</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Compatible Reflective Methods</em>' attribute.
	 * @see #setBinaryCompatibleReflectiveMethods(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_BinaryCompatibleReflectiveMethods()
	 * @model
	 * @generated
	 */
	boolean isBinaryCompatibleReflectiveMethods();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isBinaryCompatibleReflectiveMethods <em>Binary Compatible Reflective Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Compatible Reflective Methods</em>' attribute.
	 * @see #isBinaryCompatibleReflectiveMethods()
	 * @generated
	 */
	void setBinaryCompatibleReflectiveMethods(boolean value);

	/**
	 * Returns the value of the '<em><b>Public Constructors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Constructors</em>' attribute.
	 * @see #setPublicConstructors(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_PublicConstructors()
	 * @model
	 * @generated
	 */
	boolean isPublicConstructors();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isPublicConstructors <em>Public Constructors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Constructors</em>' attribute.
	 * @see #isPublicConstructors()
	 * @generated
	 */
	void setPublicConstructors(boolean value);

	/**
	 * Returns the value of the '<em><b>Template Plugin Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Plugin Variables</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenModel_TemplatePluginVariables()
	 * @model
	 * @generated
	 */
	EList<String> getTemplatePluginVariables();

	/**
	 * Returns the value of the '<em><b>Provider Root Extends Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Root Extends Class</em>' attribute.
	 * @see #setProviderRootExtendsClass(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ProviderRootExtendsClass()
	 * @model
	 * @generated
	 */
	String getProviderRootExtendsClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getProviderRootExtendsClass <em>Provider Root Extends Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Root Extends Class</em>' attribute.
	 * @see #getProviderRootExtendsClass()
	 * @generated
	 */
	void setProviderRootExtendsClass(String value);

	/**
	 * Returns the value of the '<em><b>Edit Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Plugin ID</em>' attribute.
	 * @see #setEditPluginID(String)
	 * @see genmodel.GenmodelPackage#getGenModel_EditPluginID()
	 * @model
	 * @generated
	 */
	String getEditPluginID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditPluginID <em>Edit Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Plugin ID</em>' attribute.
	 * @see #getEditPluginID()
	 * @generated
	 */
	void setEditPluginID(String value);

	/**
	 * Returns the value of the '<em><b>Edit Plugin Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Plugin Variables</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenModel_EditPluginVariables()
	 * @model
	 * @generated
	 */
	EList<String> getEditPluginVariables();

	/**
	 * Returns the value of the '<em><b>Editor Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Plugin ID</em>' attribute.
	 * @see #setEditorPluginID(String)
	 * @see genmodel.GenmodelPackage#getGenModel_EditorPluginID()
	 * @model
	 * @generated
	 */
	String getEditorPluginID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEditorPluginID <em>Editor Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor Plugin ID</em>' attribute.
	 * @see #getEditorPluginID()
	 * @generated
	 */
	void setEditorPluginID(String value);

	/**
	 * Returns the value of the '<em><b>Editor Plugin Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor Plugin Variables</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenModel_EditorPluginVariables()
	 * @model
	 * @generated
	 */
	EList<String> getEditorPluginVariables();

	/**
	 * Returns the value of the '<em><b>Tests Plugin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Plugin ID</em>' attribute.
	 * @see #setTestsPluginID(String)
	 * @see genmodel.GenmodelPackage#getGenModel_TestsPluginID()
	 * @model
	 * @generated
	 */
	String getTestsPluginID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getTestsPluginID <em>Tests Plugin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests Plugin ID</em>' attribute.
	 * @see #getTestsPluginID()
	 * @generated
	 */
	void setTestsPluginID(String value);

	/**
	 * Returns the value of the '<em><b>Tests Plugin Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests Plugin Variables</em>' attribute list.
	 * @see genmodel.GenmodelPackage#getGenModel_TestsPluginVariables()
	 * @model
	 * @generated
	 */
	EList<String> getTestsPluginVariables();

	/**
	 * Returns the value of the '<em><b>Optimized Has Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimized Has Children</em>' attribute.
	 * @see #setOptimizedHasChildren(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_OptimizedHasChildren()
	 * @model
	 * @generated
	 */
	boolean isOptimizedHasChildren();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isOptimizedHasChildren <em>Optimized Has Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimized Has Children</em>' attribute.
	 * @see #isOptimizedHasChildren()
	 * @generated
	 */
	void setOptimizedHasChildren(boolean value);

	/**
	 * Returns the value of the '<em><b>Table Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Providers</em>' attribute.
	 * @see #setTableProviders(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_TableProviders()
	 * @model
	 * @generated
	 */
	boolean isTableProviders();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isTableProviders <em>Table Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Providers</em>' attribute.
	 * @see #isTableProviders()
	 * @generated
	 */
	void setTableProviders(boolean value);

	/**
	 * Returns the value of the '<em><b>Color Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Providers</em>' attribute.
	 * @see #setColorProviders(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_ColorProviders()
	 * @model
	 * @generated
	 */
	boolean isColorProviders();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isColorProviders <em>Color Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Providers</em>' attribute.
	 * @see #isColorProviders()
	 * @generated
	 */
	void setColorProviders(boolean value);

	/**
	 * Returns the value of the '<em><b>Font Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Providers</em>' attribute.
	 * @see #setFontProviders(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_FontProviders()
	 * @model
	 * @generated
	 */
	boolean isFontProviders();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isFontProviders <em>Font Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Providers</em>' attribute.
	 * @see #isFontProviders()
	 * @generated
	 */
	void setFontProviders(boolean value);

	/**
	 * Returns the value of the '<em><b>Runtime Version</b></em>' attribute.
	 * The literals are from the enumeration {@link genmodel.GenRuntimeVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Version</em>' attribute.
	 * @see genmodel.GenRuntimeVersion
	 * @see #isSetRuntimeVersion()
	 * @see #unsetRuntimeVersion()
	 * @see #setRuntimeVersion(GenRuntimeVersion)
	 * @see genmodel.GenmodelPackage#getGenModel_RuntimeVersion()
	 * @model unsettable="true"
	 * @generated
	 */
	GenRuntimeVersion getRuntimeVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRuntimeVersion <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Version</em>' attribute.
	 * @see genmodel.GenRuntimeVersion
	 * @see #isSetRuntimeVersion()
	 * @see #unsetRuntimeVersion()
	 * @see #getRuntimeVersion()
	 * @generated
	 */
	void setRuntimeVersion(GenRuntimeVersion value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRuntimeVersion <em>Runtime Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRuntimeVersion()
	 * @see #getRuntimeVersion()
	 * @see #setRuntimeVersion(GenRuntimeVersion)
	 * @generated
	 */
	void unsetRuntimeVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRuntimeVersion <em>Runtime Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Runtime Version</em>' attribute is set.
	 * @see #unsetRuntimeVersion()
	 * @see #getRuntimeVersion()
	 * @see #setRuntimeVersion(GenRuntimeVersion)
	 * @generated
	 */
	boolean isSetRuntimeVersion();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see genmodel.GenmodelPackage#getGenModel_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Packed Enums</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packed Enums</em>' attribute.
	 * @see #setPackedEnums(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_PackedEnums()
	 * @model
	 * @generated
	 */
	boolean isPackedEnums();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isPackedEnums <em>Packed Enums</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packed Enums</em>' attribute.
	 * @see #isPackedEnums()
	 * @generated
	 */
	void setPackedEnums(boolean value);

	/**
	 * Returns the value of the '<em><b>Gen Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Packages</em>' containment reference list.
	 * @see genmodel.GenmodelPackage#getGenModel_GenPackages()
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenPackage#getGenModel
	 * @model opposite="genModel" containment="true"
	 * @generated
	 */
	EList<GenPackage> getGenPackages();

	/**
	 * Returns the value of the '<em><b>Used Gen Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Gen Packages</em>' reference list.
	 * @see genmodel.GenmodelPackage#getGenModel_UsedGenPackages()
	 * @model
	 * @generated
	 */
	EList<GenPackage> getUsedGenPackages();

	/**
	 * Returns the value of the '<em><b>Interface Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name Pattern</em>' attribute.
	 * @see #setInterfaceNamePattern(String)
	 * @see genmodel.GenmodelPackage#getGenModel_InterfaceNamePattern()
	 * @model
	 * @generated
	 */
	String getInterfaceNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getInterfaceNamePattern <em>Interface Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name Pattern</em>' attribute.
	 * @see #getInterfaceNamePattern()
	 * @generated
	 */
	void setInterfaceNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Class Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name Pattern</em>' attribute.
	 * @see #setClassNamePattern(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ClassNamePattern()
	 * @model
	 * @generated
	 */
	String getClassNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getClassNamePattern <em>Class Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name Pattern</em>' attribute.
	 * @see #getClassNamePattern()
	 * @generated
	 */
	void setClassNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Operation Reflection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Reflection</em>' attribute.
	 * @see #setOperationReflection(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_OperationReflection()
	 * @model default="false"
	 * @generated
	 */
	boolean isOperationReflection();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isOperationReflection <em>Operation Reflection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Reflection</em>' attribute.
	 * @see #isOperationReflection()
	 * @generated
	 */
	void setOperationReflection(boolean value);

	/**
	 * Returns the value of the '<em><b>Rich Ajax Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rich Ajax Platform</em>' attribute.
	 * @see #setRichAjaxPlatform(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_RichAjaxPlatform()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRichAjaxPlatform();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRichAjaxPlatform <em>Rich Ajax Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rich Ajax Platform</em>' attribute.
	 * @see #isRichAjaxPlatform()
	 * @generated
	 */
	void setRichAjaxPlatform(boolean value);

	/**
	 * Returns the value of the '<em><b>Runtime Platform</b></em>' attribute.
	 * The literals are from the enumeration {@link genmodel.GenRuntimePlatform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Platform</em>' attribute.
	 * @see genmodel.GenRuntimePlatform
	 * @see #setRuntimePlatform(GenRuntimePlatform)
	 * @see genmodel.GenmodelPackage#getGenModel_RuntimePlatform()
	 * @model
	 * @generated
	 */
	GenRuntimePlatform getRuntimePlatform();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getRuntimePlatform <em>Runtime Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Platform</em>' attribute.
	 * @see genmodel.GenRuntimePlatform
	 * @see #getRuntimePlatform()
	 * @generated
	 */
	void setRuntimePlatform(GenRuntimePlatform value);

	/**
	 * Returns the value of the '<em><b>Import Organizing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Organizing</em>' attribute.
	 * @see #setImportOrganizing(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_ImportOrganizing()
	 * @model
	 * @generated
	 */
	boolean isImportOrganizing();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isImportOrganizing <em>Import Organizing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Organizing</em>' attribute.
	 * @see #isImportOrganizing()
	 * @generated
	 */
	void setImportOrganizing(boolean value);

	/**
	 * Returns the value of the '<em><b>Plugin Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Key</em>' attribute.
	 * @see #setPluginKey(String)
	 * @see genmodel.GenmodelPackage#getGenModel_PluginKey()
	 * @model
	 * @generated
	 */
	String getPluginKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getPluginKey <em>Plugin Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Key</em>' attribute.
	 * @see #getPluginKey()
	 * @generated
	 */
	void setPluginKey(String value);

	/**
	 * Returns the value of the '<em><b>Decoration</b></em>' attribute.
	 * The literals are from the enumeration {@link genmodel.GenDecoration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration</em>' attribute.
	 * @see genmodel.GenDecoration
	 * @see #setDecoration(GenDecoration)
	 * @see genmodel.GenmodelPackage#getGenModel_Decoration()
	 * @model
	 * @generated
	 */
	GenDecoration getDecoration();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getDecoration <em>Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration</em>' attribute.
	 * @see genmodel.GenDecoration
	 * @see #getDecoration()
	 * @generated
	 */
	void setDecoration(GenDecoration value);

	/**
	 * Returns the value of the '<em><b>Style Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Providers</em>' attribute.
	 * @see #setStyleProviders(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_StyleProviders()
	 * @model
	 * @generated
	 */
	boolean isStyleProviders();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isStyleProviders <em>Style Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Providers</em>' attribute.
	 * @see #isStyleProviders()
	 * @generated
	 */
	void setStyleProviders(boolean value);

	/**
	 * Returns the value of the '<em><b>Cleanup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleanup</em>' attribute.
	 * @see #setCleanup(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_Cleanup()
	 * @model
	 * @generated
	 */
	boolean isCleanup();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCleanup <em>Cleanup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleanup</em>' attribute.
	 * @see #isCleanup()
	 * @generated
	 */
	void setCleanup(boolean value);

	/**
	 * Returns the value of the '<em><b>OS Gi Compatible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS Gi Compatible</em>' attribute.
	 * @see #setOSGiCompatible(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_OSGiCompatible()
	 * @model
	 * @generated
	 */
	boolean isOSGiCompatible();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isOSGiCompatible <em>OS Gi Compatible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Gi Compatible</em>' attribute.
	 * @see #isOSGiCompatible()
	 * @generated
	 */
	void setOSGiCompatible(boolean value);

	/**
	 * Returns the value of the '<em><b>Eclipse Platform Version</b></em>' attribute.
	 * The literals are from the enumeration {@link genmodel.GenEclipsePlatformVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclipse Platform Version</em>' attribute.
	 * @see genmodel.GenEclipsePlatformVersion
	 * @see #isSetEclipsePlatformVersion()
	 * @see #unsetEclipsePlatformVersion()
	 * @see #setEclipsePlatformVersion(GenEclipsePlatformVersion)
	 * @see genmodel.GenmodelPackage#getGenModel_EclipsePlatformVersion()
	 * @model unsettable="true"
	 * @generated
	 */
	GenEclipsePlatformVersion getEclipsePlatformVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEclipsePlatformVersion <em>Eclipse Platform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclipse Platform Version</em>' attribute.
	 * @see genmodel.GenEclipsePlatformVersion
	 * @see #isSetEclipsePlatformVersion()
	 * @see #unsetEclipsePlatformVersion()
	 * @see #getEclipsePlatformVersion()
	 * @generated
	 */
	void setEclipsePlatformVersion(GenEclipsePlatformVersion value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEclipsePlatformVersion <em>Eclipse Platform Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEclipsePlatformVersion()
	 * @see #getEclipsePlatformVersion()
	 * @see #setEclipsePlatformVersion(GenEclipsePlatformVersion)
	 * @generated
	 */
	void unsetEclipsePlatformVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getEclipsePlatformVersion <em>Eclipse Platform Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eclipse Platform Version</em>' attribute is set.
	 * @see #unsetEclipsePlatformVersion()
	 * @see #getEclipsePlatformVersion()
	 * @see #setEclipsePlatformVersion(GenEclipsePlatformVersion)
	 * @generated
	 */
	boolean isSetEclipsePlatformVersion();

	/**
	 * Returns the value of the '<em><b>Model Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Documentation</em>' attribute.
	 * @see #isSetModelDocumentation()
	 * @see #unsetModelDocumentation()
	 * @see #setModelDocumentation(String)
	 * @see genmodel.GenmodelPackage#getGenModel_ModelDocumentation()
	 * @model unsettable="true"
	 * @generated
	 */
	String getModelDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelDocumentation <em>Model Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Documentation</em>' attribute.
	 * @see #isSetModelDocumentation()
	 * @see #unsetModelDocumentation()
	 * @see #getModelDocumentation()
	 * @generated
	 */
	void setModelDocumentation(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelDocumentation <em>Model Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModelDocumentation()
	 * @see #getModelDocumentation()
	 * @see #setModelDocumentation(String)
	 * @generated
	 */
	void unsetModelDocumentation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getModelDocumentation <em>Model Documentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Model Documentation</em>' attribute is set.
	 * @see #unsetModelDocumentation()
	 * @see #getModelDocumentation()
	 * @see #setModelDocumentation(String)
	 * @generated
	 */
	boolean isSetModelDocumentation();

	/**
	 * Returns the value of the '<em><b>Auto Resize Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Resize Properties</em>' attribute.
	 * @see #setAutoResizeProperties(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_AutoResizeProperties()
	 * @model
	 * @generated
	 */
	boolean isAutoResizeProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isAutoResizeProperties <em>Auto Resize Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Resize Properties</em>' attribute.
	 * @see #isAutoResizeProperties()
	 * @generated
	 */
	void setAutoResizeProperties(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Expand Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Expand Properties</em>' attribute.
	 * @see #setAutoExpandProperties(int)
	 * @see genmodel.GenmodelPackage#getGenModel_AutoExpandProperties()
	 * @model
	 * @generated
	 */
	int getAutoExpandProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#getAutoExpandProperties <em>Auto Expand Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Expand Properties</em>' attribute.
	 * @see #getAutoExpandProperties()
	 * @generated
	 */
	void setAutoExpandProperties(int value);

	/**
	 * Returns the value of the '<em><b>Find Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Find Action</em>' attribute.
	 * @see #setFindAction(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_FindAction()
	 * @model
	 * @generated
	 */
	boolean isFindAction();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isFindAction <em>Find Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Find Action</em>' attribute.
	 * @see #isFindAction()
	 * @generated
	 */
	void setFindAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Expand All Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expand All Action</em>' attribute.
	 * @see #setExpandAllAction(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_ExpandAllAction()
	 * @model
	 * @generated
	 */
	boolean isExpandAllAction();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isExpandAllAction <em>Expand All Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand All Action</em>' attribute.
	 * @see #isExpandAllAction()
	 * @generated
	 */
	void setExpandAllAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Collapse All Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collapse All Action</em>' attribute.
	 * @see #setCollapseAllAction(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_CollapseAllAction()
	 * @model
	 * @generated
	 */
	boolean isCollapseAllAction();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isCollapseAllAction <em>Collapse All Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapse All Action</em>' attribute.
	 * @see #isCollapseAllAction()
	 * @generated
	 */
	void setCollapseAllAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Revert Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revert Action</em>' attribute.
	 * @see #setRevertAction(boolean)
	 * @see genmodel.GenmodelPackage#getGenModel_RevertAction()
	 * @model
	 * @generated
	 */
	boolean isRevertAction();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenModel#isRevertAction <em>Revert Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revert Action</em>' attribute.
	 * @see #isRevertAction()
	 * @generated
	 */
	void setRevertAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Code Style</b></em>' attribute list.
	 * The list contents are of type {@link genmodel.GenCodeStyle}.
	 * The literals are from the enumeration {@link genmodel.GenCodeStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Style</em>' attribute list.
	 * @see genmodel.GenCodeStyle
	 * @see genmodel.GenmodelPackage#getGenModel_CodeStyle()
	 * @model
	 * @generated
	 */
	EList<GenCodeStyle> getCodeStyle();

} // GenModel
