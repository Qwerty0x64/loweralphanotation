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

import java.util.HashMap;

/**
 * 
 * @author Maximus S.
 *
 */

public class JModel {
	
	protected Program program;
	protected Compiler compiler;
	protected VM vm;
	protected JRunnableInvokePlay RunInvokePlay; 
	protected JRunnableEnableButtons RunEnableButtons;
	
	public JModel() {
		compiler = new Compiler();
		
		try {
			compiler.load(getClass().getResourceAsStream("/rules/three.rules"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void compile(String source) throws Exception {		
		this.program = compiler.compile(source);
		this.vm = new VM(program);
		this.vm.loadProgam();
		this.vm.setRunnableInvokePlay(RunInvokePlay);
		this.vm.setRunnableEnableButtons(RunEnableButtons);
	}
	
	public HashMap<String, Integer> getRegisterLabelMap() {
		return this.compiler.getRegisterLabelMap();
	}
	
	public HashMap<String, Integer> getMemoryLabelMap() {
		return this.compiler.getMemoryLabelMap();
	}	
	
	public Integer[] getMemory() {
        return this.vm.getMemory();
    }

    public Integer[] getRegister() {
        return this.vm.getRegister();
    }

    public JStack<Integer> getStack() {
        return this.vm.getStack();
    }

    public long getTimeOut() {
        return this.vm.getTimeOut();
    }

    public void setTimeOut(long timeOut) {
        this.vm.setTimeOut(timeOut);
    }
    
    public void Step() {
    	this.vm.step();
    }
    
    public int getProgramCounter() {
        return vm.getProgramCounter();
    }
    
    public int getLineIndex() {
    	return vm.getLineIndex();
    }
    
    public void setRunnableInvokePlay(JRunnableInvokePlay run) {
    	this.RunInvokePlay = run;    	
    }        
    
    public void setRunnableEnableButtons(JRunnableEnableButtons run) {
    	this.RunEnableButtons = run;
    }
    
    public void resetVM() {
    	this.vm.restart();
    }
    
    public void setRunnableInvokePlayInVM() {
    	vm.setRunnableInvokePlay(this.RunInvokePlay);
    }
    
    public void setRunnableEnableButtons() {
    	vm.setRunnableEnableButtons(RunEnableButtons);
    }
    
    public void setStop(boolean b) {
    	vm.setStop(b);
    }
    
    public void run() {
    	vm.start();
    }    
}
