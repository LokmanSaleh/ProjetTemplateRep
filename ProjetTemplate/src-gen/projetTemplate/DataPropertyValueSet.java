/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.DataPropertyValueSet#getSetType <em>Set Type</em>}</li>
 *   <li>{@link projetTemplate.DataPropertyValueSet#getValues <em>Values</em>}</li>
 *   <li>{@link projetTemplate.DataPropertyValueSet#getDatapropertyvalue <em>Datapropertyvalue</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValueSet()
 * @model
 * @generated
 */
public interface DataPropertyValueSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Set Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Type</em>' attribute.
	 * @see #setSetType(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValueSet_SetType()
	 * @model
	 * @generated
	 */
	String getSetType();

	/**
	 * Sets the value of the '{@link projetTemplate.DataPropertyValueSet#getSetType <em>Set Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Type</em>' attribute.
	 * @see #getSetType()
	 * @generated
	 */
	void setSetType(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValueSet_Values()
	 * @model
	 * @generated
	 */
	String getValues();

	/**
	 * Sets the value of the '{@link projetTemplate.DataPropertyValueSet#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(String value);

	/**
	 * Returns the value of the '<em><b>Datapropertyvalue</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.DataPropertyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValueSet_Datapropertyvalue()
	 * @model
	 * @generated
	 */
	EList<DataPropertyValue> getDatapropertyvalue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // DataPropertyValueSet
