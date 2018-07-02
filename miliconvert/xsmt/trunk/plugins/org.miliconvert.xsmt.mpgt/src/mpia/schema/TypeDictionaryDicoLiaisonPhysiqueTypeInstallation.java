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
 * A representation of the literals of the enumeration '<em><b>Type Dictionary Dico Liaison Physique Type Installation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mpia.schema.SchemaPackage#getTypeDictionaryDicoLiaisonPhysiqueTypeInstallation()
 * @model extendedMetaData="name='type_Dictionary_Dico_LiaisonPhysiqueTypeInstallation'"
 * @generated
 */
public enum TypeDictionaryDicoLiaisonPhysiqueTypeInstallation implements Enumerator {
	/**
	 * The '<em><b>UNDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDER_VALUE
	 * @generated
	 * @ordered
	 */
	UNDER(0, "UNDER", "UNDER"),

	/**
	 * The '<em><b>SURF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SURF_VALUE
	 * @generated
	 * @ordered
	 */
	SURF(1, "SURF", "SURF"),

	/**
	 * The '<em><b>AER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AER_VALUE
	 * @generated
	 * @ordered
	 */
	AER(2, "AER", "AER"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER");

	/**
	 * The '<em><b>UNDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDER_VALUE = 0;

	/**
	 * The '<em><b>SURF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SURF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SURF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SURF_VALUE = 1;

	/**
	 * The '<em><b>AER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AER_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Dictionary Dico Liaison Physique Type Installation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDictionaryDicoLiaisonPhysiqueTypeInstallation[] VALUES_ARRAY =
		new TypeDictionaryDicoLiaisonPhysiqueTypeInstallation[] {
			UNDER,
			SURF,
			AER,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Dictionary Dico Liaison Physique Type Installation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDictionaryDicoLiaisonPhysiqueTypeInstallation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Physique Type Installation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonPhysiqueTypeInstallation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLiaisonPhysiqueTypeInstallation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Physique Type Installation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonPhysiqueTypeInstallation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDictionaryDicoLiaisonPhysiqueTypeInstallation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Dictionary Dico Liaison Physique Type Installation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDictionaryDicoLiaisonPhysiqueTypeInstallation get(int value) {
		switch (value) {
			case UNDER_VALUE: return UNDER;
			case SURF_VALUE: return SURF;
			case AER_VALUE: return AER;
			case OTHER_VALUE: return OTHER;
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
	private TypeDictionaryDicoLiaisonPhysiqueTypeInstallation(int value, String name, String literal) {
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
	
} //TypeDictionaryDicoLiaisonPhysiqueTypeInstallation
