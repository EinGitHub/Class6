package june14th;

import java.util.Scanner;

public class mp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
	System.out.println("Please give me a positive number ? ");
	int num = kb.nextInt();
	while (num < 0) {
		System.out.println("invalid entry please try again : ");
		num = kb.nextInt();
		}
	int fact = 1;
	
	if(num == 0) {
		fact=1;
	}
	
	for(int i=1; i <= num ; i++) {
		fact = fact*i;
		
	}
	System.out.println("The factorial of " + num +" is : " + fact);
	
	}
	

}
