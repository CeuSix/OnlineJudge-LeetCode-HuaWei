package LeetCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//46.e3 .2e81 .e1
		System.out.println(isNumber("3."));
	}
	public static boolean isNumber(String s) {
		s=s.trim();
		String patternString1 = "^[\\+|-]*\\d+$|^[\\+|-]*\\d*\\.\\d+$|^[\\+|-]*\\d+e[\\+|-]*\\d+$|^[\\+|-]*\\d+\\.\\d*$";
		Pattern pattern = Pattern.compile(patternString1);
		Matcher matcher = pattern.matcher(s);
		if(matcher.find())
			return true;
		patternString1 = "^[\\+|-]*\\d*\\.\\d+e[\\+|-]*\\d+$|^[\\+|-]*\\d+\\.\\d*e[\\+|-]*\\d+$";
		pattern = Pattern.compile(patternString1);
		matcher = pattern.matcher(s);
		if(matcher.find())
			return true;
        return false;
    }
}
