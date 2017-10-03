package com.jifar.genericTree;

public class Node<T> {
	private int key;
	private T data;
	private Node<T> left;
	private Node<T> right;
	
	public Node(int key, T data, Node<T> left, Node<T> right) {
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
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
}