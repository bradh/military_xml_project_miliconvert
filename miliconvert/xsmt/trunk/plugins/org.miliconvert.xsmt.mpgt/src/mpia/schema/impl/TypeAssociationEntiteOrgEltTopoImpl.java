/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationEntiteOrgEltTopo;
import mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Entite Org Elt Topo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEltTopoImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEltTopoImpl#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEltTopoImpl#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEntiteOrgEltTopoImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationEntiteOrgEltTopo {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie.CONTRL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourObjetElementTopographie() <em>APour Objet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetElementTopographie()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourObjetElementTopographie;

	/**
	 * The cached value of the '{@link #getAPourSujetEntiteOrganisationnelle() <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourSujetEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEntiteOrgEltTopoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEntiteOrgEltTopo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie newCategorie) {
		TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourObjetElementTopographie() {
		return aPourObjetElementTopographie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetElementTopographie(TypeAssociation newAPourObjetElementTopographie, NotificationChain msgs) {
		TypeAssociation oldAPourObjetElementTopographie = aPourObjetElementTopographie;
		aPourObjetElementTopographie = newAPourObjetElementTopographie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, oldAPourObjetElementTopographie, newAPourObjetElementTopographie);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetElementTopographie(TypeAssociation newAPourObjetElementTopographie) {
		if (newAPourObjetElementTopographie != aPourObjetElementTopographie) {
			NotificationChain msgs = null;
			if (aPourObjetElementTopographie != null)
				msgs = ((InternalEObject)aPourObjetElementTopographie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			if (newAPourObjetElementTopographie != null)
				msgs = ((InternalEObject)newAPourObjetElementTopographie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, null, msgs);
			msgs = basicSetAPourObjetElementTopographie(newAPourObjetElementTopographie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE, newAPourObjetElementTopographie, newAPourObjetElementTopographie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourSujetEntiteOrganisationnelle() {
		return aPourSujetEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetEntiteOrganisationnelle(TypeAssociationEXT newAPourSujetEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAPourSujetEntiteOrganisationnelle = aPourSujetEntiteOrganisationnelle;
		aPourSujetEntiteOrganisationnelle = newAPourSujetEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, oldAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT newAPourSujetEntiteOrganisationnelle) {
		if (newAPourSujetEntiteOrganisationnelle != aPourSujetEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourSujetEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourSujetEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourSujetEntiteOrganisationnelle(newAPourSujetEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, newAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return basicSetAPourObjetElementTopographie(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourSujetEntiteOrganisationnelle(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return getAPourObjetElementTopographie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return getAPourSujetEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationEntiteOrgEltTopoCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				setAPourObjetElementTopographie((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				setAPourObjetElementTopographie((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_OBJET_ELEMENT_TOPOGRAPHIE:
				return aPourObjetElementTopographie != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ELT_TOPO__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return aPourSujetEntiteOrganisationnelle != null;
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

} //TypeAssociationEntiteOrgEltTopoImpl