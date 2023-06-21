package june14th;
import java.util.Scanner;
public class mp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//This program ask user 6 times 2 val a
		// and give the result of div first val by second val
		
		
		final int LIMIT = 6;
		int count = 0;
		double val1,val2;
		Scanner kb = new Scanner(System.in);
		System.out.println("You will be allowed 6 chances to enter");
		System.out.println("You can enter -1 -1 at anytime to stop");
		System.out.println();
		
		while(count<LIMIT) {
			count++;
			System.out.println("This is devision # " + count + ": ");
			System.out.println("Please enter the numbers");
			val1 = kb.nextDouble();
			val2 = kb.nextDouble();
		
			if(val1 == -1 && val2 ==-1){
				break;
			}
				if(val2 == 0) {
					System.out.println("You cant do this , you lost one attempt");
					continue;
				
				}
			System.out.println("division # " + count + "result is " + val1/val2);
		}
		System.out.println("Ty , youre done");
	kb.close();
	}
		
		
	
}


