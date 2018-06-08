package com.unittest.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.refreasher.datastructure.LinkedList;

public class LinkedListTest {

	@Test
	public void testAddFirst() {
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		
		assertTrue(ll.getFirst() == (Integer)3);
	}

	@Test
	public void testAdd() {
		LinkedList ll = new LinkedList();
		ll.add(1,0);;
		ll.add(2,1);
		ll.add(3,2);
		
		assertTrue(ll.getLast() == (Integer)1);
	}

	@Test
	public void testAddLast() {
		LinkedList ll = new LinkedList();
		ll.addFirst(3);
		ll.add(2,1);
		ll.addLast(1);
		
		assertTrue(ll.getFirst() == (Integer)1);
	}

	@Test
	public void testGetFirst() {
		LinkedList ll = new LinkedList();
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		assertTrue(ll.getFirst() == (Integer)1);
	}

	@Test
	public void testGetLast() {
		LinkedList ll = new LinkedList();
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		assertTrue(ll.getLast() == (Integer)3);
	}

}
