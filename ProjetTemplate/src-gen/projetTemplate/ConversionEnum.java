/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conversion Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getConversionEnum()
 * @model
 * @generated
 */
public enum ConversionEnum implements Enumerator {
	/**
	 * The '<em><b>Convert Categorical Attributes To Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE(0, "convertCategoricalAttributesToContinue",
			"convertCategoricalAttributesToContinue"),

	/**
	 * The '<em><b>Convert Continue Attributes To Categorical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL(1, "convertContinueAttributesToCategorical",
			"convertContinueAttributesToCategorical"),

	/**
	 * The '<em><b>Detect Attribute Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECT_ATTRIBUTE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DETECT_ATTRIBUTE_TYPE(2, "detectAttributeType", "detectAttributeType");

	/**
	 * The '<em><b>Convert Categorical Attributes To Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE
	 * @model name="convertCategoricalAttributesToContinue"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE_VALUE = 0;

	/**
	 * The '<em><b>Convert Continue Attributes To Categorical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL
	 * @model name="convertContinueAttributesToCategorical"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL_VALUE = 1;

	/**
	 * The '<em><b>Detect Attribute Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECT_ATTRIBUTE_TYPE
	 * @model name="detectAttributeType"
	 * @generated
	 * @ordered
	 */
	public static final int DETECT_ATTRIBUTE_TYPE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Conversion Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConversionEnum[] VALUES_ARRAY = new ConversionEnum[] {
			CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE, CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL,
			DETECT_ATTRIBUTE_TYPE, };

	/**
	 * A public read-only list of all the '<em><b>Conversion Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConversionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conversion Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConversionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConversionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conversion Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConversionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConversionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conversion Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConversionEnum get(int value) {
		switch (value) {
		case CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE_VALUE:
			return CONVERT_CATEGORICAL_ATTRIBUTES_TO_CONTINUE;
		case CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL_VALUE:
			return CONVERT_CONTINUE_ATTRIBUTES_TO_CATEGORICAL;
		case DETECT_ATTRIBUTE_TYPE_VALUE:
			return DETECT_ATTRIBUTE_TYPE;
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
	private ConversionEnum(int value, String name, String literal) {
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

} //ConversionEnum
