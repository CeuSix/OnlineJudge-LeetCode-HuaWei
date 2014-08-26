/*java随机数发生器
 * */
package OrdinaryTool;

import java.awt.List;
import java.util.LinkedList;
import java.util.Random;

public class RandomDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//产生int值
		for(int i=0;i<10;i++){
			int mathRandom= (int)(Math.random()*100);
			Random rd=new Random();
			int random=rd.nextInt(5);
			System.out.println(mathRandom +"和"+random);
		}
		int[] systemArray = {23,12,14,2,5,7,46,130,25,3};
		for (int i : systemArray) {
			System.out.print(" "+i);
		}
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
	}

}
