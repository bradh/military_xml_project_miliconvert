/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Carnet Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCarnetPoints#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCarnetPoints#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCarnetPoints#getDecritPointUsager <em>Decrit Point Usager</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCarnetPoints()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CarnetPoints' kind='elementOnly'"
 * @generated
 */
public interface TypeCarnetPoints extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeCarnetPoints_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCarnetPoints#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCarnetPoints_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCarnetPoints#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Decrit Point Usager</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePointUsager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Point Usager</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Point Usager</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCarnetPoints_DecritPointUsager()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointUsager'"
	 *        extendedMetaData="kind='element' name='Decrit_PointUsager'"
	 * @generated
	 */
	EList<TypePointUsager> getDecritPointUsager();

} // TypeCarnetPoints
