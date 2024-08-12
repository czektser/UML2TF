/**
 */
package models.impl;

import java.util.Collection;

import models.ModelsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aws iam policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models.impl.aws_iam_policyImpl#getAws_iam_role <em>Aws iam role</em>}</li>
 *   <li>{@link models.impl.aws_iam_policyImpl#getAws_s3_bucket <em>Aws s3 bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class aws_iam_policyImpl extends MinimalEObjectImpl.Container implements AwsIamPolicy {
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
	 * The cached value of the '{@link #getAws_s3_bucket() <em>Aws s3 bucket</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_s3_bucket()
	 * @generated
	 * @ordered
	 */
	protected EList<AwsS3Bucket> aws_s3_bucket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected aws_iam_policyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.AWS_IAM_POLICY;
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
							ModelsPackage.AWS_IAM_POLICY__AWS_IAM_ROLE, oldAws_iam_role, aws_iam_role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.AWS_IAM_POLICY__AWS_IAM_ROLE,
					oldAws_iam_role, aws_iam_role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwsS3Bucket> getAws_s3_bucket() {
		if (aws_s3_bucket == null) {
			aws_s3_bucket = new EObjectResolvingEList<AwsS3Bucket>(AwsS3Bucket.class, this,
					ModelsPackage.AWS_IAM_POLICY__AWS_S3_BUCKET);
		}
		return aws_s3_bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.AWS_IAM_POLICY__AWS_IAM_ROLE:
			if (resolve)
				return getAws_iam_role();
			return basicGetAws_iam_role();
		case ModelsPackage.AWS_IAM_POLICY__AWS_S3_BUCKET:
			return getAws_s3_bucket();
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
		case ModelsPackage.AWS_IAM_POLICY__AWS_IAM_ROLE:
			setAws_iam_role((AwsIamRole) newValue);
			return;
		case ModelsPackage.AWS_IAM_POLICY__AWS_S3_BUCKET:
			getAws_s3_bucket().clear();
			getAws_s3_bucket().addAll((Collection<? extends AwsS3Bucket>) newValue);
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
		case ModelsPackage.AWS_IAM_POLICY__AWS_IAM_ROLE:
			setAws_iam_role((AwsIamRole) null);
			return;
		case ModelsPackage.AWS_IAM_POLICY__AWS_S3_BUCKET:
			getAws_s3_bucket().clear();
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
		case ModelsPackage.AWS_IAM_POLICY__AWS_IAM_ROLE:
			return aws_iam_role != null;
		case ModelsPackage.AWS_IAM_POLICY__AWS_S3_BUCKET:
			return aws_s3_bucket != null && !aws_s3_bucket.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //aws_iam_policyImpl
