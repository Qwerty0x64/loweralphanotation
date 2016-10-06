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

package model;

import java.util.ArrayList;
import model.Instruction;

public class Program {

	private ArrayList<Instruction> progCode;
    private int memSize;
    private int regSize;
    private int entryPoint;


    public Program(int regSize,int memSize) 
    {
    	progCode = new ArrayList<Instruction>();
        this.memSize = memSize;
        this.regSize = regSize;
    }

    public boolean shouldBreak(int _pc)
    {
    	progCode.get(_pc).setBreakPoint(true);
        return true;
    }

    public int getRegSize() 
    {
        return this.regSize;
    }

    public int getMemSize() 
    {
        return this.memSize;
    }

    public void setEntryPoint(int entryPoint)
    {
		this.entryPoint = entryPoint;
	}
    
    public int getEntryPoint()
    {
		return this.entryPoint;
	}
    
    public void addInstruction(Instruction inst) 
    {
    	this.progCode.add(inst);
    }

    public ArrayList<Instruction> getProgCode() 
    {
        return progCode;
    }
}
