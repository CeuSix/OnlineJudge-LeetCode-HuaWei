package LeetCode;

import HuaWei.stringFliter;

public class longest_Common_Prefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings={"abab","aba","abc"};
		System.out.println(longestCommonPrefix(strings));
		
	}
	public static  String longestCommonPrefix(String[] strs) {
        String sresult="";
        int minLength=Integer.MAX_VALUE;
        if(strs.length == 0) return sresult;
        for(int i=0;i<strs.length;i++){
        	minLength=Math.min(strs[i].length(),minLength);
        }
        char temp='\0';
        for(int i=0;i<minLength;i++){
        	temp=strs[0].charAt(i);
        	for(int j=1;j<strs.length;j++){
        		if(strs[j].charAt(i) != temp)
        			return sresult;
        	}
        	sresult=sresult+String.valueOf(temp);
        }
        return sresult;
    }
}
