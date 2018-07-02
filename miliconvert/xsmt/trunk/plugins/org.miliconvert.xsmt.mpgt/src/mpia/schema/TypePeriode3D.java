/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Periode3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePeriode3D#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode3D#getQualificatifDateFin <em>Qualificatif Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode3D#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode3D#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePeriode3D#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePeriode3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Periode3D' kind='elementOnly'"
 * @generated
 */
public interface TypePeriode3D extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePeriode3D_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode3D#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Qualificatif Date Fin</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPeriode3DQualificatifDateFin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Date Fin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPeriode3DQualificatifDateFin
	 * @see #isSetQualificatifDateFin()
	 * @see #unsetQualificatifDateFin()
	 * @see #setQualificatifDateFin(TypeDictionaryDicoPeriode3DQualificatifDateFin)
	 * @see mpia.schema.SchemaPackage#getTypePeriode3D_QualificatifDateFin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifDateFin'"
	 * @generated
	 */
	TypeDictionaryDicoPeriode3DQualificatifDateFin getQualificatifDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode3D#getQualificatifDateFin <em>Qualificatif Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Date Fin</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPeriode3DQualificatifDateFin
	 * @see #isSetQualificatifDateFin()
	 * @see #unsetQualificatifDateFin()
	 * @see #getQualificatifDateFin()
	 * @generated
	 */
	void setQualificatifDateFin(TypeDictionaryDicoPeriode3DQualificatifDateFin value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePeriode3D#getQualificatifDateFin <em>Qualificatif Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifDateFin()
	 * @see #getQualificatifDateFin()
	 * @see #setQualificatifDateFin(TypeDictionaryDicoPeriode3DQualificatifDateFin)
	 * @generated
	 */
	void unsetQualificatifDateFin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePeriode3D#getQualificatifDateFin <em>Qualificatif Date Fin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Date Fin</em>' attribute is set.
	 * @see #unsetQualificatifDateFin()
	 * @see #getQualificatifDateFin()
	 * @see #setQualificatifDateFin(TypeDictionaryDicoPeriode3DQualificatifDateFin)
	 * @generated
	 */
	boolean isSetQualificatifDateFin();

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePeriode3D_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode3D#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypePeriode3D_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode3D#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePeriode3D_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePeriode3D#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypePeriode3D
