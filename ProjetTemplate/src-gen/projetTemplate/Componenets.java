/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Componenets</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getComponenets()
 * @model
 * @generated
 */
public enum Componenets implements Enumerator {
	/**
	 * The '<em><b>Data Pre Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PRE_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_PRE_PROCESSING(0, "DataPreProcessing", "DataPreProcessing"),

	/**
	 * The '<em><b>Data Separation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_SEPARATION_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_SEPARATION(1, "DataSeparation", "DataSeparation"),

	/**
	 * The '<em><b>Model Construction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_CONSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL_CONSTRUCTION(2, "ModelConstruction", "ModelConstruction"),

	/**
	 * The '<em><b>Feature Selection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_SELECTION(3, "FeatureSelection", "FeatureSelection"),

	/**
	 * The '<em><b>Feature Construction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_CONSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_CONSTRUCTION(4, "FeatureConstruction", "FeatureConstruction");

	/**
	 * The '<em><b>Data Pre Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_PRE_PROCESSING
	 * @model name="DataPreProcessing"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_PRE_PROCESSING_VALUE = 0;

	/**
	 * The '<em><b>Data Separation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_SEPARATION
	 * @model name="DataSeparation"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_SEPARATION_VALUE = 1;

	/**
	 * The '<em><b>Model Construction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_CONSTRUCTION
	 * @model name="ModelConstruction"
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_CONSTRUCTION_VALUE = 2;

	/**
	 * The '<em><b>Feature Selection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_SELECTION
	 * @model name="FeatureSelection"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_SELECTION_VALUE = 3;

	/**
	 * The '<em><b>Feature Construction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_CONSTRUCTION
	 * @model name="FeatureConstruction"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_CONSTRUCTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Componenets</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Componenets[] VALUES_ARRAY = new Componenets[] { DATA_PRE_PROCESSING, DATA_SEPARATION,
			MODEL_CONSTRUCTION, FEATURE_SELECTION, FEATURE_CONSTRUCTION, };

	/**
	 * A public read-only list of all the '<em><b>Componenets</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Componenets> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Componenets</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Componenets get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Componenets result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Componenets</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Componenets getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Componenets result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Componenets</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Componenets get(int value) {
		switch (value) {
		case DATA_PRE_PROCESSING_VALUE:
			return DATA_PRE_PROCESSING;
		case DATA_SEPARATION_VALUE:
			return DATA_SEPARATION;
		case MODEL_CONSTRUCTION_VALUE:
			return MODEL_CONSTRUCTION;
		case FEATURE_SELECTION_VALUE:
			return FEATURE_SELECTION;
		case FEATURE_CONSTRUCTION_VALUE:
			return FEATURE_CONSTRUCTION;
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
	private Componenets(int value, String name, String literal) {
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

} //Componenets
