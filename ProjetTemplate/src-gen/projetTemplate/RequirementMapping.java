/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.RequirementMapping#getRestrictions <em>Restrictions</em>}</li>
 *   <li>{@link projetTemplate.RequirementMapping#getRationale <em>Rationale</em>}</li>
 *   <li>{@link projetTemplate.RequirementMapping#getRequirementtype <em>Requirementtype</em>}</li>
 *   <li>{@link projetTemplate.RequirementMapping#getDatapropertyvalueset <em>Datapropertyvalueset</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getRequirementMapping()
 * @model
 * @generated
 */
public interface RequirementMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Restrictions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions</em>' attribute.
	 * @see #setRestrictions(String)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementMapping_Restrictions()
	 * @model
	 * @generated
	 */
	String getRestrictions();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementMapping#getRestrictions <em>Restrictions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrictions</em>' attribute.
	 * @see #getRestrictions()
	 * @generated
	 */
	void setRestrictions(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementMapping_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementMapping#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Requirementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirementtype</em>' reference.
	 * @see #setRequirementtype(RequirementType)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementMapping_Requirementtype()
	 * @model required="true"
	 * @generated
	 */
	RequirementType getRequirementtype();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementMapping#getRequirementtype <em>Requirementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirementtype</em>' reference.
	 * @see #getRequirementtype()
	 * @generated
	 */
	void setRequirementtype(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Datapropertyvalueset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalueset</em>' reference.
	 * @see #setDatapropertyvalueset(DataPropertyValueSet)
	 * @see projetTemplate.ProjetTemplatePackage#getRequirementMapping_Datapropertyvalueset()
	 * @model required="true"
	 * @generated
	 */
	DataPropertyValueSet getDatapropertyvalueset();

	/**
	 * Sets the value of the '{@link projetTemplate.RequirementMapping#getDatapropertyvalueset <em>Datapropertyvalueset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datapropertyvalueset</em>' reference.
	 * @see #getDatapropertyvalueset()
	 * @generated
	 */
	void setDatapropertyvalueset(DataPropertyValueSet value);

} // RequirementMapping
