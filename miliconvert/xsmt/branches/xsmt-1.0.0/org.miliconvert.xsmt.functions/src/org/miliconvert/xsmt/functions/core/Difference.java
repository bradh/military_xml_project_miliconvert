/* ***** BEGIN LICENSE BLOCK *****
 * Version: GPL 2.0
 *
 * The contents of this file are subject to the GNU General Public
 * License Version 2 or later (the "GPL").
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Initial Developer of the Original Code is
 *   BT Global Services / Etat  français  Ministre de la Défense
 *
 * ***** END LICENSE BLOCK ***** */

package org.miliconvert.xsmt.functions.core;

import org.miliconvert.xsmt.tmodel.AbstractFunctionImpl;
import org.miliconvert.xsmt.tmodel.TModelException;
import org.miliconvert.xsmt.tmodel.Variable;

public class Difference extends AbstractFunctionImpl {

	public Difference() {
		super();
		variables.add(new Variable("a")); //$NON-NLS-1$
		variables.add(new Variable("b")); //$NON-NLS-1$
	}

	public String getName() {
		return Messages.Difference_0;
	}

	/**
	 * Are a and b different ?
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b are different
	 */
	private Boolean difference(Integer a, Integer b) {
		return a != b;
	}

	/**
	 * Are a and b different ?
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b are different
	 * @throws TModelException
	 *             when one of the parameters is null
	 */

	public Boolean execute(Integer a, Integer b) throws TModelException {
		if (a == null || b == null ) {
			throw new TModelException(
					"One parameter of the difference function is null: " + ": a=" //$NON-NLS-1$ //$NON-NLS-2$
							+ a + ", " + "b=" + b); //$NON-NLS-1$ //$NON-NLS-2$
		} else
			return difference(a, b);
	}
}
