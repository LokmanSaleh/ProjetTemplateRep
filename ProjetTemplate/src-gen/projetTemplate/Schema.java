/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Schema#getTechnology <em>Technology</em>}</li>
 *   <li>{@link projetTemplate.Schema#getModelelement <em>Modelelement</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see projetTemplate.ProjetTemplatePackage#getSchema_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link projetTemplate.Schema#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

	/**
	 * Returns the value of the '<em><b>Modelelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelement</em>' reference.
	 * @see #setModelelement(ModelElement)
	 * @see projetTemplate.ProjetTemplatePackage#getSchema_Modelelement()
	 * @model required="true"
	 * @generated
	 */
	ModelElement getModelelement();

	/**
	 * Sets the value of the '{@link projetTemplate.Schema#getModelelement <em>Modelelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelelement</em>' reference.
	 * @see #getModelelement()
	 * @generated
	 */
	void setModelelement(ModelElement value);

} // Schema
