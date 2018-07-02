/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Emploi Guerre Electronique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEmploiGuerreElectronique#getCategorie <em>Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEmploiGuerreElectronique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EmploiGuerreElectronique' kind='elementOnly'"
 * @generated
 */
public interface TypeEmploiGuerreElectronique extends TypeEmploiRessourceActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiGuerreElectroniqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiGuerreElectroniqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEmploiGuerreElectroniqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiGuerreElectronique_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiGuerreElectroniqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiGuerreElectronique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiGuerreElectroniqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoEmploiGuerreElectroniqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiGuerreElectronique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEmploiGuerreElectroniqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiGuerreElectronique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoEmploiGuerreElectroniqueCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

} // TypeEmploiGuerreElectronique
