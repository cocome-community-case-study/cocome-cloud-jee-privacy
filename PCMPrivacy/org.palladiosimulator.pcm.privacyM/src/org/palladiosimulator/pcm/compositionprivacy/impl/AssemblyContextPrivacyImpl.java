/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.compositionprivacy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.compositionprivacy.AssemblyContextPrivacy;
import org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage;
import org.palladiosimulator.pcm.compositionprivacy.DataPrivacyLvl;

import org.palladiosimulator.pcm.core.composition.impl.AssemblyContextImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Context Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.compositionprivacy.impl.AssemblyContextPrivacyImpl#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextPrivacyImpl extends AssemblyContextImpl implements AssemblyContextPrivacy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyContextPrivacyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompositionPrivacyPackage.Literals.ASSEMBLY_CONTEXT_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPrivacyLvl getPrivacyLevel() {
		return (DataPrivacyLvl) eGet(CompositionPrivacyPackage.Literals.ASSEMBLY_CONTEXT_PRIVACY__PRIVACY_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivacyLevel(DataPrivacyLvl newPrivacyLevel) {
		eSet(CompositionPrivacyPackage.Literals.ASSEMBLY_CONTEXT_PRIVACY__PRIVACY_LEVEL, newPrivacyLevel);
	}

} //AssemblyContextPrivacyImpl
