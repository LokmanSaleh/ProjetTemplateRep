/**
 */
package genmodel;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getGenEnum <em>Gen Enum</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getEcoreEnumLiteral <em>Ecore Enum Literal</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see genmodel.GenmodelPackage#getGenEnumLiteral()
 * @model
 * @generated
 */
public interface GenEnumLiteral extends EObject, GenBase {
	/**
	 * Returns the value of the '<em><b>Gen Enum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnum#getGenEnumLiterals <em>Gen Enum Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Enum</em>' container reference.
	 * @see #setGenEnum(GenEnum)
	 * @see genmodel.GenmodelPackage#getGenEnumLiteral_GenEnum()
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenEnum#getGenEnumLiterals
	 * @model opposite="genEnumLiterals" resolveProxies="false" required="true"
	 * @generated
	 */
	GenEnum getGenEnum();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getGenEnum <em>Gen Enum</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Enum</em>' container reference.
	 * @see #getGenEnum()
	 * @generated
	 */
	void setGenEnum(GenEnum value);

	/**
	 * Returns the value of the '<em><b>Ecore Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Enum Literal</em>' reference.
	 * @see #setEcoreEnumLiteral(EEnumLiteral)
	 * @see genmodel.GenmodelPackage#getGenEnumLiteral_EcoreEnumLiteral()
	 * @model required="true"
	 * @generated
	 */
	EEnumLiteral getEcoreEnumLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getEcoreEnumLiteral <em>Ecore Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Enum Literal</em>' reference.
	 * @see #getEcoreEnumLiteral()
	 * @generated
	 */
	void setEcoreEnumLiteral(EEnumLiteral value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #setDocumentation(String)
	 * @see genmodel.GenmodelPackage#getGenEnumLiteral_Documentation()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getDocumentation <em>Documentation</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	void unsetDocumentation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral#getDocumentation <em>Documentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Documentation</em>' attribute is set.
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	boolean isSetDocumentation();

} // GenEnumLiteral
