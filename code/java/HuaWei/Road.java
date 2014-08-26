package HuaWei;

import java.util.Scanner;

public class Road {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner cin = new Scanner(System.in);
				String input = cin.nextLine();
				String[] al = input.split(" ");
				
				int i = 0;
				for(i = 0; i < al.length-1; i++,i++){
					int first = Integer.parseInt(al[i]);
					int last = Integer.parseInt(al[i+1]);
					if(first*100/65 != (first*100+last-1)/65){
						System.out.println("NO");
						break;
					}
				}
				if(i == al.length){
					System.out.println("YES");
				}
			}
}
