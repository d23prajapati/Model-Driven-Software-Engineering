/**
 */
package embeddedSystem.impl;

import embeddedSystem.Component;
import embeddedSystem.ComponentType;
import embeddedSystem.EmbeddedSystemPackage;
import embeddedSystem.PinGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link embeddedSystem.impl.ComponentImpl#getPinGroups <em>Pin Groups</em>}</li>
 *   <li>{@link embeddedSystem.impl.ComponentImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPinGroups() <em>Pin Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PinGroup> pinGroups;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentType TYPE_EDEFAULT = ComponentType.DIGITAL_SENSOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedSystemPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedSystemPackage.COMPONENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PinGroup> getPinGroups() {
		if (pinGroups == null) {
			pinGroups = new EObjectContainmentEList<PinGroup>(PinGroup.class, this,
					EmbeddedSystemPackage.COMPONENT__PIN_GROUPS);
		}
		return pinGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ComponentType newType) {
		ComponentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedSystemPackage.COMPONENT__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EmbeddedSystemPackage.COMPONENT__PIN_GROUPS:
			return ((InternalEList<?>) getPinGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EmbeddedSystemPackage.COMPONENT__NAME:
			return getName();
		case EmbeddedSystemPackage.COMPONENT__PIN_GROUPS:
			return getPinGroups();
		case EmbeddedSystemPackage.COMPONENT__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EmbeddedSystemPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case EmbeddedSystemPackage.COMPONENT__PIN_GROUPS:
			getPinGroups().clear();
			getPinGroups().addAll((Collection<? extends PinGroup>) newValue);
			return;
		case EmbeddedSystemPackage.COMPONENT__TYPE:
			setType((ComponentType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EmbeddedSystemPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EmbeddedSystemPackage.COMPONENT__PIN_GROUPS:
			getPinGroups().clear();
			return;
		case EmbeddedSystemPackage.COMPONENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EmbeddedSystemPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EmbeddedSystemPackage.COMPONENT__PIN_GROUPS:
			return pinGroups != null && !pinGroups.isEmpty();
		case EmbeddedSystemPackage.COMPONENT__TYPE:
			return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
