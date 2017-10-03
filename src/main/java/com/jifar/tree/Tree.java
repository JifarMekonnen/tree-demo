package com.jifar.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	
	public Node root;
	
	public Node find(int key) {
		if(this.root == null) {
			return null;
		}
		Node curr = this.root;
		while (true) {
			if(curr==null) return null; 
			System.out.println(curr.getKey());
			if(key == curr.getKey()) {
				return curr;
			}else if(key < curr.getKey()) {
				curr = curr.getLeft();
			}else {
				curr = curr.getRight();
			}
		}
	}
	
	public void insert(int key, String data) {
		if(this.root==null) {
			this.root = new Node(key, data, null, null);
			return;
		}
		int branch = 0;
		Node curr = root;
		Node prev = root;
		while(curr != null) {
			prev = curr;
			if(key < curr.getKey()) {
				branch = 0;
				curr = curr.getLeft();
			}else {
				branch = 1;
				curr = curr.getRight();
			}
		}
		if(branch == 0) {
			prev.setLeft(new Node(key,data,null,null));
		}else {
			prev.setRight(new Node(key,data,null,null));
		}
	}
	
	public void traverseInOrder(Node n) {
		if(n==null)return;
		traverseInOrder(n.getLeft());
		System.out.println(n.getData());
		traverseInOrder(n.getRight());
	}
	
	public void prefix(Node n) {
		if(n == null ) return;
		System.out.println(n.getData());
		prefix(n.getLeft());
		prefix(n.getRight());
	}
	
	public void postfix(Node n) {
		if(n == null) return;
		postfix(n.getLeft());
		postfix(n.getRight());
		System.out.println(n.getData());
	}
	
	public Node min(Node n) {
		while(n.getLeft()!=null)
			n=n.getLeft();
		return n;
	}
	
	public Node max(Node n) {
		while(n.getRight()!=null)
			n=n.getRight();
		return n;
	}
	
	public Node createNode(Node parent,String data, int key){
		if(parent == null) return null;
		Node newNode = new Node(key,data,null,null);
		if(key<parent.getKey()){
			parent.setLeft(newNode);
		}else{
			parent.setRight(newNode);
		}
		return newNode;
	}
	
	public Node createRootNode(int key , String data){
		if(this.root == null){
			this.root = new Node(key, data, null, null);
		}else{
			this.root.setData(data);
		}
		return this.root;
	}
	
	public List<Node> getChilds(Node parent){
		List<Node> childs = new ArrayList<Node>();
		if(parent.getLeft()!=null)childs.add(parent.getLeft());
		if(parent.getRight()!=null)childs.add(parent.getRight());
		return childs;
	}
	
	public boolean isNodeParentOf(Node A , Node B){
		if(A == null || B == null) {
			return false;
		}
		Node curr = A;
		while (true) {
			if(curr==null) return false; 
			System.out.println(curr.getKey());
			if(B.getKey() == curr.getKey()) {
				return true;
			}else if(B.getKey() < curr.getKey()) {
				curr = curr.getLeft();
			}else {
				curr = curr.getRight();
			}
		}
	}
	
	public Node getRootNode(){
		return this.root;
	}

}
