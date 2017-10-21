package homework01;
/*
 * 编写程序，通过初始化或者用户输入一个数组input，
 * 如果数组长度n为奇数，则将数组中最大的元素放到 output[] 数组最中间的位置，
 * 如果数组长度n为偶数，则将数组中最大的元素放到 output[] 数组中间两个位置偏右的那个位置上，
 * 然后再按从大到小的顺序，依次在第一个位置的两边，按照一左一右的顺序，
 * 依次存放剩下的数，输出output数组。
 * 如：input[] = {3, 6, 1, 9, 7}    output[] = {3, 7, 9, 6, 1}; 
 * input[] = {3, 6, 1, 9, 7, 8}  output[] = {1, 6, 8, 9, 7, 3};
 * */
/*
 * 学号：2015117175
 * 姓名：袁泽同
 * 班级：计科二班
 * */
public class HumpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 6, 1, 9, 7, 8};
		System.out.println("数组a中的元素为：");
		printIntArray(a);
		int[] b = new int[a.length];
		//选择排序,从大到小
		int indexOfMax;
		int maxElement;
		for(int i = 0; i < a.length; i++){
			indexOfMax = i;
			maxElement = a[i];
			for(int j = i+1; j < a.length; j++){
				if(maxElement < a[j]){
					maxElement = a[j];
					indexOfMax = j;
				}
			}
			if(indexOfMax != i){
				a[indexOfMax] = a[i];
				a[i] = maxElement;
			}
		}
		if(a.length %2 == 1){
			//如果数组元素个数为奇数
			b[(a.length - 1) / 2] = a[0];
			
			int i=0,j= 1;
			int k = 1;
			int num = (a.length -1) / 2;
			while(i < a.length -1){
				//以a中元素中心最大元素的位置为中点左右循环复制到b
				num += (int)Math.pow(-1,j)*k;
				b[num] = a[i+1];
				k++;
				j++;
				i++;
			}
			for(int x = 0; x < b.length; x++){
				System.out.print(b[x] + " ");
			}
		}
		if(a.length %2 == 0){
			//如果数组元素个数为偶数
			b[a.length / 2] = a[0];
			int i=0,j= 1;
			int k = 1;
			int num = a.length / 2;
			while(i < a.length -1){
				//将以a中元素中心偏右的最大元素的位置为中点左右循环复制到b
				num += (int)Math.pow(-1,j)*k;
				b[num] = a[i+1];
				k++;
				j++;
				i++;
			}
			//打印数组b
			System.out.println("处理后的数组中的元素为：");
			for(int x = 0; x < b.length; x++){
				System.out.print(b[x] + " ");
			}
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
