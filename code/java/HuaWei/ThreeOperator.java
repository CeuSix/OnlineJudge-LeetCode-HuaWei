package HuaWei;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ThreeOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		String strArr[] = inputStr.split("\\s+");
		/*事前判断*/
		if(strArr.length != 3){
			System.out.println(0);
			return;
		}
		Pattern pattern = Pattern.compile("[0-9]*");
		if(!pattern.matcher(strArr[0]).matches() && !pattern.matcher(strArr[2]).matches())
		{
			System.out.println(0);
			return;
		}
		if(strArr[1].equals("+") || strArr[1].equals("-"))
		{
			int num1=Integer.parseInt(strArr[0]);
			String operator = strArr[1];
			int num2=Integer.parseInt(strArr[2]);
			switch(operator){
				case "+":
					System.out.println(num1+num2);
					break;
				case "-": 
					System.out.println(num1-num2);
					break;
			}
			
		}
		else {
			System.out.println(0);
			return;
		}
		
	}

}
