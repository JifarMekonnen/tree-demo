package com.jifar.genericTree;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Tree<Date> tree = new Tree<Date>();
        tree.insert(2, new Date(2*1000000000)); 
    	
        for(int i =0 ; i <= 3;i+=2) {
        	if(i==2) {} else {
        	tree.insert(i, new Date(i*1000000000));
        	}
    	}
        for(int i =1 ; i <= 3;i+=2) {
        	tree.insert(i, new Date(i*1000000000));
    	}
        //System.out.println(tree.find(1).getData());
        tree.traverseInOrder(tree.root);
        //tree.prefix(tree.root);
        //System.out.println(tree.max(tree.root).getData());
	}

}
