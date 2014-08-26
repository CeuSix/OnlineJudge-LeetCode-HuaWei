package HuaWei;
/*
 * 通过键盘输入一串小写字母(a~z)组成的字符串。请编写一个字符串压缩程序，将字符串中连续出席的重复字母进行压缩，并输出压缩后的字符串。
压缩规则：
1、仅压缩连续重复出现的字符。比如字符串"abcbc"由于无连续重复字符，压缩后的字符串还是"abcbc"。
2、压缩字段的格式为"字符重复的次数+字符"。例如：字符串"xxxyyyyyyz"压缩后就成为"3x6yz"。
 * */
import javax.xml.transform.Templates;

public class StringZip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringZip("cccddecc"));
		System.out.println(stringZip("xxxyyyyyyz"));
		System.out.println(stringZip("pppppppp"));
	}
	public static String stringZip(String inputstr){
		String outputstr="";
		int tempCount=1;
		if(inputstr.length() == 0) return outputstr;
		char preChar=inputstr.charAt(0);
		for(int i=1;i<inputstr.length();i++){
			if(inputstr.charAt(i) == preChar)
				tempCount++;
			else {
				if(tempCount > 1)
					outputstr+=tempCount+String.valueOf(preChar);
				else {
					outputstr+=preChar;
				}
				preChar=inputstr.charAt(i);
				tempCount=1;
			}
		}
		if(tempCount > 1)
			outputstr+=tempCount+String.valueOf(preChar);
		else {
			outputstr+=preChar;
		}
		return outputstr;
	}
}	
