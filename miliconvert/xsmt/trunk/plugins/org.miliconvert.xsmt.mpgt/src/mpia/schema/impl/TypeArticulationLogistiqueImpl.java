/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeArticulationLogistique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Articulation Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeArticulationLogistiqueImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationLogistiqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationLogistiqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationLogistiqueImpl#getACommeUniteMereUnite <em>AComme Unite Mere Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationLogistiqueImpl#getACommeUniteRattacheeUnite <em>AComme Unite Rattachee Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeArticulationLogistiqueImpl extends EObjectImpl implements TypeArticulationLogistique {
	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeUniteMereUnite() <em>AComme Unite Mere Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteMereUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteMereUnite;

	/**
	 * The cached value of the '{@link #getACommeUniteRattacheeUnite() <em>AComme Unite Rattachee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteRattacheeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aCommeUniteRattacheeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArticulationLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeArticulationLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteMereUnite() {
		return aCommeUniteMereUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteMereUnite(TypeAssociationEXT newACommeUniteMereUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteMereUnite = aCommeUniteMereUnite;
		aCommeUniteMereUnite = newACommeUniteMereUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE, oldACommeUniteMereUnite, newACommeUniteMereUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteMereUnite(TypeAssociationEXT newACommeUniteMereUnite) {
		if (newACommeUniteMereUnite != aCommeUniteMereUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteMereUnite != null)
				msgs = ((InternalEObject)aCommeUniteMereUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE, null, msgs);
			if (newACommeUniteMereUnite != null)
				msgs = ((InternalEObject)newACommeUniteMereUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE, null, msgs);
			msgs = basicSetACommeUniteMereUnite(newACommeUniteMereUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE, newACommeUniteMereUnite, newACommeUniteMereUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getACommeUniteRattacheeUnite() {
		if (aCommeUniteRattacheeUnite == null) {
			aCommeUniteRattacheeUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_RATTACHEE_UNITE);
		}
		return aCommeUniteRattacheeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE:
				return basicSetACommeUniteMereUnite(null, msgs);
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_RATTACHEE_UNITE:
				return ((InternalEList<?>)getACommeUniteRattacheeUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE:
				return getACommeUniteMereUnite();
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_RATTACHEE_UNITE:
				return getACommeUniteRattacheeUnite();
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
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE:
				setACommeUniteMereUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_RATTACHEE_UNITE:
				getACommeUniteRattacheeUnite().clear();
				getACommeUniteRattacheeUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE:
				setACommeUniteMereUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_RATTACHEE_UNITE:
				getACommeUniteRattacheeUnite().clear();
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
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_MERE_UNITE:
				return aCommeUniteMereUnite != null;
			case SchemaPackage.TYPE_ARTICULATION_LOGISTIQUE__ACOMME_UNITE_RATTACHEE_UNITE:
				return aCommeUniteRattacheeUnite != null && !aCommeUniteRattacheeUnite.isEmpty();
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
		result.append(" (commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeArticulationLogistiqueImpl
