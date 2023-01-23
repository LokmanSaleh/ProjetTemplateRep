/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Remove Uncessary Fileds Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getRemoveUncessaryFiledsEnum()
 * @model
 * @generated
 */
public enum RemoveUncessaryFiledsEnum implements Enumerator {
	/**
	 * The '<em><b>Remove IDs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_IDS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_IDS(0, "removeIDs", "removeIDs"),

	/**
	 * The '<em><b>Remove Special Characters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_SPECIAL_CHARACTERS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_SPECIAL_CHARACTERS(1, "removeSpecialCharacters", "removeSpecialCharacters");

	/**
	 * The '<em><b>Remove IDs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_IDS
	 * @model name="removeIDs"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_IDS_VALUE = 0;

	/**
	 * The '<em><b>Remove Special Characters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_SPECIAL_CHARACTERS
	 * @model name="removeSpecialCharacters"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_SPECIAL_CHARACTERS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Remove Uncessary Fileds Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RemoveUncessaryFiledsEnum[] VALUES_ARRAY = new RemoveUncessaryFiledsEnum[] { REMOVE_IDS,
			REMOVE_SPECIAL_CHARACTERS, };

	/**
	 * A public read-only list of all the '<em><b>Remove Uncessary Fileds Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RemoveUncessaryFiledsEnum> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Remove Uncessary Fileds Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RemoveUncessaryFiledsEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RemoveUncessaryFiledsEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Remove Uncessary Fileds Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RemoveUncessaryFiledsEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RemoveUncessaryFiledsEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Remove Uncessary Fileds Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RemoveUncessaryFiledsEnum get(int value) {
		switch (value) {
		case REMOVE_IDS_VALUE:
			return REMOVE_IDS;
		case REMOVE_SPECIAL_CHARACTERS_VALUE:
			return REMOVE_SPECIAL_CHARACTERS;
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
	private RemoveUncessaryFiledsEnum(int value, String name, String literal) {
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

} //RemoveUncessaryFiledsEnum
