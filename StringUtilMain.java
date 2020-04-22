package kr.ac.jinwoo.day07.homework;

public class StringUtilMain {

	public static void main(String[] args) {
		
		String str = "Hello World Java";
		char ch = 'l';
		
		System.out.println(StringUtil.checkChar(str, ch));
		System.out.println(StringUtil.removeChar(str, ch));
	}
}
