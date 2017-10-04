package com.jifar.genericTree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {

	private Tree<Double> tree = new Tree<Double>();
	@Before
	public void setUp() throws Exception {
		tree.insert(2,0.2);
		
		for(int i =0 ; i <= 3;i+=2) {
        	if(i==2) {}else {
        	tree.insert(i, i*0.1);}
    	}
        for(int i =1 ; i <= 3;i+=2) {
        	tree.insert(i, i*0.1);
    	}
	}

	@Test
	public void testFind() {
		assertEquals(0.1, this.tree.find(1).getData(),0.1);
	}

	@Test
	public void testInsert() {
		this.tree.insert(-1, -0.1);
		assertEquals(-0.1,this.tree.find(-1).getData(),0.1);
	}

	@Test
	public void testMin() {
		assertEquals(0,this.tree.min(this.tree.root).getKey());
	}

	@Test
	public void testMax() {
		assertEquals(3,this.tree.max(this.tree.root).getKey());
	}

	@Test
	public void testCreateNode() {
		tree.createNode(tree.root, 0.4, 4);
		assertEquals(0.4, tree.max(tree.root).getData(),0.1);
	}

	@Test
	public void testCreateRootNode() {
		tree.createRootNode(4,0.4);
		assertEquals(0.4, tree.root.getData(),0.1);
		assertEquals(2, tree.root.getKey());
	}

	@Test
	public void testGetChilds() {
		assertEquals(2,tree.getChilds(tree.root).size());
		assertEquals(3,tree.getChilds(tree.root).get(1).getKey());
	}

	@Test
	public void testIsNodeParentOf() {
		assertTrue(tree.isNodeParentOf(tree.root,tree.root.getLeft()));
		assertFalse(tree.isNodeParentOf(tree.root.getRight(),tree.root.getLeft()));
	}

	@Test
	public void testGetRootNode() {
		assertEquals(2,tree.getRootNode().getKey());
	}

}
