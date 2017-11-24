package homework04_03;

public class MyString2 {
	private String s;//私有数据域
	//构造方法
	public MyString2(String s) {
		this.s = s;
	}
	//比较参数字符串与本字符串的大小
	public int compare(String s) {
		int bigLen = this.s.length(), smallLen = s.length();
		if(s.length() > this.s.length()) {
			bigLen = s.length();
			smallLen = this.s.length();
		}
		for(int i = 0; i < smallLen; i++) {
			if(s.charAt(i) == this.s.charAt(i))
				continue;
			else
				return (int)(this.s.charAt(i) - s.charAt(i));
		}
		if(smallLen == bigLen)
			return 0;
		else if(bigLen == s.length())
			return -(int)s.charAt(smallLen);
		else
			return (int)this.s.charAt(smallLen);
	}
	//返回从下标 begin 开始到原字符串末尾的子串
	public MyString2 substring(int begin) {
		char[] chars = new char[s.length() - begin];
		for(int i = 0, j = begin; i < s.length() - begin; i++, j++) {
			chars[i] = s.charAt(j);
		}
		String news = new String(chars);
		MyString2 newMyString2 = new MyString2(news);
		return newMyString2;
	}
	//将原字符串中的小写字母变为大写字母，并返回新字符串的引用
	public MyString2 toUpperCase() {
		char[] chars = new char[s.length()];
		int d = (int)('Z' - 'z');
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) > 'a' && s.charAt(i) < 'z')
				chars[i] = (char)(s.charAt(i) + d);
			else
				chars[i] = s.charAt(i);
		}
		String news = new String(chars);
		MyString2 newMyString2 = new MyString2(news);
		return newMyString2;
	}
	//将MyString2 的字符串转化为char[]型，并返回字符数组的引用
	public char[] toChars() {
		char[] chars = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
		return chars;
	}
	//返回boolean值的字符串表示
	public static MyString2 valueOf(boolean b) {
		String sForBoolean = "true";
		if(b) {
			MyString2 result = new MyString2(sForBoolean);
			return result;
		}
			
		else {
			sForBoolean = "false";
			MyString2 result = new MyString2(sForBoolean);
			return result;
		}
	}
	//打印自身内容
	public void printSelf() {
		System.out.println(s);
	}
}
