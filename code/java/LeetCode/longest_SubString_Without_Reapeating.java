package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class longest_SubString_Without_Reapeating {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static  int lengthOfLongestSubstring(String s){
		int length=0;
		HashMap<Character, Integer> hm=new HashMap<>();
		for(int i=0;i< s.length();i++){
			if(!hm.containsKey(s.charAt(i)))
				hm.put(s.charAt(i),i);
			else{
				length=length>hm.size()?length:hm.size();
				i=hm.get(s.charAt(i));
				hm.clear();
			}
		}
		return Math.max(length, hm.size());
	}
}
