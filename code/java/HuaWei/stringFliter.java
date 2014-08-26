package HuaWei;
/*完成版
 * 字符串过滤，过滤已经出现的字符*/
import java.util.HashSet;

public class stringFliter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="A man, a plan, a canal: Panama";
		//s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		//System.out.println(s);
		fliter("afafafaf");
	}
	public static void fliter(String s){
		HashSet<Character> hs= new HashSet<>();
		String temps="";
		for(int i=0;i<s.length();i++)
		{
			if(!hs.contains(s.charAt(i))){
				temps+=s.charAt(i);
				hs.add(s.charAt(i));
			}
		}
		System.out.println(temps);
	}
}
