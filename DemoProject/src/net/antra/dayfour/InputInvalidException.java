package net.antra.dayfour;

public class InputInvalidException extends Exception{
	String someVariable;

	public String getSomeVariable() {
		return someVariable;
	}

	public void setSomeVariable(String someVariable) {
		this.someVariable = someVariable;
	}
}
