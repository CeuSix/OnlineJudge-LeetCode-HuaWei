package HuaWei;

import java.util.Scanner;

public class Peach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int daynum=scanner.nextInt();
		int fint=1;
		for(int i=daynum;i>1;i--){
			fint = 2*(fint+1);
		}
		System.out.println(fint);
	}

}
