/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DataPropertyValue#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.DataPropertyValue#getDatapropertytype <em>Datapropertytype</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValue()
 * @model
 * @generated
 */
public interface DataPropertyValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.DataPropertyValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datapropertytype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertytype</em>' reference.
	 * @see #setDatapropertytype(DataPropertyType)
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValue_Datapropertytype()
	 * @model required="true"
	 * @generated
	 */
	DataPropertyType getDatapropertytype();

	/**
	 * Sets the value of the '{@link projetTemplate.DataPropertyValue#getDatapropertytype <em>Datapropertytype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datapropertytype</em>' reference.
	 * @see #getDatapropertytype()
	 * @generated
	 */
	void setDatapropertytype(DataPropertyType value);

} // DataPropertyValue
