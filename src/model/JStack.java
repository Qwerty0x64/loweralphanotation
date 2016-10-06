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

import java.util.*;


/**
 * JStack describes a regular Stack with some more options for visualization.
 * @author Ashley Maxine Stirling
 * @param <T>
 */

public class JStack<T> {
	
	private List<T> list;
	
	/**
	 * @author Ashley Maxine Stirling 
	 * @param Index of the Item in stack.
	 * @return Returns the value at the Index.
	 */
	public T getItemOfList(int index) {
		return this.list.get(index);
	}
	
	/** Sets the item at the index.
	 * @author Ashley Maxine Stirling 
	 * @param index 
	 * @param t
	 */
	public void setItemOfList(int index, T t) {
		this.list.set(index, t);
	}
	
	/**
	 * @author Ashley Maxine Stirling 
	 * @return Returns the size of stack.
	 */
	public int getSize() {
		return this.list.size();
	}
	
	/**
	 * @author Ashley Maxine Stirling
	 * @param t - Pushes an item of T into the stack.
	 */
	public void push(T t) {
		this.list.add(t);
	}
	
	public T pop() {
		T t = this.list.get(this.list.size() - 1);
                list.remove(this.list.size() - 1);
                return t;
                
	}
	
	public JStack() {
		this.list = new ArrayList<T>();		
	}
	
	public JStack<T> clone() {
		return this;
	}
	
	public JStack<T> shallowclone() {
		return this;
	}
	
	public JStack<T> deepclone() {
		JStack<T> t = new JStack<T>();
		t.list = copyList();
		return t;
	}
	
	private List<T> copyList() {
		List<T> l = new ArrayList<T>(this.list);		
		return l;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < this.list.size(); i++) {
			s += this.list.get(i).toString() + " ";			
		}
		return s;
	}	
	
	
}

