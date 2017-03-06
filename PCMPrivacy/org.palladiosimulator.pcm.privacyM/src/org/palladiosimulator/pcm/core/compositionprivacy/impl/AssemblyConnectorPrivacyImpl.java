/**
 */
package org.palladiosimulator.pcm.core.compositionprivacy.impl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;

import org.palladiosimulator.pcm.core.compositionprivacy.AssemblyConnectorPrivacy;
import org.palladiosimulator.pcm.core.compositionprivacy.CompositionPackage;
import org.palladiosimulator.pcm.core.compositionprivacy.DataPrivacyLvl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector Privacy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.core.compositionprivacy.impl.AssemblyConnectorPrivacyImpl#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorPrivacyImpl extends AssemblyConnectorImpl implements AssemblyConnectorPrivacy {
	/**
	 * The default value of the '{@link #getPrivacyLevel() <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivacyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DataPrivacyLvl PRIVACY_LEVEL_EDEFAULT = DataPrivacyLvl.PERSONAL;

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
		return CompositionPackage.Literals.ASSEMBLY_CONNECTOR_PRIVACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPrivacyLvl getPrivacyLevel() {
		return (DataPrivacyLvl)eDynamicGet(CompositionPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL, CompositionPackage.Literals.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivacyLevel(DataPrivacyLvl newPrivacyLevel) {
		eDynamicSet(CompositionPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL, CompositionPackage.Literals.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL, newPrivacyLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompositionPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				return getPrivacyLevel();
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
			case CompositionPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				setPrivacyLevel((DataPrivacyLvl)newValue);
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
			case CompositionPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				setPrivacyLevel(PRIVACY_LEVEL_EDEFAULT);
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
			case CompositionPackage.ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL:
				return getPrivacyLevel() != PRIVACY_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorPrivacyImpl
