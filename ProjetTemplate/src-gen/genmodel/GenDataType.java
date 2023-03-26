/**
 */
package genmodel;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getEcoreDataType <em>Ecore Data Type</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getCreate <em>Create</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getPropertyEditorFactory <em>Property Editor Factory</em>}</li>
 * </ul>
 *
 * @see genmodel.GenmodelPackage#getGenDataType()
 * @model
 * @generated
 */
public interface GenDataType extends EObject, GenClassifier {
	/**
	 * Returns the value of the '<em><b>Ecore Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Data Type</em>' reference.
	 * @see #setEcoreDataType(EDataType)
	 * @see genmodel.GenmodelPackage#getGenDataType_EcoreDataType()
	 * @model required="true"
	 * @generated
	 */
	EDataType getEcoreDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getEcoreDataType <em>Ecore Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Data Type</em>' reference.
	 * @see #getEcoreDataType()
	 * @generated
	 */
	void setEcoreDataType(EDataType value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' attribute.
	 * @see #isSetCreate()
	 * @see #unsetCreate()
	 * @see #setCreate(String)
	 * @see genmodel.GenmodelPackage#getGenDataType_Create()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getCreate <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' attribute.
	 * @see #isSetCreate()
	 * @see #unsetCreate()
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getCreate <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreate()
	 * @see #getCreate()
	 * @see #setCreate(String)
	 * @generated
	 */
	void unsetCreate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getCreate <em>Create</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create</em>' attribute is set.
	 * @see #unsetCreate()
	 * @see #getCreate()
	 * @see #setCreate(String)
	 * @generated
	 */
	boolean isSetCreate();

	/**
	 * Returns the value of the '<em><b>Convert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert</em>' attribute.
	 * @see #isSetConvert()
	 * @see #unsetConvert()
	 * @see #setConvert(String)
	 * @see genmodel.GenmodelPackage#getGenDataType_Convert()
	 * @model unsettable="true"
	 * @generated
	 */
	String getConvert();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getConvert <em>Convert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convert</em>' attribute.
	 * @see #isSetConvert()
	 * @see #unsetConvert()
	 * @see #getConvert()
	 * @generated
	 */
	void setConvert(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getConvert <em>Convert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConvert()
	 * @see #getConvert()
	 * @see #setConvert(String)
	 * @generated
	 */
	void unsetConvert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getConvert <em>Convert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Convert</em>' attribute is set.
	 * @see #unsetConvert()
	 * @see #getConvert()
	 * @see #setConvert(String)
	 * @generated
	 */
	boolean isSetConvert();

	/**
	 * Returns the value of the '<em><b>Property Editor Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Editor Factory</em>' attribute.
	 * @see #isSetPropertyEditorFactory()
	 * @see #unsetPropertyEditorFactory()
	 * @see #setPropertyEditorFactory(String)
	 * @see genmodel.GenmodelPackage#getGenDataType_PropertyEditorFactory()
	 * @model unsettable="true" dataType="genmodel.PropertyEditorFactory"
	 * @generated
	 */
	String getPropertyEditorFactory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getPropertyEditorFactory <em>Property Editor Factory</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getPropertyEditorFactory <em>Property Editor Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyEditorFactory()
	 * @see #getPropertyEditorFactory()
	 * @see #setPropertyEditorFactory(String)
	 * @generated
	 */
	void unsetPropertyEditorFactory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType#getPropertyEditorFactory <em>Property Editor Factory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Editor Factory</em>' attribute is set.
	 * @see #unsetPropertyEditorFactory()
	 * @see #getPropertyEditorFactory()
	 * @see #setPropertyEditorFactory(String)
	 * @generated
	 */
	boolean isSetPropertyEditorFactory();

} // GenDataType
