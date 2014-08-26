package HuaWei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map= new HashMap<String,Integer>();
		map.put("Ling", 0);map.put("Yi", 1);map.put("Er", 2);map.put("San", 3);map.put("Si", 4);
		map.put("Wu", 5);map.put("Liu", 6);map.put("Qi", 7);map.put("Ba", 8);map.put("Jiu", 9);
		map.put("Shi", 10);map.put("Bai", 100);map.put("Qian", 1000);map.put("Wan", 10000);
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		//处理字符串
		String finalStr="";
		int i=0;
		//声明一个数组
		int[] array=new int[5];
		Stack<Integer> st=new Stack<Integer>();
		int numint=0;
		while(i < str.length())
		{
			String temp="";
			temp+=str.charAt(i);
			i++;
			while(!Character.isUpperCase(str.charAt(i)))
			{
				temp+=str.charAt(i);
				i++;
				if(i >= str.length())
					break;
			}
			st.push(map.get(temp).intValue());
		}
		int i1=0;
		int size=st.size();
		int finalint=0;
		int gewei=0;
		while(i1 < size)
		{
			int m=st.pop();
			if(i1 ==0 && m < 10){
				if(st.peek()==0)
					finalint+=m;
				gewei=m;
			}
			if(m >=10)
			{
				int tint=m;
				m=st.pop();
				i1++;
				if(finalint == 0)
					finalint+=gewei*tint/10;
				finalint+=m*tint;
			}
			i1++;
		}
		System.out.println(finalint);
	}

}
