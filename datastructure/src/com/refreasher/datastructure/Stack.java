package com.refreasher.datastructure;

public class Stack {
	
	private int m_nSize =0;
	private static int DEFAULT_CAPACITY = 1;
	private Object elements[];
	private Object m_top = null;
	private int m_nTopPointer=-1;
	
	public Stack()
	{
		elements = new Object[DEFAULT_CAPACITY];
	}
	public int getM_nSize() {
		return m_nSize;
	}
	public void setM_nSize(int m_nSize) {
		this.m_nSize = m_nSize;
	}
	
	public Object peek()
	{
		return m_top;
	}
	
	public void push(Object o)
	{
		m_top = o;
		if(getM_nSize() == elements.length)
		{
			resize();
		}
		elements[++m_nTopPointer] = m_top;
		setM_nSize(getM_nSize()+1);
	}
	
	public Object pop()
	{
		Object temp = m_top;
		elements[m_nTopPointer] = null;
		m_top = elements[m_nTopPointer--];
		setM_nSize(getM_nSize()-1);
		return temp;
	}
	public void resize()
	{
		Object temp[] = new Object[getM_nSize()*2];
		int i=0;
		for(Object o : elements)
		{
			temp[i++] = o;
		}
		
		elements = temp;
	}
	
}
