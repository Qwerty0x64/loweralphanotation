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

 * Authores: Sirko Höer, Jan Müller, Ashley Stirling
 */

package view.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JAlphaNotationGUI;

public class JButtonNewViewActionListener implements ActionListener {

	private JAlphaNotationGUI gui;
	public JButtonNewViewActionListener(JAlphaNotationGUI gui) {
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		gui.SetTextSource("");
		gui.SetTextConsole("");
		
	    //TODO clear by update, runtime exception null pointer
	    //-> emptry string as argument : might conflict with buttons (pause were enabled)
	    //this.gui.SetListMemorey(null);
	    //this.gui.SetListRegister(null);
	    //this.gui.SetListStack(null);
	    //this.gui.SetListRuntimeDebug(null, 0);
		
		this.gui.SetSelectedAfterCompile(0);
		
		String[] nll = new String[1];
		nll[0] = "\n";
		gui.SetListStack(nll);
        gui.SetListMemorey(nll);
        gui.SetListRegister(nll);	
        gui.SetListRuntimeDebug(nll, 0);	
	}
}
