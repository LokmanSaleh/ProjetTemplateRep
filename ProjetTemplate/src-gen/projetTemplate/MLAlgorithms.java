/**
 */
package projetTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ML Algorithms</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see projetTemplate.ProjetTemplatePackage#getMLAlgorithms()
 * @model
 * @generated
 */
public enum MLAlgorithms implements Enumerator {
	/**
	 * The '<em><b>Naive Bayes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAIVE_BAYES_VALUE
	 * @generated
	 * @ordered
	 */
	NAIVE_BAYES(0, "NaiveBayes", "NaiveBayes"),

	/**
	 * The '<em><b>Decision Tree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_TREE_VALUE
	 * @generated
	 * @ordered
	 */
	DECISION_TREE(1, "DecisionTree", "DecisionTree"),

	/**
	 * The '<em><b>KNN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNN_VALUE
	 * @generated
	 * @ordered
	 */
	KNN(2, "KNN", "KNN"),

	/**
	 * The '<em><b>Bayesian Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAYESIAN_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	BAYESIAN_NETWORK(3, "BayesianNetwork", "BayesianNetwork"),

	/**
	 * The '<em><b>Neural Netrowk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEURAL_NETROWK_VALUE
	 * @generated
	 * @ordered
	 */
	NEURAL_NETROWK(4, "NeuralNetrowk", "NeuralNetrowk"),

	/**
	 * The '<em><b>SVM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVM_VALUE
	 * @generated
	 * @ordered
	 */
	SVM(5, "SVM", "SVM");

	/**
	 * The '<em><b>Naive Bayes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAIVE_BAYES
	 * @model name="NaiveBayes"
	 * @generated
	 * @ordered
	 */
	public static final int NAIVE_BAYES_VALUE = 0;

	/**
	 * The '<em><b>Decision Tree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECISION_TREE
	 * @model name="DecisionTree"
	 * @generated
	 * @ordered
	 */
	public static final int DECISION_TREE_VALUE = 1;

	/**
	 * The '<em><b>KNN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KNN_VALUE = 2;

	/**
	 * The '<em><b>Bayesian Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAYESIAN_NETWORK
	 * @model name="BayesianNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int BAYESIAN_NETWORK_VALUE = 3;

	/**
	 * The '<em><b>Neural Netrowk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEURAL_NETROWK
	 * @model name="NeuralNetrowk"
	 * @generated
	 * @ordered
	 */
	public static final int NEURAL_NETROWK_VALUE = 4;

	/**
	 * The '<em><b>SVM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVM_VALUE = 5;

	/**
	 * An array of all the '<em><b>ML Algorithms</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MLAlgorithms[] VALUES_ARRAY = new MLAlgorithms[] { NAIVE_BAYES, DECISION_TREE, KNN,
			BAYESIAN_NETWORK, NEURAL_NETROWK, SVM, };

	/**
	 * A public read-only list of all the '<em><b>ML Algorithms</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MLAlgorithms> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ML Algorithms</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLAlgorithms get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MLAlgorithms result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ML Algorithms</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLAlgorithms getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MLAlgorithms result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ML Algorithms</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MLAlgorithms get(int value) {
		switch (value) {
		case NAIVE_BAYES_VALUE:
			return NAIVE_BAYES;
		case DECISION_TREE_VALUE:
			return DECISION_TREE;
		case KNN_VALUE:
			return KNN;
		case BAYESIAN_NETWORK_VALUE:
			return BAYESIAN_NETWORK;
		case NEURAL_NETROWK_VALUE:
			return NEURAL_NETROWK;
		case SVM_VALUE:
			return SVM;
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
	private MLAlgorithms(int value, String name, String literal) {
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

} //MLAlgorithms
