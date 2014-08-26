package OrdinaryTool;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import HuaWei.stringFliter;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str=null;
			//System.out.println(str.length());
			str="";
			str="man"+'a';
			System.out.println(str);
			int a=5;
			str=String.valueOf(a)+'a';
			System.out.println(str);
			//System.out.println(str.length());
			str="abcdef";
			String str1 = "abcdef";
			String str3 = "ab";
			String str4=str3+"cdef";
			System.out.println(str4);
			String str2=new String("abcdef");
			if(str == str4)
				System.out.println("地址一样");
			else {
				System.out.println("地址不一样");
			}
			Vector<BigDecimal> vc=new Vector<>();
			vc.add(0, new BigDecimal("55555555555555555555"));
			vc.add(1, new BigDecimal("222222222222"));
			System.out.println(vc.get(0).divide(new BigDecimal("5")).toString());
			StringBuffer sb = new StringBuffer(str1);
			sb.reverse();
			System.out.println(sb);
			LinkedList<Integer> ls= new LinkedList<>();
			ls.add(1);
			ls.add(2);
			for(int i=0;i<ls.size();i++){
				System.out.println(ls.get(i));
				ls.remove(i);
			}
			for(int i : ls)
			{
				System.out.println(i);
			}
			String text    =
			          "John writes about this, and John Doe writes about that," +
			                  " and John Wayne writes about everything.";
			String patternString1 = "John (.+?) ";
			Pattern pattern = Pattern.compile(patternString1);
			Matcher matcher = pattern.matcher(text);
			while(matcher.find()) {
			    System.out.println("found: " +matcher.group(0));
			}
			
	}
}
