/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.resourceenvironmentprivacy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.resourceenvironmentprivacy.ResourceenvironmentPrivacyPackage
 * @generated
 */
public interface ResourceenvironmentPrivacyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceenvironmentPrivacyFactory eINSTANCE = org.palladiosimulator.pcm.resourceenvironmentprivacy.impl.ResourceenvironmentPrivacyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource Container Privacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Container Privacy</em>'.
	 * @generated
	 */
	ResourceContainerPrivacy createResourceContainerPrivacy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceenvironmentPrivacyPackage getResourceenvironmentPrivacyPackage();

} //ResourceenvironmentPrivacyFactory
