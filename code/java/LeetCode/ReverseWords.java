package LeetCode;
import java.util.*;

public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String result="";
			String temp="";
			String str=sc.nextLine();
			int i=0;
			int flag=0;
			while(i<str.length()){
				if(str.charAt(i) != ' ')
					temp+=str.charAt(i);
				else {
					if(flag == 0)
						result=temp;
					else {
						result=temp + " " + result;
					}
					flag++;
					temp="";
				}
				i++;
			}
			result=temp + " " + result;
			System.out.println(result);
	}

}
