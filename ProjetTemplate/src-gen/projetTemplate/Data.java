/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Data#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.Data#getCredentias <em>Credentias</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see projetTemplate.ProjetTemplatePackage#getData_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link projetTemplate.Data#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Credentias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentias</em>' attribute.
	 * @see #setCredentias(String)
	 * @see projetTemplate.ProjetTemplatePackage#getData_Credentias()
	 * @model
	 * @generated
	 */
	String getCredentias();

	/**
	 * Sets the value of the '{@link projetTemplate.Data#getCredentias <em>Credentias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentias</em>' attribute.
	 * @see #getCredentias()
	 * @generated
	 */
	void setCredentias(String value);

} // Data
