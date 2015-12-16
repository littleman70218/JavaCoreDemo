package net.antra.dayfour;

import java.util.Scanner;

public class TestExceptionHandling3 {
	public static void main(String[] args) {
		TestExceptionHandling3 test3 = new TestExceptionHandling3();
		test3.methodDemo();
	}

	private void methodDemo() {
		try(Scanner scanner = new Scanner(System.in)){
			while(true){
				String str = scanner.next();
				try {
					checkInput(str);
				} catch (InputInvalidException e) {
					System.out.println("Input is invalid number");
					continue;
				}
				System.out.println("Input is : " + str);
			}
		}
	}

	private void checkInput(String str) throws InputInvalidException {
		try{
			double d = Double.parseDouble(str);
			if(d < 10 || d > 100){
				throw new InputInvalidException();
			}
		}catch(Exception e){
			throw new InputInvalidException();
		}
	}
}
