package view.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JOptionPane;

import view.JAlphaNotationGUI;

public class JMenuItemAboutViewActionListener implements ActionListener {

	private JAlphaNotationGUI gui;	
	public JMenuItemAboutViewActionListener(JAlphaNotationGUI gui) {
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		
		String display = "Developed by Jan Mueller, Sirko Höer & Maximus S..";
		display += "\n\nBackend developers: Jan Mueller & Sirko Höer";
		display += "\nFrontend developer: Maximus S.";
		display += "\n\nTrnslation German: Maximus S.";
		display += "\nTranslation English: Maximus S.";
		display += "\nTranslation Russian: Maximus S., Евгения У. :)";
		display += "\nTranslation Japanese: Maximus S., Julia H. :)";
		
		JOptionPane.showMessageDialog(null, display);		
	}
}
