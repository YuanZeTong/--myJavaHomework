package homework05_02;
import java.util.*;
public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Random random = new Random();
		int number1 = random.nextInt(10);
		int number2 = random.nextInt(10);
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> answerList = new ArrayList<>(); 
		System.out.print("What is " + number1 + "+ " + number2 +" ?");
		int answer = input.nextInt();
		answerList.add(answer);
		while(number1 + number2 != answer) {
			System.out.println("Wrong answer! try again. what is " + number1 + " + " + number2 + " ?");
			answer = input.nextInt();
			if(answerList.contains(answer)) {
				System.out.println("You already entered " + answer);
			}
			else {
				answerList.add(answer);
			}
		}
		System.out.println("You got it!");
	}

}
