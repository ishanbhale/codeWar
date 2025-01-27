package com.implement.list;

import java.util.Arrays;

public class ArrayListImpl {
	int capacity = 10;
	Object[] elementData;

	int index = 0;

	public ArrayListImpl() {
		super();
		elementData = new Object[capacity];

	}

	void add(Object o) {
		ensureCapacity();
		elementData[index++] = o;

	}

	void ensureCapacity() {
		if (capacity - index <= 0) {
			capacity = (capacity * 3) / 2 + 1;
			elementData = Arrays.copyOf(elementData, capacity);
			System.out.println("New capacity: " + capacity);
		}

	}

	Integer get(int index) {
		Integer element = null;
		try {
			if(index<this.index){
			element = (Integer) elementData[index];
			}
			else{
				throw new ArrayIndexOutOfBoundsException();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return element;
	}
	
	void remove(int index){
		try {
			if(index<this.index){
			elementData[index] = null;
			while(index<this.index){
				elementData[index] = elementData[index+1];
				index++;
			}
			}
			else{
				throw new ArrayIndexOutOfBoundsException();
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ArrayListImpl obj = new ArrayListImpl();
		obj.add(24);
		obj.add(25);
		obj.add(24);
		obj.add(25);
		obj.add(10);
		obj.add(25);
		obj.add(24);
		obj.add(25);
		obj.add(24);
		obj.add(25);
		obj.add(24);
		obj.add(25);
		System.out.println(obj.get(3));
		obj.remove(3);
		System.out.println(obj.get(15));
		for (Object a : obj.elementData) {
			System.out.println(a);
		}
	}

}
