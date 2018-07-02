/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Type Batiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreTypeBatiment#getCategorie <em>Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreTypeBatiment()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreTypeBatiment' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreTypeBatiment extends TypeTypeBatiment {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreTypeBatimentCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeBatimentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeBatimentCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreTypeBatiment_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreTypeBatimentCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreTypeBatiment#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreTypeBatimentCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreTypeBatimentCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreTypeBatiment#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeBatimentCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreTypeBatiment#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreTypeBatimentCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

} // TypeAutreTypeBatiment
