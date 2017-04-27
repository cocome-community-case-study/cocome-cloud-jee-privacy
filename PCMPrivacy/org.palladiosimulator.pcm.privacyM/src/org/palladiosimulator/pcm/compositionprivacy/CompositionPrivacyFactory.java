/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.compositionprivacy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage
 * @generated
 */
public interface CompositionPrivacyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionPrivacyFactory eINSTANCE = org.palladiosimulator.pcm.compositionprivacy.impl.CompositionPrivacyFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Assembly Connector Privacy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembly Connector Privacy</em>'.
	 * @generated
	 */
	AssemblyConnectorPrivacy createAssemblyConnectorPrivacy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompositionPrivacyPackage getCompositionPrivacyPackage();

} //CompositionPrivacyFactory
