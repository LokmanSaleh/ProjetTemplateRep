/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explainability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Explainability#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getExplainability()
 * @model
 * @generated
 */
public interface Explainability extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link projetTemplate.Values1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see projetTemplate.Values1
	 * @see #setValue(Values1)
	 * @see projetTemplate.ProjetTemplatePackage#getExplainability_Value()
	 * @model
	 * @generated
	 */
	Values1 getValue();

	/**
	 * Sets the value of the '{@link projetTemplate.Explainability#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see projetTemplate.Values1
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Values1 value);

} // Explainability
