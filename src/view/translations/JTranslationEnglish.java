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

public class JTranslationEnglish implements ITranslation {

	
	
	@Override
	public String getMenuOptionsLanguage() {
		return "Language";
	}

	@Override
	public String getTranslationName() {
		return "English";
	}
	

	@Override
	public String getMainRightTabbedPaneRegister() {
		return "Register";
	}

	@Override
	public String getButtonCompile() {
		return "Compile";
	}

	@Override
	public String getButtonNew() {
		return "New";
	}

	@Override
	public String getButtonSave() {
		return "Save";
	}

	@Override
	public String getButtonSaveAs() {
		return "Save as";
	}

	@Override
	public String getButtonLoad() {
		return "Load";
	}

	@Override
	public String getMainRightTabbedPaneMemory() {
		return "Memory";
	}

	@Override
	public String getMainRightTabbedPaneStack() {
		return "Stack";
	}

	public JTranslationEnglish() {

	}
	
	@Override
	public String getFrameTitle() {
		return "α - Notαtion in βετα";
	}
	
	@Override
	public String getMenuFile() {
		return "File";
	}

	@Override
	public String getMainDownTabbedPaneConsole() {
		return "Console";
	}

	@Override
	public String getMainDownTabbedPaneProblems() {
		return "Problems";
	}

	@Override
	public String getMenuFileItemNew() {
		return "New";
	}

	@Override
	public String getMenuFileItemSave() {
		return "Save";
	}

	@Override
	public String getMenuFileItemSaveAs() {
		return "Save As";
	}

	@Override
	public String getMenuFileItemLoad() {
		return "Load";
	}

	@Override
	public String getMenuFileItemExit() {
		return "Exit";
	}

	@Override
	public String getMenuEdit() {
		return "Edit";
	}

	@Override
	public String getMenuOptions() {
		return "Options";
	}
	
	@Override
	public String getMenuOptionsOptions() {
		return "Options";
	}

	@Override
	public String getMenuAbout() {
		return "About";
	}

	@Override
	public String getMenuAboutAbout() {
		return "About";
	}

	@Override
	public String getMainMiddleTabbedPaneSource() {
		return "Source";
	}

	@Override
	public String getButtonPlay() {
		return "Play";
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
		return "Step Into";
	}
}
