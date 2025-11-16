/**
 */
package embeddedSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.Component#getName <em>Name</em>}</li>
 *   <li>{@link embeddedSystem.Component#getPinGroups <em>Pin Groups</em>}</li>
 *   <li>{@link embeddedSystem.Component#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see embeddedSystem.EmbeddedSystemPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link embeddedSystem.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pin Groups</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.PinGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Groups</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getComponent_PinGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinGroup> getPinGroups();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link embeddedSystem.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see embeddedSystem.ComponentType
	 * @see #setType(ComponentType)
	 * @see embeddedSystem.EmbeddedSystemPackage#getComponent_Type()
	 * @model
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link embeddedSystem.Component#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see embeddedSystem.ComponentType
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

} // Component
