package com.unittest.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;
import com.refreasher.datastructure.ArrayList;

public class ArrayListTest {

	
	@Test
	public void testAdd() {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		assertTrue(list.size() == 3); 
	}

	@Test
	public void testContains() {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		assertFalse(list.contains(4));
		assertTrue(list.contains(3));
	}

	@Test
	public void testRemove() {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2);
		assertFalse(list.contains(3));
	}


	@Test
	public void testClear() {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.clear();
		assertTrue(list.size()==0);
	}
	

}
