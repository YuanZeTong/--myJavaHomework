package homework04_02;

public class MyString1 {
	private char[] chars;//私有数据域
	
	//构造方法
	public MyString1(char[] chars) {
		this.chars = chars;
	}
	//返回指定下标的字符
	public char charAt(int index) {
		return chars[index];
	}
	//返回字符串的字符数
	public int length() {
		return chars.length;
	}
	//返回下标从begin 到 end - 1 的子字符串
	public MyString1 substring(int begin, int end) {
		char[] newchars = new char[end - begin];
		for(int i = 0, j = begin; i < end - begin - 1; i++, j++ ) {
			newchars[i] = chars[j];
		}
		MyString1 newString = new MyString1(newchars);
		return newString;
	}
	//将字符串中的大写字母转化为小写字母并返回新字符串
	public MyString1 toLowerCase() {
		int b = (int)('z' - 'Z');
		char[] newChars = new char[this.length()]; 
		for(int i = 0; i < this.length(); i++) {
			if(chars[i] < 'Z' && chars[i] > 'A') {
				newChars[i] = (char)(chars[i] + b);
			}
			else
				newChars[i] = chars[i];
		}
		MyString1 newString = new MyString1(newChars);
		return newString;
	}
	//重写父类equals（Object o） 方法，判断两个字符串是否相同
	public boolean equals(Object o) {
		if(o instanceof MyString1) {
			if(((MyString1) o).length() == this.length()) {
				for(int i = 0; i < ((MyString1) o).length(); i++) {
					if(((MyString1) o).charAt(i) != this.charAt(i))
						return false;
				}
				return true;
			}
			else
				return false;
		}
		else return o == this;
	}
	//静态方法：将int型参数转化为字符串，并返回字符串的引用
	public static MyString1 valueOf(int i) {
		int count = 0, index = 0,j;
		char[] temp = new char[11];
		if(i < 0) {
			temp[0] = '-';
			index = 1;
			while(i != 0) {
				j = i % 10;
				temp[index] = (char)(j + (int)'0');
				count = index + 1;
				index++;
				i /= 10;
			}
		}
		else if(i > 0){
			while(i != 0) {
				j = i % 10;
				temp[index] = (char)(j + (int)'0');
				count = index + 1;
				index++;
				i /= 10;
			}
		} 
		else {
			count = 1;
			temp[0] = '0';
		}
		char[] newchars = new char[count];
		for(int m = 0, n = count -1; m < count; m++, n--) {
			newchars[m] = temp[n];
		}
		MyString1 newString = new MyString1(newchars);
		return newString;
	}
	public void printSelf() {
		for(int i = 0; i < this.length(); i++) {
			System.out.print(this.charAt(i));
		}
		System.out.println();
	}
}
