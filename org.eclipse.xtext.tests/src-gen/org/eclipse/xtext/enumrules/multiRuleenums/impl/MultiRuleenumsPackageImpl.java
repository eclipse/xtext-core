/**
 */
package org.eclipse.xtext.enumrules.multiRuleenums.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.enumrules.multiRuleenums.Model;
import org.eclipse.xtext.enumrules.multiRuleenums.MultiRuleenumsFactory;
import org.eclipse.xtext.enumrules.multiRuleenums.MultiRuleenumsPackage;
import org.eclipse.xtext.enumrules.multiRuleenums.MyEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiRuleenumsPackageImpl extends EPackageImpl implements MultiRuleenumsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum myEnumEEnum = null;

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
   * @see org.eclipse.xtext.enumrules.multiRuleenums.MultiRuleenumsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MultiRuleenumsPackageImpl()
  {
    super(eNS_URI, MultiRuleenumsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MultiRuleenumsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MultiRuleenumsPackage init()
  {
    if (isInited) return (MultiRuleenumsPackage)EPackage.Registry.INSTANCE.getEPackage(MultiRuleenumsPackage.eNS_URI);

    // Obtain or create and register package
    MultiRuleenumsPackageImpl theMultiRuleenumsPackage = (MultiRuleenumsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MultiRuleenumsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MultiRuleenumsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMultiRuleenumsPackage.createPackageContents();

    // Initialize created meta-data
    theMultiRuleenumsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMultiRuleenumsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MultiRuleenumsPackage.eNS_URI, theMultiRuleenumsPackage);
    return theMultiRuleenumsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_A()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_B()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_C()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMyEnum()
  {
    return myEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiRuleenumsFactory getMultiRuleenumsFactory()
  {
    return (MultiRuleenumsFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__A);
    createEAttribute(modelEClass, MODEL__B);
    createEAttribute(modelEClass, MODEL__C);

    // Create enums
    myEnumEEnum = createEEnum(MY_ENUM);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_A(), this.getMyEnum(), "a", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_B(), this.getMyEnum(), "b", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_C(), this.getMyEnum(), "c", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(myEnumEEnum, MyEnum.class, "MyEnum");
    addEEnumLiteral(myEnumEEnum, MyEnum.A);
    addEEnumLiteral(myEnumEEnum, MyEnum.B);
    addEEnumLiteral(myEnumEEnum, MyEnum.C);
    addEEnumLiteral(myEnumEEnum, MyEnum.D);
    addEEnumLiteral(myEnumEEnum, MyEnum.E);

    // Create resource
    createResource(eNS_URI);
  }

} //MultiRuleenumsPackageImpl
