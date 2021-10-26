package com.cg.oct12.batch3.day3;

public class ThisDemo {
	static int num1;
	int num2;

	static void staticMethod() {
		System.out.println("staticMethod " + ThisDemo.num1);
		ThisDemo obj = new ThisDemo();
		System.out.println("staticMethod " + obj.num2);
	}

	void nonStaticMethod() {
		System.out.println("nonStaticMethod " + ThisDemo.num1);
		System.out.println("nonStaticMethod " + this.num2);
	}

	public static void main(String[] args) {

		ThisDemo.staticMethod();
		ThisDemo obj2 = new ThisDemo();
		obj2.num2 = 10;
		obj2.nonStaticMethod();

	}

}
