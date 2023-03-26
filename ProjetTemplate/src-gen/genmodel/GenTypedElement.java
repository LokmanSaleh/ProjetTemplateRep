/**
 */
package genmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see genmodel.GenmodelPackage#getGenTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface GenTypedElement extends EObject, GenBase {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #setDocumentation(String)
	 * @see genmodel.GenmodelPackage#getGenTypedElement_Documentation()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	void unsetDocumentation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypedElement#getDocumentation <em>Documentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Documentation</em>' attribute is set.
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	boolean isSetDocumentation();

} // GenTypedElement
