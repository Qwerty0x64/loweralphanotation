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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import view.JAlphaNotationGUI;

public class JMenuItemLanguageViewActionListener implements ActionListener {
	
	public JMenuItemLanguageViewActionListener(JAlphaNotationGUI gui) {
		this.gui = gui;
	}
	
	private JAlphaNotationGUI gui;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		List<String> items = new ArrayList<String>();
		
		for (int i = 0; i < gui.getGUITranslations().size(); i++) {
			items.add(gui.getGUITranslations().get(i).getTranslationName());			
		}
		
		//DefaultComboBoxModel model = new DefaultComboBoxModel(items.toArray());		
		JComboBox cb = new JComboBox<>(items.toArray());
		int result = JOptionPane.showConfirmDialog(null, cb, "Language", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if (result == JOptionPane.OK_OPTION) {
			gui.SetLanguage(cb.getSelectedIndex());			
		}
		
		
	}
	
}
