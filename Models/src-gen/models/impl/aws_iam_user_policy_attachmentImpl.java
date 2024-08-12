/**
 */
package models.impl;

import models.ModelsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aws iam user policy attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models.impl.aws_iam_user_policy_attachmentImpl#getAws_iam_policy <em>Aws iam policy</em>}</li>
 *   <li>{@link models.impl.aws_iam_user_policy_attachmentImpl#getAws_iam_user <em>Aws iam user</em>}</li>
 * </ul>
 *
 * @generated
 */
public class aws_iam_user_policy_attachmentImpl extends MinimalEObjectImpl.Container
		implements AwsIamUserPolicyAttachment {
	/**
	 * The cached value of the '{@link #getAws_iam_policy() <em>Aws iam policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_iam_policy()
	 * @generated
	 * @ordered
	 */
	protected AwsIamPolicy aws_iam_policy;

	/**
	 * The cached value of the '{@link #getAws_iam_user() <em>Aws iam user</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_iam_user()
	 * @generated
	 * @ordered
	 */
	protected AwsIamUser aws_iam_user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected aws_iam_user_policy_attachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.AWS_IAM_USER_POLICY_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public AwsIamPolicy getAws_iam_policy() {
		if (aws_iam_policy != null && ((EObject) aws_iam_policy).eIsProxy()) {
			InternalEObject oldAws_iam_policy = (InternalEObject) aws_iam_policy;
			aws_iam_policy = (AwsIamPolicy) eResolveProxy(oldAws_iam_policy);
			if (aws_iam_policy != oldAws_iam_policy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY, oldAws_iam_policy,
							aws_iam_policy));
			}
		}
		return aws_iam_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsIamPolicy basicGetAws_iam_policy() {
		return aws_iam_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAws_iam_policy(AwsIamPolicy newAws_iam_policy) {
		AwsIamPolicy oldAws_iam_policy = aws_iam_policy;
		aws_iam_policy = newAws_iam_policy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY, oldAws_iam_policy, aws_iam_policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public AwsIamUser getAws_iam_user() {
		if (aws_iam_user != null && ((EObject) aws_iam_user).eIsProxy()) {
			InternalEObject oldAws_iam_user = (InternalEObject) aws_iam_user;
			aws_iam_user = (AwsIamUser) eResolveProxy(oldAws_iam_user);
			if (aws_iam_user != oldAws_iam_user) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER, oldAws_iam_user, aws_iam_user));
			}
		}
		return aws_iam_user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsIamUser basicGetAws_iam_user() {
		return aws_iam_user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAws_iam_user(AwsIamUser newAws_iam_user) {
		AwsIamUser oldAws_iam_user = aws_iam_user;
		aws_iam_user = newAws_iam_user;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER, oldAws_iam_user, aws_iam_user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			if (resolve)
				return getAws_iam_policy();
			return basicGetAws_iam_policy();
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER:
			if (resolve)
				return getAws_iam_user();
			return basicGetAws_iam_user();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			setAws_iam_policy((AwsIamPolicy) newValue);
			return;
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER:
			setAws_iam_user((AwsIamUser) newValue);
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
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			setAws_iam_policy((AwsIamPolicy) null);
			return;
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER:
			setAws_iam_user((AwsIamUser) null);
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
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			return aws_iam_policy != null;
		case ModelsPackage.AWS_IAM_USER_POLICY_ATTACHMENT__AWS_IAM_USER:
			return aws_iam_user != null;
		}
		return super.eIsSet(featureID);
	}

} //aws_iam_user_policy_attachmentImpl
