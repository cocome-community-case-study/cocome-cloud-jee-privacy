/**
 * Copyright 2005-2017 by palladiosimulator.org
 */
package org.palladiosimulator.pcm.compositionprivacy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.compositionprivacy.AssemblyConnectorPrivacy;
import org.palladiosimulator.pcm.compositionprivacy.AssemblyContextPrivacy;
import org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyFactory;
import org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage;
import org.palladiosimulator.pcm.compositionprivacy.DataPrivacyLvl;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.ResourceenvironmentPrivacyPackage;

import org.palladiosimulator.pcm.resourceenvironmentprivacy.impl.ResourceenvironmentPrivacyPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionPrivacyPackageImpl extends EPackageImpl implements CompositionPrivacyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyConnectorPrivacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblyContextPrivacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataPrivacyLvlEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.pcm.compositionprivacy.CompositionPrivacyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompositionPrivacyPackageImpl() {
		super(eNS_URI, CompositionPrivacyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CompositionPrivacyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompositionPrivacyPackage init() {
		if (isInited)
			return (CompositionPrivacyPackage) EPackage.Registry.INSTANCE
					.getEPackage(CompositionPrivacyPackage.eNS_URI);

		// Obtain or create and register package
		CompositionPrivacyPackageImpl theCompositionPrivacyPackage = (CompositionPrivacyPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CompositionPrivacyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CompositionPrivacyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ResourceenvironmentPrivacyPackageImpl theResourceenvironmentPrivacyPackage = (ResourceenvironmentPrivacyPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ResourceenvironmentPrivacyPackage.eNS_URI) instanceof ResourceenvironmentPrivacyPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPrivacyPackage.eNS_URI)
						: ResourceenvironmentPrivacyPackage.eINSTANCE);

		// Create package meta-data objects
		theCompositionPrivacyPackage.createPackageContents();
		theResourceenvironmentPrivacyPackage.createPackageContents();

		// Initialize created meta-data
		theCompositionPrivacyPackage.initializePackageContents();
		theResourceenvironmentPrivacyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompositionPrivacyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompositionPrivacyPackage.eNS_URI, theCompositionPrivacyPackage);
		return theCompositionPrivacyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyConnectorPrivacy() {
		return assemblyConnectorPrivacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssemblyConnectorPrivacy_PrivacyLevel() {
		return (EAttribute) assemblyConnectorPrivacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssemblyContextPrivacy() {
		return assemblyContextPrivacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssemblyContextPrivacy_PrivacyLevel() {
		return (EAttribute) assemblyContextPrivacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataPrivacyLvl() {
		return dataPrivacyLvlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionPrivacyFactory getCompositionPrivacyFactory() {
		return (CompositionPrivacyFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		assemblyConnectorPrivacyEClass = createEClass(ASSEMBLY_CONNECTOR_PRIVACY);
		createEAttribute(assemblyConnectorPrivacyEClass, ASSEMBLY_CONNECTOR_PRIVACY__PRIVACY_LEVEL);

		assemblyContextPrivacyEClass = createEClass(ASSEMBLY_CONTEXT_PRIVACY);
		createEAttribute(assemblyContextPrivacyEClass, ASSEMBLY_CONTEXT_PRIVACY__PRIVACY_LEVEL);

		// Create enums
		dataPrivacyLvlEEnum = createEEnum(DATA_PRIVACY_LVL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CompositionPackage theCompositionPackage = (CompositionPackage) EPackage.Registry.INSTANCE
				.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assemblyConnectorPrivacyEClass.getESuperTypes().add(theCompositionPackage.getAssemblyConnector());
		assemblyContextPrivacyEClass.getESuperTypes().add(theCompositionPackage.getAssemblyContext());

		// Initialize classes and features; add operations and parameters
		initEClass(assemblyConnectorPrivacyEClass, AssemblyConnectorPrivacy.class, "AssemblyConnectorPrivacy",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssemblyConnectorPrivacy_PrivacyLevel(), this.getDataPrivacyLvl(), "PrivacyLevel", "Personal",
				0, 1, AssemblyConnectorPrivacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assemblyContextPrivacyEClass, AssemblyContextPrivacy.class, "AssemblyContextPrivacy", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssemblyContextPrivacy_PrivacyLevel(), this.getDataPrivacyLvl(), "PrivacyLevel", "Unknown", 0,
				1, AssemblyContextPrivacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataPrivacyLvlEEnum, DataPrivacyLvl.class, "DataPrivacyLvl");
		addEEnumLiteral(dataPrivacyLvlEEnum, DataPrivacyLvl.PERSONAL);
		addEEnumLiteral(dataPrivacyLvlEEnum, DataPrivacyLvl.DEPERSONALIZED);
		addEEnumLiteral(dataPrivacyLvlEEnum, DataPrivacyLvl.ANONYMIZED);
		addEEnumLiteral(dataPrivacyLvlEEnum, DataPrivacyLvl.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //CompositionPrivacyPackageImpl
