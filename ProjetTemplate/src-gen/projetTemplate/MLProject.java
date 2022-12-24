/**
 */
package projetTemplate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projetTemplate.MLProject#getName <em>Name</em>}</li>
 *   <li>{@link projetTemplate.MLProject#getDate <em>Date</em>}</li>
 *   <li>{@link projetTemplate.MLProject#getAuthor <em>Author</em>}</li>
 *   <li>{@link projetTemplate.MLProject#getDataanalysisproblem <em>Dataanalysisproblem</em>}</li>
 *   <li>{@link projetTemplate.MLProject#getDomainproblem <em>Domainproblem</em>}</li>
 *   <li>{@link projetTemplate.MLProject#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see projetTemplate.ProjetTemplatePackage#getMLProject()
 * @model
 * @generated
 */
public interface MLProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProject_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProject#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProject_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProject#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Dataanalysisproblem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataanalysisproblem</em>' reference.
	 * @see #setDataanalysisproblem(DataAnalysisProblem)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProject_Dataanalysisproblem()
	 * @model required="true"
	 * @generated
	 */
	DataAnalysisProblem getDataanalysisproblem();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProject#getDataanalysisproblem <em>Dataanalysisproblem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataanalysisproblem</em>' reference.
	 * @see #getDataanalysisproblem()
	 * @generated
	 */
	void setDataanalysisproblem(DataAnalysisProblem value);

	/**
	 * Returns the value of the '<em><b>Domainproblem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainproblem</em>' reference.
	 * @see #setDomainproblem(DomainProblem)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProject_Domainproblem()
	 * @model required="true"
	 * @generated
	 */
	DomainProblem getDomainproblem();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProject#getDomainproblem <em>Domainproblem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domainproblem</em>' reference.
	 * @see #getDomainproblem()
	 * @generated
	 */
	void setDomainproblem(DomainProblem value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link projetTemplate.Database#getMlproject <em>Mlproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(Database)
	 * @see projetTemplate.ProjetTemplatePackage#getMLProject_Database()
	 * @see projetTemplate.Database#getMlproject
	 * @model opposite="mlproject" required="true"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link projetTemplate.MLProject#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

} // MLProject
