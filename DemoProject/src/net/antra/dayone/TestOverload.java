package net.antra.dayone;

public class TestOverload {
	public static void main(String[] args) throws Exception {
		TestOverload to = new TestOverload();
		to.print(1);
		to.print(1d);
		to.print("hello");
	}
	
	public void print(int i){
		System.out.println("Print a int: " + i);
	}
	private void print(double i){
		System.out.println("Print a double: " + i);
	}
	public void print(String i) throws Exception{
		System.out.println("Print a string: " + i);
	}
	//a method signature is the method name and the number and type of its parameters
}
