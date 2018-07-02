/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationDepEvacuationDepEvacuation;
import mpia.schema.TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Dep Evacuation Dep Evacuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationDepEvacuationDepEvacuationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationDepEvacuationDepEvacuationImpl#getAssocieCommeObjetDepannageEvacuation <em>Associe Comme Objet Depannage Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationDepEvacuationDepEvacuationImpl#getAssocieCommeSujetDepannageEvacuation <em>Associe Comme Sujet Depannage Evacuation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationDepEvacuationDepEvacuationImpl extends TypeAssociationFonctionnelleActiviteImpl implements TypeAssociationDepEvacuationDepEvacuation {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie.INRSTO;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeObjetDepannageEvacuation() <em>Associe Comme Objet Depannage Evacuation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetDepannageEvacuation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> associeCommeObjetDepannageEvacuation;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetDepannageEvacuation() <em>Associe Comme Sujet Depannage Evacuation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetDepannageEvacuation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> associeCommeSujetDepannageEvacuation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationDepEvacuationDepEvacuationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationDepEvacuationDepEvacuation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie newCategorie) {
		TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public EList<TypeAssociation> getAssocieCommeObjetDepannageEvacuation() {
		if (associeCommeObjetDepannageEvacuation == null) {
			associeCommeObjetDepannageEvacuation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_OBJET_DEPANNAGE_EVACUATION);
		}
		return associeCommeObjetDepannageEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAssocieCommeSujetDepannageEvacuation() {
		if (associeCommeSujetDepannageEvacuation == null) {
			associeCommeSujetDepannageEvacuation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_SUJET_DEPANNAGE_EVACUATION);
		}
		return associeCommeSujetDepannageEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_OBJET_DEPANNAGE_EVACUATION:
				return ((InternalEList<?>)getAssocieCommeObjetDepannageEvacuation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_SUJET_DEPANNAGE_EVACUATION:
				return ((InternalEList<?>)getAssocieCommeSujetDepannageEvacuation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_OBJET_DEPANNAGE_EVACUATION:
				return getAssocieCommeObjetDepannageEvacuation();
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_SUJET_DEPANNAGE_EVACUATION:
				return getAssocieCommeSujetDepannageEvacuation();
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
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_OBJET_DEPANNAGE_EVACUATION:
				getAssocieCommeObjetDepannageEvacuation().clear();
				getAssocieCommeObjetDepannageEvacuation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_SUJET_DEPANNAGE_EVACUATION:
				getAssocieCommeSujetDepannageEvacuation().clear();
				getAssocieCommeSujetDepannageEvacuation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_OBJET_DEPANNAGE_EVACUATION:
				getAssocieCommeObjetDepannageEvacuation().clear();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_SUJET_DEPANNAGE_EVACUATION:
				getAssocieCommeSujetDepannageEvacuation().clear();
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
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_OBJET_DEPANNAGE_EVACUATION:
				return associeCommeObjetDepannageEvacuation != null && !associeCommeObjetDepannageEvacuation.isEmpty();
			case SchemaPackage.TYPE_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION__ASSOCIE_COMME_SUJET_DEPANNAGE_EVACUATION:
				return associeCommeSujetDepannageEvacuation != null && !associeCommeSujetDepannageEvacuation.isEmpty();
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

} //TypeAssociationDepEvacuationDepEvacuationImpl