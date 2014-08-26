package HuaWei;

import java.util.ArrayList;
import java.util.Scanner;

public class GetNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//取号数组
		ArrayList<Integer> arrayList1=new ArrayList<>();
		//数组对应状态
		ArrayList<Integer> arrayList2=new ArrayList<>();
		//此时对应位置的人数
		ArrayList<Integer> arrayList3=new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String inputString="";
		String command="";
		while(scanner.hasNext()){
			inputString=scanner.next();
			if(inputString.equals("quit"))
				break;
			else{
				if(inputString.contains("get")){
					if(inputString.contains("vip")){
						
					}
					else {
						
					}
				}
				if(inputString.contains("delete")){
					if(inputString.contains("vip")){
						
					}
					else {
						
					}
				}
			}
		}
	}

}
