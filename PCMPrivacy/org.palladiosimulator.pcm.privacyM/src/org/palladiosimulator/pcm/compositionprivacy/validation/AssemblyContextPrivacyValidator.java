/**
 *
 * $Id$
 */
package org.palladiosimulator.pcm.compositionprivacy.validation;

import org.palladiosimulator.pcm.compositionprivacy.DataPrivacyLvl;

/**
 * A sample validator interface for {@link org.palladiosimulator.pcm.compositionprivacy.AssemblyContextPrivacy}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AssemblyContextPrivacyValidator {
	boolean validate();

	boolean validatePrivacyLevel(DataPrivacyLvl value);
}
