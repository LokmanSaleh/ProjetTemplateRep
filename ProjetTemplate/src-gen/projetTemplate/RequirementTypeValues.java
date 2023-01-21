/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Type Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getRequirementTypeValues()
 * @model
 * @generated
 */
public enum RequirementTypeValues implements Enumerator {
	/**
	 * The '<em><b>Explinability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLINABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLINABILITY(0, "Explinability", "Explinability"),

	/**
	 * The '<em><b>Accuracy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCURACY_VALUE
	 * @generated
	 * @ordered
	 */
	ACCURACY(1, "Accuracy", "Accuracy");

	/**
	 * The '<em><b>Explinability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLINABILITY
	 * @model name="Explinability"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLINABILITY_VALUE = 0;

	/**
	 * The '<em><b>Accuracy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCURACY
	 * @model name="Accuracy"
	 * @generated
	 * @ordered
	 */
	public static final int ACCURACY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Requirement Type Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementTypeValues[] VALUES_ARRAY = new RequirementTypeValues[] { EXPLINABILITY,
			ACCURACY, };

	/**
	 * A public read-only list of all the '<em><b>Requirement Type Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementTypeValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Type Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementTypeValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementTypeValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Type Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementTypeValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementTypeValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Type Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementTypeValues get(int value) {
		switch (value) {
		case EXPLINABILITY_VALUE:
			return EXPLINABILITY;
		case ACCURACY_VALUE:
			return ACCURACY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RequirementTypeValues(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //RequirementTypeValues
