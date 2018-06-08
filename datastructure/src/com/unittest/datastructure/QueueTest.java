package com.unittest.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

import com.refreasher.datastructure.Queue;

public class QueueTest {

	@Test
	public void testAdd() {
		Queue queue = new Queue();
		queue.add(2);
		queue.add(4);
		
		assertTrue((Integer)2 == queue.element());
	}

	@Test
	public void testElement() {
		Queue queue = new Queue();
		queue.add(8);
		queue.add(100);
		queue.add(101);
		
		assertTrue((Integer)8 == queue.element());
		
		assertTrue((Integer)8 == queue.remove());
		
		assertTrue((Integer)100 == queue.element());
	}

	@Test
	public void testOffer() {
		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		assertFalse(queue.offer(11));
		
	}

		@Test
	public void testRemove() {
			Queue queue = new Queue();
			queue.add(8);
			queue.add(100);
			queue.add(101);
			
			assertTrue((Integer)8 == queue.remove());
	}

}
