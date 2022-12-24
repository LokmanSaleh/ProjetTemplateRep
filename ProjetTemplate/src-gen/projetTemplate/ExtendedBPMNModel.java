/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended BPMN Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.ExtendedBPMNModel#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.ExtendedBPMNModel#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getExtendedBPMNModel()
 * @model
 * @generated
 */
public interface ExtendedBPMNModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getExtendedBPMNModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.ExtendedBPMNModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see projetTemplate.ProjetTemplatePackage#getExtendedBPMNModel_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link projetTemplate.ExtendedBPMNModel#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // ExtendedBPMNModel
