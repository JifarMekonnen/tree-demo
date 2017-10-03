package com.jifar.tree;

public class Node {
	private int key;
	private String data;
	private Node left;
	private Node right;
	
	public Node(int key, String data, Node left, Node right) {
		super();
		this.key = key;
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}
