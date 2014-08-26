package HuaWei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Disappear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//采用堆栈来进行解决，声明一个数组
				int[]arr = new int[15];//存储十五个数字
				int[]arr1 = new int[15];
				int[]arr2 = new int[10000];
				for(int i=0;i<15;i++){
					arr[i]=0;
					arr1[i]=1;
					arr2[i]=0;
				}
				int top=0;//记录当前栈最顶的对应下标+1
				Map<Integer, Integer> map=new HashMap<Integer, Integer>();
				Stack< Integer> st=new Stack<Integer>();
				Scanner sc = new Scanner(System.in);
				for(int i=0;i<15;i++){
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<15;i++){
					st.push(arr[i]);
					if(i!=0)
					{
						if(arr[i] == arr[top])
							arr1[i]=arr1[top]+1;
						top=i;
						arr2[top]=top;
					}
					if(arr1[i] == 3)//弹栈三次
					{
						st.pop();
						top=arr2[i];
						st.pop();
						top=arr2[i];
						st.pop();
						top--;
					}
		}
		System.out.println("none");
	}

}
