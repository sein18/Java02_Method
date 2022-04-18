package com.test01;

public class MethodTest02 {

	public static void main(String[] args) {
		//static : class.method();
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		MethodTest01.defaultMethod();
		//MethodTest01.privateMethod();
		
		//non static : class 변수명 = new class();
		//변수명.method()
		MethodTest01 test = new MethodTest01();
		test.NonStaticMethod();
	}

}
