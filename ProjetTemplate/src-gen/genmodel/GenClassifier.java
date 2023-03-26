/**
 */
package genmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getGenTypeParameters <em>Gen Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see genmodel.GenmodelPackage#getGenClassifier()
 * @model abstract="true"
 * @generated
 */
public interface GenClassifier extends EObject, GenBase {
	/**
	 * Returns the value of the '<em><b>Gen Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage#getGenClassifiers <em>Gen Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Package</em>' reference.
	 * @see genmodel.GenmodelPackage#getGenClassifier_GenPackage()
	 * @see org.eclipse.emf.codegen.ecore.genmodel.GenPackage#getGenClassifiers
	 * @model opposite="genClassifiers" resolveProxies="false" required="true" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	GenPackage getGenPackage();

	/**
	 * Returns the value of the '<em><b>Gen Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.codegen.ecore.genmodel.GenTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Type Parameters</em>' containment reference list.
	 * @see genmodel.GenmodelPackage#getGenClassifier_GenTypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenTypeParameter> getGenTypeParameters();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #setDocumentation(String)
	 * @see genmodel.GenmodelPackage#getGenClassifier_Documentation()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getDocumentation <em>Documentation</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	void unsetDocumentation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.codegen.ecore.genmodel.GenClassifier#getDocumentation <em>Documentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Documentation</em>' attribute is set.
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	boolean isSetDocumentation();

} // GenClassifier
