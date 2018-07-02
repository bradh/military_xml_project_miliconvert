/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Evenement RENS Evenement RENS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getAssocieCommeObjetEvenementRENS <em>Associe Comme Objet Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getAssocieCommeSujetEvenementRENS <em>Associe Comme Sujet Evenement RENS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSEvenementRENS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEvenementRENSEvenementRENS' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEvenementRENSEvenementRENS extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSEvenementRENS_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Evenement RENS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Evenement RENS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Evenement RENS</em>' containment reference.
	 * @see #setAssocieCommeObjetEvenementRENS(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSEvenementRENS_AssocieCommeObjetEvenementRENS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEvenementRENSEvenementRENS' target_entity='type_EvenementRENS'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_EvenementRENS'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetEvenementRENS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getAssocieCommeObjetEvenementRENS <em>Associe Comme Objet Evenement RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Evenement RENS</em>' containment reference.
	 * @see #getAssocieCommeObjetEvenementRENS()
	 * @generated
	 */
	void setAssocieCommeObjetEvenementRENS(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Evenement RENS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Evenement RENS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Evenement RENS</em>' containment reference.
	 * @see #setAssocieCommeSujetEvenementRENS(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSEvenementRENS_AssocieCommeSujetEvenementRENS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEvenementRENSEvenementRENS' target_entity='type_EvenementRENS'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_EvenementRENS'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetEvenementRENS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSEvenementRENS#getAssocieCommeSujetEvenementRENS <em>Associe Comme Sujet Evenement RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Evenement RENS</em>' containment reference.
	 * @see #getAssocieCommeSujetEvenementRENS()
	 * @generated
	 */
	void setAssocieCommeSujetEvenementRENS(TypeAssociation value);

} // TypeAssociationEvenementRENSEvenementRENS
