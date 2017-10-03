package com.jifar.tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {
    private Tree theTree = new Tree();
	@Before
	public void setUp() throws Exception {
		
    	theTree.insert(2, "data_e_"+2); 
    	
        for(int i =0 ; i <= 3;i+=2) {
        	if(i==2) {}else {
        	theTree.insert(i, "data_e_"+i);}
    	}
        for(int i =1 ; i <= 3;i+=2) {
        	theTree.insert(i, "data_o_"+i);
    	}
	}

	@Test
	public void testFind() {
		assertEquals("data_e_2", theTree.find(2).getData());
	}

	@Test
	public void testInsert() {
		theTree.insert(-1, "data_o_-1");
		assertEquals("data_o_-1", theTree.find(-1).getData());
	}
	
	@Test
	public void testMin() {
		assertEquals("data_e_0", theTree.min(theTree.root).getData());
	}

	@Test
	public void testMax() {
		assertEquals("data_o_3", theTree.max(theTree.root).getData());
	}

	@Test
	public void testCreateNode() {
		theTree.createNode(theTree.root, "data_e_4", 4);
		assertEquals("data_e_4", theTree.max(theTree.root).getData());
	}
	
	@Test
	public void testCreateRootNode() {
		theTree.createRootNode(4,"data_e_4");
		assertEquals("data_e_4", theTree.root.getData());
		assertEquals(2, theTree.root.getKey());
	}
	
	@Test
	public void testGetChilds() {
		assertEquals(2,theTree.getChilds(theTree.root).size());
		assertEquals(3,theTree.getChilds(theTree.root).get(1).getKey());
	}
	
	@Test
	public void testIsNodeParentOf() {
		assertTrue(theTree.isNodeParentOf(theTree.root,theTree.root.getLeft()));
		assertFalse(theTree.isNodeParentOf(theTree.root.getRight(),theTree.root.getLeft()));
	}
	
	@Test
	public void testGetRootNode() {
		assertEquals(2,theTree.getRootNode().getKey());
	}
}
