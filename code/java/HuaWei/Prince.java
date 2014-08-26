package HuaWei;

import java.util.Scanner;

public class Prince {

	/**
	 * @param args
	 */
	static int mintime=Integer.MAX_VALUE;
	static int longdistance=0;
	static int M,S,T;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		M=scanner.nextInt();
		S=scanner.nextInt();
		T=scanner.nextInt();
		if(S==0)
			System.out.println("Yes " + 0);
		else if(S !=0 && T == 0)
			System.out.println("No "+0);
		TestMagic(M, 0, 0);
		if(mintime <= T){
			System.out.println("Yes " + mintime);
		}
		else
			System.out.println("No "+ longdistance);		
	}
	public static boolean TestMagic(int M,int distance,int time){
		if(time <= T){
			longdistance=longdistance>distance?longdistance:distance;
			System.out.println("longdistance= "+longdistance);
		}
			
		if(distance >= S){
			mintime=mintime>time?time:mintime;
			System.out.println("mintime= "+mintime);
			return true;
		}
		if(M>=10)
			TestMagic(M-10, distance+60, time+1);
		else {
			TestMagic(M, distance+17, time+1);
			TestMagic(M+4, distance, time+1);
		}
		return true;
	}
}
