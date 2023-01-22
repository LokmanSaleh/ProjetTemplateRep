/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Data Analysis Problem Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getEnumDataAnalysisProblemType()
 * @model
 * @generated
 */
public enum EnumDataAnalysisProblemType implements Enumerator {
	/**
	 * The '<em><b>Classification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFICATION(0, "Classification", "Classification"),

	/**
	 * The '<em><b>Regression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGRESSION(1, "Regression", "Regression"),

	/**
	 * The '<em><b>Clustering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTERING(2, "Clustering", "Clustering"),

	/**
	 * The '<em><b>Feature construction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_CONSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_CONSTRUCTION(3, "Feature_construction", "Feature_construction");

	/**
	 * The '<em><b>Classification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION
	 * @model name="Classification"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFICATION_VALUE = 0;

	/**
	 * The '<em><b>Regression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION
	 * @model name="Regression"
	 * @generated
	 * @ordered
	 */
	public static final int REGRESSION_VALUE = 1;

	/**
	 * The '<em><b>Clustering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING
	 * @model name="Clustering"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTERING_VALUE = 2;

	/**
	 * The '<em><b>Feature construction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_CONSTRUCTION
	 * @model name="Feature_construction"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_CONSTRUCTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Enum Data Analysis Problem Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumDataAnalysisProblemType[] VALUES_ARRAY = new EnumDataAnalysisProblemType[] {
			CLASSIFICATION, REGRESSION, CLUSTERING, FEATURE_CONSTRUCTION, };

	/**
	 * A public read-only list of all the '<em><b>Enum Data Analysis Problem Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumDataAnalysisProblemType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Data Analysis Problem Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumDataAnalysisProblemType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDataAnalysisProblemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Data Analysis Problem Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumDataAnalysisProblemType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDataAnalysisProblemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Data Analysis Problem Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumDataAnalysisProblemType get(int value) {
		switch (value) {
		case CLASSIFICATION_VALUE:
			return CLASSIFICATION;
		case REGRESSION_VALUE:
			return REGRESSION;
		case CLUSTERING_VALUE:
			return CLUSTERING;
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
	private EnumDataAnalysisProblemType(int value, String name, String literal) {
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

} //EnumDataAnalysisProblemType
