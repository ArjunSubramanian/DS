package com.unittest.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.refreasher.datastructure.Stack;

public class StackTest {

	@Test
	public void testPeek() {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		assertTrue(st.peek() == (Integer)2);
	}

	@Test
	public void testPush() {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		assertTrue(st.getM_nSize() == 2);
	}

	@Test
	public void testPop() {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		assertTrue(st.pop() == (Integer)2);
		assertTrue(st.getM_nSize() == 1);
	}

}
