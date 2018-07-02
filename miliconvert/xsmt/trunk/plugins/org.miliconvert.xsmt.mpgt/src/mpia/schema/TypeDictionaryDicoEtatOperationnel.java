/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Etat Operationnel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoEtatOperationnel()
 * @model extendedMetaData="name='type_Dictionary_Dico_EtatOperationnel'"
 * @generated
 */
public enum TypeDictionaryDicoEtatOperationnel implements Enumerator {
	/**
	 * The '<em><b>OPR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPR_VALUE
	 * @generated
	 * @ordered
	 */
	OPR(0, "OPR", "OPR"),

	/**
	 * The '<em><b>MOPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOPS_VALUE
	 * @generated
	 * @ordered
	 */
	MOPS(1, "MOPS", "MOPS"),

	/**
	 * The '<em><b>NOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOP_VALUE
	 * @generated
	 * @ordered
	 */
	NOP(2, "NOP", "NOP"),

	/**
	 * The '<em><b>SOPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOPS_VALUE
	 * @generated
	 * @ordered
	 */
	SOPS(3, "SOPS", "SOPS"),

	/**
	 * The '<em><b>TNOPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TNOPS_VALUE
	 * @generated
	 * @ordered
	 */
	TNOPS(4, "TNOPS", "TNOPS"),

	/**
	 * The '<em><b>NKN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NKN_VALUE
	 * @generated
	 * @ordered
	 */
	NKN(5, "NKN", "NKN");

	/**
	 * The '<em><b>OPR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPR_VALUE = 0;

	/**
	 * The '<em><b>MOPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOPS_VALUE = 1;

	/**
	 * The '<em><b>NOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOP_VALUE = 2;

	/**
	 * The '<em><b>SOPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOPS_VALUE = 3;

	/**
	 * The '<em><b>TNOPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TNOPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TNOPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TNOPS_VALUE = 4;

	/**
	 * The '<em><b>NKN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NKN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NKN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NKN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Etat Operationnel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoEtatOperationnel[] VALUES_ARRAY =
		new TypeDictionaryDicoEtatOperationnel[] {
			OPR,
			MOPS,
			NOP,
			SOPS,
			TNOPS,
			NKN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Etat Operationnel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoEtatOperationnel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoEtatOperationnel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Etat Operationnel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoEtatOperationnel get(int value) {
		switch (value) {
			case OPR_VALUE: return OPR;
			case MOPS_VALUE: return MOPS;
			case NOP_VALUE: return NOP;
			case SOPS_VALUE: return SOPS;
			case TNOPS_VALUE: return TNOPS;
			case NKN_VALUE: return NKN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeDictionaryDicoEtatOperationnel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeDictionaryDicoEtatOperationnel
