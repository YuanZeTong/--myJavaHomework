package homework01;
import java.util.Scanner;
import java.math.*;
public class UseBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a:");
		String str1 = input.nextLine();
		System.out.println("Enter b:");
		String str2 = input.nextLine();
		BigInteger a = new BigInteger(str1);
		BigInteger b = new BigInteger(str2);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		BigInteger aPlusB = a.add(b);
		BigInteger aSubtractB = a.subtract(b);
		System.out.println("a + b = " + aPlusB);
		System.out.println("a - b = " + aSubtractB);
		
	}

}
