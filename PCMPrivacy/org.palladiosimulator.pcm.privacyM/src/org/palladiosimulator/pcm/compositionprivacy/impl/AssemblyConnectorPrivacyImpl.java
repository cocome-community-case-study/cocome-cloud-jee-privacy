/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.compositionprivacy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.compositionprivacy.AssemblyConnectorPrivacy;
import org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage;
import org.palladiosimulator.pcm.compositionprivacy.DataPrivacyLvl;

import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.compositionprivacy.impl.AssemblyConnectorPrivacyImpl#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorPrivacyImpl extends AssemblyConnectorImpl implements AssemblyConnectorPrivacy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorPrivacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPrivacyPackage.Literals.ASSEMBLY_CONNECTOR_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPrivacyLvl getPrivacyLevel() {
		return (DataPrivacyLvl) eGet(CompositionPrivacyPackage.Literals.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivacyLevel(DataPrivacyLvl newPrivacyLevel) {
		eSet(CompositionPrivacyPackage.Literals.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL, newPrivacyLevel);
	}

} //AssemblyConnectorPrivacyImpl
