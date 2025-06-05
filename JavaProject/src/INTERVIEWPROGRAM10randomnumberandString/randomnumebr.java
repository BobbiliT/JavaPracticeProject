
package INTERVIEWPROGRAM10randomnumberandString;

import java.util.Random;

public class randomnumebr {
	public static void main(String[] args) {
		Random rand = new Random();
		int r = rand.nextInt(10);
		System.out.println("print random number :" + r);
	}
}
