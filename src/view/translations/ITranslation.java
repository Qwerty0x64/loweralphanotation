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

public interface ITranslation {
	
	
	//Translation Name
	public String getTranslationName();
	
	//Title
	public String getFrameTitle();	
	
	//Menus
	public String getMenuFile();
	public String getMenuFileItemNew();
	public String getMenuFileItemSave();
	public String getMenuFileItemSaveAs();
	public String getMenuFileItemLoad();
	public String getMenuFileItemExit();
	
	public String getMenuEdit();
	
	public String getMenuOptions();
	public String getMenuOptionsOptions();
	public String getMenuOptionsLanguage();
	
	public String getMenuAbout();
	public String getMenuAboutAbout();

	
	//Main Tabs
	public String getMainMiddleTabbedPaneSource();
	
	//Down Tabs
	public String getMainDownTabbedPaneConsole();
	public String getMainDownTabbedPaneProblems();
	
	//Left Tabs
	public String getMainRightTabbedPaneMemory();
	public String getMainRightTabbedPaneStack();
	public String getMainRightTabbedPaneRegister();
	
	
	//Buttons
	public String getButtonCompile();
	public String getButtonNew();
	public String getButtonSave();
	public String getButtonSaveAs();
	public String getButtonLoad();
	public String getButtonPlay();
	public String getButtonPause();
	public String getButtonStop();
	public String getButtonStepInto();
	
	
		
}
