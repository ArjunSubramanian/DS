package com.refreasher.datastructure;

public class LinkedList {

	private Node m_head;
	private int m_size;
	
	//operations
	public LinkedList ()
	{
		m_head = new Node(null);
		m_size =0;
	}
	
	public LinkedList (Object value)
	{
		m_head = new Node(value);
		m_size = 0;
	}
	
	public void addFirst(Object value)
	{
		Node temp = m_head;
		m_head = new Node(value);
		m_head.setNext(temp);
		m_size++;
	}
	
	public void add(Object value, int index)
	{
		Node temp = m_head;
		Node holder = temp;
		
		for(int i=0; i < index-1  && temp.getNext() != null;i++)
		{
			temp = holder.getNext();
			holder = temp;
		}
		
		m_head = new Node(value);
		m_head.setNext(temp);
		m_size++;
	}
	
	public void addLast(Object value)
	{
		Node temp = m_head;
		Node holder = temp;
		while(temp.hasNext())
		{
			temp = holder.getNext();
			holder = temp;
		}
		
		m_head = new Node(value);
		m_head.setNext(temp);
		m_size++;
	}
	
	public Object element()
	{
		return m_head.getValue();
	}
	public Object getFirst()
	{
		return m_head.getValue();
	}
	
	public Object getLast()
	{
		Node temp = m_head;
		Node holder = temp;
		while(temp.hasNext())
		{
			temp = holder.getNext();
			holder = temp;
		}
		
		return temp.getValue();
	}
	
	//Inner Class
	private class Node
	{
		//Variables
		private Node m_next ;
		private Object m_value;
		
		//Operations
		

		public Node(Object value)
		{
			m_value = value;	
		}
		
		public Node getNext() {
			return m_next;
		}
		
		public boolean hasNext() {
			return (m_next == null || m_next.getValue() == null) ? false : true;
		}

		public void setNext(Node next) {
			this.m_next = next;
		}
		
		public Object getValue() {
			return m_value;
		}
	}
}
