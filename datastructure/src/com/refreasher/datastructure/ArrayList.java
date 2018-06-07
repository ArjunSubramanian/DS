package com.refreasher.datastructure;

public class ArrayList {

	private int size = 0;
	private static int DEFAULT_CAPACITY = 10;
	private Object elements[];
	
	public ArrayList ()
	{
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void add(Object o)
	{
		if(elements.length == size)
		{
			resize();
		}
		
		elements[size++] = o;
	}
	
	public boolean contains(Object o)
	{
		for (Object element: elements)
		{
			if(o == element)
			{
				return true;
			}
		}
		return false;
	}
	
	public void remove (int index)
	{
		elements[index] = null;
		setSize(size()-1);
	}
	
	public void clear ()
	{
		elements = new Object[DEFAULT_CAPACITY];
		setSize(0);
	}
	public void resize ()
	{
		
		size =0;
		Object[] temp= new Object[elements.length*2];
		for (Object element : elements)
		{
			temp[size++]= element;
		}
		
		elements = temp;
		
	}
	
	public void addAll (Object[] objs)
	{
		for(Object o : objs)
		{
			elements[size++] = o;
		}
	}
	public int size() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
