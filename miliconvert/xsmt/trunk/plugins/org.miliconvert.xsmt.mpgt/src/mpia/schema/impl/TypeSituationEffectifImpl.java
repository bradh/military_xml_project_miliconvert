/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeSituationEffectif;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Situation Effectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSituationEffectifImpl#getDateSituation <em>Date Situation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationEffectifImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationEffectifImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSituationEffectifImpl#getEmiseParUnite <em>Emise Par Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSituationEffectifImpl extends EObjectImpl implements TypeSituationEffectif {
	/**
	 * The default value of the '{@link #getDateSituation() <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSituation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_SITUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSituation() <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSituation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateSituation = DATE_SITUATION_EDEFAULT;

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
	 * The cached value of the '{@link #getEmiseParUnite() <em>Emise Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmiseParUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation emiseParUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSituationEffectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSituationEffectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateSituation() {
		return dateSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSituation(XMLGregorianCalendar newDateSituation) {
		XMLGregorianCalendar oldDateSituation = dateSituation;
		dateSituation = newDateSituation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_EFFECTIF__DATE_SITUATION, oldDateSituation, dateSituation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_EFFECTIF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_EFFECTIF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEmiseParUnite() {
		return emiseParUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmiseParUnite(TypeAssociation newEmiseParUnite, NotificationChain msgs) {
		TypeAssociation oldEmiseParUnite = emiseParUnite;
		emiseParUnite = newEmiseParUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE, oldEmiseParUnite, newEmiseParUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmiseParUnite(TypeAssociation newEmiseParUnite) {
		if (newEmiseParUnite != emiseParUnite) {
			NotificationChain msgs = null;
			if (emiseParUnite != null)
				msgs = ((InternalEObject)emiseParUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE, null, msgs);
			if (newEmiseParUnite != null)
				msgs = ((InternalEObject)newEmiseParUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE, null, msgs);
			msgs = basicSetEmiseParUnite(newEmiseParUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE, newEmiseParUnite, newEmiseParUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE:
				return basicSetEmiseParUnite(null, msgs);
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
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__DATE_SITUATION:
				return getDateSituation();
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CE:
				return getCE();
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE:
				return getEmiseParUnite();
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
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__DATE_SITUATION:
				setDateSituation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE:
				setEmiseParUnite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__DATE_SITUATION:
				setDateSituation(DATE_SITUATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE:
				setEmiseParUnite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__DATE_SITUATION:
				return DATE_SITUATION_EDEFAULT == null ? dateSituation != null : !DATE_SITUATION_EDEFAULT.equals(dateSituation);
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SITUATION_EFFECTIF__EMISE_PAR_UNITE:
				return emiseParUnite != null;
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
		result.append(" (dateSituation: ");
		result.append(dateSituation);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeSituationEffectifImpl
