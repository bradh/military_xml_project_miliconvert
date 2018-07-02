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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Rechange Categorie</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoRechangeCategorie()
 * @model extendedMetaData="name='type_Dictionary_Dico_RechangeCategorie'"
 * @generated
 */
public enum TypeDictionaryDicoRechangeCategorie implements Enumerator {
	/**
	 * The '<em><b>REQUST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUST_VALUE
	 * @generated
	 * @ordered
	 */
	REQUST(0, "REQUST", "REQUST"),

	/**
	 * The '<em><b>REPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPT_VALUE
	 * @generated
	 * @ordered
	 */
	REPT(1, "REPT", "REPT");

	/**
	 * The '<em><b>REQUST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUST_VALUE = 0;

	/**
	 * The '<em><b>REPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REPT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Rechange Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoRechangeCategorie[] VALUES_ARRAY =
		new TypeDictionaryDicoRechangeCategorie[] {
			REQUST,
			REPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Rechange Categorie</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoRechangeCategorie> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rechange Categorie</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRechangeCategorie get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRechangeCategorie result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rechange Categorie</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRechangeCategorie getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoRechangeCategorie result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Rechange Categorie</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoRechangeCategorie get(int value) {
		switch (value) {
			case REQUST_VALUE: return REQUST;
			case REPT_VALUE: return REPT;
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
	private TypeDictionaryDicoRechangeCategorie(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoRechangeCategorie
