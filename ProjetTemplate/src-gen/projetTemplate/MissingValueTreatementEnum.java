/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Missing Value Treatement Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getMissingValueTreatementEnum()
 * @model
 * @generated
 */
public enum MissingValueTreatementEnum implements Enumerator {
	/**
	 * The '<em><b>Replace By Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_BY_MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE_BY_MEAN(0, "ReplaceByMean", "ReplaceByMean"),

	/**
	 * The '<em><b>Replace By Zero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_BY_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE_BY_ZERO(1, "ReplaceByZero", "ReplaceByZero");

	/**
	 * The '<em><b>Replace By Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_BY_MEAN
	 * @model name="ReplaceByMean"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_BY_MEAN_VALUE = 0;

	/**
	 * The '<em><b>Replace By Zero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACE_BY_ZERO
	 * @model name="ReplaceByZero"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_BY_ZERO_VALUE = 1;

	/**
	 * An array of all the '<em><b>Missing Value Treatement Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MissingValueTreatementEnum[] VALUES_ARRAY = new MissingValueTreatementEnum[] { REPLACE_BY_MEAN,
			REPLACE_BY_ZERO, };

	/**
	 * A public read-only list of all the '<em><b>Missing Value Treatement Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MissingValueTreatementEnum> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Missing Value Treatement Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MissingValueTreatementEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MissingValueTreatementEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Missing Value Treatement Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MissingValueTreatementEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MissingValueTreatementEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Missing Value Treatement Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MissingValueTreatementEnum get(int value) {
		switch (value) {
		case REPLACE_BY_MEAN_VALUE:
			return REPLACE_BY_MEAN;
		case REPLACE_BY_ZERO_VALUE:
			return REPLACE_BY_ZERO;
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
	private MissingValueTreatementEnum(int value, String name, String literal) {
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

} //MissingValueTreatementEnum
