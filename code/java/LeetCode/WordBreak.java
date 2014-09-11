package LeetCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> dict =new HashSet<>();
		dict.add("leet");
		dict.add("code");
		System.out.println(wordBreak("leetcode",dict));
	}
	public static boolean wordBreak(String s, Set<String> dict) {
		if(dict.size() <=0) return false;
		Pattern pattern;
		Matcher matcher;
		Iterator<String> iterator=dict.iterator();
		while(iterator.hasNext()){
			pattern=Pattern.compile(iterator.next());
			matcher= pattern.matcher(s);
			s=matcher.replaceAll("");
		}
		if(s.equals("")) 
			return true;
		return false;
    }
}
