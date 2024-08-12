/**
 */
package models.impl;

import models.ModelsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aws iam role policy attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models.impl.aws_iam_role_policy_attachmentImpl#getAws_iam_role <em>Aws iam role</em>}</li>
 *   <li>{@link models.impl.aws_iam_role_policy_attachmentImpl#getAws_iam_policy <em>Aws iam policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class aws_iam_role_policy_attachmentImpl extends EAttributeImpl implements AwsIamRolePolicyAttachment {
	/**
	 * The cached value of the '{@link #getAws_iam_role() <em>Aws iam role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_iam_role()
	 * @generated
	 * @ordered
	 */
	protected AwsIamRole aws_iam_role;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected aws_iam_role_policy_attachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.AWS_IAM_ROLE_POLICY_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public AwsIamRole getAws_iam_role() {
		if (aws_iam_role != null && ((EObject) aws_iam_role).eIsProxy()) {
			InternalEObject oldAws_iam_role = (InternalEObject) aws_iam_role;
			aws_iam_role = (AwsIamRole) eResolveProxy(oldAws_iam_role);
			if (aws_iam_role != oldAws_iam_role) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE, oldAws_iam_role, aws_iam_role));
			}
		}
		return aws_iam_role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsIamRole basicGetAws_iam_role() {
		return aws_iam_role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAws_iam_role(AwsIamRole newAws_iam_role) {
		AwsIamRole oldAws_iam_role = aws_iam_role;
		aws_iam_role = newAws_iam_role;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE, oldAws_iam_role, aws_iam_role));
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
							ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY, oldAws_iam_policy,
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
					ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY, oldAws_iam_policy, aws_iam_policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE:
			if (resolve)
				return getAws_iam_role();
			return basicGetAws_iam_role();
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			if (resolve)
				return getAws_iam_policy();
			return basicGetAws_iam_policy();
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
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE:
			setAws_iam_role((AwsIamRole) newValue);
			return;
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			setAws_iam_policy((AwsIamPolicy) newValue);
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
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE:
			setAws_iam_role((AwsIamRole) null);
			return;
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			setAws_iam_policy((AwsIamPolicy) null);
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
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_ROLE:
			return aws_iam_role != null;
		case ModelsPackage.AWS_IAM_ROLE_POLICY_ATTACHMENT__AWS_IAM_POLICY:
			return aws_iam_policy != null;
		}
		return super.eIsSet(featureID);
	}

} //aws_iam_role_policy_attachmentImpl
