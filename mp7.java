package june14th;

import java.util.Scanner;

public class mp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me a positive number for ? ");
		int num = kb.nextInt();

		for(int i = 1 ; i<=10 ; i++){
	    if(i == num) {
    	 continue;
     }
			System.out.println(i);


	}
		}

}
