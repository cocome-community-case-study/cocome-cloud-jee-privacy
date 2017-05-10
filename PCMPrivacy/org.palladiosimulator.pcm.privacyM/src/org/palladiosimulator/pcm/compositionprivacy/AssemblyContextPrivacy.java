/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.compositionprivacy;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Context Privacy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.compositionprivacy.AssemblyContextPrivacy#getPrivacyLevel <em>Privacy Level</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage#getAssemblyContextPrivacy()
 * @model
 * @generated
 */
public interface AssemblyContextPrivacy extends AssemblyContext {
	/**
	 * Returns the value of the '<em><b>Privacy Level</b></em>' attribute.
	 * The default value is <code>"Unknown"</code>.
	 * The literals are from the enumeration {@link org.palladiosimulator.pcm.compositionprivacy.DataPrivacyLvl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privacy Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privacy Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.compositionprivacy.DataPrivacyLvl
	 * @see #setPrivacyLevel(DataPrivacyLvl)
	 * @see org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage#getAssemblyContextPrivacy_PrivacyLevel()
	 * @model default="Unknown" unique="false" ordered="false"
	 * @generated
	 */
	DataPrivacyLvl getPrivacyLevel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.compositionprivacy.AssemblyContextPrivacy#getPrivacyLevel <em>Privacy Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privacy Level</em>' attribute.
	 * @see org.palladiosimulator.pcm.compositionprivacy.DataPrivacyLvl
	 * @see #getPrivacyLevel()
	 * @generated
	 */
	void setPrivacyLevel(DataPrivacyLvl value);

} // AssemblyContextPrivacy
