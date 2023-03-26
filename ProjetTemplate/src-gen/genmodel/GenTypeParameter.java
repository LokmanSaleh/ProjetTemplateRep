/**
 */
package genmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypeParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter#getEcoreTypeParameter <em>Ecore Type Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see genmodel.GenmodelPackage#getGenTypeParameter()
 * @model
 * @generated
 */
public interface GenTypeParameter extends EObject, GenBase {
	/**
	 * Returns the value of the '<em><b>Ecore Type Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Type Parameter</em>' reference.
	 * @see #setEcoreTypeParameter(ETypeParameter)
	 * @see genmodel.GenmodelPackage#getGenTypeParameter_EcoreTypeParameter()
	 * @model required="true"
	 * @generated
	 */
	ETypeParameter getEcoreTypeParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter#getEcoreTypeParameter <em>Ecore Type Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Type Parameter</em>' reference.
	 * @see #getEcoreTypeParameter()
	 * @generated
	 */
	void setEcoreTypeParameter(ETypeParameter value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #setDocumentation(String)
	 * @see genmodel.GenmodelPackage#getGenTypeParameter_Documentation()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter#getDocumentation <em>Documentation</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	void unsetDocumentation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter#getDocumentation <em>Documentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Documentation</em>' attribute is set.
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	boolean isSetDocumentation();

} // GenTypeParameter
