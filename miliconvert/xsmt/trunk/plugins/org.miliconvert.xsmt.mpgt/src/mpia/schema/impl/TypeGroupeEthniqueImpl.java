/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoGroupeEthniqueCategorie;
import mpia.schema.TypeGroupeEthnique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Groupe Ethnique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeGroupeEthniqueImpl#getCategorie <em>Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeGroupeEthniqueImpl extends TypeAffiliationImpl implements TypeGroupeEthnique {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoGroupeEthniqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoGroupeEthniqueCategorie.ADMISL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoGroupeEthniqueCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroupeEthniqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeGroupeEthnique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoGroupeEthniqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoGroupeEthniqueCategorie newCategorie) {
		TypeDictionaryDicoGroupeEthniqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_GROUPE_ETHNIQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoGroupeEthniqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_GROUPE_ETHNIQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_GROUPE_ETHNIQUE__CATEGORIE:
				return getCategorie();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_GROUPE_ETHNIQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoGroupeEthniqueCategorie)newValue);
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
			case SchemaPackage.TYPE_GROUPE_ETHNIQUE__CATEGORIE:
				unsetCategorie();
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
			case SchemaPackage.TYPE_GROUPE_ETHNIQUE__CATEGORIE:
				return isSetCategorie();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeGroupeEthniqueImpl