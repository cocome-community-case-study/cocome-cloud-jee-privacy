/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.resourceenvironmentprivacy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.ResourceContainerPrivacy;
import org.palladiosimulator.pcm.resourceenvironmentprivacy.ResourceenvironmentPrivacyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.resourceenvironmentprivacy.impl.ResourceContainerPrivacyImpl#getGeolocation <em>Geolocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceContainerPrivacyImpl extends ResourceContainerImpl implements ResourceContainerPrivacy {
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
		return ResourceenvironmentPrivacyPackage.Literals.RESOURCE_CONTAINER_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGeolocation() {
		return (Integer) eGet(ResourceenvironmentPrivacyPackage.Literals.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeolocation(int newGeolocation) {
		eSet(ResourceenvironmentPrivacyPackage.Literals.RESOURCE_CONTAINER_PRIVACY__GEOLOCATION, newGeolocation);
	}

} //ResourceContainerPrivacyImpl
