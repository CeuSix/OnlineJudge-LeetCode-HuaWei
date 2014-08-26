package LeetCode;

public class implementStrStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("abcd", ""));
	}
	public static String strStr(String haystack, String needle) {
        boolean bContain=true;      
        if (haystack == null || needle == null) return null;  
        if (needle.length() == 0) return haystack;  
        if (needle.length() > haystack.length()) return null; 
        for(int i=0;i<haystack.length()-needle.length();i++){
        		bContain=true;
        		for(int j=0;j<needle.length();j++){
        			if(haystack.charAt(i+j) != needle.charAt(j)){
        				bContain=false;
        				break;
        			}
        		}
        		if(bContain == true)
        			return haystack.substring(i);
        }
        return null;
    }
}
