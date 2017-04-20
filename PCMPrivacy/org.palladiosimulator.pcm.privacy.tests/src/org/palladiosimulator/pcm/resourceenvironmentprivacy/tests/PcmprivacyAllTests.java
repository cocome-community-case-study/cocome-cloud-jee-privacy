/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.resourceenvironmentprivacy.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import org.palladiosimulator.pcm.compositionprivacy.tests.CompositionPrivacyTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Pcmprivacy</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmprivacyAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PcmprivacyAllTests("Pcmprivacy Tests");
		suite.addTest(CompositionPrivacyTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmprivacyAllTests(String name) {
		super(name);
	}

} //PcmprivacyAllTests
