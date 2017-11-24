package homework04_03;

public class TestForMyString2 {
	public static void main(String[] args) {
		//测试构造方法
		String s = "Create MyString2.";
		MyString2 myString2 = new MyString2(s);
		myString2.printSelf();
		//测试compare方法
		String a = "asdf", b = "asdfg";
		MyString2 a_myS = new MyString2(a);
		
		System.out.println("a_myS is " + a + "\n" + "b is " + b + "\n" + 
				"a_myS.compare(b) returned: " + a_myS.compare(b));
		//测试substring方法
		System.out.print("myString2.substring(7) returned: ");
		myString2.substring(7).printSelf();
		//测试toChars 方法
		char[] chars = myString2.toChars();
		for(int i = 0; i < chars.length; i++) {
			System.out.println("chars[" + i + "] " + "is " + chars[i]);
		}
		//测试valueOf方法
		System.out.print("MyString2.valueOf(false) returned:");
		MyString2.valueOf(false).printSelf();
	}
}
 