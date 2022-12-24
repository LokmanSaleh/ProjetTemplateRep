/**
 */
package projetTemplate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.Database#getValue <em>Value</em>}</li>
 *   <li>{@link projetTemplate.Database#getCredentias <em>Credentias</em>}</li>
 *   <li>{@link projetTemplate.Database#getSchema <em>Schema</em>}</li>
 *   <li>{@link projetTemplate.Database#getData <em>Data</em>}</li>
 *   <li>{@link projetTemplate.Database#getMlproject <em>Mlproject</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDatabase_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link projetTemplate.Database#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Credentias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentias</em>' attribute.
	 * @see #setCredentias(String)
	 * @see projetTemplate.ProjetTemplatePackage#getDatabase_Credentias()
	 * @model
	 * @generated
	 */
	String getCredentias();

	/**
	 * Sets the value of the '{@link projetTemplate.Database#getCredentias <em>Credentias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credentias</em>' attribute.
	 * @see #getCredentias()
	 * @generated
	 */
	void setCredentias(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' reference.
	 * @see #setSchema(Schema)
	 * @see projetTemplate.ProjetTemplatePackage#getDatabase_Schema()
	 * @model required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link projetTemplate.Database#getSchema <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see projetTemplate.ProjetTemplatePackage#getDatabase_Data()
	 * @model required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link projetTemplate.Database#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Mlproject</b></em>' reference list.
	 * The list contents are of type {@link projetTemplate.MLProject}.
	 * It is bidirectional and its opposite is '{@link projetTemplate.MLProject#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlproject</em>' reference list.
	 * @see projetTemplate.ProjetTemplatePackage#getDatabase_Mlproject()
	 * @see projetTemplate.MLProject#getDatabase
	 * @model opposite="database"
	 * @generated
	 */
	EList<MLProject> getMlproject();

} // Database
