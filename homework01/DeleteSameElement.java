package homework01;
/*
 * 编写程序，通过初始化或者用户输入两个数组a和b，
 * 求两个数组的和差并输出，
 * 所谓和差就是去掉两个数组中相同的元素 
 * 然后将两个数组中的元素存放在一个新的数组中，
 * 且数组A中元素要在B数组元素之前。
 * 如：输入： int[] a={1,2,4,7,6,9};    int[] b={2,4,3,10};
 * 输出： int[] c = {1, 7, 6, 9, 3, 10};
 * */
/*
 * 学号：2015117175
 * 姓名：袁泽同
 * 班级：计科二班
 * */
public class DeleteSameElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,4,7,6,9};
		int[] b = {2,4,3,10};
		int[] c = new int[100];
		int[] d = new int[100];
		System.out.println("数组a中的元素为：");
		printIntArray(a);
		System.out.println("数组b中的元素为：");
		printIntArray(b);
		//寻找a,b两个数组中相同的元素并放入c数组
		int count0 = 0; 
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i] == b[j]){
					c[count0] = a[i];
					count0++;
				}
			}
		}
		//将a数组中不在c数组中的元素传入d数组
		int num0 = 0;
		int count1 = 0;
		for (int i= 0; i < a.length; i++){
			for(num0 = 0; num0 < count0; num0++){
				if(c[num0] == a[i])
					break;		
			}
			if(num0 == count0){
				d[count1] = a[i];
				count1++;
			}
		}
		//将b数组中不在c数组中的元素传入d数组
		int num1 = 0;
		int count2 = count1;
		for (int i= 0; i < b.length; i++){
			for(num1 = 0; num1 < count0; num1++){
				if(c[num1] == b[i])
					break;	
			}
			if(num1 == count0){
				d[count2] = b[i];
				count2++;
			}
		}
		//打印d数组
		System.out.println("数组d中的元素为：");
		for(int i = 0; i < count2; i++){
			System.out.print(d[i] + " ");
		}
        
	}
	public static void printIntArray(int[] a) {
		//打印数组长度就是数组中元素个数的int型数组的方法
    	for(int e: a) {
			System.out.print(e + " ");
		}
    	System.out.println();
    }
}
