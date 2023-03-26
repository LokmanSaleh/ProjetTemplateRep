/**
 */
package projetTemplate.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projetTemplate.CollectedDataKnowledgeAboutTemplateConstruction;
import projetTemplate.ProjetTemplatePackage;
import projetTemplate.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collected Data Knowledge About Template Construction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.impl.CollectedDataKnowledgeAboutTemplateConstructionImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectedDataKnowledgeAboutTemplateConstructionImpl extends MinimalEObjectImpl.Container
		implements CollectedDataKnowledgeAboutTemplateConstruction {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectedDataKnowledgeAboutTemplateConstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetTemplatePackage.Literals.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectResolvingEList<Rule>(Rule.class, this,
					ProjetTemplatePackage.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetTemplatePackage.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE:
			return getRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjetTemplatePackage.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE:
			getRule().clear();
			getRule().addAll((Collection<? extends Rule>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjetTemplatePackage.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE:
			getRule().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjetTemplatePackage.COLLECTED_DATA_KNOWLEDGE_ABOUT_TEMPLATE_CONSTRUCTION__RULE:
			return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectedDataKnowledgeAboutTemplateConstructionImpl
