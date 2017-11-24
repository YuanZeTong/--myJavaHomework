package homework04_02;

public class TestForMyString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试构造方法
		char[] chars = {'C','r','e','a','t','e',' ','m','y','S','t','r','i','n','g','1','.'};
		MyString1 myString1 = new MyString1(chars);
		myString1.printSelf();
		//测试charAt方法
		System.out.println("charAt[0] of myString1 is " + myString1.charAt(0));
		//测试length方法
		System.out.println("The length of myString1 is " + myString1.length());
		//测试substring方法
		MyString1 testString = myString1.substring(0, 7);
		System.out.println("myString1.substring(0, 7) returned:");
		testString.printSelf();
		//测试 toLowerCase方法
		testString = myString1.toLowerCase();
		System.out.println("myString1.toLowerCase() returned:");
		testString.printSelf();
		//测试equals方法
		char[] chr1 = {'a','c','d'};
		char[] chr2 = {'a','c','d','c'};
		MyString1 a = new MyString1(chr1);
		MyString1 b = new MyString1(chr2);
		System.out.print("a is ");
		a.printSelf();
		System.out.print("b is ");
		b.printSelf();
		System.out.println("a equals b ? "+ a.equals(b));
		//测试valueOf方法
		System.out.print("MyString1.valueOf(7867622) returned: ");
		MyString1.valueOf(7867622).printSelf();
		
	}

}
