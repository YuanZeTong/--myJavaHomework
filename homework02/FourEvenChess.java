package homework02;
/*
 * (游戏四子连)四子连是一个两个人玩的棋盘游戏，
 * 在游戏中，玩家轮流将有颜色的棋子放在一个六行七列的垂直悬挂的网格中。
 * 这个游戏的目的是在对手实现一行、一列或者一条对角线上有四个相同颜色的棋子之前，
 * 你能先做到。程序提示两个玩家交替地下红子Red或黄子Yellow。
 * 当放下一子时，程序在控制台重新显示这个棋盘，
 * 然后确定游戏的状态(赢、平局还是继续)。
 */
/*
 * 学号：2015117175
 * 姓名：袁泽同
 * 班级：计科二班
 * */
import java.util.Scanner;
public class FourEvenChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] composition = new char[6][7];
		String [] whichColor = {"yellow","red"};
		char[] player = {'Y','R'};
		int count = 0;
		int column;
		int[] countOfRows = {5,5,5,5,5,5,5};
		Scanner input = new Scanner(System.in);
		initChessBoard(composition);
		printChessBoard(composition);
		while(count < 43) {
			if(count % 2 == 1) {
				System.out.println("Drop a " + whichColor[0] + " disk at column(0-6):");
				column = input.nextInt();
				while(!judgeRightColumn(column,countOfRows)) {
					System.out.println("Error!Enter a right column:");
					column = input.nextInt();
				}
				composition[countOfRows[column]][column] = 'Y';
				printChessBoard(composition);
				countOfRows[column]--;
				if(judgeWhoWon(composition,player[0])){
					System.out.println("The yellow player won!");
					break;
				}
					
				
			}
			if(count % 2 == 0) {
				System.out.println("Drop a " + whichColor[1] + " disk at column(0-6):");
				column = input.nextInt();
				while(!judgeRightColumn(column,countOfRows)) {
					System.out.println("Error!Enter a right column:");
					column = input.nextInt();
				}
					
				composition[countOfRows[column]][column] = 'R';
				printChessBoard(composition);
				countOfRows[column]--;
				if(judgeWhoWon(composition,player[1])){
					System.out.println("The red player won!");
					break;
				}
			}
			count++;
		}
	}
	public static void printChessBoard (char[][] composition) {
		//打印棋盘
		for(int i = 0; i < composition.length; i++) {
			System.out.print("|");
			for(int j = 0; j < composition[i].length; j++) {
				//composition[i][j] = ' ';
				System.out.print(composition[i][j] + "|");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("---------------");
	}
	public static void initChessBoard(char[][] composition) {
		//初始化棋盘
		for(int i = 0; i < composition.length; i++) {
			for(int j = 0; j < composition[i].length; j++) {
				composition[i][j] = ' ';
			}
		}
	}
	public static boolean judgeRightColumn(int column,int countOfRows[]) {
		//判断输入的列数是否符合要求和实际情况（是否超出棋盘范围）
		if(column > -1 && column < 7 && countOfRows[column] >= 0 )
			return true;
		else
			return false;
    }
	public static boolean judgeWhoWon(char[][] composition,char rOrY) {
		//判断某个玩家落子后是否已经赢了
		boolean ans = false;
		for(int i = 0; i < composition.length; i++) {
			for(int j = 0; j < composition[i].length; j++) {
				if(j + 3 < 7)
					if(composition[i][j] == rOrY && composition[i][j + 1] == rOrY &&
						composition[i][j + 2] == rOrY && composition[i][j + 3] == rOrY)
						ans = true;
				if(i + 3 < 6)
					if(composition[i][j] == rOrY && composition[i + 1][j] == rOrY &&
						composition[i + 2][j] == rOrY && composition[i + 3][j] == rOrY)
						ans = true;
				if(i + 3 < 6 && j + 3 < 7)
					if(composition[i][j] == rOrY && composition[i + 1][j + 1] == rOrY &&
						composition[i + 2][j + 2] == rOrY && composition[i + 3][j + 3] == rOrY)
						ans = true;
				if(i + 3 < 6 && j - 3 > -1)
					if(composition[i][j] == rOrY && composition[i + 1][j - 1] == rOrY &&
							composition[i + 2][j - 2] == rOrY && composition[i + 3][j - 3] == rOrY)
						ans = true;
			}
		}
		if(ans)
			return true;
		else
			return false;
	}
}
