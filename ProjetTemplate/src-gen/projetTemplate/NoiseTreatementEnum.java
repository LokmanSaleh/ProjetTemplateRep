/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Noise Treatement Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getNoiseTreatementEnum()
 * @model
 * @generated
 */
public enum NoiseTreatementEnum implements Enumerator {
	/**
	 * The '<em><b>Remove Noise From Fileds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NOISE_FROM_FILEDS_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE_NOISE_FROM_FILEDS(0, "removeNoiseFromFileds", "removeNoiseFromFileds");

	/**
	 * The '<em><b>Remove Noise From Fileds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_NOISE_FROM_FILEDS
	 * @model name="removeNoiseFromFileds"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_NOISE_FROM_FILEDS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Noise Treatement Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoiseTreatementEnum[] VALUES_ARRAY = new NoiseTreatementEnum[] { REMOVE_NOISE_FROM_FILEDS, };

	/**
	 * A public read-only list of all the '<em><b>Noise Treatement Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoiseTreatementEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Noise Treatement Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoiseTreatementEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoiseTreatementEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Noise Treatement Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoiseTreatementEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoiseTreatementEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Noise Treatement Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoiseTreatementEnum get(int value) {
		switch (value) {
		case REMOVE_NOISE_FROM_FILEDS_VALUE:
			return REMOVE_NOISE_FROM_FILEDS;
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
	private NoiseTreatementEnum(int value, String name, String literal) {
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

} //NoiseTreatementEnum
