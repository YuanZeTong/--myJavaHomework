package homework05_03;
import java.util.*;
public class FindMinNForPerfectSquare {
	
	//创建用于存储m的最小因子的数组列表
	private  static ArrayList<Integer> list = new ArrayList<>();
	//寻找m的最小因子的方法
	public static void getMinSubmultipleList(int m) {
		int middle = getMiddle(m);
		for(int i = 2; i < middle; i++) {
			if(!isPrimeNumber(i))
				continue;
			if(m % i == 0) {
				list.add(i);
				if(!isPrimeNumber(m / i))
					getMinSubmultipleList(m / i);
				else
					list.add(m / i);
				break;
			}
		}
		
	}
	//找到0到m的中间位置
	public static int getMiddle(int m) {
		if(m % 2 == 0)
			return m/2 + 1;
		return (m + 1) / 2;
	}
	//判断一个数是否是素数
	public static boolean isPrimeNumber(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	//寻找n使得m * n 是一个完全平方
	public static int findN() {
		int n = 1;
		for(int i = 0; i < list.size(); i++) {
			if(i + 1 < list.size() && list.get(i) == list.get(i + 1))
				continue;
			int temp = list.get(i);
			int count = 0;
			for(int j  = 0; j < list.size(); j++) {
				if(temp == list.get(j))
					count++;
			}
			if(count % 2 == 1)
				n *= list.get(i);
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		m  = input.nextInt();
		getMinSubmultipleList(m);
		n = findN();
		System.out.println("The smallest number n for m * n to be a perfect square is " + n + "\n" + "m * n is " + m * n);
		System.out.println(list);
		
	}

}
