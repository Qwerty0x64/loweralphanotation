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

package view.translations;

public class JTranslationGerman implements ITranslation {

	
	
	@Override
	public String getMainRightTabbedPaneRegister() {
		return "Register";
	}

	@Override
	public String getMenuOptionsLanguage() {
		return "Sprache";
	}

	@Override
	public String getButtonCompile() {
		return "Kompilieren";
	}

	@Override
	public String getTranslationName() {
		return "Deutsch";
	}

	@Override
	public String getButtonNew() {
		return "Neu";
	}

	@Override
	public String getButtonSave() {
		return "Speichern";
	}

	@Override
	public String getButtonSaveAs() { 
		return "Speichern unter";
	}

	@Override
	public String getButtonLoad() {
		return "Laden";
	}

	@Override
	public String getMainRightTabbedPaneMemory() {
		return "Speicher";
	}

	@Override
	public String getMainRightTabbedPaneStack() {
		return "Stapel";
	}

	public JTranslationGerman() {

	}
	
	@Override
	public String getFrameTitle() {
		return "α - Notαtion in βετα";
	}

	@Override
	public String getMainDownTabbedPaneConsole() {
		return "Konsole";
	}

	@Override
	public String getMainDownTabbedPaneProblems() {
		return "Probleme";
	}

	@Override
	public String getMenuFile() {
		return "Datei";
	}

	@Override
	public String getMenuFileItemNew() {
		return "Neu";
	}

	@Override
	public String getMenuFileItemSave() {
		return "Speichern";
	}

	@Override
	public String getMenuFileItemSaveAs() {
		return "Speichern unter...";
	}

	@Override
	public String getMenuFileItemLoad() {
		return "Oeffnen...";
	}

	@Override
	public String getMenuFileItemExit() {
		return "Schliessen/Verlassen";
	}

	@Override
	public String getMenuEdit() {
		return "Bearbeiten";
	}

	@Override
	public String getMenuOptions() {
		return "Optionen";
	}

	@Override
	public String getMenuOptionsOptions() {
		return "Optionen";
	}

	@Override
	public String getMenuAbout() {
		return "Ueber";
	}

	@Override
	public String getMenuAboutAbout() {
		return "Ueber";
	}

	@Override
	public String getMainMiddleTabbedPaneSource() {
		return "Quellcode";
	}

	@Override
	public String getButtonPlay() {
		return "Start";
	}

	@Override
	public String getButtonPause() {
		return "Pause";
	}

	@Override
	public String getButtonStop() {
		return "Stop";
	}

	@Override
	public String getButtonStepInto() {
		return "Schritt weiter";
	}

}
