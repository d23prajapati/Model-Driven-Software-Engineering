/**
 */
package embeddedSystem.impl;

import embeddedSystem.EmbeddedSystemPackage;
import embeddedSystem.SystemBehavior;
import embeddedSystem.SystemModel;
import embeddedSystem.SystemStructure;

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
 * An implementation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link embeddedSystem.impl.SystemModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link embeddedSystem.impl.SystemModelImpl#getSystemStructures <em>System Structures</em>}</li>
 *   <li>{@link embeddedSystem.impl.SystemModelImpl#getSystemBehaviors <em>System Behaviors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemModelImpl extends MinimalEObjectImpl.Container implements SystemModel {
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
	 * The cached value of the '{@link #getSystemStructures() <em>System Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemStructure> systemStructures;

	/**
	 * The cached value of the '{@link #getSystemBehaviors() <em>System Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemBehavior> systemBehaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedSystemPackage.Literals.SYSTEM_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedSystemPackage.SYSTEM_MODEL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemStructure> getSystemStructures() {
		if (systemStructures == null) {
			systemStructures = new EObjectContainmentEList<SystemStructure>(SystemStructure.class, this,
					EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_STRUCTURES);
		}
		return systemStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemBehavior> getSystemBehaviors() {
		if (systemBehaviors == null) {
			systemBehaviors = new EObjectContainmentEList<SystemBehavior>(SystemBehavior.class, this,
					EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_BEHAVIORS);
		}
		return systemBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_STRUCTURES:
			return ((InternalEList<?>) getSystemStructures()).basicRemove(otherEnd, msgs);
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_BEHAVIORS:
			return ((InternalEList<?>) getSystemBehaviors()).basicRemove(otherEnd, msgs);
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
		case EmbeddedSystemPackage.SYSTEM_MODEL__NAME:
			return getName();
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_STRUCTURES:
			return getSystemStructures();
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_BEHAVIORS:
			return getSystemBehaviors();
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
		case EmbeddedSystemPackage.SYSTEM_MODEL__NAME:
			setName((String) newValue);
			return;
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_STRUCTURES:
			getSystemStructures().clear();
			getSystemStructures().addAll((Collection<? extends SystemStructure>) newValue);
			return;
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_BEHAVIORS:
			getSystemBehaviors().clear();
			getSystemBehaviors().addAll((Collection<? extends SystemBehavior>) newValue);
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
		case EmbeddedSystemPackage.SYSTEM_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_STRUCTURES:
			getSystemStructures().clear();
			return;
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_BEHAVIORS:
			getSystemBehaviors().clear();
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
		case EmbeddedSystemPackage.SYSTEM_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_STRUCTURES:
			return systemStructures != null && !systemStructures.isEmpty();
		case EmbeddedSystemPackage.SYSTEM_MODEL__SYSTEM_BEHAVIORS:
			return systemBehaviors != null && !systemBehaviors.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SystemModelImpl
