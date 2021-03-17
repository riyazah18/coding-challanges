package com.io.riyaz.stack.implementation;

public class Stack {

	private int[] array;
	private int top;
	private int capacity;
	
	Stack(int capacity){
		this.array=new int[capacity];
		this.capacity=capacity;
		this.top=-1;
	}
	
	public void push(int item) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		array[++top]=item;
	}
	
	public int pop(int item) {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return array[top--]=item;
		
	}
	
	public int peek(int item) {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		return array[top];
		
	}
	
	private boolean isFull() {
		
		return top == capacity-1;
	}
	
	private boolean isEmpty() {
		
		return top == -1;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
