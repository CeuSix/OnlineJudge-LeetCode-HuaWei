package HuaWei;

import java.util.Scanner;

public class NineAndEleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			String string=scanner.next();
			int temp=0;
			int multi=0;
			if(string.length() <1)
			{
				System.out.println("-1");
				return;
			}
			else{
					if(string.charAt(0) == '0'){
						if(string.charAt(1) == 'v' || string.charAt(1) == 'V')
							Nine(string);
						else if(string.charAt(1) == 'w' || string.charAt(1) == 'W')
							Eleven(string);
						else {
							System.out.println(-1);
						}
					}
					else {
						System.out.println("-1");
					}
			}
	}
	public static void Nine(String str){
		int result=0;
		if(str.length() == 2)
			System.out.println(0);
		else{
			for(int i=2;i<str.length();i++){
				int num=str.length()-i-1;
				int multi=1;
				for(int j=0;j<num;j++)
				{
					multi=multi*9;
				}
				int temp=(int)str.charAt(i)-(int)('0');
				if(temp < 9 && temp >=0)
					result +=temp*multi;
				else {
					System.out.println("-1");
					return;
				}
			}
			System.out.println(result);
		}
	}
	public static void Eleven(String str){
		int result=0;
		if(str.length() == 2)
			System.out.println(0);
		else{
			for(int i=2;i<str.length();i++){
				int num=str.length()-i-1;
				int multi=1;
				for(int j=0;j<num;j++)
				{
					multi=multi*11;
				}
				int temp=0;
				if(str.charAt(i) == 'A' || str.charAt(i) == 'a')
					temp=10;
				else {
					temp=(int)str.charAt(i)-(int)('0');
				}
				if(temp < 11 && temp >=0)
					result +=temp*multi;
				else {
					System.out.println("-1");
					return;
				}
			}
			System.out.println(result);
		}
	}
}
