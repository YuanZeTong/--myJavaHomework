package homework07_01;
import java.util.Scanner;
public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a binary number:");
			String bin = input.nextLine();
			int dec = bin2Dec(bin);
			System.out.println("This binary number is decimal ;" + dec);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
	}
	public static int bin2Dec (String bin) throws NumberFormatException {
		int dec = 0;
		for(int i = 0; i < bin.length(); i++) {
			char temp = bin.charAt(i);
			if(temp != '0' && temp != '1')
				throw new NumberFormatException(bin);
			else {
				if(temp == '1') {
					dec += (int)Math.pow(2, bin.length() - 1 - i);
				}	
			}
		}
		return dec;
	}

}
