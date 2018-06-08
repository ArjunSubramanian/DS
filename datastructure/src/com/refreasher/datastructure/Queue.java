package com.refreasher.datastructure;

public class Queue 
{
	//Variables
	
	private int m_nHead;
	private int m_nTail;
	private static int DEFAULT_CAPACITY = 10;
	private int size ;
	private Object m_queue[];
	
	//Operations
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public Queue()
	{
		m_queue = new Object[DEFAULT_CAPACITY];
		m_nHead = 0;
		m_nTail = 0;
		size = 0;
		
	}
	
	public void add(Object o)
	{
		if(size == m_queue.length)
		{
			resize();
		}
		m_queue[m_nTail] = o;
		m_nTail++;
		size++;
	}
	
	public Object element()
	{
		return m_queue[m_nHead];
	}

	public boolean offer(Object o)
	{
		if(size == m_queue.length)
		{
			return false;
		}
		m_queue[m_nTail] = o;
		m_nTail++;
		size++;
		return true;
	}
	
	public Object remove()
	{
		Object o = m_queue[m_nHead];
		m_queue[m_nHead] = null;
		m_nHead++;
		return o;
	}
	
	public void resize()
	{
		Object temp[] = new Object[m_queue.length*2];
		int i = 0;
		for(Object o : m_queue)
		{
			temp[i++] = o;
		}
		
		m_queue = temp;
	}
}
