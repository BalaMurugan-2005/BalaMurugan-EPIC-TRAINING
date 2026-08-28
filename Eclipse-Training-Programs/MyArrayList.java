package myfirstproject;

public class MyArrayList{
	
	private int[] data;
	
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public MyArrayList() {
		data = new int[DEFAULT_CAPACITY];
		size =0;
	}
	
	
	public void add(int value) {
		if(size == data.length) {
			grow();
		}
		data[size] = value;
		size++;
	}
	
	public void add(int index , int value) {
		
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index : " + index);
		}
		
		if (size == data.length) {
			grow();
		}
		
		for(int i=size; i > index; i--) {
			data[i] = data[i-1];
		}
		
		data[index] = value;
		size++;
	}
	
	public int get(int index) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index : " + index);
		}
		return data[index];
	}
	
	public void set(int index , int value) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index : "  + index);
		}
		data[index] = value;
	}
	
	public void remove(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index : " + index);
		}
		for(int i=index; i<size -1; i++) {
			data[i] = data[i+1];
			
		}
		size--;
	}
	public int size() {
		return size;
		
	}
	
	
	
	
	
	
	
	private void grow() {
		int newCapacity = data.length *2;
		int[] newData = new int[newCapacity];
		for(int i = 0; i<size; i++) {
			newData[i] = data[i];
		}
		data = newData;
		System.out.println("Array grew to size : " + newCapacity);
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
