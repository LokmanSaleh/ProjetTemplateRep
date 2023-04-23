/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLAlgorithm#getX_selectioncriterionvalueset <em>Xselectioncriterionvalueset</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getX_selectioncriterionvalue <em>Xselectioncriterionvalue</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}</li>
 *   <li>{@link projetTemplate.MLAlgorithm#getCriteriatochoosemlalgorithm <em>Criteriatochoosemlalgorithm</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm()
 * @model
 * @generated
 */
public interface MLAlgorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Xselectioncriterionvalueset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xselectioncriterionvalueset</em>' reference.
	 * @see #setX_selectioncriterionvalueset(SelectionCriterionValueSet)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_X_selectioncriterionvalueset()
	 * @model
	 * @generated
	 */
	SelectionCriterionValueSet getX_selectioncriterionvalueset();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getX_selectioncriterionvalueset <em>Xselectioncriterionvalueset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xselectioncriterionvalueset</em>' reference.
	 * @see #getX_selectioncriterionvalueset()
	 * @generated
	 */
	void setX_selectioncriterionvalueset(SelectionCriterionValueSet value);

	/**
	 * Returns the value of the '<em><b>Xselectioncriterionvalue</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.SelectionCriterionValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xselectioncriterionvalue</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_X_selectioncriterionvalue()
	 * @model
	 * @generated
	 */
	EList<SelectionCriterionValue> getX_selectioncriterionvalue();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extendedbpmnmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extendedbpmnmodel</em>' reference.
	 * @see #setExtendedbpmnmodel(ExtendedBPMNModel)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Extendedbpmnmodel()
	 * @model required="true"
	 * @generated
	 */
	ExtendedBPMNModel getExtendedbpmnmodel();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getExtendedbpmnmodel <em>Extendedbpmnmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extendedbpmnmodel</em>' reference.
	 * @see #getExtendedbpmnmodel()
	 * @generated
	 */
	void setExtendedbpmnmodel(ExtendedBPMNModel value);

	/**
	 * Returns the value of the '<em><b>Criteriatochoosemlalgorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteriatochoosemlalgorithm</em>' reference.
	 * @see #setCriteriatochoosemlalgorithm(MLAlgorithmSelectionCriteriaContainer)
	 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithm_Criteriatochoosemlalgorithm()
	 * @model required="true"
	 * @generated
	 */
	MLAlgorithmSelectionCriteriaContainer getCriteriatochoosemlalgorithm();

	/**
	 * Sets the value of the '{@link projetTemplate.MLAlgorithm#getCriteriatochoosemlalgorithm <em>Criteriatochoosemlalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteriatochoosemlalgorithm</em>' reference.
	 * @see #getCriteriatochoosemlalgorithm()
	 * @generated
	 */
	void setCriteriatochoosemlalgorithm(MLAlgorithmSelectionCriteriaContainer value);

} // MLAlgorithm
