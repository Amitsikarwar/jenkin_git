package com.genpact.generic;

public class MyClass<T> {
	private T value;

	public MyClass() {
		super();
	}

	public MyClass(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	

}
