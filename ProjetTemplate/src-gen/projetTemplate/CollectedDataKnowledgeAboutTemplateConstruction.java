/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collected Data Knowledge About Template Construction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getCollectedDataKnowledgeAboutTemplateConstruction()
 * @model
 * @generated
 */
public interface CollectedDataKnowledgeAboutTemplateConstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getCollectedDataKnowledgeAboutTemplateConstruction_Rule()
	 * @model
	 * @generated
	 */
	EList<Rule> getRule();

} // CollectedDataKnowledgeAboutTemplateConstruction
