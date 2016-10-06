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

package controller;

import controllers.Actionlisteners.*;
import model.JModel;
import model.JRunnableEnableButtons;
import model.JRunnableInvokePlay;
import view.JAlphaNotationGUI;

/**
 * This class represents the handling between model and view. 
 * @author Ashley Maxine Stirling
 *    
 */

/*
 * lines \n[^\n]*
 * import  
 * variables protected protected([\s\S]).*;
 * variables private([\s\S]).*;
 * variables public([\s\S]).*; //constants  
 * methods public([\s\S]).*()([\s\S]).*\{
 *         private([\s\S]).*()([\s\S]).*\{         
 *  	   protected([\s\S]).*()([\s\S]).*\{
 * 
 */

public class JController {
	
	public JController() {
		
		model = new JModel();
		gui = new JAlphaNotationGUI();
		//this.CompileSuccessfull = false;
                
		initListenersView();		
		addListenersView();
		
		model.setRunnableInvokePlay(RunnableInvokePlay);
		model.setRunnableEnableButtons(RunnableEnableButtons);
	}
	
	//main components
	protected JAlphaNotationGUI gui;
	protected JModel model;
	
	//listeners 
	protected JButtonCompileControllerActionListener ButtonCompileControllerActionListener;
	protected JButtonLoadControllerActionListener ButtonLoadControllerActionListner;
	protected JButtonPauseControllerActionListener ButtonPauseControllerActionListener;
	protected JButtonPlayControllerActionListener ButtonPlayControllerActionListener;
	protected JButtonStepIntoControllerActionListener ButtonStepIntoControllerActionListener;
	protected JButtonStopControllerActionListener ButtonStopControllerActionListener;
	protected JMenuItemLoadControllerActionListener MenuItemLoadControllerActionListener;
	protected JRunnableInvokePlay RunnableInvokePlay;
	protected JRunnableEnableButtons RunnableEnableButtons;
        
    protected boolean CompileSuccessfull;
    
    public boolean getCompileSuccessfull() {
        return this.CompileSuccessfull;
    }
    
    public void setCompileSuccessfull(boolean var) {
        this.CompileSuccessfull = var;
    }

	protected void initListenersView() {
		this.ButtonCompileControllerActionListener = new JButtonCompileControllerActionListener(this.gui, this.model, this);
		this.ButtonLoadControllerActionListner = new JButtonLoadControllerActionListener(this.gui, this.model);
		this.ButtonPauseControllerActionListener = new JButtonPauseControllerActionListener(this.gui, this.model, this);
		this.ButtonPlayControllerActionListener = new JButtonPlayControllerActionListener(this.gui, this.model);
		this.ButtonStepIntoControllerActionListener = new JButtonStepIntoControllerActionListener(this.gui, this.model);
		this.ButtonStopControllerActionListener = new JButtonStopControllerActionListener(this.gui, this.model, this);
		this.MenuItemLoadControllerActionListener = new JMenuItemLoadControllerActionListener(this.gui, this.model);
		this.RunnableInvokePlay = new JRunnableInvokePlay(gui, model);
		this.RunnableEnableButtons = new JRunnableEnableButtons(gui, model);
	}
	
	protected void addListenersView() {
		this.gui.AddButtonCompileActionListener(ButtonCompileControllerActionListener);
		this.gui.AddButtonPauseActionListener(ButtonPauseControllerActionListener);
		this.gui.AddButtonPlayActionListener(ButtonPlayControllerActionListener);
		this.gui.AddButtonStopActionListener(ButtonStopControllerActionListener);
		this.gui.AddButtonStepIntoActionListener(ButtonStepIntoControllerActionListener);		
	}
	
	public void updatePanes() {
		
	}
	
	public static void main(String[] args) {
		
		JController con = new JController();
		
	}
}
