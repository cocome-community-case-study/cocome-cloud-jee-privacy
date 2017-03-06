/**
 */
package org.palladiosimulator.pcm.core.resourceenvironmentprivacy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.compositionprivacy.CompositionPackage;

import org.palladiosimulator.pcm.core.compositionprivacy.impl.CompositionPackageImpl;

import org.palladiosimulator.pcm.core.resourceenvironmentprivacy.ResourceContainerPrivacy;
import org.palladiosimulator.pcm.core.resourceenvironmentprivacy.ResourceenvironmentFactory;
import org.palladiosimulator.pcm.core.resourceenvironmentprivacy.ResourceenvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceenvironmentPackageImpl extends EPackageImpl implements ResourceenvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerPrivacyEClass = null;

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
	 * @see org.palladiosimulator.pcm.core.resourceenvironmentprivacy.ResourceenvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourceenvironmentPackageImpl() {
		super(eNS_URI, ResourceenvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourceenvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourceenvironmentPackage init() {
		if (isInited) return (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);

		// Obtain or create and register package
		ResourceenvironmentPackageImpl theResourceenvironmentPackage = (ResourceenvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ResourceenvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ResourceenvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CompositionPackageImpl theCompositionPackage = (CompositionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) instanceof CompositionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) : CompositionPackage.eINSTANCE);

		// Create package meta-data objects
		theResourceenvironmentPackage.createPackageContents();
		theCompositionPackage.createPackageContents();

		// Initialize created meta-data
		theResourceenvironmentPackage.initializePackageContents();
		theCompositionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourceenvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourceenvironmentPackage.eNS_URI, theResourceenvironmentPackage);
		return theResourceenvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceContainerPrivacy() {
		return resourceContainerPrivacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceContainerPrivacy_Geolocation() {
		return (EAttribute)resourceContainerPrivacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceenvironmentFactory getResourceenvironmentFactory() {
		return (ResourceenvironmentFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceContainerPrivacyEClass = createEClass(RESOURCE_CONTAINER_PRIVACY);
		createEAttribute(resourceContainerPrivacyEClass, RESOURCE_CONTAINER_PRIVACY__GEOLOCATION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage theResourceenvironmentPackage_1 = (org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceContainerPrivacyEClass.getESuperTypes().add(theResourceenvironmentPackage_1.getResourceContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceContainerPrivacyEClass, ResourceContainerPrivacy.class, "ResourceContainerPrivacy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceContainerPrivacy_Geolocation(), ecorePackage.getEInt(), "Geolocation", "0", 1, 1, ResourceContainerPrivacy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourceenvironmentPackageImpl
