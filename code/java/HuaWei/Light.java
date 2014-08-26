package HuaWei;

import java.math.BigDecimal;
import java.util.Scanner;

public class Light {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int m=scanner.nextInt();//灯的数目
			int array[]=new int[m+1];
			for(int i=0;i<m+1;i++){
				array[i]=0;
			}
			for(int i=1;i<m+1;i++){
				int flag=i;
				int flag1=flag;
				while(flag1 < m+1){
					if(array[flag1] == 1)
						array[flag1] = 0;
					else {
						array[flag1]=1;
					}
					flag1+=flag;
				}
			}
			int num=0;
			for(int i=1;i<m+1;i++){
				if(array[i] == 1)
					num++;
			}
			System.out.println(num);
	}

}
