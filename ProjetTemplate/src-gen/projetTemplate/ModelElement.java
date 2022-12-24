/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.ModelElement#getDatapropertyvalue <em>Datapropertyvalue</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datapropertyvalue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalue</em>' reference.
	 * @see #setDatapropertyvalue(DataPropertyValue)
	 * @see projetTemplate.ProjetTemplatePackage#getModelElement_Datapropertyvalue()
	 * @model required="true"
	 * @generated
	 */
	DataPropertyValue getDatapropertyvalue();

	/**
	 * Sets the value of the '{@link projetTemplate.ModelElement#getDatapropertyvalue <em>Datapropertyvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datapropertyvalue</em>' reference.
	 * @see #getDatapropertyvalue()
	 * @generated
	 */
	void setDatapropertyvalue(DataPropertyValue value);

} // ModelElement
