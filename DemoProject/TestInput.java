package net.antra.dayone;
import java.util.Scanner;
public class TestInput {

	public static void main (String[] args) {
		TestInput res = new TestInput();
		try(Scanner scanner = new Scanner(System.in)) {
			while (true) {
				String str = scanner.next();
				if("q".equals(str)) {
					break;
				}else if(Integer.parseInt(str) <= 0) {
					System.out.println("Input error!");
				}else res.doSometing(str);
			}
		}catch(Exception e){
			System.out.println("error!!!");
		}
	}

	public void doSometing(String str) {
		int num = Integer.parseInt(str);
		int sum = 0;
		for (int i = 0;i <= num;i++) {
			sum += i;
		}
		System.out.println(sum);;
	}
}