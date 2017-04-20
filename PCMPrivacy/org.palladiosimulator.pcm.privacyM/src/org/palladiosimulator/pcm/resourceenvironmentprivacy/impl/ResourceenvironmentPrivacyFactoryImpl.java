/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.resourceenvironmentprivacy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentPrivacyFactoryImpl extends EFactoryImpl implements ResourceenvironmentPrivacyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceenvironmentPrivacyFactory init() {
		try {
			ResourceenvironmentPrivacyFactory theResourceenvironmentPrivacyFactory = (ResourceenvironmentPrivacyFactory)EPackage.Registry.INSTANCE.getEFactory(ResourceenvironmentPrivacyPackage.eNS_URI);
			if (theResourceenvironmentPrivacyFactory != null) {
				return theResourceenvironmentPrivacyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceenvironmentPrivacyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentPrivacyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourceenvironmentPrivacyPackage.RESOURCE_CONTAINER_PRIVACY: return (EObject)createResourceContainerPrivacy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerPrivacy createResourceContainerPrivacy() {
		ResourceContainerPrivacyImpl resourceContainerPrivacy = new ResourceContainerPrivacyImpl();
		return resourceContainerPrivacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentPrivacyPackage getResourceenvironmentPrivacyPackage() {
		return (ResourceenvironmentPrivacyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourceenvironmentPrivacyPackage getPackage() {
		return ResourceenvironmentPrivacyPackage.eINSTANCE;
	}

} //ResourceenvironmentPrivacyFactoryImpl
