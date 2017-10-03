package com.jifar.tree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Tree theTree = new Tree();
    	// make a tree
    	
    	
    	theTree.insert(2, "data_e_"+2); 
    	
        for(int i =0 ; i <= 3;i+=2) {
        	if(i==2) {}else {
        	theTree.insert(i, "data_e_"+i);}
    	}
        for(int i =1 ; i <= 3;i+=2) {
        	theTree.insert(i, "data_o_"+i);
    	}
        //theTree.insert(-1, "data_e_"+-1); 
    	
    	//System.out.println(theTree.max(theTree.root).getData());
    	//System.out.println(theTree.find(0).getData());
    	//theTree.traverseInOrder(theTree.root);
        //theTree.prefix(theTree.root);
    	System.out.println(theTree.isNodeParentOf(theTree.root.getRight(),theTree.root.getLeft()));
    }
}
