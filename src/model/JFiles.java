/**
 * This file is part of loweralpha, an interactive development environment for alpha-notation.

 * Copyright (C) 2016 Jan Müller (muellerj@informatik.uni-bonn.de)

 * loweralpha is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * loweralpha is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with loweralpha.  If not, see <http://www.gnu.org/licenses/>.

 * Authores: Sirko Höer, Jan Müller, Maximus S.
 */

package model;
import java.io.PrintWriter;

/**
 * 
 * @author Maximus S.
 *
 */
public class JFiles {
	
	public JFiles() {
		
	}
	
	public static boolean writeRulesToFile() {
		
		try {
			PrintWriter writer = new PrintWriter("three.rules", "UTF-8");
			writer.println("#Diese Datei enthält alle regulären Ausdrücke um die drei-Adress Alpha-Notation zu beschreiben");
			writer.println("#Bitte vorsichtig sein mit Änderungen");
			writer.println("");
			writer.println("#Reihenfolge der Ausdrücke");
			writer.println("#1. load");
			writer.println("#2. arithmetic operation");
			writer.println("#3. conditional jump");
			writer.println("#4. jump");
			writer.println("#5. push");
			writer.println("#6. pop");
			writer.println("#7. stack arithmetic operation");
			writer.println("#8. call");
			writer.println("#9. return");
			writer.println("");
			writer.println("#1. load");
			//writer.println("(α\d*|�?[(]\d+[)]):=(α\d*|�?[(]\d+[)])");
			writer.println("");
			writer.println("#2. arithmetic operation");
			//writer.println("(α\d*|�?[(]\d+[)]):=(α\d*|�?[(]\d+[)])[+*-÷](α\d*|�?[(]\d+[)])");
			writer.println("");
			writer.println("#3. conditional jump");
			//writer.println("if(α\d*)=0thengoto(\d+)");
			writer.println("");
			writer.println("#4. jump");
			//writer.println("goto(\d+)");
			writer.println("");
			writer.println("#5. push");
			writer.println("push");
			writer.println("");
			writer.println("#6. pop");
			writer.println("pop");
			writer.println("");
			writer.println("#7. stack arithmetic operation");
			writer.println("stack[+*-÷]");
			writer.println("");
			writer.println("#8. call");
			//writer.println("call(\c+)");
			writer.println("");
			writer.println("#9. return");
			writer.println("return");
			writer.close();
			return true;			
		} catch (Exception e) {
			return false;
		}
		
	}	
}
