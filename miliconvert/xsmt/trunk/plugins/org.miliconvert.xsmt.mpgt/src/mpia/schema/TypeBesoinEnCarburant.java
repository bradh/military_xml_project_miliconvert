/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Besoin En Carburant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBesoinEnCarburant#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinEnCarburant#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinEnCarburant#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinEnCarburant#getAPourTypeEssenceTypeConsommable <em>APour Type Essence Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinEnCarburant#getAPourLocalisationLocalisation <em>APour Localisation Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBesoinEnCarburant()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_BesoinEnCarburant' kind='elementOnly'"
 * @generated
 */
public interface TypeBesoinEnCarburant extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinEnCarburant_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinEnCarburant#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBesoinEnCarburant#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBesoinEnCarburant#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinEnCarburant_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinEnCarburant#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinEnCarburant_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinEnCarburant#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Type Essence Type Consommable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Essence Type Consommable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Essence Type Consommable</em>' containment reference.
	 * @see #setAPourTypeEssenceTypeConsommable(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinEnCarburant_APourTypeEssenceTypeConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeConsommable'"
	 *        extendedMetaData="kind='element' name='APourTypeEssence_TypeConsommable'"
	 * @generated
	 */
	TypeAssociationEXT getAPourTypeEssenceTypeConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinEnCarburant#getAPourTypeEssenceTypeConsommable <em>APour Type Essence Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type Essence Type Consommable</em>' containment reference.
	 * @see #getAPourTypeEssenceTypeConsommable()
	 * @generated
	 */
	void setAPourTypeEssenceTypeConsommable(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Localisation</em>' containment reference.
	 * @see #setAPourLocalisationLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinEnCarburant_APourLocalisationLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_Localisation'"
	 * @generated
	 */
	TypeLocalisation getAPourLocalisationLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinEnCarburant#getAPourLocalisationLocalisation <em>APour Localisation Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Localisation</em>' containment reference.
	 * @see #getAPourLocalisationLocalisation()
	 * @generated
	 */
	void setAPourLocalisationLocalisation(TypeLocalisation value);

} // TypeBesoinEnCarburant
