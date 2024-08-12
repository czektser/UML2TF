/**
 */
package models;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see models.ModelsFactory
 * @model kind="package"
 * @generated
 */
public interface ModelsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "models";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/models";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "models";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelsPackage eINSTANCE = models.impl.ModelsPackageImpl.init();

	/**
	 * The meta object id for the '{@link models.impl.aws_iam_userImpl <em>aws iam user</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_iam_userImpl
	 * @see models.impl.ModelsPackageImpl#getaws_iam_user()
	 * @generated
	 */
	int AWS_IAM_USER = 0;

	/**
	 * The number of structural features of the '<em>aws iam user</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aws iam user</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_iam_policyImpl <em>aws iam policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_iam_policyImpl
	 * @see models.impl.ModelsPackageImpl#getaws_iam_policy()
	 * @generated
	 */
	int AWS_IAM_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Aws iam role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_POLICY__AWS_IAM_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Aws s3 bucket</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_POLICY__AWS_S3_BUCKET = 1;

	/**
	 * The number of structural features of the '<em>aws iam policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>aws iam policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_s3_bucketImpl <em>aws s3 bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_s3_bucketImpl
	 * @see models.impl.ModelsPackageImpl#getaws_s3_bucket()
	 * @generated
	 */
	int AWS_S3_BUCKET = 2;

	/**
	 * The number of structural features of the '<em>aws s3 bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_S3_BUCKET_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aws s3 bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_S3_BUCKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_iam_user_policy_attachmentImpl <em>aws iam user policy attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_iam_user_policy_attachmentImpl
	 * @see models.impl.ModelsPackageImpl#getaws_iam_user_policy_attachment()
	 * @generated
	 */
	int AWS_IAM_USER_POLICY_ATTACHMENT = 3;

	/**
	 * The feature id for the '<em><b>Aws iam policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Aws iam user</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER = 1;

	/**
	 * The number of structural features of the '<em>aws iam user policy attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_USER_POLICY_ATTACHMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>aws iam user policy attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_USER_POLICY_ATTACHMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_iam_roleImpl <em>aws iam role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_iam_roleImpl
	 * @see models.impl.ModelsPackageImpl#getaws_iam_role()
	 * @generated
	 */
	int AWS_IAM_ROLE = 4;

	/**
	 * The number of structural features of the '<em>aws iam role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aws iam role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_iam_instance_profileImpl <em>aws iam instance profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_iam_instance_profileImpl
	 * @see models.impl.ModelsPackageImpl#getaws_iam_instance_profile()
	 * @generated
	 */
	int AWS_IAM_INSTANCE_PROFILE = 5;

	/**
	 * The feature id for the '<em><b>Aws iam role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_INSTANCE_PROFILE__AWS_IAM_ROLE = 0;

	/**
	 * The number of structural features of the '<em>aws iam instance profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_INSTANCE_PROFILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>aws iam instance profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_INSTANCE_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_iam_role_policy_attachmentImpl <em>aws iam role policy attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_iam_role_policy_attachmentImpl
	 * @see models.impl.ModelsPackageImpl#getaws_iam_role_policy_attachment()
	 * @generated
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__EANNOTATIONS = EcorePackage.EATTRIBUTE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__NAME = EcorePackage.EATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__ORDERED = EcorePackage.EATTRIBUTE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__UNIQUE = EcorePackage.EATTRIBUTE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__LOWER_BOUND = EcorePackage.EATTRIBUTE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__UPPER_BOUND = EcorePackage.EATTRIBUTE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__MANY = EcorePackage.EATTRIBUTE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__REQUIRED = EcorePackage.EATTRIBUTE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__ETYPE = EcorePackage.EATTRIBUTE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__EGENERIC_TYPE = EcorePackage.EATTRIBUTE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__CHANGEABLE = EcorePackage.EATTRIBUTE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__VOLATILE = EcorePackage.EATTRIBUTE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__TRANSIENT = EcorePackage.EATTRIBUTE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__DEFAULT_VALUE_LITERAL = EcorePackage.EATTRIBUTE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__DEFAULT_VALUE = EcorePackage.EATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__UNSETTABLE = EcorePackage.EATTRIBUTE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__DERIVED = EcorePackage.EATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__ECONTAINING_CLASS = EcorePackage.EATTRIBUTE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__ID = EcorePackage.EATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__EATTRIBUTE_TYPE = EcorePackage.EATTRIBUTE__EATTRIBUTE_TYPE;

	/**
	 * The feature id for the '<em><b>Aws iam role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE = EcorePackage.EATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aws iam policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY = EcorePackage.EATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>aws iam role policy attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT_FEATURE_COUNT = EcorePackage.EATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT___GET_EANNOTATION__STRING = EcorePackage.EATTRIBUTE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT___GET_FEATURE_ID = EcorePackage.EATTRIBUTE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT___GET_CONTAINER_CLASS = EcorePackage.EATTRIBUTE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>aws iam role policy attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_IAM_ROLE_POLICY_ATTACHMENT_OPERATION_COUNT = EcorePackage.EATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_security_groupImpl <em>aws security group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_security_groupImpl
	 * @see models.impl.ModelsPackageImpl#getaws_security_group()
	 * @generated
	 */
	int AWS_SECURITY_GROUP = 7;

	/**
	 * The number of structural features of the '<em>aws security group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_SECURITY_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>aws security group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_SECURITY_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link models.impl.aws_instanceImpl <em>aws instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see models.impl.aws_instanceImpl
	 * @see models.impl.ModelsPackageImpl#getaws_instance()
	 * @generated
	 */
	int AWS_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Aws security group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_INSTANCE__AWS_SECURITY_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Aws iam instance profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE = 1;

	/**
	 * The number of structural features of the '<em>aws instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>aws instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link AwsIamUser <em>aws iam user</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws iam user</em>'.
	 * @see AwsIamUser
	 * @model instanceClass="AwsIamUser"
	 * @generated
	 */
	EClass getaws_iam_user();

	/**
	 * Returns the meta object for class '{@link AwsIamPolicy <em>aws iam policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws iam policy</em>'.
	 * @see AwsIamPolicy
	 * @model instanceClass="AwsIamPolicy"
	 * @generated
	 */
	EClass getaws_iam_policy();

	/**
	 * Returns the meta object for the reference '{@link AwsIamPolicy#getAws_iam_role <em>Aws iam role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aws iam role</em>'.
	 * @see AwsIamPolicy#getAws_iam_role()
	 * @see #getaws_iam_policy()
	 * @generated
	 */
	EReference getaws_iam_policy_Aws_iam_role();

	/**
	 * Returns the meta object for the reference list '{@link AwsIamPolicy#getAws_s3_bucket <em>Aws s3 bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aws s3 bucket</em>'.
	 * @see AwsIamPolicy#getAws_s3_bucket()
	 * @see #getaws_iam_policy()
	 * @generated
	 */
	EReference getaws_iam_policy_Aws_s3_bucket();

	/**
	 * Returns the meta object for class '{@link AwsS3Bucket <em>aws s3 bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws s3 bucket</em>'.
	 * @see AwsS3Bucket
	 * @model instanceClass="AwsS3Bucket"
	 * @generated
	 */
	EClass getaws_s3_bucket();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>aws iam user policy attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws iam user policy attachment</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="AwsIamUserPolicyAttachment"
	 * @generated
	 */
	EClass getaws_iam_user_policy_attachment();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getAws_iam_policy <em>Aws iam policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aws iam policy</em>'.
	 * @see java.lang.Object#getAws_iam_policy()
	 * @see #getaws_iam_user_policy_attachment()
	 * @generated
	 */
	EReference getaws_iam_user_policy_attachment_Aws_iam_policy();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getAws_iam_user <em>Aws iam user</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aws iam user</em>'.
	 * @see java.lang.Object#getAws_iam_user()
	 * @see #getaws_iam_user_policy_attachment()
	 * @generated
	 */
	EReference getaws_iam_user_policy_attachment_Aws_iam_user();

	/**
	 * Returns the meta object for class '{@link AwsIamRole <em>aws iam role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws iam role</em>'.
	 * @see AwsIamRole
	 * @model instanceClass="AwsIamRole"
	 * @generated
	 */
	EClass getaws_iam_role();

	/**
	 * Returns the meta object for class '{@link AwsIamInstanceProfile <em>aws iam instance profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws iam instance profile</em>'.
	 * @see AwsIamInstanceProfile
	 * @model instanceClass="AwsIamInstanceProfile"
	 * @generated
	 */
	EClass getaws_iam_instance_profile();

	/**
	 * Returns the meta object for the reference '{@link AwsIamInstanceProfile#getAws_iam_role <em>Aws iam role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aws iam role</em>'.
	 * @see AwsIamInstanceProfile#getAws_iam_role()
	 * @see #getaws_iam_instance_profile()
	 * @generated
	 */
	EReference getaws_iam_instance_profile_Aws_iam_role();

	/**
	 * Returns the meta object for class '{@link AwsIamRolePolicyAttachment <em>aws iam role policy attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws iam role policy attachment</em>'.
	 * @see AwsIamRolePolicyAttachment
	 * @model instanceClass="AwsIamRolePolicyAttachment"
	 * @generated
	 */
	EClass getaws_iam_role_policy_attachment();

	/**
	 * Returns the meta object for the reference '{@link AwsIamRolePolicyAttachment#getAws_iam_role <em>Aws iam role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aws iam role</em>'.
	 * @see AwsIamRolePolicyAttachment#getAws_iam_role()
	 * @see #getaws_iam_role_policy_attachment()
	 * @generated
	 */
	EReference getaws_iam_role_policy_attachment_Aws_iam_role();

	/**
	 * Returns the meta object for the reference '{@link AwsIamRolePolicyAttachment#getAws_iam_policy <em>Aws iam policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aws iam policy</em>'.
	 * @see AwsIamRolePolicyAttachment#getAws_iam_policy()
	 * @see #getaws_iam_role_policy_attachment()
	 * @generated
	 */
	EReference getaws_iam_role_policy_attachment_Aws_iam_policy();

	/**
	 * Returns the meta object for class '{@link AwsSecurityGroup <em>aws security group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws security group</em>'.
	 * @see AwsSecurityGroup
	 * @model instanceClass="AwsSecurityGroup"
	 * @generated
	 */
	EClass getaws_security_group();

	/**
	 * Returns the meta object for class '{@link AwsInstance <em>aws instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>aws instance</em>'.
	 * @see AwsInstance
	 * @model instanceClass="AwsInstance"
	 * @generated
	 */
	EClass getaws_instance();

	/**
	 * Returns the meta object for the reference list '{@link AwsInstance#getAws_security_group <em>Aws security group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aws security group</em>'.
	 * @see AwsInstance#getAws_security_group()
	 * @see #getaws_instance()
	 * @generated
	 */
	EReference getaws_instance_Aws_security_group();

	/**
	 * Returns the meta object for the reference '{@link AwsInstance#getAws_iam_instance_profile <em>Aws iam instance profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aws iam instance profile</em>'.
	 * @see AwsInstance#getAws_iam_instance_profile()
	 * @see #getaws_instance()
	 * @generated
	 */
	EReference getaws_instance_Aws_iam_instance_profile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelsFactory getModelsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link models.impl.aws_iam_userImpl <em>aws iam user</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_iam_userImpl
		 * @see models.impl.ModelsPackageImpl#getaws_iam_user()
		 * @generated
		 */
		EClass AWS_IAM_USER = eINSTANCE.getaws_iam_user();

		/**
		 * The meta object literal for the '{@link models.impl.aws_iam_policyImpl <em>aws iam policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_iam_policyImpl
		 * @see models.impl.ModelsPackageImpl#getaws_iam_policy()
		 * @generated
		 */
		EClass AWS_IAM_POLICY = eINSTANCE.getaws_iam_policy();

		/**
		 * The meta object literal for the '<em><b>Aws iam role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_IAM_POLICY__AWS_IAM_ROLE = eINSTANCE.getaws_iam_policy_Aws_iam_role();

		/**
		 * The meta object literal for the '<em><b>Aws s3 bucket</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_IAM_POLICY__AWS_S3_BUCKET = eINSTANCE.getaws_iam_policy_Aws_s3_bucket();

		/**
		 * The meta object literal for the '{@link models.impl.aws_s3_bucketImpl <em>aws s3 bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_s3_bucketImpl
		 * @see models.impl.ModelsPackageImpl#getaws_s3_bucket()
		 * @generated
		 */
		EClass AWS_S3_BUCKET = eINSTANCE.getaws_s3_bucket();

		/**
		 * The meta object literal for the '{@link models.impl.aws_iam_user_policy_attachmentImpl <em>aws iam user policy attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_iam_user_policy_attachmentImpl
		 * @see models.impl.ModelsPackageImpl#getaws_iam_user_policy_attachment()
		 * @generated
		 */
		EClass AWS_IAM_USER_POLICY_ATTACHMENT = eINSTANCE.getaws_iam_user_policy_attachment();

		/**
		 * The meta object literal for the '<em><b>Aws iam policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY = eINSTANCE
				.getaws_iam_user_policy_attachment_Aws_iam_policy();

		/**
		 * The meta object literal for the '<em><b>Aws iam user</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER = eINSTANCE
				.getaws_iam_user_policy_attachment_Aws_iam_user();

		/**
		 * The meta object literal for the '{@link models.impl.aws_iam_roleImpl <em>aws iam role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_iam_roleImpl
		 * @see models.impl.ModelsPackageImpl#getaws_iam_role()
		 * @generated
		 */
		EClass AWS_IAM_ROLE = eINSTANCE.getaws_iam_role();

		/**
		 * The meta object literal for the '{@link models.impl.aws_iam_instance_profileImpl <em>aws iam instance profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_iam_instance_profileImpl
		 * @see models.impl.ModelsPackageImpl#getaws_iam_instance_profile()
		 * @generated
		 */
		EClass AWS_IAM_INSTANCE_PROFILE = eINSTANCE.getaws_iam_instance_profile();

		/**
		 * The meta object literal for the '<em><b>Aws iam role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_IAM_INSTANCE_PROFILE__AWS_IAM_ROLE = eINSTANCE.getaws_iam_instance_profile_Aws_iam_role();

		/**
		 * The meta object literal for the '{@link models.impl.aws_iam_role_policy_attachmentImpl <em>aws iam role policy attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_iam_role_policy_attachmentImpl
		 * @see models.impl.ModelsPackageImpl#getaws_iam_role_policy_attachment()
		 * @generated
		 */
		EClass AWS_IAM_ROLE_POLICY_ATTACHMENT = eINSTANCE.getaws_iam_role_policy_attachment();

		/**
		 * The meta object literal for the '<em><b>Aws iam role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE = eINSTANCE
				.getaws_iam_role_policy_attachment_Aws_iam_role();

		/**
		 * The meta object literal for the '<em><b>Aws iam policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY = eINSTANCE
				.getaws_iam_role_policy_attachment_Aws_iam_policy();

		/**
		 * The meta object literal for the '{@link models.impl.aws_security_groupImpl <em>aws security group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_security_groupImpl
		 * @see models.impl.ModelsPackageImpl#getaws_security_group()
		 * @generated
		 */
		EClass AWS_SECURITY_GROUP = eINSTANCE.getaws_security_group();

		/**
		 * The meta object literal for the '{@link models.impl.aws_instanceImpl <em>aws instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see models.impl.aws_instanceImpl
		 * @see models.impl.ModelsPackageImpl#getaws_instance()
		 * @generated
		 */
		EClass AWS_INSTANCE = eINSTANCE.getaws_instance();

		/**
		 * The meta object literal for the '<em><b>Aws security group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_INSTANCE__AWS_SECURITY_GROUP = eINSTANCE.getaws_instance_Aws_security_group();

		/**
		 * The meta object literal for the '<em><b>Aws iam instance profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE = eINSTANCE.getaws_instance_Aws_iam_instance_profile();

	}

} //ModelsPackage
