package net.antra.daytwo.inheritence;

public class Student extends Person{
	static String name = "Personal";
	@Override
	public void eat(String food) {
		System.out.println(name + " Eat food : " + food + " as a student");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("A student is released.");
	}
	
}
