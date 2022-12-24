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
 *   <li>{@link projetTemplate.DataPropertyValueSet#getMlalgorithmsolutionpattern <em>Mlalgorithmsolutionpattern</em>}</li>
 *   <li>{@link projetTemplate.DataPropertyValueSet#getMlprocchainsolutionpattern <em>Mlprocchainsolutionpattern</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link projetTemplate.DataPropertyValue#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapropertyvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValueSet_Datapropertyvalue()
	 * @see projetTemplate.DataPropertyValue#getDatapropertyvalueset
	 * @model opposite="datapropertyvalueset"
	 * @generated
	 */
	EList<DataPropertyValue> getDatapropertyvalue();

	/**
	 * Returns the value of the '<em><b>Mlalgorithmsolutionpattern</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLAlgorithmSolutionPattern}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.MLAlgorithmSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlalgorithmsolutionpattern</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValueSet_Mlalgorithmsolutionpattern()
	 * @see projetTemplate.MLAlgorithmSolutionPattern#getDatapropertyvalueset
	 * @model opposite="datapropertyvalueset"
	 * @generated
	 */
	EList<MLAlgorithmSolutionPattern> getMlalgorithmsolutionpattern();

	/**
	 * Returns the value of the '<em><b>Mlprocchainsolutionpattern</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLProcChainSolutionPattern}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.MLProcChainSolutionPattern#getDatapropertyvalueset <em>Datapropertyvalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlprocchainsolutionpattern</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDataPropertyValueSet_Mlprocchainsolutionpattern()
	 * @see projetTemplate.MLProcChainSolutionPattern#getDatapropertyvalueset
	 * @model opposite="datapropertyvalueset"
	 * @generated
	 */
	EList<MLProcChainSolutionPattern> getMlprocchainsolutionpattern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void evaluate();

} // DataPropertyValueSet
