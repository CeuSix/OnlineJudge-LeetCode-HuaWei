package OrdinaryTool;

import java.util.regex.Pattern;

public class Transvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string3 = "Aa   NNbb  1 2   3";
//		System.out.println(string3.length());
//		System.out.println(string3.trim());
//		System.out.println(string3);
//		System.out.println(string3.replace(" ", ""));
//		System.out.println(string3);
		String string[] =string3.split(" ");
		System.out.println(string.length);
		for ( String string2 : string) {
			System.out.println(string2+"12312");
		}
		//System.out.println(Pattern.matches(string, "2233"));
	}

}
