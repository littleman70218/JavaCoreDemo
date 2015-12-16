package net.antra.dayone;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			while(true){
				String str = scanner.next();
				System.out.println(str);
				if("exit".equals(str)){
					break;
				}
			}
		}
	}
}
