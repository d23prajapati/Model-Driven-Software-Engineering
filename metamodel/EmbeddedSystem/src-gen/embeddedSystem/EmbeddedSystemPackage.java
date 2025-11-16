/**
 */
package embeddedSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see embeddedSystem.EmbeddedSystemFactory
 * @model kind="package"
 * @generated
 */
public interface EmbeddedSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "embeddedSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/embeddedSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "embeddedSystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmbeddedSystemPackage eINSTANCE = embeddedSystem.impl.EmbeddedSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.SystemModelImpl <em>System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.SystemModelImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getSystemModel()
	 * @generated
	 */
	int SYSTEM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>System Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__SYSTEM_STRUCTURES = 1;

	/**
	 * The feature id for the '<em><b>System Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL__SYSTEM_BEHAVIORS = 2;

	/**
	 * The number of structural features of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.SystemStructureImpl <em>System Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.SystemStructureImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getSystemStructure()
	 * @generated
	 */
	int SYSTEM_STRUCTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__BOARD = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__COMPONENTS = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE__CONNECTIONS = 3;

	/**
	 * The number of structural features of the '<em>System Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.SystemBehaviorImpl <em>System Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.SystemBehaviorImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getSystemBehavior()
	 * @generated
	 */
	int SYSTEM_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>System Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.BoardImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__PIN_GROUPS = 1;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.ComponentImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pin Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PIN_GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.PinGroupImpl <em>Pin Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.PinGroupImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getPinGroup()
	 * @generated
	 */
	int PIN_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Pins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP__PINS = 0;

	/**
	 * The number of structural features of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pin Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.PinImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 6;

	/**
	 * The feature id for the '<em><b>Pin Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PIN_NR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.impl.ConnectionImpl
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SRC = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link embeddedSystem.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.ComponentType
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 8;

	/**
	 * The meta object id for the '{@link embeddedSystem.PinType <em>Pin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see embeddedSystem.PinType
	 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getPinType()
	 * @generated
	 */
	int PIN_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link embeddedSystem.SystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Model</em>'.
	 * @see embeddedSystem.SystemModel
	 * @generated
	 */
	EClass getSystemModel();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.SystemModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embeddedSystem.SystemModel#getName()
	 * @see #getSystemModel()
	 * @generated
	 */
	EAttribute getSystemModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link embeddedSystem.SystemModel#getSystemStructures <em>System Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Structures</em>'.
	 * @see embeddedSystem.SystemModel#getSystemStructures()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_SystemStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link embeddedSystem.SystemModel#getSystemBehaviors <em>System Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Behaviors</em>'.
	 * @see embeddedSystem.SystemModel#getSystemBehaviors()
	 * @see #getSystemModel()
	 * @generated
	 */
	EReference getSystemModel_SystemBehaviors();

	/**
	 * Returns the meta object for class '{@link embeddedSystem.SystemStructure <em>System Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Structure</em>'.
	 * @see embeddedSystem.SystemStructure
	 * @generated
	 */
	EClass getSystemStructure();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.SystemStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embeddedSystem.SystemStructure#getName()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EAttribute getSystemStructure_Name();

	/**
	 * Returns the meta object for the containment reference '{@link embeddedSystem.SystemStructure#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see embeddedSystem.SystemStructure#getBoard()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link embeddedSystem.SystemStructure#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see embeddedSystem.SystemStructure#getComponents()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link embeddedSystem.SystemStructure#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see embeddedSystem.SystemStructure#getConnections()
	 * @see #getSystemStructure()
	 * @generated
	 */
	EReference getSystemStructure_Connections();

	/**
	 * Returns the meta object for class '{@link embeddedSystem.SystemBehavior <em>System Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Behavior</em>'.
	 * @see embeddedSystem.SystemBehavior
	 * @generated
	 */
	EClass getSystemBehavior();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.SystemBehavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embeddedSystem.SystemBehavior#getName()
	 * @see #getSystemBehavior()
	 * @generated
	 */
	EAttribute getSystemBehavior_Name();

	/**
	 * Returns the meta object for class '{@link embeddedSystem.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see embeddedSystem.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.Board#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embeddedSystem.Board#getName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link embeddedSystem.Board#getPinGroups <em>Pin Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Groups</em>'.
	 * @see embeddedSystem.Board#getPinGroups()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_PinGroups();

	/**
	 * Returns the meta object for class '{@link embeddedSystem.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see embeddedSystem.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embeddedSystem.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link embeddedSystem.Component#getPinGroups <em>Pin Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Groups</em>'.
	 * @see embeddedSystem.Component#getPinGroups()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_PinGroups();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see embeddedSystem.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for class '{@link embeddedSystem.PinGroup <em>Pin Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Group</em>'.
	 * @see embeddedSystem.PinGroup
	 * @generated
	 */
	EClass getPinGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link embeddedSystem.PinGroup#getPins <em>Pins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pins</em>'.
	 * @see embeddedSystem.PinGroup#getPins()
	 * @see #getPinGroup()
	 * @generated
	 */
	EReference getPinGroup_Pins();

	/**
	 * Returns the meta object for class '{@link embeddedSystem.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see embeddedSystem.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.Pin#getPinNr <em>Pin Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Nr</em>'.
	 * @see embeddedSystem.Pin#getPinNr()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_PinNr();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.Pin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see embeddedSystem.Pin#getName()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Name();

	/**
	 * Returns the meta object for the attribute '{@link embeddedSystem.Pin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see embeddedSystem.Pin#getType()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Type();

	/**
	 * Returns the meta object for class '{@link embeddedSystem.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see embeddedSystem.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link embeddedSystem.Connection#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see embeddedSystem.Connection#getSrc()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Src();

	/**
	 * Returns the meta object for the reference '{@link embeddedSystem.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see embeddedSystem.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for enum '{@link embeddedSystem.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see embeddedSystem.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the meta object for enum '{@link embeddedSystem.PinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Type</em>'.
	 * @see embeddedSystem.PinType
	 * @generated
	 */
	EEnum getPinType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmbeddedSystemFactory getEmbeddedSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.SystemModelImpl <em>System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.SystemModelImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getSystemModel()
		 * @generated
		 */
		EClass SYSTEM_MODEL = eINSTANCE.getSystemModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_MODEL__NAME = eINSTANCE.getSystemModel_Name();

		/**
		 * The meta object literal for the '<em><b>System Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__SYSTEM_STRUCTURES = eINSTANCE.getSystemModel_SystemStructures();

		/**
		 * The meta object literal for the '<em><b>System Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_MODEL__SYSTEM_BEHAVIORS = eINSTANCE.getSystemModel_SystemBehaviors();

		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.SystemStructureImpl <em>System Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.SystemStructureImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getSystemStructure()
		 * @generated
		 */
		EClass SYSTEM_STRUCTURE = eINSTANCE.getSystemStructure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_STRUCTURE__NAME = eINSTANCE.getSystemStructure_Name();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__BOARD = eINSTANCE.getSystemStructure_Board();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__COMPONENTS = eINSTANCE.getSystemStructure_Components();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_STRUCTURE__CONNECTIONS = eINSTANCE.getSystemStructure_Connections();

		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.SystemBehaviorImpl <em>System Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.SystemBehaviorImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getSystemBehavior()
		 * @generated
		 */
		EClass SYSTEM_BEHAVIOR = eINSTANCE.getSystemBehavior();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_BEHAVIOR__NAME = eINSTANCE.getSystemBehavior_Name();

		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.BoardImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();

		/**
		 * The meta object literal for the '<em><b>Pin Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__PIN_GROUPS = eINSTANCE.getBoard_PinGroups();

		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.ComponentImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Pin Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PIN_GROUPS = eINSTANCE.getComponent_PinGroups();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.PinGroupImpl <em>Pin Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.PinGroupImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getPinGroup()
		 * @generated
		 */
		EClass PIN_GROUP = eINSTANCE.getPinGroup();

		/**
		 * The meta object literal for the '<em><b>Pins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIN_GROUP__PINS = eINSTANCE.getPinGroup_Pins();

		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.PinImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Pin Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__PIN_NR = eINSTANCE.getPin_PinNr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NAME = eINSTANCE.getPin_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__TYPE = eINSTANCE.getPin_Type();

		/**
		 * The meta object literal for the '{@link embeddedSystem.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.impl.ConnectionImpl
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SRC = eINSTANCE.getConnection_Src();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link embeddedSystem.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.ComponentType
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '{@link embeddedSystem.PinType <em>Pin Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see embeddedSystem.PinType
		 * @see embeddedSystem.impl.EmbeddedSystemPackageImpl#getPinType()
		 * @generated
		 */
		EEnum PIN_TYPE = eINSTANCE.getPinType();

	}

} //EmbeddedSystemPackage
