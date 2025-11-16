/**
 */
package embeddedSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.SystemStructure#getName <em>Name</em>}</li>
 *   <li>{@link embeddedSystem.SystemStructure#getBoard <em>Board</em>}</li>
 *   <li>{@link embeddedSystem.SystemStructure#getComponents <em>Components</em>}</li>
 *   <li>{@link embeddedSystem.SystemStructure#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure()
 * @model
 * @generated
 */
public interface SystemStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link embeddedSystem.SystemStructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure_Board()
	 * @model containment="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link embeddedSystem.SystemStructure#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getSystemStructure_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // SystemStructure
