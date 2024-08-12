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
 * An implementation of the model object '<em><b>aws instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models.impl.aws_instanceImpl#getAws_security_group <em>Aws security group</em>}</li>
 *   <li>{@link models.impl.aws_instanceImpl#getAws_iam_instance_profile <em>Aws iam instance profile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class aws_instanceImpl extends MinimalEObjectImpl.Container implements AwsInstance {
	/**
	 * The cached value of the '{@link #getAws_security_group() <em>Aws security group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_security_group()
	 * @generated
	 * @ordered
	 */
	protected EList<AwsSecurityGroup> aws_security_group;

	/**
	 * The cached value of the '{@link #getAws_iam_instance_profile() <em>Aws iam instance profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAws_iam_instance_profile()
	 * @generated
	 * @ordered
	 */
	protected AwsIamInstanceProfile aws_iam_instance_profile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected aws_instanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelsPackage.Literals.AWS_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AwsSecurityGroup> getAws_security_group() {
		if (aws_security_group == null) {
			aws_security_group = new EObjectResolvingEList<AwsSecurityGroup>(AwsSecurityGroup.class, this,
					ModelsPackage.AWS_INSTANCE__AWS_SECURITY_GROUP);
		}
		return aws_security_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public AwsIamInstanceProfile getAws_iam_instance_profile() {
		if (aws_iam_instance_profile != null && ((EObject) aws_iam_instance_profile).eIsProxy()) {
			InternalEObject oldAws_iam_instance_profile = (InternalEObject) aws_iam_instance_profile;
			aws_iam_instance_profile = (AwsIamInstanceProfile) eResolveProxy(oldAws_iam_instance_profile);
			if (aws_iam_instance_profile != oldAws_iam_instance_profile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModelsPackage.AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE, oldAws_iam_instance_profile,
							aws_iam_instance_profile));
			}
		}
		return aws_iam_instance_profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsIamInstanceProfile basicGetAws_iam_instance_profile() {
		return aws_iam_instance_profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAws_iam_instance_profile(AwsIamInstanceProfile newAws_iam_instance_profile) {
		AwsIamInstanceProfile oldAws_iam_instance_profile = aws_iam_instance_profile;
		aws_iam_instance_profile = newAws_iam_instance_profile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE,
					oldAws_iam_instance_profile, aws_iam_instance_profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelsPackage.AWS_INSTANCE__AWS_SECURITY_GROUP:
			return getAws_security_group();
		case ModelsPackage.AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE:
			if (resolve)
				return getAws_iam_instance_profile();
			return basicGetAws_iam_instance_profile();
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
		case ModelsPackage.AWS_INSTANCE__AWS_SECURITY_GROUP:
			getAws_security_group().clear();
			getAws_security_group().addAll((Collection<? extends AwsSecurityGroup>) newValue);
			return;
		case ModelsPackage.AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE:
			setAws_iam_instance_profile((AwsIamInstanceProfile) newValue);
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
		case ModelsPackage.AWS_INSTANCE__AWS_SECURITY_GROUP:
			getAws_security_group().clear();
			return;
		case ModelsPackage.AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE:
			setAws_iam_instance_profile((AwsIamInstanceProfile) null);
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
		case ModelsPackage.AWS_INSTANCE__AWS_SECURITY_GROUP:
			return aws_security_group != null && !aws_security_group.isEmpty();
		case ModelsPackage.AWS_INSTANCE__AWS_IAM_INSTANCE_PROFILE:
			return aws_iam_instance_profile != null;
		}
		return super.eIsSet(featureID);
	}

} //aws_instanceImpl
