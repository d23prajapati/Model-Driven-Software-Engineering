/**
 */
package embeddedSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.PinGroup#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @see embeddedSystem.EmbeddedSystemPackage#getPinGroup()
 * @model
 * @generated
 */
public interface PinGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link embeddedSystem.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see embeddedSystem.EmbeddedSystemPackage#getPinGroup_Pins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pin> getPins();

} // PinGroup
