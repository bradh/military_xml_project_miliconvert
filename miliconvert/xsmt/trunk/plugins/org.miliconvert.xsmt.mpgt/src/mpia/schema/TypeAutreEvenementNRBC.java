/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Evenement NRBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreEvenementNRBC#getCategorie <em>Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreEvenementNRBC()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreEvenementNRBC' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreEvenementNRBC extends TypeEvenementNRBC {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreEvenementNRBCCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreEvenementNRBCCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreEvenementNRBCCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenementNRBC_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreEvenementNRBCCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreEvenementNRBC#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreEvenementNRBCCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreEvenementNRBCCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreEvenementNRBC#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreEvenementNRBCCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreEvenementNRBC#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreEvenementNRBCCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

} // TypeAutreEvenementNRBC