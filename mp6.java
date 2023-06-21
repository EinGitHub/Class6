package june14th;

import java.util.Scanner;

public class mp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me a positive number for Fib ? ");
		int num = kb.nextInt();
		while (num < 0) {
			System.out.println("invalid entry please try again : ");
			num = kb.nextInt();
			}
	int a=0,b=1,c=0;
	
	for(int i = 1 ; i <= num ; i++){
	System.out.print(c + " ");
	a = b;
	b = c;
	c = a + b;
	}
	}

}
