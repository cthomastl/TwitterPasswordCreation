package twitter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		handle h = new handle();
		Scanner scan = new Scanner(System.in);
		boolean set = true;
			System.out.println("Create your twitter handle");
			String input = scan.nextLine();
			h.setTwitterHandle(input);
			System.out.println("");
			System.out.println("Create your password");
			System.out.println("");
			String input2 = scan.nextLine();
			h.setPassword(input2);
			
		
	}

}
