package net.antra.daytwo.inheritence;

public class TestInheritance {
	public static void main(String[] args) {
		Person prs = new Person();
		Student std = new Student();
//		std = null;
//		System.gc();
//		std = new Student();
		std.eat("apple");
		prs.eat("orange");
	}
}
