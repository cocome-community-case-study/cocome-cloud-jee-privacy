/**
 */
package org.palladiosimulator.pcm.core.resourceenvironmentprivacy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.resourceenvironmentprivacy.ResourceContainerPrivacy;
import org.palladiosimulator.pcm.core.resourceenvironmentprivacy.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.core.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl#getGeolocation <em>Geolocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceContainerPrivacyImpl extends ResourceContainerImpl implements ResourceContainerPrivacy {
	/**
	 * The default value of the '{@link #getGeolocation() <em>Geolocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocation()
	 * @generated
	 * @ordered
	 */
	protected static final int GEOLOCATION_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerPrivacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourceenvironmentPackage.Literals.RESOURCE_CONTAINER_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGeolocation() {
		return (Integer)eDynamicGet(ResourceenvironmentPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION, ResourceenvironmentPackage.Literals.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeolocation(int newGeolocation) {
		eDynamicSet(ResourceenvironmentPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION, ResourceenvironmentPackage.Literals.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION, newGeolocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourceenvironmentPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				return getGeolocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourceenvironmentPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				setGeolocation((Integer)newValue);
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
			case ResourceenvironmentPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				setGeolocation(GEOLOCATION_EDEFAULT);
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
			case ResourceenvironmentPackage.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION:
				return getGeolocation() != GEOLOCATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ResourceContainerPrivacyImpl
